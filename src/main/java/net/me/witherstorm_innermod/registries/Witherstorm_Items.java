package net.me.witherstorm_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.DiscFragmentItem;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Witherstorm_Items {
    public static final Item WITHERSTORM__MUSIC_DISC_WITHERSTORM = SkyCore.BuiltinRegistries.registerItem("witherstorm__music_disc_witherstorm_theme",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(Witherstorm_JukeBoxSongs.WITHERSTORM_THEME)));
    public static final Item WITHERSTORM__DISC_FRAGMENT_WITHERSTORM = SkyCore.BuiltinRegistries.registerItem("witherstorm__disc_fragment_witherstorm_theme",
            new DiscFragmentItem(new Item.Settings()));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"Witherstorm\" innermod");
    }
}
