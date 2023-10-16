package net.me.skyblock.entity.non_mobs;

import net.me.skyblock.SkyBlock;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant WITHERSTORM = registerPainting("witherstorm", new PaintingVariant(64,64));
    public static final PaintingVariant BENI = registerPainting("beni", new PaintingVariant(64,64));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(SkyBlock.MOD_ID, name), paintingVariant);
    }
    public static void registerPaintings(){
        SkyBlock.LOGGER.debug("Registering Paintings for " + SkyBlock.MOD_ID);
    }
}
