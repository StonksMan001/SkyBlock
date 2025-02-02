package net.me.mcd_innermod.registries;

import net.me.mcd_innermod.items.RapierItem;
import net.me.mcd_innermod.items.mcd_artifact.DeathCapMushroomItem;
import net.me.mcd_innermod.items.mcd_artifact.IronSkinItem;
import net.me.mcd_innermod.items.mcd_meele.RoughDiamondSword;
import net.me.mcd_innermod.items.mcd_meele.SteelMace;
import net.me.mcd_innermod.items.mcd_ranged.AutoCrossbowItem;
import net.me.mcd_innermod.items.mcd_ranged.ShortBowItem;
import net.me.mcd_innermod.items.mcd_ranged.TwinBowItem;
import net.me.skycore_supermod.common_registries.SkyCore_ToolMaterials;
import net.me.skycore_supermod.item_utils.SimpleOneLineTooltipItem;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

public class MCD_Items {
    public static final Item MCD__SHORTBOW = SkyCore.BuiltinRegistries.registerItem("mcd__shortbow",
            new ShortBowItem(new Item.Settings().maxDamage(384)));
    public static final Item MCD__TWIN_BOW = SkyCore.BuiltinRegistries.registerItem("mcd__twin_bow",
            new TwinBowItem(new Item.Settings().maxDamage(384).rarity(Rarity.EPIC)));
    public static final Item MCD__ROUGH_DIAMOND_SWORD = SkyCore.BuiltinRegistries.registerItem("mcd__rough_diamond_sword",
            new RoughDiamondSword(ToolMaterials.DIAMOND, 3, 1.6f - 4f, new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item MCD__STEEL_MACE = SkyCore.BuiltinRegistries.registerItem("mcd__steel_mace",
            new SteelMace(SkyCore_ToolMaterials.STEEL_MACE, 3, 1.6f - 4f, new Item.Settings()));
    public static final Item MCD__AUTO_CROSSBOW = SkyCore.BuiltinRegistries.registerItem("mcd__auto_crossbow",
            new AutoCrossbowItem(new Item.Settings().maxDamage(465).rarity(Rarity.EPIC)));
    public static final Item MCD__ARTIFACT_IRON_HIDE_AMULET = SkyCore.BuiltinRegistries.registerItem("mcd__artifact_iron_hide_amulet",
            new IronSkinItem(new Item.Settings()));
    public static final Item MCD__ARTIFACT_DEATH_CAP_MUSHROOM = SkyCore.BuiltinRegistries.registerItem("mcd__artifact_death_cap_mushroom",
            new DeathCapMushroomItem(new Item.Settings()));
    public static final Item MCD__DIAMOND_RAPIER = SkyCore.BuiltinRegistries.registerItem("mcd__diamond_rapier",
            new RapierItem(ToolMaterials.DIAMOND, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__GOLDEN_RAPIER = SkyCore.BuiltinRegistries.registerItem("mcd__golden_rapier",
            new RapierItem(ToolMaterials.GOLD, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__IRON_RAPIER = SkyCore.BuiltinRegistries.registerItem("mcd__iron_rapier",
            new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__NETHERITE_RAPIER = SkyCore.BuiltinRegistries.registerItem("mcd__netherite_rapier",
            new RapierItem(ToolMaterials.NETHERITE, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__STONE_RAPIER = SkyCore.BuiltinRegistries.registerItem("mcd__stone_rapier",
            new RapierItem(ToolMaterials.STONE, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__WOODEN_RAPIER = SkyCore.BuiltinRegistries.registerItem("mcd__wooden_rapier",
            new RapierItem(ToolMaterials.WOOD, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__ANCIENT_GOLD_INGOT = SkyCore.BuiltinRegistries.registerItem("mcd__ancient_gold_ingot",
            new SimpleOneLineTooltipItem(new Item.Settings(),
                    Text.translatable("tooltip.skyblock.special_resource").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY))));
    public static final Item MCD__VILLAGER_STATUE = SkyCore.BuiltinRegistries.registerItem("mcd__villager_statue",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item MCD__DIAMOND_KEY = SkyCore.BuiltinRegistries.registerItem("mcd__diamond_key",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1))); //TODO
    public static final Item MCD__GOLD_KEY = SkyCore.BuiltinRegistries.registerItem("mcd__gold_key",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1))); //TODO
}
