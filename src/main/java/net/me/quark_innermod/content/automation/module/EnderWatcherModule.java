package net.me.quark_innermod.content.automation.module;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.me.quark_innermod.content.automation.block.EnderWatcherBlock;
import net.me.quark_innermod.content.automation.block_entity.EnderWatcherBlockEntity;
import net.me.quark_innermod.internal_zeta.org.ZetaModule;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;

public class EnderWatcherModule extends ZetaModule {
    public static BlockEntityType<EnderWatcherBlockEntity> enderWatcherBlockEntityType;
    public static Block enderWatcherBlock;
    @Override
    public void register() {
        enderWatcherBlock = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__ender_watcher",
                new EnderWatcherBlock(AbstractBlock.Settings
                        .create().mapColor(MapColor.GREEN)
                        .strength(3f, 10f)
                        .sounds(BlockSoundGroup.METAL)));
        enderWatcherBlockEntityType = SkyCore.BuiltinRegistries.registerBlockEntityType("quark__ender_watcher",
                BlockEntityType.Builder.create(EnderWatcherBlockEntity::new, enderWatcherBlock).build());
    }
    @Override
    public void registerClient() {
    }
}
