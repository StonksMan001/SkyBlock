package net.me.skyblock.items.mcd.mcd_ranged;

import net.me.skyblock.items.mcd.McdItem;
import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class TwinBowItem extends BowItem {
    public TwinBowItem(Settings settings) {
        super(settings);
    }
    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
        if (clickType == ClickType.RIGHT && SkyBlockRegistries.DataComponentTypeRegistries.MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE != null) {
            stack.set(SkyBlockRegistries.DataComponentTypeRegistries.MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE, Boolean.FALSE.equals(stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE)));
            return true;
        } else {
            return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
        }
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE) == null) {
            stack.set(SkyBlockRegistries.DataComponentTypeRegistries.MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE, false);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!world.isClient && user instanceof PlayerEntity playerEntity) {
            ItemStack itemStack = playerEntity.getProjectileType(stack);
            if (!itemStack.isEmpty()) {
                int i = this.getMaxUseTime(stack, user) - remainingUseTicks;
                float f = getPullProgress(i);
                if (!((double)f < 0.1)) {
                    List<ItemStack> list = load(stack, itemStack, playerEntity);
                    if (world instanceof ServerWorld) {
                        ServerWorld serverWorld = ((ServerWorld) world).toServerWorld();
                        if (!list.isEmpty()) {
                            boolean bowHasInfinity = false;
                            RegistryEntry<Enchantment> registryEntry = world.getRegistryManager().get(RegistryKeys.ENCHANTMENT).getEntry(Enchantments.INFINITY).orElseThrow();
                            if (EnchantmentHelper.getLevel(registryEntry, stack) > 0) {
                                bowHasInfinity = true;
                            }
                            boolean critical = f == 1.0F;
                            float speed = f * 3.0F;
                            float divergence = 1.0F;
                            int index = 0; //redundant
                            Box searchBox = new Box(playerEntity.getBlockPos()).expand(20);
                            List<LivingEntity> targetEntities =
                                    Boolean.TRUE.equals(stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE))
                                            ?
                                    serverWorld.getEntitiesByClass(LivingEntity.class, searchBox,
                                            entity ->
                                                    (entity instanceof Monster || entity instanceof HostileEntity || (entity instanceof PlayerEntity playerEntity2 && !playerEntity2.isCreative() && !playerEntity2.isSpectator())) &&
                                                    entity != playerEntity &&
                                                    (entity.getScoreboardTeam() != playerEntity.getScoreboardTeam() ||
                                                            (entity.getScoreboardTeam() == null && playerEntity.getScoreboardTeam() == null)
                                                    ))
                                            :
                                    serverWorld.getEntitiesByClass(LivingEntity.class, searchBox,
                                            entity ->
                                                    (entity instanceof Monster || entity instanceof HostileEntity) &&
                                                    (entity.getScoreboardTeam() != playerEntity.getScoreboardTeam() ||
                                                            (entity.getScoreboardTeam() == null && playerEntity.getScoreboardTeam() == null)
                                                    ));
                            boolean bonus_shot = false;
                            if (!targetEntities.isEmpty() && !playerEntity.isSneaking()) {
                                bonus_shot = true;
                                LivingEntity closestHostile = targetEntities.getFirst();
                                // bonus projectile
                                PersistentProjectileEntity persistentProjectileEntity1 = this.createArrowEntity(serverWorld, playerEntity, stack, itemStack, critical);
                                this.shoot(playerEntity, persistentProjectileEntity1, index, speed, divergence, playerEntity.getYaw(), null);
                                persistentProjectileEntity1.pickupType = PersistentProjectileEntity.PickupPermission.DISALLOWED;
                                persistentProjectileEntity1.setVelocity(closestHostile.getX() - playerEntity.getX(), closestHostile.getEyeY() - playerEntity.getEyeY(), closestHostile.getZ() - playerEntity.getZ(), 1.5F, 0);
                                world.spawnEntity(persistentProjectileEntity1);
                            }
                            // main projectile
                            PersistentProjectileEntity persistentProjectileEntity0 = this.createArrowEntity(serverWorld, playerEntity, stack, itemStack, critical);
                            this.shoot(playerEntity, persistentProjectileEntity0, index, speed, divergence, 0.0f, null);
                            if (bonus_shot || (bowHasInfinity && persistentProjectileEntity0 instanceof ArrowEntity)) {
                                persistentProjectileEntity0.pickupType = PersistentProjectileEntity.PickupPermission.DISALLOWED;
                            } else if (playerEntity.isCreative()) {
                                persistentProjectileEntity0.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                            } else {
                                persistentProjectileEntity0.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                            }
                            world.spawnEntity(persistentProjectileEntity0);
                            stack.damage(this.getWeaponStackDamage(itemStack), playerEntity, LivingEntity.getSlotForHand(playerEntity.getActiveHand()));
                        }
                    }
                    world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SkyBlockRegistries.SoundRegistries.MCD__TWIN_BOW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F);
                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
    }
    protected PersistentProjectileEntity createArrowEntity(World world, LivingEntity shooter, ItemStack weaponStack, ItemStack projectileStack, boolean critical) {
        Item var8 = projectileStack.getItem();
        ArrowItem var10000;
        if (var8 instanceof ArrowItem arrowItem) {
            var10000 = arrowItem;
        } else {
            var10000 = (ArrowItem)Items.ARROW;
        }
        ArrowItem arrowItem2 = var10000;
        PersistentProjectileEntity persistentProjectileEntity = arrowItem2.createArrow(world, projectileStack, shooter, weaponStack);
        if (critical) {
            persistentProjectileEntity.setCritical(true);
        }
        return persistentProjectileEntity;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__twin_bow.tooltip1").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__twin_bow.tooltip2").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.rarity.unique"));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__bonus_shot.target_players")
                .append(Text.literal(": ")
                        .append(Boolean.TRUE.equals(stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE)) ?
                                Text.translatable("options.on").formatted(Formatting.GREEN):
                                Text.translatable("options.off").formatted(Formatting.RED))));
        tooltip.add(Text.translatable("enchantment.skyblock.mcd__bonus_shot").setStyle(Style.EMPTY.withFormatting(Formatting.GREEN)));
        super.appendTooltip(stack, context, tooltip, type);
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return McdItem.getMcdItemBarColor();
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}

