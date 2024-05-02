package net.me.skyblock.archived;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.items.end.EnchantedEnderiteAppleItem;
import net.me.skyblock.blocks_and_items.items.util.basic.ModFoodComponents;
import net.me.skyblock.blocks_and_items.items.util.basic.ModToolMaterials;
import net.me.skyblock.blocks_and_items.items.util.basic.ModArmorMaterials;
import net.me.skyblock.blocks_and_items.items.util.basic.ModAxeItem;
import net.me.skyblock.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ArchivedItems {
    //SKYBLOCK MAIN-BLOCK
    public static final Item ANT_BOTTLE = registerItem("ant_bottle",
            new Item(new FabricItemSettings()));
    public static final Item BOTTLE_OF_ANT_JAM = registerItem("bottle_of_ant_jam",
            new Item(new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item MUSIC_DISC_WITHERSTORM = registerItem("music_disc_wither_storm_theme",
            new MusicDiscItem(6, ModSounds.WITHERSTORM_THEME, new  FabricItemSettings().maxCount(1).rarity(Rarity.RARE),188));
    public static final Item DISC_FRAGMENT_WITHERSTORM = registerItem("disc_fragment_wither_storm_theme",
            new DiscFragmentItem(new FabricItemSettings()));
    public static final Item ENDERITE_APPLE = registerItem("enderite_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.SP5__ENDERITE_APPLE)));
    public static final Item ENCHANTED_ENDERITE_APPLE = registerItem("enchanted_enderite_apple",
            new EnchantedEnderiteAppleItem(new FabricItemSettings().food(ModFoodComponents.SP5__ENCHANTED_ENDERITE_APPLE)));
    public static final Item ENDER_STICK = registerItem("ender_stick",
            new Item(new FabricItemSettings()));
    public static final Item ENDMERALD = registerItem("end_emerald",
            new Item(new FabricItemSettings()));
    public static final Item MELTE_RESIDUES = registerItem("melte_residues",
            new Item(new FabricItemSettings()));
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
            new SwordItem(ModToolMaterials.ENDERITE, 9, 1.6f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 11, 1f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 8, 1f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, 3, 5.5f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 7, 1.2f -4f, new FabricItemSettings()));
    //SKYBLOCK MAIN-BLOCK
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name), item);
    }
    public static void registerArchivedItems () {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Archived Items for " + SkyBlock.MOD_ID);
    }
    protected static Item register(Block block, Item item) {
        return ArchivedItems.register(Registries.BLOCK.getId(block), item);
    }
    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, id, item);
    }
}
