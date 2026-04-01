package net.me.sp5_innermod.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skycore_supermod.InnerMod;

public class EnderiteAddonCommon extends InnerMod {
    @Override
    public void activate() {
        SP5_ArmorMaterials.register();
        SP5_Blocks.register();
        SP5_FoodComponents.register();
        SP5_Items.register();
        SP5_SaplingGenerators.register();

        StrippableBlockRegistry.register(SP5_Blocks.SP5__END_STEM, SP5_Blocks.SP5__STRIPPED_END_STEM);
        StrippableBlockRegistry.register(SP5_Blocks.SP5__END_HYPHAE, SP5_Blocks.SP5__STRIPPED_END_HYPHAE);
        StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_STEM, SP5_Blocks.SP5__STRIPPED_BLUISHE_STEM);
        StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_HYPHAE, SP5_Blocks.SP5__STRIPPED_BLUISHE_HYPHAE);
        StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_LIGHT_STEM, SP5_Blocks.SP5__STRIPPED_BLUISHE_STEM);
        StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_LIGHT_HYPHAE, SP5_Blocks.SP5__STRIPPED_BLUISHE_HYPHAE);

        FuelRegistry.INSTANCE.add(SP5_Items.SP5__MELTED_RESIDUES, 30000);
    }
}
