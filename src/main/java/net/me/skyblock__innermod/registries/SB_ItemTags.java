package net.me.skyblock__innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

public class SB_ItemTags {
    public static final TagKey<Item> SKYBLOCK__FIR_LOGS = SkyCore.BuiltinRegistries.createItemTag("skyblock__fir_logs");
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering ItemTags for \"SkyBlock\" innermod");
    }
}
