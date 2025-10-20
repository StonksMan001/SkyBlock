package net.me.mcd_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class MCDCommon extends InnerMod {
    @Override
    public void activate() {
        MCD_BlockEntities.register();
        MCD_Blocks.register();
        MCD_DataComponentTypes.register();
        MCD_GameRules.register();
        MCD_Items.register();
        MCD_Sounds.register();
    }
}
