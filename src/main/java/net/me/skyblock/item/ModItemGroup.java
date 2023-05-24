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
    public static ItemGroup MCD;
    public static ItemGroup UNUSED;
    public static ItemGroup ABYSS;
    public static ItemGroup PEARFECTION;

    public static void registerItemGroups() {
        FYBERITE = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "features"))
                .displayName(Text.literal("Sky Block: Feature (Qbaesz13, SoryYPMod)"))
                .icon(() -> new ItemStack(ModItems.ENDERITE_SWORD)).build();
        UNUSED = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "unused"))
                .displayName(Text.literal("Sky Block: Unused (Qbaesz13)"))
                .icon(() -> new ItemStack(ModItems.FYBERITE)).build();
        ABYSS = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "classified"))
                .displayName(Text.literal("The Abyss Chapter II: Feature (Y3Z0N)"))
                .icon(() -> new ItemStack(ModItems.LORAN)).build();
        PEARFECTION = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "classified"))
                .displayName(Text.literal("Pearfection: Feature (DigitalPear_11)"))
                .icon(() -> new ItemStack(ModBlocks.FLOWERING_CALLERY_LEAVES)).build();
        MCD = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "mcd"))
                .displayName(Text.literal("Sky Block: Minecraft Dungeons (ilosemypotato)"))
                .icon(() -> new ItemStack(ModBlocks.MOSSIER_COBBLESTONE)).build();
    }
}
