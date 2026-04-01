package net.me.create_innermod.registries;

import net.me.create_innermod.items.NuggetOfExperienceItem;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.Item;

public class Create_Items {
    public static final Item CREATE__NUGGET_OF_EXPERIENCE = SkyCore.BuiltinRegistries.registerItem("create__nugget_of_experience",
            new NuggetOfExperienceItem(new Item.Settings()));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"Create\" innermod");
    }
}
