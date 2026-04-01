package net.me.quark_innermod.base;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.me.quark_innermod.config.QuarkConfigManager;
import net.me.quark_innermod.config.QuarkConfigs;
import net.me.quark_innermod.content.automation.module.*;
import net.me.quark_innermod.internal_zeta.org.FabricZeta;
import net.me.quark_innermod.internal_zeta.org.Zeta;
import net.me.quark_innermod.internal_zeta.org.ZetaBock;
import net.minecraft.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuarkFabric {
	public static final String MOD_ID = "quark";
	public static final String ZETA_INSTANCE_ID = "quark-zeta";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Zeta ZETA = new FabricZeta(MOD_ID, LoggerFactory.getLogger(ZETA_INSTANCE_ID));

	public static <T> void registerModules(T instance) {
		if (QuarkConfigs.Module.automation) {
			if (QuarkConfigs.Automation.chute) ChuteModule.setup(instance, new ChuteModule());
			if (QuarkConfigs.Automation.enderWatcher) EnderWatcherModule.setup(instance, new EnderWatcherModule());
			if (QuarkConfigs.Automation.gravisand) GravisandModule.setup(instance, new GravisandModule());
			//if (QuarkConfigs.Automation.feedingTrough) FeedingTroughModule.setup(instance, new FeedingTroughModule());
			if (QuarkConfigs.Automation.chainsConnectBlocks) ChainsConnectBlocksModule.setup(instance, new ChainsConnectBlocksModule());
			//if (QuarkConfigs.Automation.dispensersPlaceBlocks) DispensersPlaceBlocksModule.setup(instance, new DispensersPlaceBlocksModule());
		}
	}
	public void onInitialize() {
        QuarkConfigManager.registerConfigs();
		QuarkFabric.registerModules(this);
	}
	public static void addFlammableZetaBlock(Block block) {
		if (block instanceof ZetaBock zetaBock) {
			FlammableBlockRegistry.getDefaultInstance().add(zetaBock, zetaBock.getFlammabilityZeta(), zetaBock.getFireSpreadSpeedZeta());
		}
	}
}