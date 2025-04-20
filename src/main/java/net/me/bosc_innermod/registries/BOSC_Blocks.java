package net.me.bosc_innermod.registries;

import net.me.bosc_innermod.blocks.SculkJawBlock;
import net.me.skycore_supermod.BaseShortPlantBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class BOSC_Blocks {
    //BUNCH O' SCULK
    public static final Block BOSC__SCULK_JAW = SkyCore.BuiltinRegistries.registerBlockAndItem("bosc__sculk_jaw",
            new SculkJawBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .strength(1f)
                    .mapColor(MapColor.BLACK), Blocks.SCULK));
    public static final Block BOSC__DEAD_SCULK = SkyCore.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk",
            new SculkBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .sounds(BlockSoundGroup.CORAL)
                    .mapColor(MapColor.BLACK)));
    public static final Block BOSC__DEAD_SCULK_JAW = SkyCore.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk_jaw",
            new SculkBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .sounds(BlockSoundGroup.CORAL)
                    .mapColor(MapColor.BLACK)));
    public static final Block BOSC__DEAD_SCULK_SPROUTS = SkyCore.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .mapColor(MapColor.DEEPSLATE_GRAY), BOSC_BlockTags.BOSC__DEAD_SCULK_GROUND));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for \"Bunch 'o Sculk\" innermod");
    }
}
