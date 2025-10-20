package net.me.backport_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;

public class BP_Items {
    public static final Item BP__PALE_HANGING_MOSS = SkyCore.BuiltinRegistries.registerItem("bp__pale_hanging_moss",
            new AliasedBlockItem(BP_Blocks.BP__PALE_HANGING_MOSS, new Item.Settings()));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"Backport\" innermod");
    }
}
