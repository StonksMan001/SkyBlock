package net.me.skyblock.sound;

import net.me.skyblock.SkyBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent WITHERSTORM_THEME = registerSoundEvent("wither_storm_theme");
    public static SoundEvent ABYSS_AMCIENCE = registerSoundEvent("abyss_amcience");
    public static SoundEvent ABYSS_RESONATOR_AMBIENCE = registerSoundEvent("abyss_resonator_ambience");
    public static SoundEvent AMBIENT_JUMPSCARE_EFFECT = registerSoundEvent("ambient_jumpscare_effect");
    public static SoundEvent AMBIENTMUSIC = registerSoundEvent("ambientmusic");
    public static SoundEvent CORRUPTED_VALLEY = registerSoundEvent("corrupted_valley");
    public static SoundEvent DREAM_EVENT_1 = registerSoundEvent("dream_event_1");
    public static SoundEvent DREAM_EVENT_2 = registerSoundEvent("dream_event_2");
    public static SoundEvent END_GAME = registerSoundEvent("end_game");
    public static SoundEvent FEAR_EVENT_1 = registerSoundEvent("fear_event_1");
    public static SoundEvent FEAR_EVENT_2 = registerSoundEvent("fear_event_2");
    public static SoundEvent JASON_JOHNSON_THE_CYANIDEX_THEME = registerSoundEvent("jason_johnson_-_the_cyanidex_theme");
    public static SoundEvent JJ_FIRST_DREAM = registerSoundEvent("jj_first_dream");
    public static SoundEvent RANDOMFX_1 = registerSoundEvent("randomfx_1");
    public static SoundEvent RANDOMFX_2 = registerSoundEvent("randomfx_2");
    public static SoundEvent RANDOMFX_3 = registerSoundEvent("randomfx_3");
    public static SoundEvent RANDOMFX_4 = registerSoundEvent("randomfx_4");
    public static SoundEvent RANDOMFX_5 = registerSoundEvent("randomfx_5");
    public static SoundEvent RANDOMFX_6 = registerSoundEvent("randomfx_6");
    public static SoundEvent RANDOMFX_7 = registerSoundEvent("randomfx_7");
    public static SoundEvent RANDOMFX_8 = registerSoundEvent("randomfx_8");
    public static SoundEvent RANDOMFX_9 = registerSoundEvent("randomfx_9");
    public static SoundEvent RANDOMFX_10 = registerSoundEvent("randomfx_10");
    public static SoundEvent RANDOMFX_11 = registerSoundEvent("randomfx_11");
    public static SoundEvent RUMA_AMBIENCE = registerSoundEvent("ruma_ambience");
    public static SoundEvent RUMA_MUSIC = registerSoundEvent("ruma_music");
    public static SoundEvent RUMA_MUSIC_2 = registerSoundEvent("ruma_music_2");
    public static SoundEvent SLIME_FOREST = registerSoundEvent("slime_forest");
    public static SoundEvent THE_ABYSS_A_NEW_ERA = registerSoundEvent("the_abyss_-_a_new_era");
    public static SoundEvent THE_ABYSS_FADED_REALITY = registerSoundEvent("the_abyss_-_faded_reality");
    public static SoundEvent THE_ABYSS_FROSTED = registerSoundEvent("the_abyss_-_frosted");
    public static SoundEvent THE_ABYSS_JOURNEYS = registerSoundEvent("the_abyss_-_journeys");
    public static SoundEvent THE_ABYSS_LOST_IN_DESSERT = registerSoundEvent("the_abyss_-_lost_in_dessert");
    public static SoundEvent BROKEN_RADIO = registerSoundEvent("broken_radio");
    public static SoundEvent WISP_ATTRACT_1 = registerSoundEvent("wisp_attract_1");
    public static SoundEvent WISP_ATTRACT_2 = registerSoundEvent("wisp_attract_2");
    public static SoundEvent WISP_ATTRACT_3 = registerSoundEvent("wisp_attract_3");
    public static SoundEvent WISP_ATTRACT_4 = registerSoundEvent("wisp_attract_4");
    public static SoundEvent WISP_MOTION_1 = registerSoundEvent("wisp_motion_1");
    public static SoundEvent WISP_MOTION_2 = registerSoundEvent("wisp_motion_2");
    public static SoundEvent WISP_MOTION_3 = registerSoundEvent("wisp_motion_3");
    public static SoundEvent WANDERLUST = registerSoundEvent("wanderlust");
    public static SoundEvent SKOGSSTUGA = registerSoundEvent("skogsstuga");
    public static SoundEvent INTERTILE = registerSoundEvent("intertile");
    public static SoundEvent HALLAND = registerSoundEvent("halland");
    public static SoundEvent FINNBACKA = registerSoundEvent("finnbacka");
    public static SoundEvent DALARNA = registerSoundEvent("dalarna");
    public static SoundEvent CRYPT = registerSoundEvent("crypt");
    public static SoundEvent CREEPER_WOODS = registerSoundEvent("creeper_woods");
    public static SoundEvent CARAVAN = registerSoundEvent("caravan");
    public static SoundEvent BROKEN_HEARTH_OF_ENDER = registerSoundEvent("broken_hearth_of_ender");
    public static SoundEvent OBSIDIAN_CAVERN = registerSoundEvent("obsidian_cavern");
    public static SoundEvent TO_THE_BEGINNING = registerSoundEvent("to_the_beginning");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SkyBlock.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
