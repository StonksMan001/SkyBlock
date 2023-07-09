package net.me.skyblock.item.not_important_rn;

import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTag extends ItemTagProvider {
    public static final TagKey<Item> CROSSBOW_ITEMS = of("crossbow_items");
    public ModItemTag(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture, CompletableFuture<TagLookup<Block>> blockTagLookupFuture) {
        super(output, registryLookupFuture, blockTagLookupFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {

    }
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(id));
    }
}
