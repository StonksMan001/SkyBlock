package net.me.skyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup FYBERITE;
    public static ItemGroup UNUSED;
    public static ItemGroup ABYSS;

    public static void registerItemGroups() {
        FYBERITE = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "features"))
                .displayName(Text.literal("Sky Block: Feature"))
                .icon(() -> new ItemStack(ModItems.ENDERITE_SWORD)).build();
        UNUSED = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "unused"))
                .displayName(Text.literal("Sky Block: Unused"))
                .icon(() -> new ItemStack(ModItems.FYBERITE)).build();
        ABYSS = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "classified"))
                .displayName(Text.literal("Sky Block: Classified"))
                .icon(() -> new ItemStack(ModBlocks.UNSTABLE_OBSIDIAN)).build();

    }
}
