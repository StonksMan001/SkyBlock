package net.me.skyblock;

import net.fabricmc.api.ModInitializer;
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
	}
}