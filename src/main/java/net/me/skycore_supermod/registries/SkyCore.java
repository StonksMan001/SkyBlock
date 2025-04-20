package net.me.skycore_supermod.registries;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.abyss_innermod.registries.*;
import net.me.azalea_wood_innermod.registries.AzaleaWood_Blocks;
import net.me.backport_innermod.registries.BP_Biomes;
import net.me.backport_innermod.registries.BP_Blocks;
import net.me.beni_innermod.entities.GypsyVillagerEntity;
import net.me.beni_innermod.registries.*;
import net.me.bosc_innermod.registries.BOSC_BlockTags;
import net.me.bosc_innermod.registries.BOSC_Blocks;
import net.me.brainrot_innermod.registries.Brainrot_Blocks;
import net.me.brainrot_innermod.registries.Brainrot_GameRules;
import net.me.create_innermod.registries.Create_Items;
import net.me.halloween_innermod.registries.H_ArmorMaterials;
import net.me.halloween_innermod.registries.H_Blocks;
import net.me.halloween_innermod.registries.H_Enchantments;
import net.me.halloween_innermod.registries.H_Items;
import net.me.mcd_innermod.registries.*;
import net.me.pearfection_innermod.registries.Pearfection_Blocks;
import net.me.quark_innermod.registries.Quark_Blocks;
import net.me.skyblock__innermod.registries.*;
import net.me.skycore_supermod.DataFixer;
import net.me.skyblock__innermod.entities.OminousEvokerEntity;
import net.me.skycore_supermod.common_registries.SkyCore_ConfiguredFeatures;
import net.me.skycore_supermod.common_registries.SkyCore_ItemGroups;
import net.me.skycore_supermod.common_registries.SkyCore_DataComponentTypes;
import net.me.sp5_innermod.registries.*;
import net.me.witherstorm_innermod.registries.Witherstorm_Items;
import net.me.witherstorm_innermod.registries.Witherstorm_JukeBoxSongs;
import net.me.witherstorm_innermod.registries.Witherstorm_Sounds;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.component.ComponentType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.poi.PointOfInterestType;
import org.betterx.wover.core.api.ModCore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SkyCore implements ModInitializer {
	public static final ModCore MOD_CORE = ModCore.create("skyblock");
	public static final String MOD_ID = "skyblock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Should never touch
		ArchivedRegistries.ArchivedItemRegistries.registerArchivedItems();
		ArchivedRegistries.ArchivedBlockRegistries.registerArchivedBlocks();

		GhostItemRegistries.registerGhostItems();
		DataFixer.register();
		// Should never touch

		// RegistryAPI v2
		SkyCore_ConfiguredFeatures.register();
		SkyCore_DataComponentTypes.register();
		SkyCore_ItemGroups.register();

		Abyss_ArmorMaterials.register();
		Abyss_Blocks.register();
		Abyss_Dimensions.register();
		Abyss_Items.register();
		Abyss_Sounds.register();

		AzaleaWood_Blocks.register();

		BP_Biomes.register();
		BP_Blocks.register();

		BOSC_Blocks.register();
		BOSC_BlockTags.register();

		Brainrot_Blocks.register();
		Brainrot_GameRules.register();

		Create_Items.register();

		H_ArmorMaterials.register();
		H_Blocks.register();
		H_Enchantments.register();
		H_Items.register();

		MCD_BlockEntities.register();
		MCD_Blocks.register();
		MCD_DataComponentTypes.register();
		MCD_GameRules.register();
		MCD_Items.register();
		MCD_RenderLayers.register();
		MCD_Sounds.register();

		Pearfection_Blocks.register();

		Quark_Blocks.register();

		SB_BiomeEffects.register();
		SB_Biomes.register();
		SB_BlockEntities.register();
		SB_Blocks.register();
		SB_BlockTags.register();
		SB_DataComponentTypes.register();
		SB_Dimensions.register();
		SB_Enchantments.register();
		SB_EntityTypes.register();
		SB_FoodComponents.register();
		SB_GameRules.register();
		SB_Items.register();
		SB_ItemTags.register();
		SB_ScreenHandlers.register();
		SB_Sounds.register();

		SP5_ArmorMaterials.register();
		SP5_Blocks.register();
		SP5_FoodComponents.register();
		SP5_Items.register();
		SP5_SaplingGenerators.register();

		Witherstorm_Items.register();
		Witherstorm_JukeBoxSongs.register();
		Witherstorm_Sounds.register();

		Beni_Items.register();
		Beni_Blocks.register();
		Beni_EntityTypes.register();
		Beni_GameRules.register();
		Beni_SensorTypes.register();
		Beni_ArmorMaterials.register();
		// RegistryAPI v2

		StrippableBlockRegistry.register(SP5_Blocks.SP5__END_STEM, SP5_Blocks.SP5__STRIPPED_END_STEM);
		StrippableBlockRegistry.register(SP5_Blocks.SP5__END_HYPHAE, SP5_Blocks.SP5__STRIPPED_END_HYPHAE);
		StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_STEM, SP5_Blocks.SP5__STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_HYPHAE, SP5_Blocks.SP5__STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_LIGHT_STEM, SP5_Blocks.SP5__STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(SP5_Blocks.SP5__BLUISHE_LIGHT_HYPHAE, SP5_Blocks.SP5__STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(AzaleaWood_Blocks.FLOGICAL__AZALEA_LOG, AzaleaWood_Blocks.FLOGICAL__STRIPPED_AZALEA_LOG);
		StrippableBlockRegistry.register(AzaleaWood_Blocks.FLOGICAL__AZALEA_WOOD, AzaleaWood_Blocks.FLOGICAL__STRIPPED_AZALEA_WOOD);
		StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__FIR_LOG, SB_Blocks.SKYBLOCK__STRIPPED_FIR_LOG);
		StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__FIR_WOOD, SB_Blocks.SKYBLOCK__STRIPPED_FIR_WOOD);
		StrippableBlockRegistry.register(BP_Blocks.BP__PALE_LOG, BP_Blocks.BP__STRIPPED_PALE_LOG);
		StrippableBlockRegistry.register(BP_Blocks.BP__PALE_WOOD, BP_Blocks.BP__STRIPPED_PALE_WOOD);
		StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__WHITE_MUSHROOM_STEM, SB_Blocks.SKYBLOCK__STRIPPED_MUSHROOM_STEM);
		StrippableBlockRegistry.register(SB_Blocks.SKYBLOCK__WHITE_MUSHROOM_HYPHAE, SB_Blocks.SKYBLOCK__STRIPPED_MUSHROOM_HYPHAE);
		StrippableBlockRegistry.register(Pearfection_Blocks.DIGPEAR__CALLERY_LOG, Pearfection_Blocks.DIGPEAR__STRIPPED_CALLERY_LOG);
		StrippableBlockRegistry.register(Pearfection_Blocks.DIGPEAR__CALLERY_WOOD, Pearfection_Blocks.DIGPEAR__STRIPPED_CALLERY_WOOD);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BLARU_LOG, Abyss_Blocks.ABYSS__STRIPPED_BLARU_LOG);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BLARU_WOOD, Abyss_Blocks.ABYSS__STRIPPED_BLARU_WOOD);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__FROZEN_LOG, Abyss_Blocks.ABYSS__STRIPPED_FROZEN_LOG);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__VIGILANT_LOG, Abyss_Blocks.ABYSS__STRIPPED_VIGILANT_LOG);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__VIGILANT_WOOD, Abyss_Blocks.ABYSS__STRIPPED_VIGILANT_WOOD);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__FROZEN_WOOD, Abyss_Blocks.ABYSS__STRIPPED_FROZEN_WOOD);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SLIMED_LOG, Abyss_Blocks.ABYSS__STRIPPED_SLIMED_LOG);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SLIMED_WOOD, Abyss_Blocks.ABYSS__STRIPPED_SLIMED_WOOD);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BOG_SHROOM_LOG, Abyss_Blocks.ABYSS__STRIPPED_BOG_SHROOM_LOG);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__BOG_SHROOM_WOOD, Abyss_Blocks.ABYSS__STRIPPED_BOG_SHROOM_WOOD);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SAL_SHROOM_LOG, Abyss_Blocks.ABYSS__STRIPPED_SAL_SHROOM_LOG);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__SAL_SHROOM_WOOD, Abyss_Blocks.ABYSS__STRIPPED_SAL_SHROOM_WOOD);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__ABYSS_JUNGLE_LOG, Abyss_Blocks.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG);
		StrippableBlockRegistry.register(Abyss_Blocks.ABYSS__ABYSS_JUNGLE_WOOD, Abyss_Blocks.ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD);

		//FabricDefaultAttributeRegistry.register(ModEntities.MCD__WISP, WispEntity.setAttributes());  //TODO: this
		FabricDefaultAttributeRegistry.register(SB_EntityTypes.SKYBLOCK__OMINOUS_EVOKER, OminousEvokerEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(Beni_EntityTypes.BENIMOD__GYPSY_VILLAGER, GypsyVillagerEntity.setAttributes());

		FuelRegistry.INSTANCE.add(SP5_Items.SP5__MELTED_RESIDUES, 30000);
	}
	public static Identifier identifierOfSkyBlock(String id) {
		return Identifier.of(SkyCore.MOD_ID, id);
	}
	public static class BuiltinRegistries {
		public static RegistryKey<Enchantment> ofEnchantmentRegistry(String name) {
			return RegistryKey.of(RegistryKeys.ENCHANTMENT, identifierOfSkyBlock(name));
		}
		public static RegistryKey<World> ofMinecraftWorldRegistry(String name) {
			return RegistryKey.of(RegistryKeys.WORLD, identifierOfSkyBlock(name + ".json"));
		}
		public static RegistryKey<JukeboxSong> ofJukeBlockSongRegistry(String name) {
			return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, identifierOfSkyBlock(name));
		}
		public static RegistryKey<DimensionType> ofDimensionTypeRegistry(Identifier id) {
			return RegistryKey.of(RegistryKeys.DIMENSION_TYPE, id);
		}
		public static RegistryKey<DimensionType> ofDimensionTypeRegistry(String name) {
			return RegistryKey.of(RegistryKeys.DIMENSION_TYPE, identifierOfSkyBlock(name));
		}
		public static RegistryKey<Biome> ofBiomeRegistry(String name) {
			return RegistryKey.of(RegistryKeys.BIOME, identifierOfSkyBlock(name));
		}
		public static <U extends Sensor<?>> SensorType<U> registerSensorType(String name, Supplier<U> factory) {
			return Registry.register(Registries.SENSOR_TYPE, identifierOfSkyBlock(name), new SensorType<>(factory));
		}
		public static void registerJukeBlockSong(Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
			registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput));
		}
		public static Item registerItemThatHasBlock(BlockItem blockItem) {
			blockItem.appendBlocks(Item.BLOCK_ITEMS, blockItem);
			return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Registries.BLOCK.getId(blockItem.getBlock())), blockItem);
		}
		public static Item registerItem(String name, Item item) {
			return Registry.register(Registries.ITEM, identifierOfSkyBlock(name), item);
		}
		public static Block registerBlock(String name, Block block) {
			return Registry.register(Registries.BLOCK, identifierOfSkyBlock(name), block);
		}
		public static Block registerBlockAndItem(String name, Block block) {
			registerBlockItem(name, block);
			return registerBlock(name, block);
		}
		public static Item registerBlockItem(String name, Block block) {
			return Registry.register(Registries.ITEM, identifierOfSkyBlock(name), new BlockItem(block, new Item.Settings()));
		}
		public static SoundEvent registerSoundEvent(String name) {
			Identifier identifier = identifierOfSkyBlock(name);
			return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
		}
		public static RegistryEntry.Reference<SoundEvent> registerSoundEventReference(String name) {
			Identifier identifier = identifierOfSkyBlock(name);
			return Registry.registerReference(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
		}
		public static PointOfInterestType registerPointOfInterest(String name, int ticket_count, int search_distance, Block... blocks) {
			return PointOfInterestHelper.register(identifierOfSkyBlock(name), ticket_count, search_distance, blocks);
		}
		public static RegistryKey<PointOfInterestType> poiRegistryKey(String name) {
			return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, identifierOfSkyBlock(name));
		}
		public static <T extends Entity> EntityType<T> registerEntityType(String name, EntityType<T> type) {
			return Registry.register(Registries.ENTITY_TYPE, identifierOfSkyBlock(name), type);
		}
		public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntityType(String name, BlockEntityType<T> type) {
			return Registry.register(Registries.BLOCK_ENTITY_TYPE, identifierOfSkyBlock(name), type);
		}
		public static <T extends ScreenHandler> ScreenHandlerType<T> registerScreenHandler(String name, ScreenHandlerType<T> type) {
			return Registry.register(Registries.SCREEN_HANDLER, identifierOfSkyBlock(name), type);
		}
		public static ItemGroup registerItemGroup(String name, ItemGroup itemGroup) {
			return Registry.register(Registries.ITEM_GROUP, identifierOfSkyBlock(name), itemGroup);
		}
		public static <T> ComponentType<T> registerComponentType(String name, UnaryOperator<ComponentType.Builder<T>> componentTypeBuilderOperator) {
			return Registry.register(Registries.DATA_COMPONENT_TYPE, identifierOfSkyBlock(name),
					componentTypeBuilderOperator.apply(ComponentType.builder()).build());
		}
		public static TagKey<Block> createBlockTag(String name) {
			return TagKey.of(RegistryKeys.BLOCK, identifierOfSkyBlock(name));
		}
		public static TagKey<Item> createItemTag(String name) {
			return TagKey.of(RegistryKeys.ITEM, identifierOfSkyBlock(name));
		}
		public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
			EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);
			ArmorItem.Type[] armorItemTypes = ArmorItem.Type.values();

            for (ArmorItem.Type type : armorItemTypes) {
                enumMap.put(type, defense.get(type));
            }

			return Registry.registerReference(Registries.ARMOR_MATERIAL, identifierOfSkyBlock(name), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
		}
		public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
			List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(identifierOfSkyBlock(id)));
			return registerArmorMaterial(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
		}
		public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String id, RegistryEntry<ArmorMaterial> copyOf) {
			List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(identifierOfSkyBlock(id)));
			return registerArmorMaterial(id, (EnumMap<ArmorItem.Type, Integer>) copyOf.value().defense(), copyOf.value().enchantability(), copyOf.value().equipSound(), copyOf.value().toughness(), copyOf.value().knockbackResistance(), copyOf.value().repairIngredient(), list);
		}
		public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String id, RegistryEntry<ArmorMaterial> copyOf, Supplier<Ingredient> repairIngredient) {
			List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(identifierOfSkyBlock(id)));
			return registerArmorMaterial(id, (EnumMap<ArmorItem.Type, Integer>) copyOf.value().defense(), copyOf.value().enchantability(), copyOf.value().equipSound(), copyOf.value().toughness(), copyOf.value().knockbackResistance(), repairIngredient, list);
		}
		public static boolean alwaysPredicate(Object... arg) {
			return true;
		}
		public static boolean neverPredicate(Object... arg) {
			return false;
		}
	}
}