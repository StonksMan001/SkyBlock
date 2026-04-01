package net.me.skycore_supermod.common_registries;

import com.google.common.base.Suppliers;
import net.me.halloween_innermod.registries.H_Items;
import net.me.skyblock__innermod.registries.SB_ItemTags;
import net.me.sp5_innermod.registries.SP5_Items;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum SkyCore_ToolMaterials implements ToolMaterial {

    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2236, 11.0f, -1f, 19, () -> Ingredient.ofItems(SP5_Items.SP5__ENDERITE_INGOT)),
    BENIKARD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2236, 0f, -1f, 15, () -> Ingredient.ofItems(Items.WATER_BUCKET)),
    ABERYTHE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 10.0f, -1f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    FIRWOOD_MACE(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 200, 2.0F, -1f, 15, () -> Ingredient.fromTag(SB_ItemTags.SKYBLOCK__FIR_LOGS)),
    STEEL_MACE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    H__ANOMALITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 11.0f, -1f, 1, () -> Ingredient.ofItems(H_Items.H__ANOMALITE_FRAGMENT)),
    H__ANOMALITE_EXOPLASMIC(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2000, 11.0f, -1f, 1, () -> Ingredient.ofItems(H_Items.H__ANOMALITE_FRAGMENT)),
    H__ANOMALITE_ENDOPLASMIC(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 15.0f, -1f, 1, () -> Ingredient.ofItems(H_Items.H__ANOMALITE_FRAGMENT));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    SkyCore_ToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
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
