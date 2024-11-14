package net.me.skyblock.items.mcd.mcd_ranged;

import net.me.skyblock.items.mcd.McdItem;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class TwinBowItem extends BowItem {
    public TwinBowItem(Settings settings) {
        super(settings);
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
                            boolean critical = f == 1.0F;
                            float speed = f * 3.0F;
                            float divergence = 1.0F;
                            int index = 0; //redundant
                            PersistentProjectileEntity persistentProjectileEntity0 = (PersistentProjectileEntity) this.createArrowEntity(serverWorld, playerEntity, stack, itemStack, critical);
                            this.shoot(playerEntity, persistentProjectileEntity0, index, speed, divergence, 0.0f, null);
                            persistentProjectileEntity0.pickupType = PersistentProjectileEntity.PickupPermission.DISALLOWED;
                            world.spawnEntity(persistentProjectileEntity0);
                            stack.damage(this.getWeaponStackDamage(itemStack), playerEntity, LivingEntity.getSlotForHand(playerEntity.getActiveHand()));

                            Box searchBox = new Box(playerEntity.getBlockPos()).expand(30);
                            List<LivingEntity> hostileMobs = serverWorld.getEntitiesByClass(LivingEntity.class, searchBox, entity -> entity instanceof HostileEntity);
                            if (!hostileMobs.isEmpty()) {
                                LivingEntity closestHostile = hostileMobs.getFirst();

                                PersistentProjectileEntity persistentProjectileEntity1 = (PersistentProjectileEntity) this.createArrowEntity(serverWorld, playerEntity, stack, itemStack, critical);
                                this.shoot(playerEntity, persistentProjectileEntity1, index, speed, divergence, playerEntity.getYaw(), null);
                                persistentProjectileEntity1.pickupType = PersistentProjectileEntity.PickupPermission.DISALLOWED;
                                persistentProjectileEntity1.setVelocity(closestHostile.getX() - playerEntity.getX(), closestHostile.getEyeY() - playerEntity.getEyeY(), closestHostile.getZ() - playerEntity.getZ(), 1.5F, 0);
                                world.spawnEntity(persistentProjectileEntity1);
                            }
                        }
                    }
                    world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SkyBlockRegistries.SoundRegistries.MCD__TWIN_BOW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F);
                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__twin_bow.tooltip1").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__twin_bow.tooltip2").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.rarity.unique"));
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

