package net.me.skyblock.api;

import net.me.skyblock.blocks_and_items.ModItems;
import net.me.skyblock.blocks_and_items.items.skyblock.BondedTotemOfUndying;
import net.me.skyblock.blocks_and_items.items.skyblock.FirwoodMace;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

import java.util.Objects;

public class ModModelPredicateProvider {
    public static void registerModModels() {

        registerBow(ModItems.MCD__SHORTBOW);
        registerBow(ModItems.MCD__TWIN_BOW);
        registerCrossbow(ModItems.MCD__AUTO_CROSSBOW);
        registerWrittenBookTextures(Items.WRITTEN_BOOK);
        registerFirwoodMace(ModItems.SKYBLOCK__FIRWOOD_MACE);
        //registerEnchantedBookTextures(Items.ENCHANTED_BOOK);
    }
    /*public static final String[] ANNOTATIONS = {
            "@green",
            "@contr",
            "@note"
    };*/
    private static void registerWrittenBookTextures(Item book) {
        /*ModelPredicateProviderRegistry.register(book, new Identifier("null"),
                (stack, world, entity, seed) -> {
                    NbtCompound nbtCompound = stack.getNbt();
                    if (nbtCompound == null) {
                        return 0.0f;
                    }
                    String title = nbtCompound.getString(WrittenBookItem.TITLE_KEY);
                    int flags = 0;
                    for (int i = 0; i <= 2; i++) {
                        if (title.contains(ANNOTATIONS[i])) {
                            flags++;
                        }
                    }
                    if (flags > 1) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });*/
        ModelPredicateProviderRegistry.register(book, new Identifier("green"),
                (stack, world, entity, seed) -> {
                    NbtCompound nbtCompound = stack.getNbt();
                    if (nbtCompound == null) {
                        return 0.0f;
                    }
                    String title = nbtCompound.getString(WrittenBookItem.TITLE_KEY);
                    if (title.contains("@green")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(book, new Identifier("contract"),
                (stack, world, entity, seed) -> {
                    NbtCompound nbtCompound = stack.getNbt();
                    if (nbtCompound == null) {
                        return 0.0f;
                    }
                    String title = nbtCompound.getString(WrittenBookItem.TITLE_KEY);
                    if (title.contains("@contr")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(book, new Identifier("note"),
                (stack, world, entity, seed) -> {
                    NbtCompound nbtCompound = stack.getNbt();
                    if (nbtCompound == null) {
                        return 0.0f;
                    }
                    String title = nbtCompound.getString(WrittenBookItem.TITLE_KEY);
                    if (title.contains("@note")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(book, new Identifier("laws"),
                (stack, world, entity, seed) -> {
                    NbtCompound nbtCompound = stack.getNbt();
                    if (nbtCompound == null) {
                        return 0.0f;
                    }
                    String title = nbtCompound.getString(WrittenBookItem.TITLE_KEY);
                    if (title.contains("@laws")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
    }
    private static void registerEnchantedBookTextures(Item book) {
        ModelPredicateProviderRegistry.register(book, new Identifier("test"),
                (stack, world, entity, seed) -> {
                    NbtCompound nbtCompound = stack.getNbt();
                    if (nbtCompound == null) {
                        return 0.0f;
                    }
                    int level = EnchantmentHelper.getLevelFromNbt(nbtCompound);
                    if (level == 1) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
    }
    /*private static void registerOminousTotem(Item totem) {
        ModelPredicateProviderRegistry.register(totem, new Identifier("single"),
                (stack, world, entity, seed) -> {
                    if (stack.getNbt() == null) {
                        return 0.0f;
                    }
                    if (BondedTotemOfUndying.getGroupCount(stack) == 1) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(totem, new Identifier("double"),
                (stack, world, entity, seed) -> {
                    if (stack.getNbt() == null) {
                        return 0.0f;
                    }
                    if (BondedTotemOfUndying.getGroupCount(stack) == 2) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(totem, new Identifier("triple"),
                (stack, world, entity, seed) -> {
                    if (stack.getNbt() == null) {
                        return 0.0f;
                    }
                    if (BondedTotemOfUndying.getGroupCount(stack) == 3) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
    }*/
    private static void registerFirwoodMace(Item firwood_mace) {
        ModelPredicateProviderRegistry.register(firwood_mace, new Identifier("green"),
                (stack, world, entity, seed) -> {
                    if (stack.getNbt() == null) {
                        return 0.0f;
                    }
                    if (Objects.equals(FirwoodMace.getLeaves(stack), "green")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
        ModelPredicateProviderRegistry.register(firwood_mace, new Identifier("orange"),
                (stack, world, entity, seed) -> {
                    if (stack.getNbt() == null) {
                        return 0.0f;
                    }
                    if (Objects.equals(FirwoodMace.getLeaves(stack), "orange")) {
                        return 1.0f;
                    } else {
                        return 0.0f;
                    }
                });
    }

    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
                });

        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
    private static void registerCrossbow(Item crossbow) {
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (CrossbowItem.isCharged(stack)) {
                return 0.0f;
            }
            return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / (float)CrossbowItem.getPullTime(stack);
        });
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("charged"), (stack, world, entity, seed) -> CrossbowItem.isCharged(stack) ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("firework"), (stack, world, entity, seed) -> CrossbowItem.isCharged(stack) && CrossbowItem.hasProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0f : 0.0f);
    }

}
