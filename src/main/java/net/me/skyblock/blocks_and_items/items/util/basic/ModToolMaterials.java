package net.me.skyblock.blocks_and_items.items.util.basic;

import net.fabricmc.yarn.constants.MiningLevels;
import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    ENDERITE(MiningLevels.NETHERITE, 2236, 11.0f, -1f, 19, () -> Ingredient.ofItems(ModItems.SP5__ENDERITE_INGOT)),
    BENIKARD(MiningLevels.NETHERITE, 2236, 0f, -1f, 15, () -> Ingredient.ofItems(Items.WATER_BUCKET)),
    ABERYTHE(MiningLevels.NETHERITE, 2100, 10.0f, -1f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    H__ANOMALITE(MiningLevels.NETHERITE, 200, 11.0f, -1f, 1, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT)),
    H__ANOMALITE_EXOPLASMIC(MiningLevels.NETHERITE, 2000, 11.0f, -1f, 1, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT)),
    H__ANOMALITE_ENDOPLASMIC(MiningLevels.NETHERITE, 1000, 15.0f, -1f, 1, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
