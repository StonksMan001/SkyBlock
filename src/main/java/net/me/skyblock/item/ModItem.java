package net.me.skyblock.item;

import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.me.skyblock.SkyBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.resource.featuretoggle.ToggleableFeature;
import net.minecraft.util.Hand;

public class ModItem extends Item {
    public ModItem(Settings settings) {
        super(settings);
    }

    public boolean hasRedGlint(ModItemStack stack) {
        return stack.hasEnchantments();
    }
    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModItem for " + SkyBlock.MOD_ID);
    }
}
