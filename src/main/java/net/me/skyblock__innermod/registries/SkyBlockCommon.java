package net.me.skyblock__innermod.registries;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skyblock__innermod.entities.OminousEvokerEntity;
import net.me.skycore_supermod.InnerMod;

public class SkyBlockCommon extends InnerMod {
    @Override
    public void activate() {
        SB_BiomeEffects.register();
        SB_Biomes.register();
        SB_BlockEntities.register();
        SB_Blocks.register();
        SB_BlockTags.register();
        SB_DataComponentTypes.register();
        SB_Dimensions.register();
        SB_Enchantments.register();
        SB_EntityTypes.register();
        SB_FoodComponents.register();
        SB_GameRules.register();
        SB_Items.register();
        SB_ItemTags.register();
        SB_ScreenHandlers.register();
        SB_Sounds.register();
        StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__FIR_LOG, SB_Blocks.SKYBLOCK__STRIPPED_FIR_LOG);
        StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__FIR_WOOD, SB_Blocks.SKYBLOCK__STRIPPED_FIR_WOOD);
        StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__WHITE_MUSHROOM_STEM, SB_Blocks.SKYBLOCK__STRIPPED_MUSHROOM_STEM);
        StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__WHITE_MUSHROOM_HYPHAE, SB_Blocks.SKYBLOCK__STRIPPED_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__BOGGED_LOG, SB_Blocks.SKYBLOCK__STRIPPED_BOGGED_LOG);
        StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__BOGGED_WOOD, SB_Blocks.SKYBLOCK__STRIPPED_BOGGED_WOOD);

        FabricDefaultAttributeRegistry.register(SB_EntityTypes.SKYBLOCK__OMINOUS_EVOKER, OminousEvokerEntity.setAttributes());
    }
}
