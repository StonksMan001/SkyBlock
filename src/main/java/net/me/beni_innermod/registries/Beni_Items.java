package net.me.beni_innermod.registries;

import net.me.skycore_supermod.ToolAPI;
import net.me.skycore_supermod.common_registries.SkyCore_ToolMaterials;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.Item;

public class Beni_Items {
    public static final Item SKYBLOCK__LIGHTNING_SWORD = SkyCore.BuiltinRegistries.registerItem("skyblock__lightning_sword",
            new ToolAPI.SwordItem(SkyCore_ToolMaterials.BENIKARD, 3, 3.5f - 4f, new Item.Settings()));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"BeniMod\" innermod");
    }
}
