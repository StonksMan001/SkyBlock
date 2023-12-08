package net.me.skyblock.archived;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.blocks.abyss.AbyssVegetation;
import net.me.skyblock.blocks_and_items.blocks.abyss.BlueVigilantGrass;
import net.me.skyblock.blocks_and_items.blocks.end.EndFlower;
import net.me.skyblock.blocks_and_items.blocks.end.EndVegetation;
import net.me.skyblock.blocks_and_items.blocks.mcd.MossyOakPlanks;
import net.me.skyblock.blocks_and_items.blocks.skyblock.SuspiciousCoarseDirt;
import net.me.skyblock.blocks_and_items.blocks.util.ModStairsBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ArchivedBlocks {
    //SKYBLOCK MAIN-BLOCK
    public static final Block ENDMERALD_ORE = registerBlock("end_emerald_ore",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block ENDMERALD_BLOCK = registerBlock("end_emerald_block",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block ASTEROID_RESIDUES = registerBlock("asteroid_residues",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SOLID_ROCK = registerBlock("solid_rock",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block END_GRASS = registerBlock("end_grass",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE)
                    .sounds(BlockSoundGroup.GRASS)
                    .instrument(Instrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 7.5F)));
    public static final Block BLUISHE_GRASS = registerBlock("bluishe_end_stone",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE)
                    .instrument(Instrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F)));
    public static final Block ANT_JAM_BLOCK = registerBlock("ant_jam_block",
            new SlimeBlock(FabricBlockSettings
                    .copy(Blocks.HONEY_BLOCK)
                    .strength(0.01f)));
    public static final Block SWEET_BERRY_JAM_BLOCK = registerBlock("sweet_berry_jam_block",
            new SlimeBlock(FabricBlockSettings
                    .copy(Blocks.HONEY_BLOCK)
                    .strength(0.01f)));
    public static final Block SUSPICIOUS_COARSE_DIRT = registerBlock("suspicious_coarse_dirt",
            new SuspiciousCoarseDirt(FabricBlockSettings
                    .copy(Blocks.COARSE_DIRT)
                    .strength(0.5f)));
    public static final Block TRANSPARENT_BLOCK = registerBlock("transparent_block",
            new GlassBlock(FabricBlockSettings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(0.5f)));
    public static final Block END_WART_BLOCK = registerBlock("end_wart_block",
            new GlassBlock(FabricBlockSettings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block BLUE_WART = registerBlock("blue_wart",
            new GlassBlock(FabricBlockSettings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .strength(0.5f)));
    public static final Block END_STEM = registerBlock("end_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block END_HYPHAE = registerBlock("end_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block STRIPPED_END_STEM = registerBlock("stripped_end_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block STRIPPED_END_HYPHAE = registerBlock("stripped_end_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block ENDLIGHT = registerBlock("endlight",
            new Block(FabricBlockSettings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));
    public static final Block END_PLANKS = registerBlock("end_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)));
    public static final Block END_STAIRS = registerBlock("end_stairs",
            new ModStairsBlock(ArchivedBlocks.END_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block END_SLAB = registerBlock("end_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block BLUISHE_STEM = registerBlock("bluishe_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block BLUISHE_HYPHAE = registerBlock("bluishe_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block BLUISHE_LIGHT_STEM = registerBlock("bluishe_light_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block BLUISHE_LIGHT_HYPHAE = registerBlock("bluishe_light_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block STRIPPED_BLUISHE_STEM = registerBlock("stripped_bluishe_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block STRIPPED_BLUISHE_HYPHAE = registerBlock("stripped_bluishe_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block BLUISHE_PLANKS = registerBlock("bluishe_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block BLUISHE_STAIRS = registerBlock("bluishe_stairs",
            new ModStairsBlock(ArchivedBlocks.BLUISHE_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block BLUISHE_SLAB = registerBlock("bluishe_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LOG)
                    .strength(2.0f)));
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_WOOD)
                    .strength(2.0f)));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)));
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)));
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f)));
    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs",
            new ModStairsBlock(ArchivedBlocks.AZALEA_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)));
    public static final Block AZALEA_SLAB = registerBlock("azalea_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)));
    //SKYBLOCK MAIN-BLOCK
    //MCD
    public static final Block MOSSIER_COBBLESTONE = registerBlock("mossier_cobblestone",
            new Block(FabricBlockSettings
                    .copy(Blocks.COBBLESTONE)
                    .strength(2.0F, 6.0F)));
    public static final Block MOSSIER_OAK_PLANKS = registerBlock("mossier_oak_planks",
            new MossyOakPlanks(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f, 3.0f)));
    public static final Block MOSSIER_SPRUCE_PLANKS = registerBlock("mossier_spruce_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f, 3.0f)));
    //MCD
    //QUARK
    public static final Block APPLE_CRATE = registerBlock("apple_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block CARROT_CRATE = registerBlock("carrot_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block POTATO_CRATE = registerBlock("potato_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block SWEET_BERRY_SACK = registerBlock("sweet_berry_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block GLOW_BERRY_SACK = registerBlock("glow_berry_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block COCOA_BEANS_SACK = registerBlock("cocoa_beans_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block GUNPOWDER_SACK = registerBlock("gunpowder_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block NETHER_WART_SACK = registerBlock("nether_wart_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block STICK_BLOCK = registerBlock("stick_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)));
    public static final Block SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)));
    public static final Block CACTUS_BLOCK = registerBlock("cactus_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(1.0f)));
    public static final Block CHORUS_FRUIT_BLOCK = registerBlock("chorus_fruit_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block ANDESITE_PILLAR = registerBlock("andesite_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(1.5f, 6.0f)));
    public static final Block DIORITE_PILLAR = registerBlock("diorite_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(1.5f, 6.0f)));
    public static final Block GRANITE_PILLAR = registerBlock("granite_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(1.5f, 6.0f)));
    public static final Block CAVE_ROOTS = registerBlock("cave_roots",
            new VineBlock(FabricBlockSettings
                    .copyOf(Blocks.VINE)
                    .noCollision()
                    .ticksRandomly()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.VINE)));
    //QUARK
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(SkyBlock.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SkyBlock.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }
    public static void registerArchivedBlocks() {
        SkyBlock.LOGGER.info("Registering Archived Blocks for " + SkyBlock.MOD_ID);
    }
}