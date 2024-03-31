package net.me.skyblock.api;

import net.me.skyblock.SkyBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BOSC__DEAD_SCULK_GROUND = createBlockTag("bosc__dead_sculk_ground");
        public static final TagKey<Block> SKYBLOCK__SCULK_GROUND = createBlockTag("skyblock__sculk_ground");
        public static final TagKey<Block> SKYBLOCK__RED_SCULK_GROUND = createBlockTag("skyblock__red_sculk_ground");
        public static final TagKey<Block> SKYBLOCK__SCULK_VEIN_CANT_COVER = createBlockTag("skyblock__sculk_vein_cant_cover");
        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(SkyBlock.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(SkyBlock.MOD_ID, name));
        }
    }
}
