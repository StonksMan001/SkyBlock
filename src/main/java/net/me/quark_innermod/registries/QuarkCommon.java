package net.me.quark_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class QuarkCommon extends InnerMod {
    @Override
    public void activate() {
        //QuarkFabric quark = new QuarkFabric();
        //quark.onInitialize();
        Quark_Blocks.register();
        //Quark_BlockTags.register();
    }
}
