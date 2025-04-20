package net.me.mcd_innermod.registries;

import com.mojang.serialization.Codec;
import net.me.mcd_innermod.components.McdRarity;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.component.ComponentType;

public class MCD_DataComponentTypes {
    public static final ComponentType<Boolean> MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE = SkyCore.BuiltinRegistries.registerComponentType("mcd__twin_bow_attack_player_entities_toggle", booleanBuilder -> {
        return booleanBuilder.codec(Codec.BOOL);
    });
    public static final ComponentType<Boolean> MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE = SkyCore.BuiltinRegistries.registerComponentType("mcd__iron_hide_amulet_personal_toggle", booleanBuilder -> {
        return booleanBuilder.codec(Codec.BOOL);
    });
    public static final ComponentType<McdRarity> MCD__RARITY = SkyCore.BuiltinRegistries.registerComponentType("mcd__rarity", (mcdRarityBuilder) -> {
        return mcdRarityBuilder.codec(McdRarity.CODEC);
    });
    public static final ComponentType<Long> MCD__ACCELERATE_LAST_SHOT_TIME = SkyCore.BuiltinRegistries.registerComponentType("mcd__accelerate_last_shot_time", longBuilder -> {
        return longBuilder.codec(Codec.LONG);
    });
    public static final ComponentType<Float> MCD__ACCELERATE_RELOAD_BONUS = SkyCore.BuiltinRegistries.registerComponentType("mcd__accelerate_reload_bonus", floatBuilder -> {
        return floatBuilder.codec(Codec.FLOAT);
    });
    public static final ComponentType<Integer> MCD__STEEL_MACE_ATTACK_CHAIN = SkyCore.BuiltinRegistries.registerComponentType("mcd__steel_mace_attack_chain", integerBuilder -> {
        return integerBuilder.codec(Codec.INT);
    });
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering DataComponentTypes for \"MCD\" innermod");
    }
}
