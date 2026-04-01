package net.me.abyss_innermod.registries;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skycore_supermod.InnerMod;

public class AbyssCommon extends InnerMod {
    @Override
    public void activate() {
        Abyss_ArmorMaterials.register();
        Abyss_Blocks.register();
        Abyss_Dimensions.register();
        Abyss_Items.register();
        Abyss_Sounds.register();
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BLARU_LOG, Abyss_Blocks.ABYSS__STRIPPED_BLARU_LOG);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BLARU_WOOD, Abyss_Blocks.ABYSS__STRIPPED_BLARU_WOOD);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__FROZEN_LOG, Abyss_Blocks.ABYSS__STRIPPED_FROZEN_LOG);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__VIGILANT_LOG, Abyss_Blocks.ABYSS__STRIPPED_VIGILANT_LOG);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__VIGILANT_WOOD, Abyss_Blocks.ABYSS__STRIPPED_VIGILANT_WOOD);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__FROZEN_WOOD, Abyss_Blocks.ABYSS__STRIPPED_FROZEN_WOOD);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SLIMED_LOG, Abyss_Blocks.ABYSS__STRIPPED_SLIMED_LOG);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SLIMED_WOOD, Abyss_Blocks.ABYSS__STRIPPED_SLIMED_WOOD);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BOG_SHROOM_LOG, Abyss_Blocks.ABYSS__STRIPPED_BOG_SHROOM_LOG);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BOG_SHROOM_WOOD, Abyss_Blocks.ABYSS__STRIPPED_BOG_SHROOM_WOOD);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SAL_SHROOM_LOG, Abyss_Blocks.ABYSS__STRIPPED_SAL_SHROOM_LOG);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SAL_SHROOM_WOOD, Abyss_Blocks.ABYSS__STRIPPED_SAL_SHROOM_WOOD);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__ABYSS_JUNGLE_LOG, Abyss_Blocks.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG);
        StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__ABYSS_JUNGLE_WOOD, Abyss_Blocks.ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD);
    }
}
