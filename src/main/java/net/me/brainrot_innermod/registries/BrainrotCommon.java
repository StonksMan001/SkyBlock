package net.me.brainrot_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class BrainrotCommon extends InnerMod {
    @Override
    public void activate() {
        Brainrot_Blocks.register();
        Brainrot_GameRules.register();
    }
}
