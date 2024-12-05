package net.me.skyblock.api.skycore;

import net.minecraft.item.ToolMaterial;

public class ToolAPI {
    public static class ShovelItem extends net.minecraft.item.ShovelItem {
        public ShovelItem(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
            super(toolMaterial, settings.attributeModifiers(net.minecraft.item.ShovelItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed)));
        }
    }
    public static class SwordItem extends net.minecraft.item.SwordItem {
        public SwordItem(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
            super(toolMaterial, settings.attributeModifiers(net.minecraft.item.ShovelItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed)));
        }
    }
    public static class AxeItem extends net.minecraft.item.AxeItem {
        public AxeItem(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
            super(toolMaterial, settings.attributeModifiers(net.minecraft.item.ShovelItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed)));
        }
    }
    public static class PickaxeItem extends net.minecraft.item.PickaxeItem {
        public PickaxeItem(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
            super(toolMaterial, settings.attributeModifiers(net.minecraft.item.ShovelItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed)));
        }
    }
    public static class HoeItem extends net.minecraft.item.HoeItem {
        public HoeItem(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
            super(toolMaterial, settings.attributeModifiers(net.minecraft.item.ShovelItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed)));
        }
    }
}
