package net.me.bosc_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class BunchOSculkCommon extends InnerMod {
    @Override
    public void activate() {
        BOSC_Blocks.register();
        BOSC_BlockTags.register();
    }
}
