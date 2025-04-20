package net.me.witherstorm_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;

public class Witherstorm_JukeBoxSongs {
    public static final RegistryKey<JukeboxSong> WITHERSTORM_THEME = SkyCore.BuiltinRegistries.ofJukeBlockSongRegistry("wither_storm_theme");
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering JukeBoxSongs for \"Witherstorm\" innermod");
    }
}
