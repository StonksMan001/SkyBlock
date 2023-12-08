package net.me.skyblock.blocks_and_items.items.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.me.skyblock.SkyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GhostItems {
    public static final Item Z__LOGO_V1 = registerItem("z__logo_v1",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V2 = registerItem("z__logo_v2",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V3 = registerItem("z__logo_v3",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V4 = registerItem("z__logo_v4",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V5 = registerItem("z__logo_v5",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V6 = registerItem("z__logo_v6",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO1 = registerItem("z__logo1",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO2 = registerItem("z__logo2",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO3 = registerItem("z__logo3",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO4 = registerItem("z__logo4",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO5 = registerItem("z__logo5",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO6 = registerItem("z__logo6",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_BLANK = registerItem("z__tile_blank",
            new TileBlankItem(Blocks.AIR, new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_1 = registerItem("z__tile_skyblock_1",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_2 = registerItem("z__tile_skyblock_2",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_3 = registerItem("z__tile_skyblock_3",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_4 = registerItem("z__tile_skyblock_4",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_5 = registerItem("z__tile_skyblock_5",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_6 = registerItem("z__tile_skyblock_6",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_7 = registerItem("z__tile_skyblock_7",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_8 = registerItem("z__tile_skyblock_8",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_9 = registerItem("z__tile_skyblock_9",
            new Item(new FabricItemSettings()));
    public static final Item Z__NULL = registerItem("z__null",
            new NullItem(Blocks.AIR, new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name), item);
    }
    public static void registerGhostItems () {
        SkyBlock.LOGGER.debug("Registering Abstract Items for " + SkyBlock.MOD_ID);
    }
    protected static Item registerBlockAndItem(Block block, Item item) {
        return GhostItems.register(Registries.BLOCK.getId(block), item);
    }
    public static Item registerBlockItem(BlockItem item) {
        return Items.register(item.getBlock(), item);
    }
    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, id, item);
    }
}
