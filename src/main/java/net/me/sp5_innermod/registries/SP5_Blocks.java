package net.me.sp5_innermod.registries;

import net.me.skycore_supermod.BaseTallPlantBlock;
import net.me.skycore_supermod.ModStairsBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.me.sp5_innermod.blocks.BluisheLightStemBlock;
import net.me.sp5_innermod.blocks.EndFlower;
import net.me.sp5_innermod.blocks.EndVegetation;
import net.me.sp5_innermod.blocks.EnderBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;

public class SP5_Blocks {
    public static final Block SP5__ENDMERALD_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_emerald_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__ENDMERALD_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_emerald_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()
                    .mapColor(MapColor.EMERALD_GREEN)));
    public static final Block SP5__ENDERITE_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__enderite_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__ENDERITE_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__enderite_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__ASTEROID_RESIDUES = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__asteroid_residues",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__SOLID_ROCK = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__solid_rock",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()
                    .mapColor(MapColor.BLACK)));
    public static final Block SP5__END_GRASS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_grass",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .sounds(BlockSoundGroup.GRASS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 7.5F)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block SP5__WARPED_NAVI_PLANT = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__warped_navi_plant",
            new BaseTallPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.TALL_GRASS)
                    .offset(AbstractBlock.OffsetType.NONE)
                    .mapColor(MapColor.CYAN), SP5__END_GRASS));
    public static final Block SP5__BLUISHE_GRASS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_end_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F)
                    .mapColor(MapColor.CYAN)));
    public static final Block SP5__END_GRASS_VEGETATION = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__ender_grass",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.GRASS)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__END_MUSHROOM = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_fungus",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_FUNGUS)
                    .sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__BLUISHE_BUSH = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_bush",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_FUNGUS)
                    .sounds(BlockSoundGroup.GRASS)
                    .mapColor(MapColor.LAPIS_BLUE)));
    public static final Block SP5__BLUISHE_MUSHROOM = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_fungus",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_FUNGUS)
                    .sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SP5__END_BUSH = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_bush",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.GRASS)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__END_FLOWER = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_flower",
            new EndFlower(AbstractBlock.Settings
                    .copy(Blocks.DANDELION)
                    .sounds(BlockSoundGroup.SPORE_BLOSSOM)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__TRANSPARENT_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__transparent_block",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(0.5f)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block SP5__END_WART_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_wart_block",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__BLUE_WART = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__blue_wart",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .strength(0.5f)
                    .mapColor(MapColor.CYAN)));
    public static final Block SP5__CRACKED_END_STONE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__cracked_end_stone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__WARPED_END_STONE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__warped_end_stone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__END_STONE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_stone_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__END_STONE_TILES = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_stone_tiles",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__SMALL_END_STONE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__small_end_stone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__SMOOTH_END_STONE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__smooth_end_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__CHISELED_END_STONE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__CHISELED_END_STONE_CUBIC = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone_cubic",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__CHISELED_END_STONE_MAZE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone_maze",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block SP5__PURPLE_END_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__PURPLE_END_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_stairs",
            new StairsBlock(SP5__PURPLE_END_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICK_STAIRS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__PURPLE_END_BRICK_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__WARPED_PURPLE_END_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__warped_purple_end_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__PURPLE_END_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICK_SLAB)
                    .strength(3.0f, 9.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__END_PURPLE_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SP5__END_PURPLE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_stairs",
            new StairsBlock(SP5__END_PURPLE_BLOCK.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.PURPUR_STAIRS)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SP5__END_PURPLE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SP5__ENDER_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__ender_block",
            new EnderBlock(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SP5__END_PURPLE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_SLAB)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SP5__END_STEM = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_STEM)
                    .strength(2.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__END_HYPHAE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_HYPHAE)
                    .strength(2.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__STRIPPED_END_STEM = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__stripped_end_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_STEM)
                    .strength(2.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__STRIPPED_END_HYPHAE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__stripped_end_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                    .strength(2.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__ENDLIGHT = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__endlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)
                    .mapColor(MapColor.PINK)));
    public static final Block SP5__END_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__END_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_stairs",
            new ModStairsBlock(SP5__END_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__END_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__end_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SP5__BLUISHE_STEM = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__BLUISHE_HYPHAE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__BLUISHE_LIGHT_STEM = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_light_stem",
            new BluisheLightStemBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__BLUISHE_LIGHT_HYPHAE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_light_hyphae",
            new BluisheLightStemBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__STRIPPED_BLUISHE_STEM = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__stripped_bluishe_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__STRIPPED_BLUISHE_HYPHAE = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__stripped_bluishe_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__BLUISHE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__BLUISHE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_stairs",
            new ModStairsBlock(SP5__BLUISHE_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block SP5__BLUISHE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BLUE)));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for \"Enderite Addon\" innermod");
    }
}
