package net.me.create_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class CreateCommon extends InnerMod {
    @Override
    public void activate() {
        Create_Items.register();
    }
}
