package net.me.skyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.me.skyblock.SkyBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup FYBERITE;

    public static void registerItemGroups() {
        FYBERITE = FabricItemGroup.builder(new Identifier(SkyBlock.MOD_ID, "fyberite"))
                .displayName(Text.literal("Sky Block"))
                .icon(() -> new ItemStack(ModItems.FYBERITE)).build();
    }
}
