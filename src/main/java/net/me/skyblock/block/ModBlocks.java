package net.me.skyblock.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.block.custom.SuspiciousCoarseDirt;
import net.me.skyblock.item.ModItemGroup;
import net.me.skyblock.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.command.PlaySoundCommand;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block VOID_BLOCK = registerBlock("void_block",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(3.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ENDMERALD_ORE = registerBlock("end_emerald_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ENDMERALD_BLOCK = registerBlock("end_emerald_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ENDERITE_BLOCK = registerBlock("end_emerald_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block END_GRASS = registerBlock("end_grass",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block BLUISHE_GRASS = registerBlock("bluishe_end_stone",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ANT_JAM_BLOCK = registerBlock("ant_jam_block",
            new HoneyBlock(FabricBlockSettings.copy(Blocks.HONEY_BLOCK).strength(0.1f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block SUSPICIOUS_COARSE_DIRT = registerBlock("suspicious_coarse_dirt",
            new SuspiciousCoarseDirt(FabricBlockSettings.copy(Blocks.COARSE_DIRT).strength(3.0f).requiresTool().luminance(state -> state.get(SuspiciousCoarseDirt.ANT) ? 0 : 0)), ModItemGroup.FYBERITE);
    public static final Block TRANSPARENT_BLOCK = registerBlock("transparent_block",
            new GlassBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS).sounds(BlockSoundGroup.WART_BLOCK).strength(1.0f)), ModItemGroup.FYBERITE);
    public static final Block END_WART_BLOCK = registerBlock("end_wart_block",
            new GlassBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS).sounds(BlockSoundGroup.WART_BLOCK).strength(1.0f)), ModItemGroup.FYBERITE);
    public static final Block BLUE_WART = registerBlock("blue_wart",
            new GlassBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS).sounds(BlockSoundGroup.MOSS_BLOCK).strength(1.0f)), ModItemGroup.FYBERITE);
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(SkyBlock.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        SkyBlock.LOGGER.info("Registering ModBlocks for " + SkyBlock.MOD_ID);
    }
}
