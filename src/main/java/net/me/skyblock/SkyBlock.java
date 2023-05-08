package net.me.skyblock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItemGroup;
import net.me.skyblock.item.ModItems;
import net.me.skyblock.util.ModRegistries;
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
		ModRegistries.registerModStuffs();

		StrippableBlockRegistry.register(ModBlocks.END_STEM, ModBlocks.STRIPPED_END_STEM);
		StrippableBlockRegistry.register(ModBlocks.END_HYPHAE, ModBlocks.STRIPPED_END_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.AZALEA_LOG, ModBlocks.STRIPPED_AZALEA_LOG);
		StrippableBlockRegistry.register(ModBlocks.AZALEA_WOOD, ModBlocks.STRIPPED_AZALEA_WOOD);
	}
}