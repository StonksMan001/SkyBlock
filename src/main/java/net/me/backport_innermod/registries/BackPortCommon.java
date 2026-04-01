package net.me.backport_innermod.registries;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skycore_supermod.InnerMod;

public class BackPortCommon extends InnerMod {
    @Override
    public void activate() {
        BP_Biomes.register();
        BP_Blocks.register();
        BP_ConfiguredFeatures.register();
        BP_Items.register();
        BP_SaplingGenerators.register();
        StrippableBlockRegistry.register(BP_Blocks.BP__PALE_LOG, BP_Blocks.BP__STRIPPED_PALE_LOG);
        StrippableBlockRegistry.register(BP_Blocks.BP__PALE_WOOD, BP_Blocks.BP__STRIPPED_PALE_WOOD);
    }
}
