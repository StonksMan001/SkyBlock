package net.me.skyblock.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }
    private static void registerFuels() {
        SkyBlock.LOGGER.info("Registering Fuels for" + SkyBlock.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.MELTE_RESIDUES,20000);
    }
}
