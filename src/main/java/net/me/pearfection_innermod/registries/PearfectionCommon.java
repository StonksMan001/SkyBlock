package net.me.pearfection_innermod.registries;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skycore_supermod.InnerMod;

public class PearfectionCommon extends InnerMod {
    @Override
    public void activate() {
        Pearfection_Blocks.register();
        StrippableBlockRegistry.register(Pearfection_Blocks.DIGPEAR__CALLERY_LOG, Pearfection_Blocks.DIGPEAR__STRIPPED_CALLERY_LOG);
        StrippableBlockRegistry.register(Pearfection_Blocks.DIGPEAR__CALLERY_WOOD, Pearfection_Blocks.DIGPEAR__STRIPPED_CALLERY_WOOD);
    }
}
