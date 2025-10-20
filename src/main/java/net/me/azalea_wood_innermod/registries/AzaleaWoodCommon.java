package net.me.azalea_wood_innermod.registries;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skycore_supermod.InnerMod;

public class AzaleaWoodCommon extends InnerMod {
    @Override
    public void activate() {
        AzaleaWood_Blocks.register();
        StrippableBlockRegistry.register(AzaleaWood_Blocks.FLOGICAL__AZALEA_LOG, AzaleaWood_Blocks.FLOGICAL__STRIPPED_AZALEA_LOG);
        StrippableBlockRegistry.register(AzaleaWood_Blocks.FLOGICAL__AZALEA_WOOD, AzaleaWood_Blocks.FLOGICAL__STRIPPED_AZALEA_WOOD);
    }
}
