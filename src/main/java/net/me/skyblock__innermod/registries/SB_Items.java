package net.me.skyblock__innermod.registries;

import net.me.skyblock__innermod.items.*;
import net.me.skycore_supermod.common_registries.SkyCore_ToolMaterials;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;

public class SB_Items {
    //SKYBLOCK MAIN-BLOCK
    public static final Item SKYBLOCK__FYBERITE = SkyCore.BuiltinRegistries.registerItem("skyblock__fyberite_ingot",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__ANT_BOTTLE = SkyCore.BuiltinRegistries.registerItem("skyblock__ant_bottle",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__BOTTLE_OF_ANT_JAM = SkyCore.BuiltinRegistries.registerItem("skyblock__bottle_of_ant_jam",
            new Item(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item SKYBLOCK__SUGAR_POPPY_MIXTURE = SkyCore.BuiltinRegistries.registerItem("skyblock__sugar_poppy_mixture",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__STEAM_DUMPLING_FRESH = SkyCore.BuiltinRegistries.registerItem("skyblock__steam_dumpling_raw",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__STEAM_DUMPLING = SkyCore.BuiltinRegistries.registerItem("skyblock__steam_dumpling",
            new Item(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__STEAM_DUMPLING)));
    public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER = SkyCore.BuiltinRegistries.registerItem("skyblock__steam_dumpling_with_molten_butter",
            new Item(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER)));
    public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = SkyCore.BuiltinRegistries.registerItem("skyblock__steam_dumpling_with_molten_butter_and_sugar_poppy_mixture",
            new Item(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE)));
    //SKYBLOCK MAIN-BLOCK
    //SKYBLOCK VANILLA+
    public static final Item SKYBLOCK__PUFFBALL_MUSHROOM_FLESH = SkyCore.BuiltinRegistries.registerItem("skyblock__puffball_mushroom_flesh",
            new Item(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__PUFFBALL_MUSHROOM_FLESH)));
    public static final Item SKYBLOCK__COOKED_PUFFBALL_MUSHROOM_FLESH = SkyCore.BuiltinRegistries.registerItem("skyblock__cooked_puffball_mushroom_flesh",
            new Item(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__COOKED_PUFFBALL_MUSHROOM_FLESH)));
    public static final Item SKYBLOCK__PUFFBALL_MUSHROOM_STEW = SkyCore.BuiltinRegistries.registerItem("skyblock__puffball_mushroom_stew",
            new Item(new Item.Settings().maxCount(1).food(SB_FoodComponents.SKYBLOCK__PUFFBALL_MUSHROOM_STEW)));
    public static final Item SKYBLOCK__CHILLI_PEPPER_SEEDS = SkyCore.BuiltinRegistries.registerItem("skyblock__chilli_pepper_seeds",
            new AliasedBlockItem(SB_Blocks.SKYBLOCK__CHILLI_PEPPER_CROP, new Item.Settings()));
    public static final Item SKYBLOCK__CHILLI_PEPPER = SkyCore.BuiltinRegistries.registerItem("skyblock__chilli_pepper",
            new ChilliPepper(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__CHILLI_PEPPER)));
    public static final Item SKYBLOCK__GOLDEN_CHILLI_PEPPER = SkyCore.BuiltinRegistries.registerItem("skyblock__golden_chilli_pepper",
            new Item(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__GOLDEN_CHILLI_PEPPER)));
    public static final Item SKYBLOCK__BLUEBERRIES = SkyCore.BuiltinRegistries.registerItem("skyblock__blueberries",
            new Item(new Item.Settings().food(SB_FoodComponents.SKYBLOCK__BLUEBERRIES)));
    public static final Item SKYBLOCK__DUCKWEED = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new PlaceableOnWaterItem(SB_Blocks.SKYBLOCK__DUCKWEED, new Item.Settings()));
    public static final Item SKYBLOCK__SMALL_LILY_PADS = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new PlaceableOnWaterItem(SB_Blocks.SKYBLOCK__SMALL_LILY_PADS, new Item.Settings()));
    public static final Item SKYBLOCK__FIRWOOD_MACE = SkyCore.BuiltinRegistries.registerItem("skyblock__firwood_mace",
            new FirwoodMace(SkyCore_ToolMaterials.FIRWOOD_MACE, 9, 0.6f - 4f, new Item.Settings()));
    public static final Item SKYBLOCK__RARE_TOKEN = SkyCore.BuiltinRegistries.registerItem("skyblock__rare_token",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__UNCOMMON_TOKEN = SkyCore.BuiltinRegistries.registerItem("skyblock__uncommon_token",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__COMMON_TOKEN = SkyCore.BuiltinRegistries.registerItem("skyblock__common_token",
            new Item(new Item.Settings()));
    //SPORE PLANTER BOXES
    public static final Item SKYBLOCK__SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new SporePlanterBoxItem(SB_Blocks.SKYBLOCK__SPORE_PLANTER_BOX, new Item.Settings(), "tooltip.skyblock.skyblock__empty_spore_type"));
    public static final Item SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new SporePlanterBoxItem(SB_Blocks.SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX, new Item.Settings(), SB_Blocks.SKYBLOCK__PUFFBALL_MUSHROOM.asItem().getTranslationKey()));
    public static final Item SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new SporePlanterBoxItem(SB_Blocks.SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX, new Item.Settings(), Blocks.RED_MUSHROOM.asItem().getTranslationKey()));
    public static final Item SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new SporePlanterBoxItem(SB_Blocks.SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX, new Item.Settings(), Blocks.BROWN_MUSHROOM.asItem().getTranslationKey()));
    //SPORE PLANTER BOXES
    //---1.21.1+
    public static final Item SKYBLOCK__BONDED_TOTEM_OF_UNDYING = SkyCore.BuiltinRegistries.registerItem("skyblock__bonded_totem_of_undying",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item SKYBLOCK__OMINOUS_LINK = SkyCore.BuiltinRegistries.registerItem("skyblock__ominous_link",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item SKYBLOCK__COMPRESSED_STEEL = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new BlockItem(SB_Blocks.SKYBLOCK__COMPRESSED_STEEL, new Item.Settings()
                    .rarity(Rarity.EPIC)));
    //---1.21.1+
    //SKYBLOCK VANILLA+
    //SKYBLOCK TROPHIES
    public static final Item SKYBLOCK__PESTILENT_TROPHY = SkyCore.BuiltinRegistries.registerItemThatHasBlock(
            new Trophy.TrophyBlockItem(SB_Blocks.SKYBLOCK__PESTILENT_TROPHY, new Item.Settings(),
                    new String[]{
                            "tooltip.skyblock.skyblock__pestilent_trophy.tooltip1",
                            "tooltip.skyblock.skyblock__pestilent_trophy.tooltip2"
                    },
                    new String[]{
                            "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip1",
                            "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip2",
                            "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip3",
                            "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip4",
                            "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip5"
                    }));
    public static final Item SKYBLOCK__TORCH_OF_LUNACY = SkyCore.BuiltinRegistries.registerItem("skyblock__torch_of_lunacy",
            new TorchOfLunacyItem(new Item.Settings(),
                    new String[]{
                            "tooltip.skyblock.skyblock__torch_of_lunacy.tooltip1",
                            "tooltip.skyblock.skyblock__torch_of_lunacy.tooltip2",
                            "tooltip.skyblock.skyblock__torch_of_lunacy.tooltip3"
                    },
                    new String[]{
                            "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip1",
                            "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip2",
                            "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip3",
                            "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip4"
                    }));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"SkyBlock\" innermod");
    }
}
