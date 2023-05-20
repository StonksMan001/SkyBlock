package net.me.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.custom.ModArmorMaterials;
import net.me.skyblock.item.custom.ModAxeItem;
import net.me.skyblock.sound.ModSounds;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FYBERITE = registerItem("fyberite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MUSIC_DISC_WITHERSTORM = registerItem("music_disc_wither_storm_theme",
            new MusicDiscItem(6, ModSounds.WITHERSTORM_THEME, new  FabricItemSettings().maxCount(1),188));
    public static final Item ENDERITE_APPLE = registerItem("enderite_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.ENDERITE_APPLE)));
    public static final Item ENCHANTED_ENDERITE_APPLE = registerItem("enchanted_enderite_apple",
            new EnchantedEnderiteAppleItem(new FabricItemSettings().food(ModFoodComponents.ENCHANTED_ENDERITE_APPLE)));
    public static final Item SUGAR_POPPY_MIXTURE = registerItem("sugar_poppy_mixture",
            new Item(new FabricItemSettings()));
    public static final Item STEAM_DUMPLING_FRESH = registerItem("steam_dumpling_raw",
            new Item(new FabricItemSettings()));
    public static final Item STEAM_DUMPLING = registerItem("steam_dumpling",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING)));
    public static final Item STEAM_DUMPLING_WITH_MOLTEN_BUTTER = registerItem("steam_dumpling_with_molten_butter",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING_WITH_MOLTEN_BUTTER)));
    public static final Item STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = registerItem("steam_dumpling_with_molten_butter_and_sugar_poppy_mixture",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE)));
    public static final Item LORAN = registerItem("loran",
            new Loran(new FabricItemSettings()));
    public static final Item ENDER_STICK = registerItem("ender_stick",
            new Item(new FabricItemSettings()));
    public static final Item ENDMERALD = registerItem("end_emerald",
            new Item(new FabricItemSettings()));
    public static final Item MELTE_RESIDUES = registerItem("melte_residues",
            new Item(new FabricItemSettings()));
    //ENDERITE
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 2, -2.4f, new FabricItemSettings()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 4, -3.0f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 1, -3.0f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, -4, 1.5f, new FabricItemSettings()));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 0, -2.8f, new FabricItemSettings()));
    //ENDERITE
    //ABERYTHE
    public static final Item ABERYTHE_GEM = registerItem("aberythe_gem",
            new Item(new FabricItemSettings()));
    public static final Item ABERYTHE_HELMET = registerItem("aberythe_helmet",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ABERYTHE_CHESTPLATE = registerItem("aberythe_chestplate",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ABERYTHE_LEGGINGS = registerItem("aberythe_leggings",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ABERYTHE_BOOTS = registerItem("aberythe_boots",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ABERYTHE_SWORD = registerItem("aberythe_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 2, -2.4f, new FabricItemSettings()));
    public static final Item ABERYTHE_AXE = registerItem("aberythe_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 4, -3.0f, new FabricItemSettings()));
    public static final Item ABERYTHE_SHOVEL = registerItem("aberythe_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 1, -3.0f, new FabricItemSettings()));
    public static final Item ABERYTHE_HOE = registerItem("aberythe_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, -4, 0.2f, new FabricItemSettings()));
    public static final Item ABERYTHE_PICKAXE = registerItem("aberythe_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 0, -2.8f, new FabricItemSettings()));
    //ABERYTHE
    public static final Item ANT_BOTTLE = registerItem("ant_bottle",
            new Item(new FabricItemSettings()));
    public static final Item BOTTLE_OF_ANT_JAM = registerItem("bottle_of_ant_jam",
            new Item(new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.UNUSED, FYBERITE);
        addToItemGroup(ModItemGroup.UNUSED, MUSIC_DISC_WITHERSTORM);
        addToItemGroup(ModItemGroup.FYBERITE, ENDMERALD);
        addToItemGroup(ModItemGroup.FYBERITE, ANT_BOTTLE);
        addToItemGroup(ModItemGroup.FYBERITE, BOTTLE_OF_ANT_JAM);
        addToItemGroup(ModItemGroup.UNUSED, SUGAR_POPPY_MIXTURE);
        addToItemGroup(ModItemGroup.UNUSED, STEAM_DUMPLING_FRESH);
        addToItemGroup(ModItemGroup.UNUSED, STEAM_DUMPLING);
        addToItemGroup(ModItemGroup.UNUSED, STEAM_DUMPLING_WITH_MOLTEN_BUTTER);
        addToItemGroup(ModItemGroup.UNUSED, STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_APPLE);
        addToItemGroup(ModItemGroup.FYBERITE, ENCHANTED_ENDERITE_APPLE);

        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_INGOT);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_HELMET);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_LEGGINGS);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_BOOTS);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_SWORD);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_AXE);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_PICKAXE);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_HOE);
        addToItemGroup(ModItemGroup.FYBERITE, ENDERITE_SHOVEL);

        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_GEM);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_HELMET);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_CHESTPLATE);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_LEGGINGS);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_BOOTS);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_SWORD);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_AXE);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_PICKAXE);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_HOE);
        addToItemGroup(ModItemGroup.ABYSS, ABERYTHE_SHOVEL);

        addToItemGroup(ModItemGroup.FYBERITE, ENDER_STICK);
        addToItemGroup(ModItemGroup.FYBERITE, MELTE_RESIDUES);
        addToItemGroup(ModItemGroup.ABYSS, LORAN);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems () {
        SkyBlock.LOGGER.debug("Registering Mod Items for " + SkyBlock.MOD_ID);

        addItemsToItemGroup();
    }
}
