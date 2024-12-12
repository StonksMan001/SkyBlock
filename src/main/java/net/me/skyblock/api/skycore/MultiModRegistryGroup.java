package net.me.skyblock.api.skycore;

import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.me.skyblock.registries.SkyBlock;
import net.minecraft.block.Block;
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
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.poi.PointOfInterestType;

import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public abstract class MultiModRegistryGroup extends InnerMod {
    protected String innerId = "";
    public MultiModRegistryGroup(String innerId) {
        this.innerId = innerId;
    }
    private Identifier getIdentifier(String id) {
        return Identifier.of(SkyBlock.MOD_ID, Objects.equals(this.innerId, "") ? id : this.innerId + "__" + id);
    }
    public void activate() {}

    /*
    protected void registerItemGroups() {}
    protected void registerItems() {}
    protected void registerDataComponents() {}
    protected void registerFoodComponents() {}
    protected void registerEnchantments() {}
    protected void registerBlocks() {}
    protected void registerBlockEntities() {}
    protected void registerBlockEntityRendererFactories() {}
    protected void registerGameRules() {}
    protected void registerDimensions() {}
    protected void registerConfiguredFeatures() {}
    protected void registerEntityTypes() {}
    protected void registerParticles() {}
    protected void registerSaplingGenerators() {}
    protected void registerSounds() {}
    protected void registerJukeBoxSongs() {}
    protected void registerItemTags() {}
    protected void registerBlockTags() {}
    protected void registerToolMaterials() {}
    protected void registerArmorMaterials() {}
    protected void registerArmorTrimMaterials() {}
    protected void registerModelPredicateProviders() {}
    protected void registerRenderLayers() {}
    protected void registerScreenHandlers() {}
    protected void registerBiomeEffects() {}
    */


    protected RegistryKey<Enchantment> ofEnchantmentRegistry(String name) {
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, getIdentifier(name));
    }
    protected RegistryKey<World> ofMinecraftWorldRegistry(String name) {
        return RegistryKey.of(RegistryKeys.WORLD, getIdentifier(name + ".json"));
    }
    protected RegistryKey<JukeboxSong> ofJukeBlockSongRegistry(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, getIdentifier(name));
    }
    protected RegistryKey<DimensionType> ofDimensionTypeRegistry(Identifier id) {
        return RegistryKey.of(RegistryKeys.DIMENSION_TYPE, id);
    }
    protected RegistryKey<DimensionType> ofDimensionTypeRegistry(String name) {
        return RegistryKey.of(RegistryKeys.DIMENSION_TYPE, getIdentifier(name));
    }
    protected RegistryKey<Biome> ofBiomeRegistry(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, getIdentifier(name));
    }
    protected void registerJukeBlockSong(Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
        registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput));
    }
    protected Item registerItemThatHasBlock(BlockItem blockItem) {
        blockItem.appendBlocks(Item.BLOCK_ITEMS, blockItem);
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Registries.BLOCK.getId(blockItem.getBlock())), blockItem);
    }
    protected Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, getIdentifier(name), item);
    }
    protected Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, getIdentifier(name), block);
    }
    protected Block registerBlockAndItem(String name, Block block) {
        registerBlockItem(name, block);
        return registerBlock(name, block);
    }
    protected Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, getIdentifier(name), new BlockItem(block, new Item.Settings()));
    }
    protected SoundEvent registerSoundEvent(String name) {
        Identifier identifier = getIdentifier(name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
    protected RegistryEntry.Reference<SoundEvent> registerSoundEventReference(String name) {
        Identifier identifier = getIdentifier(name);
        return Registry.registerReference(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
    protected PointOfInterestType registerPointOfInterestType(String name, int ticket_count, int search_distance, Block... blocks) {
        return PointOfInterestHelper.register(getIdentifier(name), ticket_count, search_distance, blocks);
    }
    protected RegistryKey<PointOfInterestType> poiRegistryKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, getIdentifier(name));
    }
    protected <T extends Entity> EntityType<T> registerEntityType(String name, EntityType<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, getIdentifier(name), type);
    }
    protected <T extends BlockEntity> BlockEntityType<T> registerBlockEntityType(String name, BlockEntityType<T> type) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, getIdentifier(name), type);
    }
    protected <T extends ScreenHandler> ScreenHandlerType<T> registerScreenHandler(String name, ScreenHandlerType<T> type) {
        return Registry.register(Registries.SCREEN_HANDLER, getIdentifier(name), type);
    }
    protected ItemGroup registerItemGroup(String name, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, getIdentifier(name), itemGroup);
    }
    protected <T> ComponentType<T> registerComponentType(String name, UnaryOperator<ComponentType.Builder<T>> componentTypeBuilderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, getIdentifier(name),
                componentTypeBuilderOperator.apply(ComponentType.builder()).build());
    }
    protected TagKey<Block> createBlockTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, getIdentifier(name));
    }
    protected TagKey<Item> createItemTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, getIdentifier(name));
    }
    protected RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);
        ArmorItem.Type[] armorItemTypes = ArmorItem.Type.values();

        for (ArmorItem.Type type : armorItemTypes) {
            enumMap.put(type, defense.get(type));
        }

        return Registry.registerReference(Registries.ARMOR_MATERIAL, getIdentifier(name), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }
    protected RegistryEntry<ArmorMaterial> registerArmorMaterial(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(getIdentifier(id)));
        return registerArmorMaterial(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }
    protected boolean alwaysPredicate(Object... arg) {
        return true;
    }
    protected boolean neverPredicate(Object... arg) {
        return false;
    }
}
