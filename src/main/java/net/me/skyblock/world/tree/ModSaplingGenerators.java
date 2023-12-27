package net.me.skyblock.world.tree;

import net.me.skyblock.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator BLUISHE = new SaplingGenerator("bluishe",
            0f,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.BLUISHE_TREE_KEY),
            Optional.empty(),
            Optional.empty(),
            Optional.empty());
}
