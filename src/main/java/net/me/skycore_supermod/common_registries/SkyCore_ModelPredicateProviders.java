package net.me.skycore_supermod.common_registries;

import net.me.mcd_innermod.registries.MCD_Items;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.WrittenBookContentComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class SkyCore_ModelPredicateProviders {
    public static void registerModModels() {
        registerBow(MCD_Items.MCD__SHORTBOW);
        registerBow(MCD_Items.MCD__TWIN_BOW);
        registerCrossbow(MCD_Items.MCD__AUTO_CROSSBOW);
        registerWrittenBookTextures(Items.WRITTEN_BOOK);
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
        ModelPredicateProviderRegistry.register(book, Identifier.of("test"),
                (stack, world, entity, seed) -> {
                    ItemEnchantmentsComponent itemEnchantmentsComponent = stack.get(DataComponentTypes.ENCHANTMENTS);
                    if (itemEnchantmentsComponent == null) {
                        return 0.0f;
                    }
                    int maxLevel = 0;
                    for (RegistryEntry<Enchantment> enchantmentRegistryEntry : itemEnchantmentsComponent.getEnchantments()) {
                        int level = itemEnchantmentsComponent.getLevel(enchantmentRegistryEntry);
                        if (level > maxLevel) maxLevel = level;
                    }
                    if (maxLevel == 1) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
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
