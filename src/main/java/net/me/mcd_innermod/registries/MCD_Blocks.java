package net.me.mcd_innermod.registries;

import net.me.mcd_innermod.blocks.*;
import net.me.mcd_innermod.blocks.echoing_void.StrongholdDecorBlock;
import net.me.mcd_innermod.blocks.echoing_void.VoidBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.particle.ParticleTypes;

public class MCD_Blocks {
    public static final Block MCD__VOID_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__void_block",
            new VoidBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .strength(3.0f)
                    .requiresTool()));  //TODO: MAPCOLOR
    public static final Block MCD__OG_PURPUR_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__og_purpur_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_BLOCK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .mapColor(MapColor.MAGENTA)));
    public static final Block MCD__MOSSIER_COBBLESTONE = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__mossier_cobblestone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.COBBLESTONE)
                    .strength(2.0F, 6.0F)
                    .mapColor(MapColor.CYAN)));
    public static final Block MCD__MOSSIER_OAK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__mossier_oak_planks",
            new MossyOakPlanks(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f, 3.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block MCD__MOSSIER_SPRUCE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__mossier_spruce_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f, 3.0f)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block MCD__BARREN_GRASS_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__barren_grass_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F)
                    .mapColor(MapColor.YELLOW)));
    public static final Block MCD__DRIED_MOSS_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__dried_moss_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MOSS_BLOCK)
                    .mapColor(MapColor.ORANGE)));
    public static final Block MCD__DRIED_MOSS_CARPET = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__dried_moss_carpet",
            new CarpetBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSS_CARPET)
                    .mapColor(MapColor.ORANGE)));
    public static final Block MCD__MIDNIGHT_MOSS_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__midnight_moss_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MOSS_BLOCK)
                    .mapColor(MapColor.CYAN)));
    public static final Block MCD__MIDNIGHT_MOSS_CARPET = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__midnight_moss_carpet",
            new CarpetBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSS_CARPET)
                    .mapColor(MapColor.CYAN)));
    public static final Block MCD__MIDNIGHT_SPROUTS = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__midnight_sprouts",
            new ShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .mapColor(MapColor.CYAN)));
    public static final Block MCD__POP_FLOWER = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__pop_flower",
            new PopFlowerBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)
                    .mapColor(MapColor.CYAN)));
    public static final Block MCD__ANCIENT_GOLD_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__ancient_gold_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.GOLD_BLOCK)
                    .strength(Blocks.NETHERITE_BLOCK.getHardness(), Blocks.NETHERITE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block MCD__ANCIENT_LODESTONE = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__ancient_lodestone",
            new AncientLodestone(AbstractBlock.Settings
                    .copy(Blocks.LODESTONE)
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block MCD__SPIRIT_TORCH = SkyCore.BuiltinRegistries.registerBlock("mcd__spirit_torch",
            new SpiritTorchBlock(AbstractBlock.Settings
                    .copy(Blocks.SOUL_TORCH)
                    .luminance((state) -> 7)));
    public static final Block MCD__SPIRIT_WALL_TORCH = SkyCore.BuiltinRegistries.registerBlock("mcd__spirit_wall_torch",
            new WallSpiritTorchBlock(AbstractBlock.Settings
                    .copy(Blocks.SOUL_WALL_TORCH)
                    .dropsLike(MCD__SPIRIT_TORCH)
                    .luminance((state) -> 7)));
    //CUSTOM WORLD BLOCKS
    public static final Block MCD__STRONGHOLD_DECOR = SkyCore.BuiltinRegistries.registerBlockAndItem("mcd__stronghold_decor",
            new StrongholdDecorBlock(AbstractBlock.Settings
                    .copy(Blocks.BEDROCK)
                    .mapColor(MapColor.STONE_GRAY)));
    //CUSTOM WORLD BLOCKS
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for \"MCD\" innermod");
    }
}
