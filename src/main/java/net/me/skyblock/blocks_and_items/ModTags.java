package net.me.skyblock.blocks_and_items;

import net.me.skyblock.SkyBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BOSC__DEAD_SCULK_GROUND = SkyBlock.BuiltinRegistries.createBlockTag("bosc__dead_sculk_ground");
        public static final TagKey<Block> SKYBLOCK__SCULK_GROUND = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__sculk_ground");
        public static final TagKey<Block> SKYBLOCK__RED_SCULK_GROUND = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__red_sculk_ground");
        public static final TagKey<Block> SKYBLOCK__SCULK_VEIN_CANT_COVER = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__sculk_vein_cant_cover");
        public static final TagKey<Block> SKYBLOCK__SPORE_PLANTER_BOXES = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__spore_planter_boxes");

    }
    public static class Items {
        public static final TagKey<Item> SKYBLOCK__FIR_LOGS = SkyBlock.BuiltinRegistries.createItemTag("skyblock__fir_logs");
    }
}
