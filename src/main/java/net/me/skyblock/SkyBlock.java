package net.me.skyblock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItemGroup;
import net.me.skyblock.item.ModItems;
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

		StrippableBlockRegistry.register(ModBlocks.END_STEM, ModBlocks.STRIPPED_END_STEM);
		StrippableBlockRegistry.register(ModBlocks.END_HYPHAE, ModBlocks.STRIPPED_END_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.AZALEA_LOG, ModBlocks.STRIPPED_AZALEA_LOG);
		StrippableBlockRegistry.register(ModBlocks.AZALEA_WOOD, ModBlocks.STRIPPED_AZALEA_WOOD);
		StrippableBlockRegistry.register(ModBlocks.BLARU_LOG, ModBlocks.STRIPPED_BLARU_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLARU_WOOD, ModBlocks.STRIPPED_BLARU_WOOD);
		StrippableBlockRegistry.register(ModBlocks.BOG_SHROOM_LOG, ModBlocks.STRIPPED_BOG_SHROOM_LOG);
		StrippableBlockRegistry.register(ModBlocks.BOG_SHROOM_WOOD, ModBlocks.STRIPPED_BOG_SHROOM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS_JUNGLE_LOG, ModBlocks.STRIPPED_ABYSS_JUNGLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS_JUNGLE_WOOD, ModBlocks.STRIPPED_ABYSS_JUNGLE_WOOD);
	}
}