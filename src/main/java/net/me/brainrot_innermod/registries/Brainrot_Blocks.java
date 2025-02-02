package net.me.brainrot_innermod.registries;

import net.me.brainrot_innermod.blocks.BrainrotCore;
import net.me.brainrot_innermod.blocks.BrainrottenSandBlock;
import net.me.brainrot_innermod.blocks.BrainrottenSoilBlock;
import net.me.brainrot_innermod.blocks.GrimaceShakeBlock;
import net.me.skycore_supermod.BaseShortPlantBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;

public class Brainrot_Blocks {
    //ABYSS
    //BRAINROT
    public static final Block BRAINROT__BRAINROT_CORE = SkyCore.BuiltinRegistries.registerBlockAndItem("brainrot__brainrot_core",
            new BrainrotCore(AbstractBlock.Settings
                    .copy(Blocks.HEAVY_CORE)
                    .mapColor(MapColor.PINK)));
    public static final Block BRAINROT__GRIMACE_SHAKE = SkyCore.BuiltinRegistries.registerBlockAndItem("brainrot__grimace_shake",
            new GrimaceShakeBlock(AbstractBlock.Settings
                    .copy(Blocks.COBWEB)
                    .sounds(BlockSoundGroup.HONEY)
                    .mapColor(MapColor.MAGENTA)));
    public static final Block BRAINROT__BRAINROTTEN_SOIL = SkyCore.BuiltinRegistries.registerBlockAndItem("brainrot__brainrotten_soil",
            new BrainrottenSoilBlock(AbstractBlock.Settings
                    .copy(Blocks.ROOTED_DIRT)
                    .mapColor(MapColor.BLACK)));
    public static final Block BRAINROT__BRAINROTTEN_SPROUTS = SkyCore.BuiltinRegistries.registerBlockAndItem("brainrot__brainrotten_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .mapColor(MapColor.BLACK), BRAINROT__BRAINROTTEN_SOIL)); //TODO: common tagkey for brainrot ground
    public static final Block BRAINROT__BRAINROTTEN_SAND = SkyCore.BuiltinRegistries.registerBlockAndItem("brainrot__brainrotten_sand",
            new BrainrottenSandBlock(new ColorCode(14406560), AbstractBlock.Settings
                    .copy(Blocks.SAND)
                    .mapColor(MapColor.BLACK)));
}
