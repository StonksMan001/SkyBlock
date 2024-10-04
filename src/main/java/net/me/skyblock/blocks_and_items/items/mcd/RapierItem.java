package net.me.skyblock.blocks_and_items.items.mcd;

import net.me.skyblock.api.skycore.ToolAPI;
import net.minecraft.item.ToolMaterial;

public class RapierItem extends ToolAPI.SwordItem {
    public RapierItem(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, baseAttackDamage, attackSpeed, settings);
    }
}
