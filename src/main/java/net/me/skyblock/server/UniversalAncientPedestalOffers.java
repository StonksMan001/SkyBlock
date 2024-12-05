package net.me.skyblock.server;

import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import oshi.util.tuples.Pair;

import java.util.Map;

public class UniversalAncientPedestalOffers {
    public static Map<Item, Tier> currentDeque() {
        return Map.ofEntries(
                Map.entry(offer1.getA().getA(), offer1.getB()),
                Map.entry(offer2.getA().getA(), offer2.getB()),
                Map.entry(offer3.getA().getA(), offer3.getB())
        );
    }
    public static Pair<Pair<Item, Integer>, Tier> offer1 = new Pair<>(new Pair<>(Items.NETHERITE_INGOT, 1), Tier.RED);
    public static Pair<Pair<Item, Integer>, Tier> offer2 = new Pair<>(new Pair<>(Items.DIAMOND, 1), Tier.YELLOW);
    public static Pair<Pair<Item, Integer>, Tier> offer3 = new Pair<>(new Pair<>(Items.IRON_INGOT, 1), Tier.GREEN);

    /*public static void resetDeque() {
        Random generator = new Random();
        Set<Pair<Item, Integer>> key_set = commonTable().keySet();
        Set<Item> keyA_set = new HashSet<>();
        Set<Integer> keyB_set = new HashSet<>();
        for (Pair<Item, Integer> pair : key_set) {
            Item item = pair.getA();
            keyA_set.add(item);
            int value = pair.getB();
            keyB_set.add(value);
        }
        //Pair<Item, Integer>[] value_array = (Pair<Item, Integer>[]) commonTable().values().toArray();
        Item[] keyA_array = (Item[]) keyA_set.toArray();
        Item rand_key = keyA_array[generator.nextInt(keyA_array.length)];
        SkyBlock.LOGGER.info(rand_key.toString());
        offer1 = new Pair<>(new Pair<>(rand_key, 1), Tier.RED);
    }*/
    public static void removeOffer() {

    }

    public enum Tier {
        RED,
        YELLOW,
        GREEN;
    }
    public static Map<Pair<Item, Integer>, Tier> commonTable() {
        //noinspection RedundantTypeArguments (explicit type arguments speedup compilation and analysis time)
        return Map.<Pair<Item, Integer>, Tier>ofEntries(
                //CROPS
                Map.entry(new Pair<>(Items.HAY_BLOCK, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.WHEAT, 32), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__APPLE_CRATE.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.APPLE, 16), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__BEETROOT_CRATE.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.BEETROOT, 32), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__CARROT_CRATE.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.CARROT, 32), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__POTATO_CRATE.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.POTATO, 32), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__SUGAR_CANE_BLOCK.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.SUGAR_CANE, 32), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__STICK_BLOCK.asItem(), 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.STICK, 64), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__CACTUS_BLOCK.asItem(), 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.CACTUS, 16), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__SWEET_BERRY_SACK.asItem(), 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.SWEET_BERRIES, 64), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__GLOW_BERRY_SACK.asItem(), 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.GLOW_BERRIES, 64), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.QUARK__COCOA_BEAN_SACK.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.COCOA_BEANS, 32), Tier.GREEN),
                Map.entry(new Pair<>(Items.BAMBOO_BLOCK, 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.BAMBOO, 64), Tier.GREEN),
                Map.entry(new Pair<>(Items.MELON, 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.MELON_SLICE, 64), Tier.GREEN),
                Map.entry(new Pair<>(Items.PUMPKIN, 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.CARVED_PUMPKIN, 4), Tier.GREEN),
                //CROPS
                //LEAVES
                Map.entry(new Pair<>(Items.OAK_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.DARK_OAK_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.SPRUCE_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.BIRCH_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.ACACIA_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.JUNGLE_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.MANGROVE_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.DIGPEAR__CALLERY_LEAVES.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.DIGPEAR__FLOWERING_CALLERY_LEAVES.asItem(), 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.CHERRY_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.AZALEA_LEAVES, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.FLOWERING_AZALEA_LEAVES, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.BROWN_MUSHROOM_BLOCK, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.RED_MUSHROOM_BLOCK, 4), Tier.GREEN),
                //LEAVES
                //SAPLINGS
                Map.entry(new Pair<>(Items.OAK_SAPLING, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.DARK_OAK_SAPLING, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.SPRUCE_SAPLING, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.BIRCH_SAPLING, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.ACACIA_SAPLING, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.JUNGLE_SAPLING, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.MANGROVE_PROPAGULE, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.CHERRY_SAPLING, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.AZALEA, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.FLOWERING_AZALEA, 4), Tier.GREEN),
                //SAPLINGS
                //LOGS
                Map.entry(new Pair<>(Items.OAK_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.DARK_OAK_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.SPRUCE_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.BIRCH_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.ACACIA_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.JUNGLE_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.MANGROVE_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.CHERRY_LOG, 8), Tier.GREEN),
                Map.entry(new Pair<>(SkyBlockRegistries.BlockRegistries.DIGPEAR__CALLERY_LOG.asItem(), 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.MUSHROOM_STEM, 8), Tier.GREEN),
                //LOGS
                //FLOWERS
                Map.entry(new Pair<>(Items.BROWN_MUSHROOM, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.RED_MUSHROOM, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.DEAD_BUSH, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.DANDELION, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.POPPY, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.BLUE_ORCHID, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.ALLIUM, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.AZURE_BLUET, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.RED_TULIP, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.PINK_TULIP, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.ORANGE_TULIP, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.WHITE_TULIP, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.OXEYE_DAISY, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.CORNFLOWER, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.LILY_OF_THE_VALLEY, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.WITHER_ROSE, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.PINK_PETALS, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.SPORE_BLOSSOM, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.SUNFLOWER, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.LILAC, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.ROSE_BUSH, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.PEONY, 8), Tier.GREEN),
                //FLOWERS
                //TOOLS
                Map.entry(new Pair<>(Items.STONE_AXE, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.STONE_PICKAXE, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.STONE_SHOVEL, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.STONE_SWORD, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.STONE_HOE, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.IRON_AXE, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.IRON_PICKAXE, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.IRON_SHOVEL, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.IRON_SWORD, 1), Tier.GREEN),
                Map.entry(new Pair<>(Items.IRON_HOE, 1), Tier.GREEN),
                //TOOLS
                //RANDOM
                Map.entry(new Pair<>(Items.DIAMOND, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.IRON_INGOT, 32), Tier.GREEN),
                Map.entry(new Pair<>(Items.COPPER_INGOT, 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.PAPER, 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.KELP, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.SEAGRASS, 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.FLOWER_POT, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.ARROW, 32), Tier.GREEN),
                Map.entry(new Pair<>(Items.BOOK, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.SHORT_GRASS, 32), Tier.GREEN),
                Map.entry(new Pair<>(Items.TALL_GRASS, 16), Tier.GREEN),
                Map.entry(new Pair<>(Items.MANGROVE_ROOTS, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.MUD, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.MUDDY_MANGROVE_ROOTS, 4), Tier.GREEN),
                Map.entry(new Pair<>(Items.MOSS_BLOCK, 8), Tier.GREEN),
                Map.entry(new Pair<>(Items.MOSS_CARPET, 8), Tier.GREEN)
                //RANDOM
        );
    }
}
