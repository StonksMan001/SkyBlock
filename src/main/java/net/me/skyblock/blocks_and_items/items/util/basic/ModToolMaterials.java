package net.me.skyblock.blocks_and_items.items.util.basic;

import com.google.common.base.Suppliers;
import net.me.skyblock.blocks_and_items.ModTags;
import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2236, 11.0f, -1f, 19, () -> Ingredient.ofItems(ModItems.SP5__ENDERITE_INGOT)),
    BENIKARD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2236, 0f, -1f, 15, () -> Ingredient.ofItems(Items.WATER_BUCKET)),
    ABERYTHE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 10.0f, -1f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FIRWOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 200, 2.0F, -1f, 15, () -> Ingredient.fromTag(ModTags.Items.SKYBLOCK__FIR_LOGS)),
    H__ANOMALITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 11.0f, -1f, 1, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT)),
    H__ANOMALITE_EXOPLASMIC(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2000, 11.0f, -1f, 1, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT)),
    H__ANOMALITE_ENDOPLASMIC(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 15.0f, -1f, 1, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
