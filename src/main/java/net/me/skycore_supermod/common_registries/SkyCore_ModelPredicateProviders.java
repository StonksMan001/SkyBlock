package net.me.skycore_supermod.common_registries;

import net.me.skycore_supermod.SkyblockHelpers;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.WrittenBookContentComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.Objects;

public class SkyCore_ModelPredicateProviders {
    public static void registerModModels() {
        registerWrittenBookTextures(Items.WRITTEN_BOOK);
        registerEnchantedBookTextures(Items.ENCHANTED_BOOK);
    }

    private static void registerWrittenBookTextures(Item book) {
        ModelPredicateProviderRegistry.register(book, Identifier.of("green"),
                (stack, world, entity, seed) -> {
                    WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                    if (writtenBookContentComponent == null) {
                        return 0.0f;
                    }
                    String title = writtenBookContentComponent.title().toString();
                    if (title.contains("@green")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(book, Identifier.of("contract"),
                (stack, world, entity, seed) -> {
                    WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                    if (writtenBookContentComponent == null) {
                        return 0.0f;
                    }
                    String title = writtenBookContentComponent.title().toString();
                    if (title.contains("@contr")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(book, Identifier.of("note"),
                (stack, world, entity, seed) -> {
                    WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                    if (writtenBookContentComponent == null) {
                        return 0.0f;
                    }
                    String title = writtenBookContentComponent.title().toString();
                    if (title.contains("@note")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(book, Identifier.of("laws"),
                (stack, world, entity, seed) -> {
                    WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                    if (writtenBookContentComponent == null) {
                        return 0.0f;
                    }
                    String title = writtenBookContentComponent.title().toString();
                    if (title.contains("@laws")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
    }

    private static void registerEnchantedBookTextures(Item book) {
        Pair<RegistryKey<Enchantment>, String>[] enchantments = new Pair[]{
                new Pair<>(Enchantments.INFINITY, "infinity"),
                new Pair<>(Enchantments.PUNCH, "punch"),
                new Pair<>(Enchantments.POWER, "power"),
                new Pair<>(Enchantments.PIERCING, "piercing"),
                new Pair<>(Enchantments.MULTISHOT, "multishot"),
                new Pair<>(Enchantments.QUICK_CHARGE, "quick_charge"),
                new Pair<>(Enchantments.FLAME, "flame"),
                new Pair<>(Enchantments.FIRE_ASPECT, "fire_aspect"),
                new Pair<>(Enchantments.SILK_TOUCH, "silk_touch"),
                new Pair<>(Enchantments.FORTUNE, "fortune"),
                new Pair<>(Enchantments.EFFICIENCY, "efficiency"),
                new Pair<>(Enchantments.UNBREAKING, "unbreaking"),
                new Pair<>(Enchantments.LOOTING, "looting"),
                new Pair<>(Enchantments.IMPALING, "impaling"),
                new Pair<>(Enchantments.LOYALTY, "loyalty"),
                new Pair<>(Enchantments.CHANNELING, "channeling"),
                new Pair<>(Enchantments.RIPTIDE, "riptide"),
                new Pair<>(Enchantments.RESPIRATION, "respiration"),
                new Pair<>(Enchantments.DEPTH_STRIDER, "depth_strider"),
                new Pair<>(Enchantments.AQUA_AFFINITY, "aqua_affinity"),
                new Pair<>(Enchantments.FEATHER_FALLING, "feather_falling"),
                new Pair<>(Enchantments.THORNS, "thorns"),
                new Pair<>(Enchantments.PROTECTION, "protection"),
                new Pair<>(Enchantments.BLAST_PROTECTION, "blast_protection"),
                new Pair<>(Enchantments.FIRE_PROTECTION, "fire_protection"),
                new Pair<>(Enchantments.PROJECTILE_PROTECTION, "projectile_protection"),
                new Pair<>(Enchantments.SWEEPING_EDGE, "sweeping_edge"),
                new Pair<>(Enchantments.KNOCKBACK, "knockback"),
                new Pair<>(Enchantments.SMITE, "smite"),
                new Pair<>(Enchantments.BANE_OF_ARTHROPODS, "bane_of_arthropods"),
                new Pair<>(Enchantments.SHARPNESS, "sharpness"),
                new Pair<>(Enchantments.LUCK_OF_THE_SEA, "luck_of_the_sea"),
                new Pair<>(Enchantments.LURE, "lure"),
                new Pair<>(Enchantments.SOUL_SPEED, "soul_speed"),
                new Pair<>(Enchantments.FROST_WALKER, "frost_walker"),
                new Pair<>(Enchantments.MENDING, "mending"),
                new Pair<>(Enchantments.SWIFT_SNEAK, "swift_sneak"),
                new Pair<>(Enchantments.VANISHING_CURSE, "vanishing_curse"),
                new Pair<>(Enchantments.BINDING_CURSE, "binding_curse")
        };
        for (int i = 0; i < enchantments.length; i++) {
            int finalI = i;
            ModelPredicateProviderRegistry.register(book, Identifier.of(enchantments[i].getRight()),
                    (stack, world, entity, seed) -> {
                        ItemEnchantmentsComponent itemEnchantmentsComponent = stack.get(DataComponentTypes.STORED_ENCHANTMENTS);
                        if (Objects.isNull(itemEnchantmentsComponent) || Objects.isNull(world) || itemEnchantmentsComponent.getEnchantments().size() > 1) {
                            stack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true);
                            return 0;
                        }
                        if (itemEnchantmentsComponent.getEnchantments().stream().findFirst().orElseThrow() == SkyblockHelpers.getEnchantmentRegistryEntry(world, enchantments[finalI].getLeft())) {
                            stack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, null);
                            return 1;
                        }
                        return 0;
                    });
        }
    }

    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow, Identifier.of("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0F;
                    } else {
                        return entity.getActiveItem() != stack ? 0.0F : (float) (stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / 20.0F;
                    }
                });

        ModelPredicateProviderRegistry.register(bow, Identifier.of("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
    }

    private static void registerCrossbow(Item crossbow) {
        ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float) (stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / (float) CrossbowItem.getPullTime(stack, entity);
            }
        });
        ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("charged"), (stack, world, entity, seed) -> CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("firework"), (stack, world, entity, seed) -> {
            ChargedProjectilesComponent chargedProjectilesComponent = stack.get(DataComponentTypes.CHARGED_PROJECTILES);
            return chargedProjectilesComponent != null && chargedProjectilesComponent.contains(Items.FIREWORK_ROCKET) ? 1.0F : 0.0F;
        });
    }

}
