package net.me.beni_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class BeniCommon extends InnerMod {
    @Override
    public void activate() {
        Beni_Items.register();
    }
}
