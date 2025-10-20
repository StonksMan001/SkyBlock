package net.me.halloween_innermod.registries;

import net.me.skycore_supermod.InnerMod;

public class HalloweenCommon extends InnerMod {
    @Override
    public void activate() {
        H_ArmorMaterials.register();
        H_Blocks.register();
        H_Enchantments.register();
        H_GameRules.register();
        H_Items.register();
    }
}
