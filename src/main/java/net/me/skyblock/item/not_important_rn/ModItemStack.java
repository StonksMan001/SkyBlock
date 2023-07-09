package net.me.skyblock.item.not_important_rn;

import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.me.skyblock.SkyBlock;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import org.jetbrains.annotations.Nullable;

public class ModItemStack implements FabricItemStack {

    private boolean empty;
    private int count;
    @Deprecated
    private final ModItem moditem;
    @Deprecated
    private final Item item;
    @Nullable
    private NbtCompound nbt;

    public ModItemStack(boolean empty, int count, ModItem moditem, Item item) {
        this.empty = empty;
        this.count = count;
        this.moditem = moditem;
        this.item = item;
    }

    public ModItem getModitem() {
        return (ModItem) (this.empty ? Items.AIR : this.item);
    }

    public boolean hasRedGlint() {
        return this.getModitem().hasRedGlint(this);
    }
    public boolean hasEnchantments() {
        if (this.nbt != null && this.nbt.contains(ENCHANTMENTS_KEY, NbtElement.LIST_TYPE)) {
            return !this.nbt.getList(ENCHANTMENTS_KEY, NbtElement.COMPOUND_TYPE).isEmpty();
        }
        return false;
    }
    public static final String ENCHANTMENTS_KEY = "Enchantments";

    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModItemStack for " + SkyBlock.MOD_ID);
    }
}
