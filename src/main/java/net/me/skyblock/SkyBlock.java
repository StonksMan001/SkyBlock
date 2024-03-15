package net.me.skyblock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skyblock.api.datafixer.DataFixer;
import net.me.skyblock.archived.ArchivedBlocks;
import net.me.skyblock.archived.ArchivedItems;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.block_entities.ModBlockEntities;
import net.me.skyblock.blocks_and_items.items.util.GhostItems;
import net.me.skyblock.enchantments.ModEnchantments;
import net.me.skyblock.entity.ModEntities;
import net.me.skyblock.entity.mobs.mcd.WispEntity;
import net.me.skyblock.blocks_and_items.ModCreativeInventoryGroups;
import net.me.skyblock.blocks_and_items.ModItems;
import net.me.skyblock.entity.non_mobs.ModPaintings;
import net.me.skyblock.particle.ModParticles;
import net.me.skyblock.world.dimension.ModDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyBlock implements ModInitializer {
	public static final String MOD_ID = "skyblock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		// Should never touch
		ArchivedItems.registerArchivedItems();
		ArchivedBlocks.registerArchivedBlocks();
		// Should never touch

		DataFixer.register();

		ModCreativeInventoryGroups.registerItemGroups();
		GhostItems.registerGhostItems();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerModBlockEntities();
		ModEnchantments.registerModEnchantments();
		ModDimensions.register();
		ModPaintings.registerPaintings();
		ModParticles.registerParticles();

		StrippableBlockRegistry.register(ModBlocks.SP5__END_STEM, ModBlocks.SP5__STRIPPED_END_STEM);
		StrippableBlockRegistry.register(ModBlocks.SP5__END_HYPHAE, ModBlocks.SP5__STRIPPED_END_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_STEM, ModBlocks.SP5__STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_HYPHAE, ModBlocks.SP5__STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_LIGHT_STEM, ModBlocks.SP5__STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_LIGHT_HYPHAE, ModBlocks.SP5__STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.FLOGICAL__AZALEA_LOG, ModBlocks.FLOGICAL__STRIPPED_AZALEA_LOG);
		StrippableBlockRegistry.register(ModBlocks.FLOGICAL__AZALEA_WOOD, ModBlocks.FLOGICAL__STRIPPED_AZALEA_WOOD);
		StrippableBlockRegistry.register(ModBlocks.DIGPEAR__CALLERY_LOG, ModBlocks.DIGPEAR__STRIPPED_CALLERY_LOG);
		StrippableBlockRegistry.register(ModBlocks.DIGPEAR__CALLERY_WOOD, ModBlocks.DIGPEAR__STRIPPED_CALLERY_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BLARU_LOG, ModBlocks.ABYSS__STRIPPED_BLARU_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BLARU_WOOD, ModBlocks.ABYSS__STRIPPED_BLARU_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__FROZEN_LOG, ModBlocks.ABYSS__STRIPPED_FROZEN_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__VIGILANT_LOG, ModBlocks.ABYSS__STRIPPED_VIGILANT_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__VIGILANT_WOOD, ModBlocks.ABYSS__STRIPPED_VIGILANT_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__FROZEN_WOOD, ModBlocks.ABYSS__STRIPPED_FROZEN_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SLIMED_LOG, ModBlocks.ABYSS__STRIPPED_SLIMED_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SLIMED_WOOD, ModBlocks.ABYSS__STRIPPED_SLIMED_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BOG_SHROOM_LOG, ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BOG_SHROOM_WOOD, ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SAL_SHROOM_LOG, ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SAL_SHROOM_WOOD, ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__ABYSS_JUNGLE_LOG, ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__ABYSS_JUNGLE_WOOD, ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD);


		FabricDefaultAttributeRegistry.register(ModEntities.WISP, WispEntity.setAttributes());

		FuelRegistry.INSTANCE.add(ModItems.SP5__MELTED_RESIDUES, 30000);
	}
}