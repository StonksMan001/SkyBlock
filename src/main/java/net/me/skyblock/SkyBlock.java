package net.me.skyblock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.me.skyblock.api.datafixer.DataFixer;
import net.me.skyblock.archived.ArchivedBlocks;
import net.me.skyblock.archived.ArchivedItems;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.ModBlockEntities;
import net.me.skyblock.blocks_and_items.items.util.GhostItems;
import net.me.skyblock.client.ModScreenHandlers;
import net.me.skyblock.component.ModDataComponentTypes;
import net.me.skyblock.enchantments.ModEnchantments;
import net.me.skyblock.entity.ModEntities;
import net.me.skyblock.blocks_and_items.ModItemGroups;
import net.me.skyblock.blocks_and_items.ModItems;
import net.me.skyblock.entity.mobs.skyblock.OminousEvokerEntity;
import net.me.skyblock.server.ModGameRules;
import net.me.skyblock.sound.ModSounds;
import net.me.skyblock.world.dimension.ModDimensions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.component.ComponentType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.poi.PointOfInterestType;
import org.betterx.wover.core.api.ModCore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SkyBlock implements ModInitializer {
	public static final ModCore MOD_CORE = ModCore.create("skyblock");
	public static final String MOD_ID = "skyblock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		// Should never touch
		ArchivedItems.registerArchivedItems();
		ArchivedBlocks.registerArchivedBlocks();

		GhostItems.registerGhostItems();
		// Should never touch

		DataFixer.register();

		ModItemGroups.register();
		ModDataComponentTypes.register();
		ModSounds.register();
		ModItems.register();
		ModBlocks.register();
		ModBlockEntities.register();
		ModEnchantments.register();
		ModDimensions.register();
		ModScreenHandlers.register();
		ModGameRules.register();

		StrippableBlockRegistry.register(ModBlocks.SP5__END_STEM, ModBlocks.SP5__STRIPPED_END_STEM);
		StrippableBlockRegistry.register(ModBlocks.SP5__END_HYPHAE, ModBlocks.SP5__STRIPPED_END_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_STEM, ModBlocks.SP5__STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_HYPHAE, ModBlocks.SP5__STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_LIGHT_STEM, ModBlocks.SP5__STRIPPED_BLUISHE_STEM);
		StrippableBlockRegistry.register(ModBlocks.SP5__BLUISHE_LIGHT_HYPHAE, ModBlocks.SP5__STRIPPED_BLUISHE_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.FLOGICAL__AZALEA_LOG, ModBlocks.FLOGICAL__STRIPPED_AZALEA_LOG);
		StrippableBlockRegistry.register(ModBlocks.FLOGICAL__AZALEA_WOOD, ModBlocks.FLOGICAL__STRIPPED_AZALEA_WOOD);
		StrippableBlockRegistry.register(ModBlocks.SKYBLOCK__FIR_LOG, ModBlocks.SKYBLOCK__STRIPPED_FIR_LOG);
		StrippableBlockRegistry.register(ModBlocks.SKYBLOCK__FIR_WOOD, ModBlocks.SKYBLOCK__STRIPPED_FIR_WOOD);
		StrippableBlockRegistry.register(ModBlocks.SKYBLOCK__WHITE_MUSHROOM_STEM, ModBlocks.SKYBLOCK__STRIPPED_MUSHROOM_STEM);
		StrippableBlockRegistry.register(ModBlocks.SKYBLOCK__WHITE_MUSHROOM_HYPHAE, ModBlocks.SKYBLOCK__STRIPPED_MUSHROOM_HYPHAE);
		StrippableBlockRegistry.register(ModBlocks.DIGPEAR__CALLERY_LOG, ModBlocks.DIGPEAR__STRIPPED_CALLERY_LOG);
		StrippableBlockRegistry.register(ModBlocks.DIGPEAR__CALLERY_WOOD, ModBlocks.DIGPEAR__STRIPPED_CALLERY_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BLARU_LOG, ModBlocks.ABYSS__STRIPPED_BLARU_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BLARU_WOOD, ModBlocks.ABYSS__STRIPPED_BLARU_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__FROZEN_LOG, ModBlocks.ABYSS__STRIPPED_FROZEN_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__VIGILANT_LOG, ModBlocks.ABYSS__STRIPPED_VIGILANT_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__VIGILANT_WOOD, ModBlocks.ABYSS__STRIPPED_VIGILANT_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__FROZEN_WOOD, ModBlocks.ABYSS__STRIPPED_FROZEN_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SLIMED_LOG, ModBlocks.ABYSS__STRIPPED_SLIMED_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SLIMED_WOOD, ModBlocks.ABYSS__STRIPPED_SLIMED_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BOG_SHROOM_LOG, ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__BOG_SHROOM_WOOD, ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SAL_SHROOM_LOG, ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__SAL_SHROOM_WOOD, ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__ABYSS_JUNGLE_LOG, ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.ABYSS__ABYSS_JUNGLE_WOOD, ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD);

		//FabricDefaultAttributeRegistry.register(ModEntities.MCD__WISP, WispEntity.setAttributes());  //TODO: this
		FabricDefaultAttributeRegistry.register(ModEntities.SKYBLOCK__OMINOUS_EVOKER, OminousEvokerEntity.setAttributes());

		FuelRegistry.INSTANCE.add(ModItems.SP5__MELTED_RESIDUES, 30000);


	}
	public static Identifier identifierOfSkyBlock(String id) {
		return Identifier.of(SkyBlock.MOD_ID, id);
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
		public static boolean alwaysPredicate(Object... arg) {
			return true;
		}
		public static boolean neverPredicate(Object... arg) {
			return false;
		}
	}
}