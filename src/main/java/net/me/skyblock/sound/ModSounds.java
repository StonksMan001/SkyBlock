package net.me.skyblock.sound;

import net.me.skyblock.SkyBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SkyBlock.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
