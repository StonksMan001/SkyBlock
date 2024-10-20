package net.me.skyblock.sound;

import net.me.skyblock.SkyBlock;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;

public interface ModJukeBoxSongs {
    RegistryKey<JukeboxSong> WITHERSTORM_THEME = SkyBlock.BuiltinRegistries.ofJukeBlockSongRegistry("wither_storm_theme");
}
