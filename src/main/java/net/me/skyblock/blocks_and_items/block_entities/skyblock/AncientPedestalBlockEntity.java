package net.me.skyblock.blocks_and_items.block_entities.skyblock;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.me.skyblock.api.skycore.ImplInvAPI;
import net.me.skyblock.blocks_and_items.ModBlockEntities;
import net.me.skyblock.client.gui.screen_handlers.AncientPedestalScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AncientPedestalBlockEntity extends BlockEntity {

    public AncientPedestalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SKYBLOCK__ANCIENT_PEDESTAL_BLOCK_ENTITY, pos, state);
    }
}
