package net.me.skyblock.registries.archived;
import net.me.skyblock.registries.SkyBlock;
import net.me.skyblock.api.skycore.ArmorAPI;
import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.items.end.EnchantedEnderiteAppleItem;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;

public class ArchivedItemRegistries {
    //SKYBLOCK MAIN-BLOCK
    public static final Item ANT_BOTTLE = SkyBlock.BuiltinRegistries.registerItem("ant_bottle",
            new Item(new Item.Settings()));
    public static final Item BOTTLE_OF_ANT_JAM = SkyBlock.BuiltinRegistries.registerItem("bottle_of_ant_jam",
            new Item(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item MUSIC_DISC_WITHERSTORM = SkyBlock.BuiltinRegistries.registerItem("music_disc_wither_storm_theme",
            new Item(new  Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(SkyBlockRegistries.JukeBoxSongRegistries.WITHERSTORM_THEME)));
    public static final Item DISC_FRAGMENT_WITHERSTORM = SkyBlock.BuiltinRegistries.registerItem("disc_fragment_wither_storm_theme",
            new DiscFragmentItem(new Item.Settings()));
    public static final Item ENDERITE_APPLE = SkyBlock.BuiltinRegistries.registerItem("enderite_apple",
            new Item(new Item.Settings().food(SkyBlockRegistries.FoodComponentRegistries.SP5__ENDERITE_APPLE)));
    public static final Item ENCHANTED_ENDERITE_APPLE = SkyBlock.BuiltinRegistries.registerItem("enchanted_enderite_apple",
            new EnchantedEnderiteAppleItem(new Item.Settings().food(SkyBlockRegistries.FoodComponentRegistries.SP5__ENCHANTED_ENDERITE_APPLE)));
    public static final Item ENDER_STICK = SkyBlock.BuiltinRegistries.registerItem("ender_stick",
            new Item(new Item.Settings()));
    public static final Item ENDMERALD = SkyBlock.BuiltinRegistries.registerItem("end_emerald",
            new Item(new Item.Settings()));
    public static final Item MELTE_RESIDUES = SkyBlock.BuiltinRegistries.registerItem("melte_residues",
            new Item(new Item.Settings()));
    public static final Item ENDERITE_INGOT = SkyBlock.BuiltinRegistries.registerItem("enderite_ingot",
            new Item(new Item.Settings()));
    public static final Item ENDERITE_HELMET = SkyBlock.BuiltinRegistries.registerItem("enderite_helmet",
            new ArmorAPI.ArmorItem(SkyBlockRegistries.ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.HELMET, new Item.Settings(), 45));
    public static final Item ENDERITE_CHESTPLATE = SkyBlock.BuiltinRegistries.registerItem("enderite_chestplate",
            new ArmorAPI.ArmorItem(SkyBlockRegistries.ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 45));
    public static final Item ENDERITE_LEGGINGS = SkyBlock.BuiltinRegistries.registerItem("enderite_leggings",
            new ArmorAPI.ArmorItem(SkyBlockRegistries.ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 45));
    public static final Item ENDERITE_BOOTS = SkyBlock.BuiltinRegistries.registerItem("enderite_boots",
            new ArmorAPI.ArmorItem(SkyBlockRegistries.ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.BOOTS, new Item.Settings(), 45));
    public static final Item ENDERITE_SWORD = SkyBlock.BuiltinRegistries.registerItem("enderite_sword",
            new ToolAPI.SwordItem(SkyBlockRegistries.ToolMaterialRegistries.ENDERITE, 9, 1.6f -4f, new Item.Settings()));
    public static final Item ENDERITE_AXE = SkyBlock.BuiltinRegistries.registerItem("enderite_axe",
            new ToolAPI.AxeItem(SkyBlockRegistries.ToolMaterialRegistries.ENDERITE, 11, 1f -4f, new Item.Settings()));
    public static final Item ENDERITE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("enderite_shovel",
            new ToolAPI.ShovelItem(SkyBlockRegistries.ToolMaterialRegistries.ENDERITE, 8, 1f -4f, new Item.Settings()));
    public static final Item ENDERITE_HOE = SkyBlock.BuiltinRegistries.registerItem("enderite_hoe",
            new ToolAPI.HoeItem(SkyBlockRegistries.ToolMaterialRegistries.ENDERITE, 3, 5.5f -4f, new Item.Settings()));
    public static final Item ENDERITE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("enderite_pickaxe",
            new ToolAPI.PickaxeItem(SkyBlockRegistries.ToolMaterialRegistries.ENDERITE, 7, 1.2f -4f, new Item.Settings()));
    //SKYBLOCK MAIN-BLOCK

    public static void registerArchivedItems () {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Archived Items for " + SkyBlock.MOD_ID);
    }
}
