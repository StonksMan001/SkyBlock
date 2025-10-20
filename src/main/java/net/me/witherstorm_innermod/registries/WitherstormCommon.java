package net.me.witherstorm_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class WitherstormCommon extends InnerMod {
    @Override
    public void activate() {
        Witherstorm_Items.register();
        Witherstorm_JukeBoxSongs.register();
        Witherstorm_Sounds.register();
    }
}
