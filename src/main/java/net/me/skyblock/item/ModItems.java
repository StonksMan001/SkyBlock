package net.me.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.me.skyblock.SkyBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FYBERITE = registerItem("fyberite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ENDMERALD = registerItem("end_emerald",
            new Item(new FabricItemSettings()));
    public static final Item ANT_BOTTLE = registerItem("ant_bottle",
            new Item(new FabricItemSettings()));
    public static final Item BOTTLE_OF_ANT_JAM = registerItem("bottle_of_ant_jam",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.FYBERITE, FYBERITE);
        addToItemGroup(ModItemGroup.FYBERITE, ENDMERALD);
        addToItemGroup(ModItemGroup.FYBERITE, ANT_BOTTLE);
        addToItemGroup(ModItemGroup.FYBERITE, BOTTLE_OF_ANT_JAM);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems () {
        SkyBlock.LOGGER.debug("Registering Mod Items for " + SkyBlock.MOD_ID);

        addItemsToItemGroup();
    }
}
