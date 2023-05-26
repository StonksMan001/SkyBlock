package net.me.skyblock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItemGroup;
import net.me.skyblock.item.ModItems;
import net.me.skyblock.painting.ModPaintings;
import net.me.skyblock.world.dimension.ModDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyBlock implements ModInitializer {
	public static final String MOD_ID = "skyblock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDimensions.register();
		ModPaintings.registerPaintings();

		StrippableBlockRegistry.register(ModBlocks.END_STEM, ModBlocks.STRIPPED_END_STEM);
		StrippableBlockRegistry.register(ModBlocks.END_HYPHAE, ModBlocks.STRIPPED_END_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.BLUISHE_STEM, ModBlocks.STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(ModBlocks.BLUISHE_HYPHAE, ModBlocks.STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.BLUISHE_LIGHT_STEM, ModBlocks.STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(ModBlocks.BLUISHE_LIGHT_HYPHAE, ModBlocks.STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.AZALEA_LOG, ModBlocks.STRIPPED_AZALEA_LOG);
		StrippableBlockRegistry.register(ModBlocks.AZALEA_WOOD, ModBlocks.STRIPPED_AZALEA_WOOD);
		StrippableBlockRegistry.register(ModBlocks.BLARU_LOG, ModBlocks.STRIPPED_BLARU_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLARU_WOOD, ModBlocks.STRIPPED_BLARU_WOOD);
		StrippableBlockRegistry.register(ModBlocks.FROZEN_LOG, ModBlocks.STRIPPED_FROZEN_LOG);
		StrippableBlockRegistry.register(ModBlocks.VIGILANT_LOG, ModBlocks.STRIPPED_VIGILANT_LOG);
		StrippableBlockRegistry.register(ModBlocks.VIGILANT_WOOD, ModBlocks.STRIPPED_VIGILANT_WOOD);
		StrippableBlockRegistry.register(ModBlocks.FROZEN_WOOD, ModBlocks.STRIPPED_FROZEN_WOOD);
		StrippableBlockRegistry.register(ModBlocks.SLIMED_LOG, ModBlocks.STRIPPED_SLIMED_LOG);
		StrippableBlockRegistry.register(ModBlocks.SLIMED_WOOD, ModBlocks.STRIPPED_SLIMED_WOOD);
		StrippableBlockRegistry.register(ModBlocks.BOG_SHROOM_LOG, ModBlocks.STRIPPED_BOG_SHROOM_LOG);
		StrippableBlockRegistry.register(ModBlocks.BOG_SHROOM_WOOD, ModBlocks.STRIPPED_BOG_SHROOM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.SAL_SHROOM_LOG, ModBlocks.STRIPPED_SAL_SHROOM_LOG);
		StrippableBlockRegistry.register(ModBlocks.SAL_SHROOM_WOOD, ModBlocks.STRIPPED_SAL_SHROOM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS_JUNGLE_LOG, ModBlocks.STRIPPED_ABYSS_JUNGLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS_JUNGLE_WOOD, ModBlocks.STRIPPED_ABYSS_JUNGLE_WOOD);


	}
}