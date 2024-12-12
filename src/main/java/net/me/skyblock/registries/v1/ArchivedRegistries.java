package net.me.skyblock.registries.v1;

import net.me.skyblock.api.skycore.ArmorAPI;
import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.blocks.mcd.MossyOakPlanks;
import net.me.skyblock.blocks.skyblock.SuspiciousCoarseDirt;
import net.me.skyblock.blocks.util.ModStairsBlock;
import net.me.skyblock.items.end.EnchantedEnderiteAppleItem;
import net.me.skyblock.registries.SkyBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ArchivedRegistries {
    public static class ArchivedBlockRegistries {
        //SKYBLOCK MAIN-BLOCK
        public static final Block ENDMERALD_ORE = registerBlock("end_emerald_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block ENDMERALD_BLOCK = registerBlock("end_emerald_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.EMERALD_BLOCK)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.EMERALD_GREEN)));
        public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.EMERALD_BLOCK)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PURPLE)));
        public static final Block ASTEROID_RESIDUES = registerBlock("asteroid_residues",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SOLID_ROCK = registerBlock("solid_rock",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.BLACK)));
        public static final Block END_GRASS = registerBlock("end_grass",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .sounds(BlockSoundGroup.GRASS)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool()
                        .strength(2.0F, 7.5F)
                        .mapColor(MapColor.TERRACOTTA_PURPLE)));
        public static final Block BLUISHE_GRASS = registerBlock("bluishe_end_stone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool()
                        .strength(3.0F, 9.0F)
                        .mapColor(MapColor.CYAN)));
        public static final Block ANT_JAM_BLOCK = registerBlock("ant_jam_block",
                new SlimeBlock(AbstractBlock.Settings
                        .copy(Blocks.HONEY_BLOCK)
                        .strength(0.01f)
                        .mapColor(MapColor.LIGHT_GRAY)));
        public static final Block SWEET_BERRY_JAM_BLOCK = registerBlock("sweet_berry_jam_block",
                new SlimeBlock(AbstractBlock.Settings
                        .copy(Blocks.HONEY_BLOCK)
                        .strength(0.01f)
                        .mapColor(MapColor.DARK_RED)));
        public static final Block SUSPICIOUS_COARSE_DIRT = registerBlock("suspicious_coarse_dirt",
                new SuspiciousCoarseDirt(AbstractBlock.Settings
                        .copy(Blocks.COARSE_DIRT)
                        .strength(0.5f)
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block TRANSPARENT_BLOCK = registerBlock("transparent_block",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BLACK_STAINED_GLASS)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(0.5f)
                        .mapColor(MapColor.TERRACOTTA_PURPLE)));
        public static final Block END_WART_BLOCK = registerBlock("end_wart_block",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BLACK_STAINED_GLASS)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block BLUE_WART = registerBlock("blue_wart",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BLACK_STAINED_GLASS)
                        .sounds(BlockSoundGroup.MOSS_BLOCK)
                        .strength(0.5f)
                        .mapColor(MapColor.CYAN)));
        public static final Block END_STEM = registerBlock("end_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block END_HYPHAE = registerBlock("end_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block STRIPPED_END_STEM = registerBlock("stripped_end_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_CRIMSON_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block STRIPPED_END_HYPHAE = registerBlock("stripped_end_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block ENDLIGHT = registerBlock("endlight",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SHROOMLIGHT)
                        .strength(1.0f)
                        .mapColor(MapColor.PINK)));
        public static final Block END_PLANKS = registerBlock("end_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block END_STAIRS = registerBlock("end_stairs",
                new ModStairsBlock(ArchivedBlockRegistries.END_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block END_SLAB = registerBlock("end_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));


        public static final Block BLUISHE_STEM = registerBlock("bluishe_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block BLUISHE_HYPHAE = registerBlock("bluishe_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block BLUISHE_LIGHT_STEM = registerBlock("bluishe_light_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block BLUISHE_LIGHT_HYPHAE = registerBlock("bluishe_light_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block STRIPPED_BLUISHE_STEM = registerBlock("stripped_bluishe_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block STRIPPED_BLUISHE_HYPHAE = registerBlock("stripped_bluishe_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block BLUISHE_PLANKS = registerBlock("bluishe_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block BLUISHE_STAIRS = registerBlock("bluishe_stairs",
                new ModStairsBlock(ArchivedBlockRegistries.BLUISHE_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block BLUISHE_SLAB = registerBlock("bluishe_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));


        public static final Block AZALEA_LOG = registerBlock("azalea_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs",
                new ModStairsBlock(ArchivedBlockRegistries.AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.OAK_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block AZALEA_SLAB = registerBlock("azalea_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        //SKYBLOCK MAIN-BLOCK
        //MCD
        public static final Block MOSSIER_COBBLESTONE = registerBlock("mossier_cobblestone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.COBBLESTONE)
                        .strength(2.0F, 6.0F)
                        .mapColor(MapColor.CYAN)));
        public static final Block MOSSIER_OAK_PLANKS = registerBlock("mossier_oak_planks",
                new MossyOakPlanks(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .strength(2.0f, 3.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block MOSSIER_SPRUCE_PLANKS = registerBlock("mossier_spruce_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_PLANKS)
                        .strength(2.0f, 3.0f)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        //MCD
        //QUARK
        public static final Block APPLE_CRATE = registerBlock("apple_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.RED)));
        public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.TERRACOTTA_PURPLE)));
        public static final Block CARROT_CRATE = registerBlock("carrot_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.TERRACOTTA_ORANGE)));
        public static final Block POTATO_CRATE = registerBlock("potato_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.GOLD)));
        public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.GOLD)));
        public static final Block SWEET_BERRY_SACK = registerBlock("sweet_berry_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.DARK_RED)));
        public static final Block GLOW_BERRY_SACK = registerBlock("glow_berry_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.YELLOW)));
        public static final Block COCOA_BEANS_SACK = registerBlock("cocoa_beans_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.BROWN)));
        public static final Block GUNPOWDER_SACK = registerBlock("gunpowder_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.DEEPSLATE_GRAY)));
        public static final Block NETHER_WART_SACK = registerBlock("nether_wart_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.DARK_RED)));
        public static final Block STICK_BLOCK = registerBlock("stick_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.BAMBOO_WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        public static final Block SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.BAMBOO_WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.EMERALD_GREEN)));
        public static final Block CACTUS_BLOCK = registerBlock("cactus_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOL)
                        .strength(1.0f)
                        .mapColor(MapColor.DARK_GREEN)));
        public static final Block CHORUS_FRUIT_BLOCK = registerBlock("chorus_fruit_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block ANDESITE_PILLAR = registerBlock("andesite_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.ANDESITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.STONE_GRAY)));
        public static final Block DIORITE_PILLAR = registerBlock("diorite_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.DIORITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.OFF_WHITE)));
        public static final Block GRANITE_PILLAR = registerBlock("granite_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.GRANITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block CAVE_ROOTS = registerBlock("cave_roots",
                new VineBlock(AbstractBlock.Settings
                        .copy(Blocks.VINE)
                        .noCollision()
                        .ticksRandomly()
                        .strength(0.2f)
                        .sounds(BlockSoundGroup.VINE)
                        .mapColor(MapColor.OAK_TAN)));
        //QUARK
        private static Block registerBlockWithoutItem(String name, Block block) {
            return Registry.register(Registries.BLOCK, Identifier.of(SkyBlock.MOD_ID, name), block);
        }

        private static Block registerBlock(String name, Block block) {
            registerBlockItem(name, block);
            return Registry.register(Registries.BLOCK, Identifier.of(SkyBlock.MOD_ID, name), block);
        }
        private static Item registerBlockItem(String name, Block block) {
            return Registry.register(Registries.ITEM, Identifier.of(SkyBlock.MOD_ID, name),
                    new BlockItem(block, new Item.Settings()));
        }

        private static boolean always(BlockState state, BlockView world, BlockPos pos) {
            return true;
        }
        private static boolean never(BlockState state, BlockView world, BlockPos pos) {
            return false;
        }
        public static void registerArchivedBlocks() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Archived Blocks for " + SkyBlock.MOD_ID);
        }
    }

    public static class ArchivedItemRegistries {
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
}
