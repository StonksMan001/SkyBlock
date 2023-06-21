package net.me.skyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup FYBERITE = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID, "citrine"),
            FabricItemGroup.builder().displayName(Text.literal("Sky Block: Feature (Qbaesz13, SoryYPMod)")).icon(() -> new ItemStack(ModItems.ENDERITE_SWORD)).entries((displayContext, entries) -> {
                entries.add(ModItems.ENDERITE_INGOT);
            }).build());
    public static ItemGroup MCD = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"minecraft_dungeons"),
            FabricItemGroup.builder().displayName(Text.literal("Sky Block: Minecraft Dungeons (ilosemypotato)")).icon(() -> new ItemStack(ModItems.TWIN_BOW)).entries((displayContext, entries) -> {
                entries.add(ModItems.TWIN_BOW);
            }).build());
    public static ItemGroup UNUSED = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"unused"),
            FabricItemGroup.builder().displayName(Text.literal("Sky Block: Unused (Qbaesz13)")).icon(() -> new ItemStack(ModItems.FYBERITE)).entries((displayContext, entries) -> {
                entries.add(ModItems.MUSIC_DISC_WITHERSTORM);
            }).build());
    public static ItemGroup ABYSS = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"classified"),
            FabricItemGroup.builder().displayName(Text.literal("The Abyss Chapter II: Feature (Y3Z0N)")).icon(() -> new ItemStack(ModItems.LORAN)).entries((displayContext, entries) -> {
                entries.add(ModItems.ABERYTHE_GEM);
            }).build());
    public static ItemGroup QUARK = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"quark"),
            FabricItemGroup.builder().displayName(Text.literal("Quark: Features (Vazkii)")).icon(() -> new ItemStack(ModBlocks.APPLE_CRATE)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.APPLE_CRATE);
            }).build());
    public static ItemGroup PEARFECTION = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"pearfection"),
            FabricItemGroup.builder().displayName(Text.literal("Pearfection: Feature (DigitalPear_11)")).icon(() -> new ItemStack(ModBlocks.FLOWERING_CALLERY_LEAVES)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.CALLERY_LEAVES);
            }).build());

    public static void registerItemGroups() {}
}
