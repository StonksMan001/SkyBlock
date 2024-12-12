package net.me.skyblock.client.gui.screen_handlers;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.*;
import net.minecraft.screen.slot.Slot;

public class AncientPedestalScreenHandler extends ScreenHandler {
    private final Inventory inventory;


    public AncientPedestalScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(SkyBlockRegistries.ScreenHandlerRegistries.SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER, syncId);
        checkSize(inventory, 3);
        this.inventory = inventory;
        playerInventory.onOpen(playerInventory.player);

        this.addSlot(new Slot(inventory, 0, 10, 14));
        this.addSlot(new Slot(inventory, 1, 10, 33));
        this.addSlot(new Slot(inventory, 2, 10, 52));

        addPlayerInventorySlots(playerInventory);
    }
    public AncientPedestalScreenHandler(int syncId, PlayerInventory playerInventory, Object object) {
        this(syncId, playerInventory, new SimpleInventory(3));
    }

    public ItemStack quickMove(PlayerEntity player, int slot) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot2 = this.slots.get(slot);
        if (slot2 != null && slot2.hasStack()) {
            ItemStack itemStack2 = slot2.getStack();
            itemStack = itemStack2.copy();
            if (slot < 9) {
                if (!this.insertItem(itemStack2, 9, 45, true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(itemStack2, 0, 9, false)) {
                return ItemStack.EMPTY;
            }

            if (itemStack2.isEmpty()) {
                slot2.setStack(ItemStack.EMPTY);
            } else {
                slot2.markDirty();
            }

            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot2.onTakeItem(player, itemStack2);
        }

        return itemStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }
    private void addPlayerInventorySlots(PlayerInventory playerInventory) {
        int i;
        for(i = 0; i < 3; ++i) {
            for(int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }

    }
}
