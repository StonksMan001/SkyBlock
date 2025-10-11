package net.me.quark_innermod.base;

public class QuarkFabricClient {
	public void onInitializeClient() {
		QuarkFabric.registerModules(this);
	}
}