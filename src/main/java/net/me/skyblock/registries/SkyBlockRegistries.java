package net.me.skyblock.registries;

import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.me.skyblock.api.skycore.ArmorAPI;
import net.me.skyblock.api.skycore.BaseShortPlantBlock;
import net.me.skyblock.api.skycore.BaseTallPlantBlock;
import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.block_entities.mcd.PopFlowerBlockEntity;
import net.me.skyblock.block_entities.mcd.echoing_void.VoidBlockEntity;
import net.me.skyblock.block_entities.skyblock.AncientPedestalBlockEntity;
import net.me.skyblock.blocks.abyss.AbyssVegetation;
import net.me.skyblock.blocks.abyss.BlueVigilantGrass;
import net.me.skyblock.blocks.bosc.SculkJawBlock;
import net.me.skyblock.blocks.end.BluisheLightStemBlock;
import net.me.skyblock.blocks.end.EndFlower;
import net.me.skyblock.blocks.end.EndVegetation;
import net.me.skyblock.blocks.end.EnderBlock;
import net.me.skyblock.blocks.mcd.MossyOakPlanks;
import net.me.skyblock.blocks.mcd.PopFlowerBlock;
import net.me.skyblock.blocks.mcd.echoing_void.StrongholdDecorBlock;
import net.me.skyblock.blocks.mcd.echoing_void.VoidBlock;
import net.me.skyblock.blocks.skyblock.*;
import net.me.skyblock.blocks.skyblock.crops.BlueberryBush;
import net.me.skyblock.blocks.skyblock.crops.ChilliPepperBlock;
import net.me.skyblock.blocks.skyblock.crops.PuffballMushroom;
import net.me.skyblock.blocks.skyblock.crops.PuffballMushroomBlock;
import net.me.skyblock.blocks.skyblock.vegetations.unknown.UnknownDirt;
import net.me.skyblock.blocks.skyblock.vegetations.unknown.UnknownDirtNylium;
import net.me.skyblock.blocks.util.ModStairsBlock;
import net.me.skyblock.component.McdRarity;
import net.me.skyblock.items.abyss.Loran;
import net.me.skyblock.items.create.NuggetOfExperienceItem;
import net.me.skyblock.items.end.EnchantedEnderiteAppleItem;
import net.me.skyblock.items.mcd.RapierItem;
import net.me.skyblock.items.mcd.mcd_artifact.IronSkinItem;
import net.me.skyblock.items.mcd.mcd_ranged.AutoCrossbowItem;
import net.me.skyblock.items.mcd.mcd_ranged.ShortBowItem;
import net.me.skyblock.items.mcd.mcd_ranged.TwinBowItem;
import net.me.skyblock.items.skyblock.*;
import net.me.skyblock.items.util.AnomaliteArmorItem;
import net.me.skyblock.items.util.NullItem;
import net.me.skyblock.items.util.custom_unenchantable.UnenchantableAxeItem;
import net.me.skyblock.items.util.custom_unenchantable.UnenchantablePickaxeItem;
import net.me.skyblock.items.util.custom_unenchantable.UnenchantableSwordItem;
import net.me.skyblock.client.VoidBlockEntityRenderer;
import net.me.skyblock.client.gui.screen_handlers.AncientPedestalScreenHandler;
import net.me.skyblock.component.util.SimpleByteValueComponent;
import net.me.skyblock.entity.mobs.skyblock.OminousEvokerEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Util;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import org.betterx.wover.enchantment.api.EnchantmentUtils;

import java.util.*;
import java.util.function.Supplier;

@Deprecated
public class SkyBlockRegistries {
    public static class SoundRegistries {
        public static RegistryEntry.Reference<SoundEvent> WITHERSTORM_THEME = SkyBlock.BuiltinRegistries.registerSoundEventReference("wither_storm_theme");
        public static SoundEvent ABYSS_AMCIENCE = SkyBlock.BuiltinRegistries.registerSoundEvent("abyss_amcience");
        public static SoundEvent ABYSS_RESONATOR_AMBIENCE = SkyBlock.BuiltinRegistries.registerSoundEvent("abyss_resonator_ambience");
        public static SoundEvent AMBIENT_JUMPSCARE_EFFECT = SkyBlock.BuiltinRegistries.registerSoundEvent("ambient_jumpscare_effect");
        public static SoundEvent AMBIENTMUSIC = SkyBlock.BuiltinRegistries.registerSoundEvent("ambientmusic");
        public static SoundEvent CORRUPTED_VALLEY = SkyBlock.BuiltinRegistries.registerSoundEvent("corrupted_valley");
        public static SoundEvent DREAM_EVENT_1 = SkyBlock.BuiltinRegistries.registerSoundEvent("dream_event_1");
        public static SoundEvent DREAM_EVENT_2 = SkyBlock.BuiltinRegistries.registerSoundEvent("dream_event_2");
        public static SoundEvent END_GAME = SkyBlock.BuiltinRegistries.registerSoundEvent("end_game");
        public static SoundEvent FEAR_EVENT_1 = SkyBlock.BuiltinRegistries.registerSoundEvent("fear_event_1");
        public static SoundEvent FEAR_EVENT_2 = SkyBlock.BuiltinRegistries.registerSoundEvent("fear_event_2");
        public static SoundEvent JASON_JOHNSON_THE_CYANIDEX_THEME = SkyBlock.BuiltinRegistries.registerSoundEvent("jason_johnson_-_the_cyanidex_theme");
        public static SoundEvent JJ_FIRST_DREAM = SkyBlock.BuiltinRegistries.registerSoundEvent("jj_first_dream");
        public static SoundEvent RANDOMFX_1 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_1");
        public static SoundEvent RANDOMFX_2 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_2");
        public static SoundEvent RANDOMFX_3 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_3");
        public static SoundEvent RANDOMFX_4 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_4");
        public static SoundEvent RANDOMFX_5 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_5");
        public static SoundEvent RANDOMFX_6 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_6");
        public static SoundEvent RANDOMFX_7 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_7");
        public static SoundEvent RANDOMFX_8 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_8");
        public static SoundEvent RANDOMFX_9 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_9");
        public static SoundEvent RANDOMFX_10 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_10");
        public static SoundEvent RANDOMFX_11 = SkyBlock.BuiltinRegistries.registerSoundEvent("randomfx_11");
        public static SoundEvent RUMA_AMBIENCE = SkyBlock.BuiltinRegistries.registerSoundEvent("ruma_ambience");
        public static SoundEvent RUMA_MUSIC = SkyBlock.BuiltinRegistries.registerSoundEvent("ruma_music");
        public static SoundEvent RUMA_MUSIC_2 = SkyBlock.BuiltinRegistries.registerSoundEvent("ruma_music_2");
        public static SoundEvent SLIME_FOREST = SkyBlock.BuiltinRegistries.registerSoundEvent("slime_forest");
        public static SoundEvent THE_ABYSS_A_NEW_ERA = SkyBlock.BuiltinRegistries.registerSoundEvent("the_abyss_-_a_new_era");
        public static SoundEvent THE_ABYSS_FADED_REALITY = SkyBlock.BuiltinRegistries.registerSoundEvent("the_abyss_-_faded_reality");
        public static SoundEvent THE_ABYSS_FROSTED = SkyBlock.BuiltinRegistries.registerSoundEvent("the_abyss_-_frosted");
        public static SoundEvent THE_ABYSS_JOURNEYS = SkyBlock.BuiltinRegistries.registerSoundEvent("the_abyss_-_journeys");
        public static SoundEvent THE_ABYSS_LOST_IN_DESSERT = SkyBlock.BuiltinRegistries.registerSoundEvent("the_abyss_-_lost_in_dessert");
        public static SoundEvent BROKEN_RADIO = SkyBlock.BuiltinRegistries.registerSoundEvent("broken_radio");
        public static SoundEvent WISP_ATTRACT = SkyBlock.BuiltinRegistries.registerSoundEvent("wisp_attract");
        public static SoundEvent WISP_MOTION = SkyBlock.BuiltinRegistries.registerSoundEvent("wisp_motion");
        public static SoundEvent WANDERLUST = SkyBlock.BuiltinRegistries.registerSoundEvent("wanderlust");
        public static SoundEvent SKOGSSTUGA = SkyBlock.BuiltinRegistries.registerSoundEvent("skogsstuga");
        public static SoundEvent INTERTILE = SkyBlock.BuiltinRegistries.registerSoundEvent("intertile");
        public static SoundEvent HALLAND = SkyBlock.BuiltinRegistries.registerSoundEvent("halland");
        public static SoundEvent FINNBACKA = SkyBlock.BuiltinRegistries.registerSoundEvent("finnbacka");
        public static SoundEvent DALARNA = SkyBlock.BuiltinRegistries.registerSoundEvent("dalarna");
        public static SoundEvent CRYPT = SkyBlock.BuiltinRegistries.registerSoundEvent("crypt");
        public static SoundEvent CREEPER_WOODS = SkyBlock.BuiltinRegistries.registerSoundEvent("creeper_woods");
        public static SoundEvent CARAVAN = SkyBlock.BuiltinRegistries.registerSoundEvent("caravan");
        public static SoundEvent BROKEN_HEARTH_OF_ENDER = SkyBlock.BuiltinRegistries.registerSoundEvent("broken_hearth_of_ender");
        public static SoundEvent OBSIDIAN_CAVERN = SkyBlock.BuiltinRegistries.registerSoundEvent("obsidian_cavern");
        public static SoundEvent TO_THE_BEGINNING = SkyBlock.BuiltinRegistries.registerSoundEvent("to_the_beginning");
        public static SoundEvent H__DESPAIR = SkyBlock.BuiltinRegistries.registerSoundEvent("h__despair");
        public static SoundEvent H__ABANDONED_VALLEY = SkyBlock.BuiltinRegistries.registerSoundEvent("h__abandoned_valley");
        public static SoundEvent H__BREACH_OF_WORLDS = SkyBlock.BuiltinRegistries.registerSoundEvent("h__breach_of_worlds");
        public static SoundEvent MCD__IRON_HIDE_AMULET_USE = SkyBlock.BuiltinRegistries.registerSoundEvent("artifact_iron_hide_amulet_used");
        public static SoundEvent MCD__TWIN_BOW_SHOOT = SkyBlock.BuiltinRegistries.registerSoundEvent("mcd__twin_bow_shoot");
        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering SoundEvents for " + SkyBlock.MOD_ID);
        }
    }

    public static class TagRegistries {
        public static class Blocks {
            public static final TagKey<Block> BOSC__DEAD_SCULK_GROUND = SkyBlock.BuiltinRegistries.createBlockTag("bosc__dead_sculk_ground");
            public static final TagKey<Block> SKYBLOCK__SCULK_GROUND = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__sculk_ground");
            public static final TagKey<Block> SKYBLOCK__RED_SCULK_GROUND = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__red_sculk_ground");
            public static final TagKey<Block> SKYBLOCK__SCULK_VEIN_CANT_COVER = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__sculk_vein_cant_cover");
            public static final TagKey<Block> SKYBLOCK__SPORE_PLANTER_BOXES = SkyBlock.BuiltinRegistries.createBlockTag("skyblock__spore_planter_boxes");

        }
        public static class Items {
            public static final TagKey<Item> SKYBLOCK__FIR_LOGS = SkyBlock.BuiltinRegistries.createItemTag("skyblock__fir_logs");
        }
    }

    public static class ScreenHandlerRegistries {
        public static final ScreenHandlerType<AncientPedestalScreenHandler> SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER = null; //SkyBlock.BuiltinRegistries.registerScreenHandler("skyblock__ancient_pedestal_screen_handler",
                //new ExtendedScreenHandlerType<>(AncientPedestalScreenHandler::new)); //TODO: this

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Screen Handlers for " + SkyBlock.MOD_ID);
        }
    }

    public static class SaplingGeneratorRegistries {
        public static final SaplingGenerator BLUISHE = new SaplingGenerator("bluishe",
                0f,
                Optional.empty(),
                Optional.empty(),
                Optional.of(ConfiguredFeatureRegistries.BLUISHE_TREE_KEY),
                Optional.empty(),
                Optional.empty(),
                Optional.empty());
    }

    public static class RenderLayerRegistries extends RenderLayer {
        public RenderLayerRegistries(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
            super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
        }
        private static final RenderLayer VOID_BLOCK = RenderLayer.of("void_block", VertexFormats.POSITION, VertexFormat.DrawMode.QUADS, 256, false, false, MultiPhaseParameters.builder().program(RenderPhase.END_GATEWAY_PROGRAM).texture(Textures.create().add(VoidBlockEntityRenderer.SKY_TEXTURE, false, false).add(VoidBlockEntityRenderer.PORTAL_TEXTURE, false, false).build()).build(false));

        public static RenderLayer getVoidBlock() {
            return VOID_BLOCK;
        }
    }

    public static class ParticleRegistries {
    }

    public static interface JukeBoxSongRegistries {
        RegistryKey<JukeboxSong> WITHERSTORM_THEME = SkyBlock.BuiltinRegistries.ofJukeBlockSongRegistry("wither_storm_theme");
    }

    public static class ItemRegistries {
        //SKYBLOCK MAIN-BLOCK
        public static final Item SKYBLOCK__FYBERITE = SkyBlock.BuiltinRegistries.registerItem("skyblock__fyberite_ingot",
                new Item(new Item.Settings()));
        public static final Item SKYBLOCK__ANT_BOTTLE = SkyBlock.BuiltinRegistries.registerItem("skyblock__ant_bottle",
                new Item(new Item.Settings()));
        public static final Item SKYBLOCK__BOTTLE_OF_ANT_JAM = SkyBlock.BuiltinRegistries.registerItem("skyblock__bottle_of_ant_jam",
                new Item(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE)));
        public static final Item WITHERSTORM__MUSIC_DISC_WITHERSTORM = SkyBlock.BuiltinRegistries.registerItem("witherstorm__music_disc_witherstorm_theme",
                new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(JukeBoxSongRegistries.WITHERSTORM_THEME)));
        public static final Item WITHERSTORM__DISC_FRAGMENT_WITHERSTORM = SkyBlock.BuiltinRegistries.registerItem("witherstorm__disc_fragment_witherstorm_theme",
                new DiscFragmentItem(new Item.Settings()));
        public static final Item SP5__ENDERITE_APPLE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_apple",
                new Item(new Item.Settings().food(FoodComponentRegistries.SP5__ENDERITE_APPLE)));
        public static final Item SP5__ENCHANTED_ENDERITE_APPLE = SkyBlock.BuiltinRegistries.registerItem("sp5__enchanted_enderite_apple",
                new EnchantedEnderiteAppleItem(new Item.Settings().food(FoodComponentRegistries.SP5__ENCHANTED_ENDERITE_APPLE)));
        public static final Item SKYBLOCK__SUGAR_POPPY_MIXTURE = SkyBlock.BuiltinRegistries.registerItem("skyblock__sugar_poppy_mixture",
                new Item(new Item.Settings()));
        public static final Item SKYBLOCK__STEAM_DUMPLING_FRESH = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling_raw",
                new Item(new Item.Settings()));
        public static final Item SKYBLOCK__STEAM_DUMPLING = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling",
                new Item(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__STEAM_DUMPLING)));
        public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling_with_molten_butter",
                new Item(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER)));
        public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling_with_molten_butter_and_sugar_poppy_mixture",
                new Item(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE)));
        //SKYBLOCK MAIN-BLOCK
        //SKYBLOCK VANILLA+
        public static final Item SKYBLOCK__PUFFBALL_MUSHROOM_FLESH = SkyBlock.BuiltinRegistries.registerItem("skyblock__puffball_mushroom_flesh",
                new Item(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_FLESH)));
        public static final Item SKYBLOCK__COOKED_PUFFBALL_MUSHROOM_FLESH = SkyBlock.BuiltinRegistries.registerItem("skyblock__cooked_puffball_mushroom_flesh",
                new Item(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__COOKED_PUFFBALL_MUSHROOM_FLESH)));
        public static final Item SKYBLOCK__PUFFBALL_MUSHROOM_STEW = SkyBlock.BuiltinRegistries.registerItem("skyblock__puffball_mushroom_stew",
                new Item(new Item.Settings().maxCount(1).food(FoodComponentRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_STEW)));
        public static final Item SKYBLOCK__CHILLI_PEPPER_SEEDS = SkyBlock.BuiltinRegistries.registerItem("skyblock__chilli_pepper_seeds",
                new AliasedBlockItem(BlockRegistries.SKYBLOCK__CHILLI_PEPPER_CROP, new Item.Settings()));
        public static final Item SKYBLOCK__CHILLI_PEPPER = SkyBlock.BuiltinRegistries.registerItem("skyblock__chilli_pepper",
                new ChilliPepper(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__CHILLI_PEPPER)));
        public static final Item SKYBLOCK__GOLDEN_CHILLI_PEPPER = SkyBlock.BuiltinRegistries.registerItem("skyblock__golden_chilli_pepper",
                new Item(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__GOLDEN_CHILLI_PEPPER)));
        public static final Item SKYBLOCK__BLUEBERRIES = SkyBlock.BuiltinRegistries.registerItem("skyblock__blueberries",
                new Item(new Item.Settings().food(FoodComponentRegistries.SKYBLOCK__BLUEBERRIES)));
        public static final Item SKYBLOCK__DUCKWEED = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new PlaceableOnWaterItem(BlockRegistries.SKYBLOCK__DUCKWEED, new Item.Settings()));
        public static final Item SKYBLOCK__SMALL_LILY_PADS = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new PlaceableOnWaterItem(BlockRegistries.SKYBLOCK__SMALL_LILY_PADS, new Item.Settings()));
        public static final Item SKYBLOCK__FIRWOOD_MACE = SkyBlock.BuiltinRegistries.registerItem("skyblock__firwood_mace",
                new FirwoodMace(ToolMaterialRegistries.FIRWOOD, 9, 0.6f -4f, new Item.Settings()));
        public static final Item CREATE__NUGGET_OF_EXPERIENCE = SkyBlock.BuiltinRegistries.registerItem("create__nugget_of_experience",
                new NuggetOfExperienceItem(new Item.Settings()));
        public static final Item SKYBLOCK__RARE_TOKEN = SkyBlock.BuiltinRegistries.registerItem("skyblock__rare_token",
                new Item(new Item.Settings()));
        public static final Item SKYBLOCK__UNCOMMON_TOKEN = SkyBlock.BuiltinRegistries.registerItem("skyblock__uncommon_token",
                new Item(new Item.Settings()));
        public static final Item SKYBLOCK__COMMON_TOKEN = SkyBlock.BuiltinRegistries.registerItem("skyblock__common_token",
                new Item(new Item.Settings()));
        //SPORE PLANTER BOXES
        public static final Item SKYBLOCK__SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new SporePlanterBoxItem(BlockRegistries.SKYBLOCK__SPORE_PLANTER_BOX, new Item.Settings(), "tooltip.skyblock.skyblock__empty_spore_type"));
        public static final Item SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new SporePlanterBoxItem(BlockRegistries.SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX, new Item.Settings(), BlockRegistries.SKYBLOCK__PUFFBALL_MUSHROOM.asItem().getTranslationKey()));
        public static final Item SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new SporePlanterBoxItem(BlockRegistries.SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX, new Item.Settings(), Blocks.RED_MUSHROOM.asItem().getTranslationKey()));
        public static final Item SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new SporePlanterBoxItem(BlockRegistries.SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX, new Item.Settings(), Blocks.BROWN_MUSHROOM.asItem().getTranslationKey()));
        //SPORE PLANTER BOXES
        //---1.21.1+
        public static final Item SKYBLOCK__BONDED_TOTEM_OF_UNDYING = SkyBlock.BuiltinRegistries.registerItem("skyblock__bonded_totem_of_undying",
                new Item(new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)));
        public static final Item SKYBLOCK__OMINOUS_LINK = SkyBlock.BuiltinRegistries.registerItem("skyblock__ominous_link",
                new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
        public static final Item SKYBLOCK__COMPRESSED_STEEL = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new BlockItem(BlockRegistries.SKYBLOCK__COMPRESSED_STEEL, new Item.Settings()
                        .rarity(Rarity.EPIC)));
        //---1.21.1+
        //SKYBLOCK VANILLA+
        //SKYBLOCK TROPHIES
        public static final Item SKYBLOCK__PESTILENT_TROPHY = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
                new Trophy.BlockItem(BlockRegistries.SKYBLOCK__PESTILENT_TROPHY, new Item.Settings(),
                        new String[]{
                                "tooltip.skyblock.skyblock__pestilent_trophy.tooltip1",
                                "tooltip.skyblock.skyblock__pestilent_trophy.tooltip2"
                        },
                        new String[]{
                                "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip1",
                                "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip2",
                                "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip3",
                                "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip4",
                                "tooltip.skyblock.skyblock__pestilent_trophy.background_info.tooltip5"
                }));
        public static final Item SKYBLOCK__TORCH_OF_LUNACY = SkyBlock.BuiltinRegistries.registerItem("skyblock__torch_of_lunacy",
                new TorchOfLunacyItem(new Item.Settings(),
                        new String[]{
                                "tooltip.skyblock.skyblock__torch_of_lunacy.tooltip1",
                                "tooltip.skyblock.skyblock__torch_of_lunacy.tooltip2",
                                "tooltip.skyblock.skyblock__torch_of_lunacy.tooltip3"
                        },
                        new String[]{
                                "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip1",
                                "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip2",
                                "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip3",
                                "tooltip.skyblock.skyblock__torch_of_lunacy.background_info.tooltip4"
                        }));
        //SKYBLOCK TROPHIES
        public static final Item ABYSS__LORAN = SkyBlock.BuiltinRegistries.registerItem("abyss__loran",
                new Loran(new Item.Settings()));
        public static final Item ABYSS__ABYSS_PORTAL_ACTIVATOR = SkyBlock.BuiltinRegistries.registerItem("abyss__abyss_portal_activator",
                new Item(new Item.Settings()));
        public static final Item SP5__ENDER_STICK = SkyBlock.BuiltinRegistries.registerItem("sp5__ender_stick",
                new Item(new Item.Settings()));
        public static final Item SP5__ENDMERALD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_emerald",
                new Item(new Item.Settings()));
        public static final Item SP5__MELTED_RESIDUES = SkyBlock.BuiltinRegistries.registerItem("sp5__melted_residues",
                new Item(new Item.Settings()));
        public static final Item SP5__ENDERITE_INGOT = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_ingot",
                new Item(new Item.Settings()));
        public static final Item SP5__ENDERITE_CHORUS_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_chorus_fruit",
                new ChorusFruitItem(new Item.Settings().food(FoodComponents.CHORUS_FRUIT)));
        public static final Item SP5__POPPED_ENDERITE_CHORUS_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__popped_enderite_chorus_fruit",
                new Item(new Item.Settings()));
        public static final Item SP5__BLUISHE_LIGHT_SHEEL = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_light_sheel",
                new Item(new Item.Settings()));
        public static final Item SP5__ENDERITE_HELMET = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_helmet",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.HELMET, new Item.Settings(), 45));
        public static final Item SP5__ENDERITE_CHESTPLATE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_chestplate",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 45));
        public static final Item SP5__ENDERITE_LEGGINGS = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_leggings",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 45));
        public static final Item SP5__ENDERITE_BOOTS = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_boots",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ENDERITE, ArmorItem.Type.BOOTS, new Item.Settings(), 45));
        public static final Item SP5__ENDERITE_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_sword",
                new ToolAPI.SwordItem(ToolMaterialRegistries.ENDERITE, 9, 1.6f -4f, new Item.Settings()));
        public static final Item SP5__ENDERITE_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_axe",
                new ToolAPI.AxeItem(ToolMaterialRegistries.ENDERITE, 11, 1f -4f, new Item.Settings()));
        public static final Item SP5__ENDERITE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_shovel",
                new ToolAPI.ShovelItem(ToolMaterialRegistries.ENDERITE, 8, 1f -4f, new Item.Settings()));
        public static final Item SP5__ENDERITE_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_hoe",
                new ToolAPI.HoeItem(ToolMaterialRegistries.ENDERITE, 3, 5.5f -4f, new Item.Settings()));
        public static final Item SP5__ENDERITE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_pickaxe",
                new ToolAPI.PickaxeItem(ToolMaterialRegistries.ENDERITE, 7, 1.2f -4f, new Item.Settings()));

        public static final Item SP5__END_WOODEN_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_sword",
                new ToolAPI.SwordItem(ToolMaterials.STONE, 5-2, 1.6f -4f, new Item.Settings()));
        public static final Item SP5__END_WOODEN_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_axe",
                new ToolAPI.AxeItem(ToolMaterials.STONE, 9-2, 0.8f -4f, new Item.Settings()));
        public static final Item SP5__END_WOODEN_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_shovel",
                new ToolAPI.ShovelItem(ToolMaterials.STONE, 3.5f-2, 1f -4f, new Item.Settings()));
        public static final Item SP5__END_WOODEN_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_hoe",
                new ToolAPI.HoeItem(ToolMaterials.STONE, 1-2, 2f -4f, new Item.Settings()));
        public static final Item SP5__END_WOODEN_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_pickaxe",
                new ToolAPI.PickaxeItem(ToolMaterials.STONE, 3-2, 1.2f -4f, new Item.Settings()));


        public static final Item SP5__BLUISHE_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_sword",
                new ToolAPI.SwordItem(ToolMaterials.IRON, 6-3, 1.6f -4f, new Item.Settings()));
        public static final Item SP5__BLUISHE_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_axe",
                new ToolAPI.AxeItem(ToolMaterials.IRON, 9-3, 0.9f -4f, new Item.Settings()));
        public static final Item SP5__BLUISHE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_shovel",
                new ToolAPI.ShovelItem(ToolMaterials.IRON, 4.5f-3, 1f -4f, new Item.Settings()));
        public static final Item SP5__BLUISHE_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_hoe",
                new ToolAPI.HoeItem(ToolMaterials.IRON, 1-3, 3f -4f, new Item.Settings()));
        public static final Item SP5__BLUISHE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_pickaxe",
                new ToolAPI.PickaxeItem(ToolMaterials.IRON, 4-3, 1.2f -4f, new Item.Settings()));
        public static final Item SP5__END_STONE_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_sword",
                new ToolAPI.SwordItem(ToolMaterials.IRON, 6-3, 1.6f -4f, new Item.Settings()));
        public static final Item SP5__END_STONE_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_axe",
                new ToolAPI.AxeItem(ToolMaterials.IRON, 9-3, 0.9f -4f, new Item.Settings()));
        public static final Item SP5__END_STONE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_shovel",
                new ToolAPI.ShovelItem(ToolMaterials.IRON, 4.5f-3, 1f -4f, new Item.Settings()));
        public static final Item SP5__END_STONE_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_hoe",
                new ToolAPI.HoeItem(ToolMaterials.IRON, 1-3, 3f -4f, new Item.Settings()));
        public static final Item SP5__END_STONE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_pickaxe",
                new ToolAPI.PickaxeItem(ToolMaterials.IRON, 4-3, 1.2f -4f, new Item.Settings()));
        //ABYSS
        public static final Item ABYSS__ABERYTHE_GEM = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_gem",
                new Item(new Item.Settings()));
        public static final Item ABYSS__ABERYTHE_HELMET = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_helmet",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ABERYTHE, ArmorItem.Type.HELMET, new Item.Settings(), 41));
        public static final Item ABYSS__ABERYTHE_CHESTPLATE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_chestplate",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ABERYTHE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 41));
        public static final Item ABYSS__ABERYTHE_LEGGINGS = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_leggings",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ABERYTHE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 41));
        public static final Item ABYSS__ABERYTHE_BOOTS = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_boots",
                new ArmorAPI.ArmorItem(ArmorMaterialRegistries.ABERYTHE, ArmorItem.Type.BOOTS, new Item.Settings(), 41));
        public static final Item ABYSS__ABERYTHE_SWORD = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_sword",
                new ToolAPI.SwordItem(ToolMaterialRegistries.ENDERITE, 1, 1.6f -4f, new Item.Settings()));
        public static final Item ABYSS__ABERYTHE_AXE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_axe",
                new ToolAPI.AxeItem(ToolMaterialRegistries.ENDERITE, 1, 1f -4f, new Item.Settings()));
        public static final Item ABYSS__ABERYTHE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_shovel",
                new ToolAPI.ShovelItem(ToolMaterialRegistries.ENDERITE, 1, 1f -4f, new Item.Settings()));
        public static final Item ABYSS__ABERYTHE_HOE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_hoe",
                new ToolAPI.HoeItem(ToolMaterialRegistries.ENDERITE, 1, 5f -4f, new Item.Settings()));
        public static final Item ABYSS__ABERYTHE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_pickaxe",
                new ToolAPI.PickaxeItem(ToolMaterialRegistries.ENDERITE, 1, 1.2f -4f, new Item.Settings()));
        //ABYSS
        //MCD
        public static final Item MCD__SHORTBOW = SkyBlock.BuiltinRegistries.registerItem("mcd__shortbow",
                new ShortBowItem(new Item.Settings().maxDamage(384)));
        public static final Item MCD__TWIN_BOW = SkyBlock.BuiltinRegistries.registerItem("mcd__twin_bow",
                new TwinBowItem(new Item.Settings().maxDamage(384).rarity(Rarity.EPIC)));
        public static final Item MCD__AUTO_CROSSBOW = SkyBlock.BuiltinRegistries.registerItem("mcd__auto_crossbow",
                new AutoCrossbowItem(new Item.Settings().maxDamage(465).rarity(Rarity.EPIC)));
        public static final Item MCD__ARTIFACT_IRON_HIDE_AMULET= SkyBlock.BuiltinRegistries.registerItem("mcd__artifact_iron_hide_amulet",
                new IronSkinItem(new Item.Settings().maxCount(1).maxDamage(10)));
        public static final Item SKYBLOCK__LIGHTNING_SWORD = SkyBlock.BuiltinRegistries.registerItem("skyblock__lightning_sword",
                new ToolAPI.SwordItem(ToolMaterialRegistries.BENIKARD, 3, 3.5f -4f, new Item.Settings()));
        public static final Item MCD__DIAMOND_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__diamond_rapier",
                new RapierItem(ToolMaterials.DIAMOND, 2, Float.MAX_VALUE, new Item.Settings()));
        public static final Item MCD__GOLDEN_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__golden_rapier",
                new RapierItem(ToolMaterials.GOLD, 2, Float.MAX_VALUE, new Item.Settings()));
        public static final Item MCD__IRON_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__iron_rapier",
                new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
        public static final Item MCD__NETHERITE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__netherite_rapier",
                new RapierItem(ToolMaterials.NETHERITE, 2, Float.MAX_VALUE, new Item.Settings()));
        public static final Item MCD__STONE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__stone_rapier",
                new RapierItem(ToolMaterials.STONE, 2, Float.MAX_VALUE, new Item.Settings()));
        public static final Item MCD__WOODEN_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__wooden_rapier",
                new RapierItem(ToolMaterials.WOOD, 2, Float.MAX_VALUE, new Item.Settings()));

        public static final Item SP5__ENDERITE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_rapier",
                new RapierItem(ToolMaterialRegistries.ENDERITE, 8, Float.MAX_VALUE, new Item.Settings()));
        public static final Item SP5__END_WOODEN_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_rapier",
                new RapierItem(ToolMaterials.STONE, 2, Float.MAX_VALUE, new Item.Settings()));
        public static final Item SP5__END_STONE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_rapier",
                new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
        public static final Item SP5__BLUISHE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_rapier",
                new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
        //MCD
        // <BACKPORTED FEATURES>
        /** Ominous Bottle (1.21 Feature) */
        @Deprecated
        public static final Item BP__OMINOUS_BOTTLE = SkyBlock.BuiltinRegistries.registerItem("bp__ominous_bottle",
                new OminousBottleItem(new Item.Settings().food(FoodComponents.OMINOUS_BOTTLE).component(DataComponentTypes.OMINOUS_BOTTLE_AMPLIFIER, 0)));
        // <BACKPORTED FEATURES>
        //HALLOWEEN (UNIVERSAL)
        public static final Item H__ANOMALITE_FRAGMENT = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_fragment",
                new Item(new Item.Settings()));
        public static final Item H__ANOMALITE_HANDLE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_handle",
                new Item(new Item.Settings()));
        public static final Item H__NODE_CORE = SkyBlock.BuiltinRegistries.registerItem("h__node_core",
                new Item(new Item.Settings()));
        public static final Item H__PEARL_OF_DARKNESS = SkyBlock.BuiltinRegistries.registerItem("h__pearl_of_darkness",
                new Item(new Item.Settings()));
        public static final Item H__ANOMALITE_AXE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_axe",
                new UnenchantableAxeItem(ToolMaterialRegistries.H__ANOMALITE, 10, 1.0f -4f, new Item.Settings()));
        public static final Item H__ANOMALITE_SWORD = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_sword",
                new UnenchantableSwordItem(ToolMaterialRegistries.H__ANOMALITE, 8, 1.6f -4f, new Item.Settings()));
        public static final Item H__ANOMALITE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_pickaxe",
                new UnenchantablePickaxeItem(ToolMaterialRegistries.H__ANOMALITE, 6, 1.2f -4f, new Item.Settings()));
        public static final Item H__ANOMALITE_HELMET = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_helmet",
                new AnomaliteArmorItem(ArmorMaterialRegistries.H__ANOMALITE, ArmorItem.Type.HELMET, new Item.Settings(), 40));
        public static final Item H__ANOMALITE_CHESTPLATE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_chestplate",
                new AnomaliteArmorItem(ArmorMaterialRegistries.H__ANOMALITE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 40));
        public static final Item H__ANOMALITE_LEGGINGS = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_leggings",
                new AnomaliteArmorItem(ArmorMaterialRegistries.H__ANOMALITE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 40));
        public static final Item H__ANOMALITE_BOOTS = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_boots",
                new AnomaliteArmorItem(ArmorMaterialRegistries.H__ANOMALITE, ArmorItem.Type.BOOTS, new Item.Settings(), 40));
        // <HALLOWEEN 2023 EXCLUSIVE>
        @Deprecated
        public static final Item H__ANOMALITE_SWORD1 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_sword1",
                new UnenchantableSwordItem(ToolMaterialRegistries.H__ANOMALITE, 8, 1.6f -4f, new Item.Settings()));
        @Deprecated
        public static final Item H__ANOMALITE_SWORD2 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_sword2",
                new UnenchantableSwordItem(ToolMaterialRegistries.H__ANOMALITE, 8, 1.6f -4f, new Item.Settings()));
        @Deprecated
        public static final Item H__ANOMALITE_PICKAXE1 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_pickaxe1",
                new UnenchantablePickaxeItem(ToolMaterialRegistries.H__ANOMALITE, 6, 1.2f -4f, new Item.Settings()));
        @Deprecated
        public static final Item H__ANOMALITE_PICKAXE2 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_pickaxe2",
                new UnenchantablePickaxeItem(ToolMaterialRegistries.H__ANOMALITE, 6, 1.2f -4f, new Item.Settings()));
        @Deprecated
        public static final Item H__PLASMA_1 = SkyBlock.BuiltinRegistries.registerItem("h__plasma_1",
                new Item(new Item.Settings()));
        @Deprecated
        public static final Item H__PLASMA_2 = SkyBlock.BuiltinRegistries.registerItem("h__plasma_2",
                new Item(new Item.Settings()));
        // <HALLOWEEN 2023 EXCLUSIVE>
        // <HALLOWEEN 2024 EXCLUSIVE>
        // ---------empty------------
        // <HALLOWEEN 2024 EXCLUSIVE>
        //HALLOWEEN (UNIVERSAL)
        //unimplemented TODO
        public static final Item MCD__VILLAGER_STATUE = SkyBlock.BuiltinRegistries.registerItem("mcd__villager_statue",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__FORBIDDEN_POTION = SkyBlock.BuiltinRegistries.registerItem("sp5__forbidden_potion",
                new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
        public static final Item SP5__GOD_POTION = SkyBlock.BuiltinRegistries.registerItem("sp5__god_potion",
                new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
        public static final Item SP5__END_CAKE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_cake",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__END_MILK = SkyBlock.BuiltinRegistries.registerItem("sp5__end_milk",
                new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
        public static final Item SP5__CORCODUS_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__corcodus_fruit",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__END_VINES = SkyBlock.BuiltinRegistries.registerItem("sp5__end_vines",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item MCD__DIAMOND_KEY = SkyBlock.BuiltinRegistries.registerItem("mcd__diamond_key",
                new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
        public static final Item MCD__GOLD_KEY = SkyBlock.BuiltinRegistries.registerItem("mcd__gold_key",
                new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
        public static final Item SP5__END_BREAD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_bread",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__END_WHEAT = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wheat",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__END_WHEAT_SEEDS = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wheat_seeds",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__NAVI_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__navi_fruit",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__END_BEEF = SkyBlock.BuiltinRegistries.registerItem("sp5__end_beef",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        public static final Item SP5__COOKED_END_BEEF = SkyBlock.BuiltinRegistries.registerItem("sp5__cooked_end_beef",
                new Item(new Item.Settings().rarity(Rarity.EPIC)));
        //unimplemented
        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Items for " + SkyBlock.MOD_ID);
        }
    }

    public static class ItemGroupRegistries {
        public static final ItemGroup SKYBLOCK_FEATURES = SkyBlock.BuiltinRegistries.registerItemGroup( "skyblock_features",
                FabricItemGroup.builder().displayName(Text.literal("SkyBlock-Multimod")).icon(() -> new ItemStack(GhostItemRegistries.Z__LOGO1)).entries((displayContext, entries) -> {
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK_9, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(BlockRegistries.SKYBLOCK__FROSTSLATE);
                    entries.add(BlockRegistries.SKYBLOCK__FROSTSLATE_PILLAR);
                    entries.add(BlockRegistries.SKYBLOCK__FROSTSLATE_BRICKS);
                    entries.add(BlockRegistries.SKYBLOCK__FROSTSLATE_BRICK_STAIRS);
                    entries.add(BlockRegistries.SKYBLOCK__FROSTSLATE_BRICK_SLAB);
                    entries.add(BlockRegistries.SKYBLOCK__SNOWY_SHORT_GRASS);
                    ItemGroupRegistries.addSpaces(entries, 0, 3);
                    invisibleAdd(entries, ItemRegistries.SKYBLOCK__LIGHTNING_SWORD);
                    entries.add(ItemRegistries.SKYBLOCK__BOTTLE_OF_ANT_JAM);
                    entries.add(BlockRegistries.SKYBLOCK__ANT_JAM_BLOCK);
                    entries.add(ItemRegistries.SKYBLOCK__ANT_BOTTLE);
                    entries.add(BlockRegistries.SKYBLOCK__SUSPICIOUS_COARSE_DIRT);
                    ItemGroupRegistries.addSpaces(entries, 3, 4);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2_9, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(BlockRegistries.SKYBLOCK__BOGGED_LOG);
                    entries.add(BlockRegistries.SKYBLOCK__BOGGED_WOOD);
                    entries.add(BlockRegistries.SKYBLOCK__BOGGED_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__BOGGED_STAIRS);
                    entries.add(BlockRegistries.SKYBLOCK__BOGGED_SLAB);
                    entries.add(ItemRegistries.SKYBLOCK__DUCKWEED);
                    entries.add(BlockRegistries.SKYBLOCK__CLOVER);
                    entries.add(ItemRegistries.SKYBLOCK__SMALL_LILY_PADS);
                    entries.add(BlockRegistries.SKYBLOCK__ANCIENT_PEDESTAL);
                    entries.add(BlockRegistries.SKYBLOCK__WHITE_MUSHROOM_STEM);
                    entries.add(BlockRegistries.SKYBLOCK__WHITE_MUSHROOM_HYPHAE);
                    entries.add(BlockRegistries.SKYBLOCK__STRIPPED_MUSHROOM_STEM);
                    entries.add(BlockRegistries.SKYBLOCK__STRIPPED_MUSHROOM_HYPHAE);
                    entries.add(BlockRegistries.SKYBLOCK__MUSHROOM_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__VERTICAL_MUSHROOM_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__CARVED_MUSHROOM_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__MUSHROOM_STAIRS);
                    entries.add(BlockRegistries.SKYBLOCK__MUSHROOM_SLAB);
                    entries.add(BlockRegistries.SKYBLOCK__FIR_LOG);
                    entries.add(BlockRegistries.SKYBLOCK__FIR_WOOD);
                    entries.add(BlockRegistries.SKYBLOCK__STRIPPED_FIR_LOG);
                    entries.add(BlockRegistries.SKYBLOCK__STRIPPED_FIR_WOOD);
                    entries.add(BlockRegistries.SKYBLOCK__FIR_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__VERTICAL_FIR_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__CARVED_FIR_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__FIR_STAIRS);
                    entries.add(BlockRegistries.SKYBLOCK__FIR_SLAB);
                    entries.add(ItemRegistries.SKYBLOCK__FIRWOOD_MACE);
                    entries.add(BlockRegistries.SKYBLOCK__FIR_LEAVES);
                    entries.add(BlockRegistries.SKYBLOCK__AUTUMN_FIR_LEAVES);
                    entries.add(BlockRegistries.SKYBLOCK__AUTUMN_BIRCH_LEAVES);
                    entries.add(BlockRegistries.SKYBLOCK__BLUEBERRY_BUSH);
                    entries.add(ItemRegistries.SKYBLOCK__CHILLI_PEPPER_SEEDS);
                    ItemGroupRegistries.addSpaces(entries, 7, 3);
                    entries.add(BlockRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK);
                    entries.add(ItemRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_FLESH);
                    entries.add(ItemRegistries.SKYBLOCK__COOKED_PUFFBALL_MUSHROOM_FLESH);
                    entries.add(BlockRegistries.SKYBLOCK__PUFFBALL_MUSHROOM);
                    entries.add(ItemRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_STEW);
                    entries.add(ItemRegistries.SKYBLOCK__SPORE_PLANTER_BOX);
                    entries.add(ItemRegistries.SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX);
                    entries.add(ItemRegistries.SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX);
                    entries.add(ItemRegistries.SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX);
                    entries.add(BlockRegistries.SKYBLOCK__CHILLI_PEPPER_CRATE);
                    entries.add(ItemRegistries.SKYBLOCK__CHILLI_PEPPER);
                    entries.add(BlockRegistries.SKYBLOCK__GOLDEN_CHILLI_PEPPER_CRATE);
                    entries.add(ItemRegistries.SKYBLOCK__GOLDEN_CHILLI_PEPPER);
                    entries.add(BlockRegistries.SKYBLOCK__BLUEBERRY_SACK);
                    entries.add(ItemRegistries.SKYBLOCK__BLUEBERRIES);
                    entries.add(BlockRegistries.SKYBLOCK__BLOCK_OF_EXPERIENCE);
                    entries.add(ItemRegistries.CREATE__NUGGET_OF_EXPERIENCE);
                    ItemGroupRegistries.addSpaces(entries, 10,1);
                    entries.add(Items.OMINOUS_BOTTLE);
                    entries.add(ItemRegistries.SKYBLOCK__OMINOUS_LINK);
                    entries.add(Items.TOTEM_OF_UNDYING);
                    entries.add(ItemRegistries.SKYBLOCK__BONDED_TOTEM_OF_UNDYING);
                    entries.add(Items.HEAVY_CORE);
                    entries.add(ItemRegistries.SKYBLOCK__COMPRESSED_STEEL);
                    entries.add(ItemRegistries.SKYBLOCK__COMMON_TOKEN);
                    entries.add(ItemRegistries.SKYBLOCK__UNCOMMON_TOKEN);
                    entries.add(ItemRegistries.SKYBLOCK__RARE_TOKEN);
                    entries.add(BlockRegistries.SKYBLOCK__CARVED_OAK_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__CARVED_SPRUCE_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__CARVED_DARK_OAK_PLANKS);
                    entries.add(BlockRegistries.ABYSS__CARVED_FROZEN_PLANKS);
                    ItemGroupRegistries.addSpaces(entries, 11, 5);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p1_9, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(BlockRegistries.BP__PALE_LOG);
                    entries.add(BlockRegistries.BP__PALE_WOOD);
                    entries.add(BlockRegistries.BP__STRIPPED_PALE_LOG);
                    entries.add(BlockRegistries.BP__STRIPPED_PALE_WOOD);
                    entries.add(BlockRegistries.BP__PALE_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_PALE_OAK_PLANKS);
                    entries.add(BlockRegistries.SKYBLOCK__CARVED_PALE_OAK_PLANKS);
                    entries.add(BlockRegistries.BP__PALE_STAIRS);
                    entries.add(BlockRegistries.BP__PALE_SLAB);
                    entries.add(BlockRegistries.BP__PALE_LEAVES);
                    entries.add(BlockRegistries.BP__PALE_MOSS_BLOCK);
                    entries.add(BlockRegistries.BP__PALE_MOSS_CARPET);
                    ItemGroupRegistries.addSpaces(entries, 16, 6);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK2p2_9, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(ItemRegistries.SKYBLOCK__PESTILENT_TROPHY, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(ItemRegistries.SKYBLOCK__TORCH_OF_LUNACY, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    ItemGroupRegistries.addSpaces(entries, 22, 7);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SKYBLOCK3_9, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(ItemRegistries.H__ANOMALITE_SWORD);
                    entries.add(ItemRegistries.H__ANOMALITE_AXE);
                    entries.add(ItemRegistries.H__ANOMALITE_PICKAXE);
                    entries.add(ItemRegistries.H__ANOMALITE_FRAGMENT);
                    entries.add(ItemRegistries.H__ANOMALITE_HANDLE);
                    entries.add(ItemRegistries.H__ANOMALITE_HELMET);
                    entries.add(ItemRegistries.H__ANOMALITE_CHESTPLATE);
                    entries.add(ItemRegistries.H__ANOMALITE_LEGGINGS);
                    entries.add(ItemRegistries.H__ANOMALITE_BOOTS);
                    entries.add(ItemRegistries.H__PEARL_OF_DARKNESS);
                    entries.add(ItemRegistries.H__NODE_CORE);
                    entries.add(ItemRegistries.H__PLASMA_1);
                    entries.add(ItemRegistries.H__PLASMA_2);
                    entries.add(BlockRegistries.H__NODE);
                    ItemGroupRegistries.addSpaces(entries, 29, 4);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    entries.add(GhostItemRegistries.Z__TILE_SP5_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                    ItemGroupRegistries.addTiles(entries, 0, 1);
                    entries.add(ItemRegistries.SP5__ENDERITE_INGOT);
                    entries.add(ItemRegistries.SP5__ENDERITE_APPLE);
                    entries.add(ItemRegistries.SP5__ENCHANTED_ENDERITE_APPLE);
                    entries.add(ItemRegistries.SP5__ENDER_STICK);
                    entries.add(ItemRegistries.SP5__ENDMERALD);
                    entries.add(ItemRegistries.SP5__MELTED_RESIDUES);

                    entries.add(ItemRegistries.SP5__ENDERITE_HELMET);
                    entries.add(ItemRegistries.SP5__ENDERITE_CHESTPLATE);
                    entries.add(ItemRegistries.SP5__ENDERITE_LEGGINGS);
                    entries.add(ItemRegistries.SP5__ENDERITE_BOOTS);
                    entries.add(ItemRegistries.SP5__ENDERITE_SWORD);
                    entries.add(ItemRegistries.SP5__ENDERITE_RAPIER);
                    entries.add(ItemRegistries.SP5__ENDERITE_AXE);
                    entries.add(ItemRegistries.SP5__ENDERITE_SHOVEL);
                    entries.add(ItemRegistries.SP5__ENDERITE_HOE);
                    entries.add(ItemRegistries.SP5__ENDERITE_PICKAXE);

                    entries.add(BlockRegistries.SP5__ENDMERALD_ORE);
                    entries.add(BlockRegistries.SP5__ENDMERALD_BLOCK);

                    entries.add(BlockRegistries.SP5__ENDERITE_ORE);
                    entries.add(BlockRegistries.SP5__ENDERITE_BLOCK);

                    entries.add(BlockRegistries.SP5__ASTEROID_RESIDUES);
                    entries.add(BlockRegistries.SP5__SOLID_ROCK);

                    entries.add(BlockRegistries.SP5__END_GRASS);
                    entries.add(BlockRegistries.SP5__BLUISHE_GRASS);

                    entries.add(BlockRegistries.SP5__TRANSPARENT_BLOCK);
                    entries.add(BlockRegistries.SP5__END_WART_BLOCK);
                    entries.add(BlockRegistries.SP5__BLUE_WART);

                    entries.add(BlockRegistries.SP5__END_STEM);
                    entries.add(BlockRegistries.SP5__END_HYPHAE);
                    entries.add(BlockRegistries.SP5__STRIPPED_END_STEM);
                    entries.add(BlockRegistries.SP5__STRIPPED_END_HYPHAE);
                    entries.add(BlockRegistries.SP5__END_PLANKS);
                    entries.add(BlockRegistries.SP5__END_STAIRS);
                    entries.add(BlockRegistries.SP5__END_SLAB);
                    entries.add(BlockRegistries.SP5__ENDLIGHT);

                    entries.add(BlockRegistries.SP5__BLUISHE_STEM);
                    entries.add(BlockRegistries.SP5__BLUISHE_HYPHAE);
                    entries.add(BlockRegistries.SP5__BLUISHE_LIGHT_STEM);
                    entries.add(BlockRegistries.SP5__BLUISHE_LIGHT_HYPHAE);
                    entries.add(BlockRegistries.SP5__STRIPPED_BLUISHE_STEM);
                    entries.add(BlockRegistries.SP5__STRIPPED_BLUISHE_HYPHAE);
                    entries.add(BlockRegistries.SP5__BLUISHE_PLANKS);
                    entries.add(BlockRegistries.SP5__BLUISHE_STAIRS);
                    entries.add(BlockRegistries.SP5__BLUISHE_SLAB);

                    entries.add(BlockRegistries.SP5__END_GRASS_VEGETATION);
                    entries.add(BlockRegistries.SP5__END_MUSHROOM);
                    entries.add(BlockRegistries.SP5__BLUISHE_BUSH);
                    entries.add(BlockRegistries.SP5__BLUISHE_MUSHROOM);
                    entries.add(BlockRegistries.SP5__END_BUSH);
                    entries.add(BlockRegistries.SP5__END_FLOWER);

                    entries.add(BlockRegistries.SP5__CRACKED_END_STONE_BRICKS);
                    entries.add(BlockRegistries.SP5__WARPED_END_STONE_BRICKS);
                    entries.add(BlockRegistries.SP5__END_STONE_PILLAR);
                    entries.add(BlockRegistries.SP5__END_STONE_TILES);
                    entries.add(BlockRegistries.SP5__SMALL_END_STONE_BRICKS);
                    entries.add(BlockRegistries.SP5__SMOOTH_END_STONE);
                    entries.add(BlockRegistries.SP5__CHISELED_END_STONE);
                    entries.add(BlockRegistries.SP5__CHISELED_END_STONE_CUBIC);
                    entries.add(BlockRegistries.SP5__CHISELED_END_STONE_MAZE);

                    entries.add(BlockRegistries.SP5__PURPLE_END_BRICKS);
                    entries.add(BlockRegistries.SP5__PURPLE_END_BRICK_PILLAR);
                    entries.add(BlockRegistries.SP5__WARPED_PURPLE_END_BRICKS);
                    entries.add(BlockRegistries.SP5__PURPLE_END_BRICK_STAIRS);
                    entries.add(BlockRegistries.SP5__PURPLE_END_BRICK_SLAB);

                    entries.add(BlockRegistries.SP5__END_PURPLE_BLOCK);
                    entries.add(BlockRegistries.SP5__END_PURPLE_PILLAR);
                    entries.add(BlockRegistries.SP5__ENDER_BLOCK);
                    entries.add(BlockRegistries.SP5__END_PURPLE_STAIRS);
                    entries.add(BlockRegistries.SP5__END_PURPLE_SLAB);

                    entries.add(ItemRegistries.SP5__ENDERITE_CHORUS_FRUIT);
                    entries.add(ItemRegistries.SP5__POPPED_ENDERITE_CHORUS_FRUIT);

                    entries.add(ItemRegistries.SP5__BLUISHE_LIGHT_SHEEL);

                    entries.add(ItemRegistries.SP5__END_WOODEN_SWORD);
                    entries.add(ItemRegistries.SP5__END_WOODEN_RAPIER);
                    entries.add(ItemRegistries.SP5__END_WOODEN_AXE);
                    entries.add(ItemRegistries.SP5__END_WOODEN_SHOVEL);
                    entries.add(ItemRegistries.SP5__END_WOODEN_HOE);
                    entries.add(ItemRegistries.SP5__END_WOODEN_PICKAXE);

                    entries.add(ItemRegistries.SP5__END_STONE_SWORD);
                    entries.add(ItemRegistries.SP5__END_STONE_RAPIER);
                    entries.add(ItemRegistries.SP5__END_STONE_AXE);
                    entries.add(ItemRegistries.SP5__END_STONE_SHOVEL);
                    entries.add(ItemRegistries.SP5__END_STONE_HOE);
                    entries.add(ItemRegistries.SP5__END_STONE_PICKAXE);

                    entries.add(ItemRegistries.SP5__BLUISHE_SWORD);
                    entries.add(ItemRegistries.SP5__BLUISHE_RAPIER);
                    entries.add(ItemRegistries.SP5__BLUISHE_AXE);
                    entries.add(ItemRegistries.SP5__BLUISHE_SHOVEL);
                    entries.add(ItemRegistries.SP5__BLUISHE_HOE);
                    entries.add(ItemRegistries.SP5__BLUISHE_PICKAXE);
                    ItemGroupRegistries.addSpaces(entries, 33, 0);
                    ItemGroupRegistries.addTiles(entries, 1, 9);
                    entries.add(Blocks.SCULK);
                    entries.add(BlockRegistries.BOSC__SCULK_JAW);
                    entries.add(BlockRegistries.SKYBLOCK__SCULK_SPROUTS);
                    entries.add(BlockRegistries.SKYBLOCK__RED_SCULK);
                    entries.add(BlockRegistries.SKYBLOCK__RED_SCULK_JAW);
                    entries.add(BlockRegistries.SKYBLOCK__RED_SCULK_SPROUTS);
                    entries.add(BlockRegistries.BOSC__DEAD_SCULK);
                    entries.add(BlockRegistries.BOSC__DEAD_SCULK_JAW);
                    entries.add(BlockRegistries.BOSC__DEAD_SCULK_SPROUTS);
                    ItemGroupRegistries.addSpaces(entries, 33, 0);
                    ItemGroupRegistries.addTiles(entries, 10, 9);
                    entries.add(BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM);
                    entries.add(BlockRegistries.SKYBLOCK__UNKNOWN_DIRT);
                    entries.add(BlockRegistries.SKYBLOCK__UNKNOWN_VEGETATION);
                    entries.add(BlockRegistries.SKYBLOCK__UNKNOWN_SPROUTS);
                    ItemGroupRegistries.addSpaces(entries, 33, 5);
                    ItemGroupRegistries.addTiles(entries, 19, 9);
                    entries.add(BlockRegistries.FLOGICAL__AZALEA_LOG);
                    entries.add(BlockRegistries.FLOGICAL__AZALEA_WOOD);
                    entries.add(BlockRegistries.FLOGICAL__STRIPPED_AZALEA_LOG);
                    entries.add(BlockRegistries.FLOGICAL__STRIPPED_AZALEA_WOOD);
                    entries.add(BlockRegistries.FLOGICAL__AZALEA_PLANKS);
                    entries.add(BlockRegistries.FLOGICAL__AZALEA_STAIRS);
                    entries.add(BlockRegistries.FLOGICAL__AZALEA_SLAB);
                    ItemGroupRegistries.addSpaces(entries, 38, 2);
                    ItemGroupRegistries.addTiles(entries, 28, 9);
                    entries.add(BlockRegistries.DIGPEAR__CALLERY_LOG);
                    entries.add(BlockRegistries.DIGPEAR__CALLERY_WOOD);
                    entries.add(BlockRegistries.DIGPEAR__STRIPPED_CALLERY_LOG);
                    entries.add(BlockRegistries.DIGPEAR__STRIPPED_CALLERY_WOOD);
                    entries.add(BlockRegistries.DIGPEAR__CALLERY_PLANKS);
                    entries.add(BlockRegistries.DIGPEAR__CALLERY_STAIRS);
                    entries.add(BlockRegistries.DIGPEAR__CALLERY_SLAB);
                    entries.add(BlockRegistries.DIGPEAR__CALLERY_LEAVES);
                    entries.add(BlockRegistries.DIGPEAR__FLOWERING_CALLERY_LEAVES);
                    ItemGroupRegistries.addTiles(entries, 37, 9);
                }).build());
        public static ItemGroup MCD = SkyBlock.BuiltinRegistries.registerItemGroup("minecraft_dungeons",
                FabricItemGroup.builder().displayName(Text.literal("SkyBlock: Minecraft Dungeons (ilosemypotato)")).icon(() -> new ItemStack(GhostItemRegistries.Z__LOGO2)).entries((displayContext, entries) -> {
                    entries.add(ItemRegistries.MCD__TWIN_BOW);
                    entries.add(ItemRegistries.MCD__AUTO_CROSSBOW);
                    entries.add(ItemRegistries.MCD__WOODEN_RAPIER);
                    entries.add(ItemRegistries.MCD__STONE_RAPIER);
                    entries.add(ItemRegistries.MCD__IRON_RAPIER);
                    entries.add(ItemRegistries.MCD__GOLDEN_RAPIER);
                    entries.add(ItemRegistries.MCD__DIAMOND_RAPIER);
                    entries.add(ItemRegistries.MCD__NETHERITE_RAPIER);
                    entries.add(BlockRegistries.MCD__MOSSIER_COBBLESTONE);
                    entries.add(BlockRegistries.MCD__MIDNIGHT_MOSS_BLOCK);
                    entries.add(BlockRegistries.MCD__MIDNIGHT_MOSS_CARPET);
                    entries.add(BlockRegistries.MCD__MIDNIGHT_SPROUTS);
                    entries.add(BlockRegistries.MCD__POP_FLOWER);
                    entries.add(BlockRegistries.MCD__MOSSIER_OAK_PLANKS);
                    entries.add(BlockRegistries.MCD__MOSSIER_SPRUCE_PLANKS);
                    ItemStack commonAmulet = new ItemStack(ItemRegistries.MCD__ARTIFACT_IRON_HIDE_AMULET);
                    commonAmulet.set(DataComponentTypeRegistries.MCD__RARITY, McdRarity.COMMON);
                    entries.add(commonAmulet);
                    ItemStack rareAmulet = new ItemStack(ItemRegistries.MCD__ARTIFACT_IRON_HIDE_AMULET);
                    rareAmulet.set(DataComponentTypeRegistries.MCD__RARITY, McdRarity.RARE);
                    entries.add(rareAmulet);
                }).build());
        public static ItemGroup UNUSED = SkyBlock.BuiltinRegistries.registerItemGroup("unused",
                FabricItemGroup.builder().displayName(Text.literal("SkyBlock: Unused (Qbaesz13)")).icon(() -> new ItemStack(GhostItemRegistries.Z__LOGO5)).entries((displayContext, entries) -> {
                    invisibleAdd(entries, ItemRegistries.WITHERSTORM__MUSIC_DISC_WITHERSTORM);
                    invisibleAdd(entries, ItemRegistries.WITHERSTORM__DISC_FRAGMENT_WITHERSTORM);
                    invisibleAdd(entries, ItemRegistries.SKYBLOCK__FYBERITE);
                    invisibleAdd(entries, ItemRegistries.SKYBLOCK__SUGAR_POPPY_MIXTURE);
                    invisibleAdd(entries, ItemRegistries.SKYBLOCK__STEAM_DUMPLING_FRESH);
                    invisibleAdd(entries, ItemRegistries.SKYBLOCK__STEAM_DUMPLING);
                    invisibleAdd(entries, ItemRegistries.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER);
                    invisibleAdd(entries, ItemRegistries.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE);
                    invisibleAdd(entries, BlockRegistries.MCD__VOID_BLOCK);
                    invisibleAdd(entries, BlockRegistries.MCD__STRONGHOLD_DECOR);
                    invisibleAdd(entries, BlockRegistries.ABYSS__ABYSS_STONE_OG);
                    //invisibleAdd(entries, ModBlocks.STRIPPED_ABYSCULK_LOG);
                    //invisibleAdd(entries, ModBlocks.STRIPPED_ABYSCULK_WOOD);
                    invisibleAdd(entries, BlockRegistries.SKYBLOCK__SWEET_BERRY_JAM_BLOCK);
                    entries.add(BlockRegistries.MCD__BARREN_GRASS_BLOCK);
                    entries.add(BlockRegistries.MCD__OG_PURPUR_BLOCK);
                    entries.add(ItemRegistries.MCD__SHORTBOW);
                    invisibleAdd(entries, ItemRegistries.MCD__VILLAGER_STATUE);
                    invisibleAdd(entries, ItemRegistries.SP5__FORBIDDEN_POTION);
                    invisibleAdd(entries, ItemRegistries.SP5__GOD_POTION);
                    invisibleAdd(entries, ItemRegistries.SP5__END_CAKE);
                    invisibleAdd(entries, ItemRegistries.SP5__END_MILK);
                    invisibleAdd(entries, ItemRegistries.SP5__CORCODUS_FRUIT);
                    invisibleAdd(entries, ItemRegistries.SP5__END_VINES);
                    invisibleAdd(entries, ItemRegistries.MCD__DIAMOND_KEY);
                    invisibleAdd(entries, ItemRegistries.MCD__GOLD_KEY);
                    invisibleAdd(entries, ItemRegistries.SP5__END_BREAD);
                    invisibleAdd(entries, ItemRegistries.SP5__END_WHEAT);
                    invisibleAdd(entries, ItemRegistries.SP5__END_WHEAT_SEEDS);
                    invisibleAdd(entries, ItemRegistries.SP5__NAVI_FRUIT);
                    invisibleAdd(entries, ItemRegistries.SP5__END_BEEF);
                    invisibleAdd(entries, ItemRegistries.SP5__COOKED_END_BEEF);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ENDMERALD_ORE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ENDMERALD_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ENDERITE_ORE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ENDERITE_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ASTEROID_RESIDUES);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.SOLID_ROCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.END_GRASS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_GRASS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ANT_JAM_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.SWEET_BERRY_JAM_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.SUSPICIOUS_COARSE_DIRT);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.TRANSPARENT_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.END_WART_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUE_WART);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.END_STEM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.END_HYPHAE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.STRIPPED_END_STEM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.STRIPPED_END_HYPHAE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ENDLIGHT);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.END_PLANKS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.END_STAIRS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.END_SLAB);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_STEM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_HYPHAE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_LIGHT_STEM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_LIGHT_HYPHAE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.STRIPPED_BLUISHE_STEM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.STRIPPED_BLUISHE_HYPHAE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_PLANKS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_STAIRS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BLUISHE_SLAB);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.AZALEA_LOG);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.AZALEA_WOOD);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.STRIPPED_AZALEA_LOG);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.STRIPPED_AZALEA_WOOD);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.AZALEA_PLANKS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.AZALEA_STAIRS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.AZALEA_SLAB);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.MOSSIER_COBBLESTONE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.MOSSIER_OAK_PLANKS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.MOSSIER_SPRUCE_PLANKS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.APPLE_CRATE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.BEETROOT_CRATE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.CARROT_CRATE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.POTATO_CRATE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.GOLDEN_APPLE_CRATE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.GOLDEN_CARROT_CRATE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.SWEET_BERRY_SACK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.GLOW_BERRY_SACK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.COCOA_BEANS_SACK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.GUNPOWDER_SACK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.NETHER_WART_SACK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.STICK_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.SUGAR_CANE_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.CACTUS_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.CHORUS_FRUIT_BLOCK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.ANDESITE_PILLAR);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.DIORITE_PILLAR);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.GRANITE_PILLAR);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedBlockRegistries.CAVE_ROOTS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ANT_BOTTLE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.BOTTLE_OF_ANT_JAM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.MUSIC_DISC_WITHERSTORM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.DISC_FRAGMENT_WITHERSTORM);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_APPLE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENCHANTED_ENDERITE_APPLE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDER_STICK);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDMERALD);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.MELTE_RESIDUES);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_INGOT);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_HELMET);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_CHESTPLATE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_LEGGINGS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_BOOTS);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_SWORD);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_AXE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_SHOVEL);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_HOE);
                    invisibleAdd(entries, ArchivedRegistries.ArchivedItemRegistries.ENDERITE_PICKAXE);
                    invisibleAdd(entries, ItemRegistries.BP__OMINOUS_BOTTLE);
                    invisibleAdd(entries, ItemRegistries.H__ANOMALITE_SWORD1);
                    invisibleAdd(entries, ItemRegistries.H__ANOMALITE_SWORD2);
                    invisibleAdd(entries, ItemRegistries.H__ANOMALITE_PICKAXE1);
                    invisibleAdd(entries, ItemRegistries.H__ANOMALITE_PICKAXE2);
                    invisibleAdd(entries, ItemRegistries.H__PLASMA_1);
                    invisibleAdd(entries, ItemRegistries.H__PLASMA_2);
                }).build());
        public static ItemGroup ABYSS = SkyBlock.BuiltinRegistries.registerItemGroup("classified",
                FabricItemGroup.builder().displayName(Text.literal("The Abyss Chapter II (Y3Z0N)")).icon(() -> new ItemStack(GhostItemRegistries.Z__LOGO3)).entries((displayContext, entries) -> {
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_GEM);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_HELMET);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_CHESTPLATE);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_LEGGINGS);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_BOOTS);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_SWORD);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_AXE);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_SHOVEL);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_HOE);
                    entries.add(ItemRegistries.ABYSS__ABERYTHE_PICKAXE);
                    entries.add(ItemRegistries.ABYSS__LORAN);
                    entries.add(ItemRegistries.ABYSS__ABYSS_PORTAL_ACTIVATOR);
                    entries.add(BlockRegistries.ABYSS__UNSTABLE_OBSIDIAN);
                    entries.add(BlockRegistries.ABYSS__ABYSS_DIRT);
                    entries.add(BlockRegistries.ABYSS__ROMA_MUD);
                    entries.add(BlockRegistries.ABYSS__ROMA_MUD_CURSED);
                    entries.add(BlockRegistries.ABYSS__ABYSS_GRAVEL);
                    entries.add(BlockRegistries.ABYSS__INFECTED_PEAT);
                    entries.add(BlockRegistries.ABYSS__STONE_RACKLE);
                    entries.add(BlockRegistries.ABYSS__BLARU_MOSS);
                    entries.add(BlockRegistries.ABYSS__GLOWING_BLARU_MOSS);
                    entries.add(BlockRegistries.ABYSS__BLARU_GRASS);
                    entries.add(BlockRegistries.ABYSS__ABYSS_SPORES);
                    entries.add(BlockRegistries.ABYSS__TESLA_FLOWER);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_VERSA);
                    entries.add(BlockRegistries.ABYSS__EXOLIUS_MAXIMUS);
                    entries.add(BlockRegistries.ABYSS__YOUNG_EXOLIUS_MAXIMUS);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_GRASS);
                    entries.add(BlockRegistries.ABYSS__BLUE_VIGILANT_GRASS);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_MOSS);
                    entries.add(BlockRegistries.ABYSS__INFUSED_MAGMA);
                    entries.add(BlockRegistries.ABYSS__ABYSS_STONE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_DIAMOND_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_EMERALD_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_GOLD_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_IRON_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_IGNISITHE_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_ABERYTHE_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_ABORANYS_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_FUSION_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_GARNITE_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_GLACERYTHE_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_INCORYTHE_ORE);
                    entries.add(BlockRegistries.ABYSS__ABYSS_LORAN_ORE);
                    entries.add(BlockRegistries.ABYSS__PURPLE_SHROOMLIGHT);
                    entries.add(BlockRegistries.ABYSS__DARK_BLUE_SHROOMLIGHT);
                    entries.add(BlockRegistries.ABYSS__BLUE_SHROOMLIGHT);
                    entries.add(BlockRegistries.ABYSS__ABYSS_JUNGLE_LOG);
                    entries.add(BlockRegistries.ABYSS__ABYSS_JUNGLE_WOOD);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD);
                    entries.add(BlockRegistries.ABYSS__ABYSS_JUNGLE_PLANKS);
                    entries.add(BlockRegistries.ABYSS__ABYSS_JUNGLE_STAIRS);
                    entries.add(BlockRegistries.ABYSS__ABYSS_JUNGLE_SLAB);
                    entries.add(BlockRegistries.ABYSS__ABYSS_JUNGLE_LEAVES);
                    entries.add(BlockRegistries.ABYSS__BLARU_LOG);
                    entries.add(BlockRegistries.ABYSS__BLARU_WOOD);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_BLARU_LOG);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_BLARU_WOOD);
                    entries.add(BlockRegistries.ABYSS__BLARU_PLANKS);
                    entries.add(BlockRegistries.ABYSS__BLARU_STAIRS);
                    entries.add(BlockRegistries.ABYSS__BLARU_SLAB);
                    entries.add(BlockRegistries.ABYSS__BLARU_LEAVES);
                    entries.add(BlockRegistries.ABYSS__FROZEN_LOG);
                    entries.add(BlockRegistries.ABYSS__FROZEN_WOOD);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_FROZEN_LOG);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_FROZEN_WOOD);
                    entries.add(BlockRegistries.ABYSS__FROZEN_PLANKS);
                    entries.add(BlockRegistries.ABYSS__VERTICAL_FROZEN_PLANKS);
                    entries.add(BlockRegistries.ABYSS__CARVED_FROZEN_PLANKS);
                    entries.add(BlockRegistries.ABYSS__FROZEN_STAIRS);
                    entries.add(BlockRegistries.ABYSS__FROZEN_SLAB);
                    entries.add(BlockRegistries.ABYSS__FROZEN_LEAVES);
                    entries.add(BlockRegistries.ABYSS__SLIMED_LOG);
                    entries.add(BlockRegistries.ABYSS__SLIMED_WOOD);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_SLIMED_LOG);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_SLIMED_WOOD);
                    entries.add(BlockRegistries.ABYSS__SLIMED_PLANKS);
                    entries.add(BlockRegistries.ABYSS__SLIMED_STAIRS);
                    entries.add(BlockRegistries.ABYSS__SLIMED_SLAB);
                    entries.add(BlockRegistries.ABYSS__ABYSS_SLIME_BLOCK);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_LOG);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_WOOD);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_VIGILANT_LOG);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_VIGILANT_WOOD);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_PLANKS);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_STAIRS);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_SLAB);
                    entries.add(BlockRegistries.ABYSS__VIGILANT_LEAVES);
                    entries.add(BlockRegistries.ABYSS__BOG_SHROOM_LOG);
                    entries.add(BlockRegistries.ABYSS__BOG_SHROOM_WOOD);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_BOG_SHROOM_LOG);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_BOG_SHROOM_WOOD);
                    entries.add(BlockRegistries.ABYSS__BOG_SHROOM_PLANKS);
                    entries.add(BlockRegistries.ABYSS__BOG_SHROOM_STAIRS);
                    entries.add(BlockRegistries.ABYSS__BOG_SHROOM_SLAB);
                    entries.add(BlockRegistries.ABYSS__BOG_SHROOM_LEAVES);
                    entries.add(BlockRegistries.ABYSS__SAL_SHROOM_LOG);
                    entries.add(BlockRegistries.ABYSS__SAL_SHROOM_WOOD);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_SAL_SHROOM_LOG);
                    entries.add(BlockRegistries.ABYSS__STRIPPED_SAL_SHROOM_WOOD);
                    entries.add(BlockRegistries.ABYSS__SAL_SHROOM_PLANKS);
                    entries.add(BlockRegistries.ABYSS__SAL_SHROOM_STAIRS);
                    entries.add(BlockRegistries.ABYSS__SAL_SHROOM_SLAB);
                    entries.add(BlockRegistries.ABYSS__SAL_SHROOM_LEAVES);
                    entries.add(BlockRegistries.ABYSS__ABYSCULK_LOG);
                    entries.add(BlockRegistries.ABYSS__ABYSCULK_WOOD);
                    entries.add(BlockRegistries.ABYSS__ABYSCULK_PLANKS);
                    entries.add(BlockRegistries.ABYSS__ABYSCULK_STAIRS);
                    entries.add(BlockRegistries.ABYSS__ABYSCULK_SLAB);
                }).build());
        public static ItemGroup QUARK = SkyBlock.BuiltinRegistries.registerItemGroup("quark",
                FabricItemGroup.builder().displayName(Text.literal("Quark (Vazkii)")).icon(() -> new ItemStack(GhostItemRegistries.Z__LOGO4)).entries((displayContext, entries) -> {
                    entries.add(BlockRegistries.QUARK__APPLE_CRATE);
                    entries.add(BlockRegistries.QUARK__BEETROOT_CRATE);
                    entries.add(BlockRegistries.QUARK__CARROT_CRATE);
                    entries.add(BlockRegistries.QUARK__POTATO_CRATE);
                    entries.add(BlockRegistries.QUARK__GOLDEN_APPLE_CRATE);
                    entries.add(BlockRegistries.QUARK__GOLDEN_CARROT_CRATE);
                    entries.add(BlockRegistries.QUARK__SWEET_BERRY_SACK);
                    entries.add(BlockRegistries.QUARK__GLOW_BERRY_SACK);
                    entries.add(BlockRegistries.QUARK__COCOA_BEAN_SACK);
                    entries.add(BlockRegistries.QUARK__GUNPOWDER_SACK);
                    entries.add(BlockRegistries.QUARK__NETHER_WART_SACK);
                    entries.add(BlockRegistries.QUARK__STICK_BLOCK);
                    entries.add(BlockRegistries.QUARK__SUGAR_CANE_BLOCK);
                    entries.add(BlockRegistries.QUARK__CACTUS_BLOCK);
                    entries.add(BlockRegistries.QUARK__CHORUS_FRUIT_BLOCK);

                    entries.add(BlockRegistries.QUARK__ANDESITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__CHISELED_ANDESITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__ANDESITE_PILLAR);
                    entries.add(Blocks.POLISHED_ANDESITE);
                    entries.add(Blocks.POLISHED_ANDESITE_STAIRS);
                    entries.add(Blocks.POLISHED_ANDESITE_SLAB);
                    entries.add(BlockRegistries.QUARK__ANDESITE_BRICK_STAIRS);
                    entries.add(BlockRegistries.QUARK__ANDESITE_BRICK_SLAB);
                    entries.add(Blocks.ANDESITE_STAIRS);
                    entries.add(Blocks.ANDESITE_SLAB);
                    entries.add(BlockRegistries.QUARK__DIORITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__CHISELED_DIORITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__DIORITE_PILLAR);
                    entries.add(Blocks.POLISHED_DIORITE);
                    entries.add(Blocks.POLISHED_DIORITE_STAIRS);
                    entries.add(Blocks.POLISHED_DIORITE_SLAB);
                    entries.add(BlockRegistries.QUARK__DIORITE_BRICK_STAIRS);
                    entries.add(BlockRegistries.QUARK__DIORITE_BRICK_SLAB);
                    entries.add(Blocks.DIORITE_STAIRS);
                    entries.add(Blocks.DIORITE_SLAB);
                    entries.add(BlockRegistries.QUARK__GRANITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__CHISELED_GRANITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__GRANITE_PILLAR);
                    entries.add(Blocks.POLISHED_GRANITE);
                    entries.add(Blocks.POLISHED_GRANITE_STAIRS);
                    entries.add(Blocks.POLISHED_GRANITE_SLAB);
                    entries.add(BlockRegistries.QUARK__GRANITE_BRICK_STAIRS);
                    entries.add(BlockRegistries.QUARK__GRANITE_BRICK_SLAB);
                    entries.add(Blocks.GRANITE_STAIRS);
                    entries.add(Blocks.GRANITE_SLAB);
                    entries.add(BlockRegistries.QUARK__DRIPSTONE_BRICKS);
                    entries.add(BlockRegistries.QUARK__CHISELED_DRIPSTONE_BRICKS);
                    entries.add(BlockRegistries.QUARK__DRIPSTONE_PILLAR);
                    entries.add(BlockRegistries.QUARK__POLISHED_DRIPSTONE);
                    entries.add(BlockRegistries.QUARK__POLISHED_DRIPSTONE_STAIRS);
                    entries.add(BlockRegistries.QUARK__POLISHED_DRIPSTONE_SLAB);
                    entries.add(BlockRegistries.QUARK__DRIPSTONE_BRICK_STAIRS);
                    entries.add(BlockRegistries.QUARK__DRIPSTONE_BRICK_SLAB);
                    entries.add(BlockRegistries.QUARK__DRIPSTONE_STAIRS);
                    entries.add(BlockRegistries.QUARK__DRIPSTONE_SLAB);
                    entries.add(BlockRegistries.QUARK__CALCITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__CHISELED_CALCITE_BRICKS);
                    entries.add(BlockRegistries.QUARK__CALCITE_PILLAR);
                    entries.add(BlockRegistries.QUARK__POLISHED_CALCITE);
                    entries.add(BlockRegistries.QUARK__POLISHED_CALCITE_STAIRS);
                    entries.add(BlockRegistries.QUARK__POLISHED_CALCITE_SLAB);
                    entries.add(BlockRegistries.QUARK__CALCITE_BRICK_STAIRS);
                    entries.add(BlockRegistries.QUARK__CALCITE_BRICK_SLAB);
                    entries.add(BlockRegistries.QUARK__CALCITE_STAIRS);
                    entries.add(BlockRegistries.QUARK__CALCITE_SLAB);

                    entries.add(BlockRegistries.QUARK__CAVE_ROOTS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_OAK_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_SPRUCE_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_BIRCH_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_JUNGLE_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_ACACIA_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_DARK_OAK_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_MANGROVE_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_CHERRY_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_BAMBOO_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_CRIMSON_PLANKS);
                    entries.add(BlockRegistries.QUARK__VERTICAL_WARPED_PLANKS);
                    entries.add(BlockRegistries.ABYSS__VERTICAL_FROZEN_PLANKS);
                }).build());

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Item Groups for " + SkyBlock.MOD_ID);
        }
        public static void invisibleAdd(ItemGroup.Entries entries, ItemConvertible itemConvertible) {
            entries.add(itemConvertible, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
        }

        private static void addSpaces(ItemGroup.Entries entries, int used_spaces, int spaces) {
            for (byte b : NullItem.VALUES) {
                if (spaces != 0) {
                    ItemStack itemStack = new ItemStack(GhostItemRegistries.Z__NULL);
                    itemStack.set(DataComponentTypeRegistries.SIMPLE_BYTE_VALUE_COMPONENT, new SimpleByteValueComponent(used_spaces + b));
                    spaces = spaces-1;
                entries.add(itemStack, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                }
            }
        }
        private static void addTiles(ItemGroup.Entries entries, int used_tiles, int tiles) {
            for (byte b : NullItem.VALUES) {
                if (tiles != 0) {
                    ItemStack itemStack = new ItemStack(GhostItemRegistries.Z__TILE_BLANK);
                    itemStack.set(DataComponentTypeRegistries.SIMPLE_BYTE_VALUE_COMPONENT, new SimpleByteValueComponent(used_tiles + b));
                    tiles = tiles-1;
                    entries.add(itemStack, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                }
            }
        }
    }

    public static class EntityTypeRegistries {
        /*public static final EntityType<WispEntity> MCD__WISP = SkyBlock.BuiltinRegistries.registerEntityType("mcd__wisp",
                EntityType.Builder.create(WispEntity::new, SpawnGroup.CREATURE)
                        .dimensions(0.35f, 0.6f).build());*/ //TODO: this
        public static final EntityType<OminousEvokerEntity> SKYBLOCK__OMINOUS_EVOKER = SkyBlock.BuiltinRegistries.registerEntityType("skyblock__ominous_evoker",
                EntityType.Builder.create(OminousEvokerEntity::new, SpawnGroup.CREATURE)
                        .dimensions(0.6F, 1.95F).build());
    }

    public static class EnchantmentRegistries {
        public static RegistryKey<Enchantment> PRIMITIVENESS_CURSE = SkyBlock.BuiltinRegistries.ofEnchantmentRegistry("primitiveness_curse");

        public static void register() {
            System.out.println("[SkyBlock MultiMod] Registering Enchantments for " + SkyBlock.MOD_ID);
        }
        public static class Helper {
            public static void addEnchantmentToStack(ItemStack itemStack, RegistryWrapper.WrapperLookup wrapper, RegistryKey<Enchantment> enchantment, int level) {
                EnchantmentUtils.enchantInWorld(itemStack, enchantment, level, wrapper);
            }
        }
    }

    public static class DimensionRegistries {
        public static final RegistryKey<World> THE_ABYSS_KEY = SkyBlock.BuiltinRegistries.ofMinecraftWorldRegistry("the_abyss_fabric");
        public static final RegistryKey<World> UNKNOWN_KEY = SkyBlock.BuiltinRegistries.ofMinecraftWorldRegistry("unknown");
        public static final RegistryKey<DimensionType> THE_ABYSS_TYPE_KEY = SkyBlock.BuiltinRegistries.ofDimensionTypeRegistry(THE_ABYSS_KEY.getValue());

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Dimensions for " + SkyBlock.MOD_ID);
        }
    }

    public static class DataComponentTypeRegistries {
        public static final ComponentType<SimpleByteValueComponent> SIMPLE_BYTE_VALUE_COMPONENT = SkyBlock.BuiltinRegistries.registerComponentType("z__null_component", nullComponentBuilder -> {
            return nullComponentBuilder.codec(SimpleByteValueComponent.CODEC);
        });
        public static final ComponentType<Boolean> MCD__TWIN_BOW_TARGET_PLAYER_ENTITIES_TOGGLE = SkyBlock.BuiltinRegistries.registerComponentType("mcd__twin_bow_attack_player_entities_toggle", booleanBuilder -> {
            return booleanBuilder.codec(Codec.BOOL);
        });
        public static final ComponentType<Boolean> MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE = SkyBlock.BuiltinRegistries.registerComponentType("mcd__iron_hide_amulet_personal_toggle", booleanBuilder -> {
            return booleanBuilder.codec(Codec.BOOL);
        });
        public static final ComponentType<McdRarity> MCD__RARITY = SkyBlock.BuiltinRegistries.registerComponentType("mcd__rarity", (mcdRarityBuilder) -> {
            return mcdRarityBuilder.codec(McdRarity.CODEC);
        });

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering DataComponentTypes for " + SkyBlock.MOD_ID);
        }
    }

    public static class ConfiguredFeatureRegistries {
        public static final RegistryKey<ConfiguredFeature<?, ?>> BLUISHE_TREE_KEY = registerKey("bluishe_tree");
        public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
            /*register(context, BLUISHE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SP5__BLUISHE_STEM),
                    new StraightTrunkPlacer(5, 4, 3),
                    BlockStateProvider.of(ModBlocks.SP5__BLUE_WART),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                    new TwoLayersFeatureSize(1, 0, 2)).build());*/
        }
        public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
            return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(SkyBlock.MOD_ID, name));
        }
        private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
                Registerable<ConfiguredFeature<?, ?>> context,
                RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC featureConfig) {
            context.register(key, new ConfiguredFeature<>(feature, featureConfig));
        }
    }

    public static class BlockRegistries {
        //TODO:
        // -MapColors
        // -SKYBLOCK__OBSIDIAN_PILLAR
        // -BN__BLUE_OBSIDIAN_PILLAR

        //ABYSS
        public static final Block ABYSS__UNSTABLE_OBSIDIAN = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__unstable_obsidian",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OBSIDIAN)
                        .strength(50.0f, 1200.0f)
                        .requiresTool()
                        .luminance(state -> 10))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_DIRT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_dirt",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DIRT)
                        .sounds(BlockSoundGroup.MUD)
                        .strength(0.5f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ROMA_MUD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__roma_mud",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.MUD)
                        .sounds(BlockSoundGroup.MUD)
                        .strength(0.5f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ROMA_MUD_CURSED = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__roma_mud_2",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.MUD)
                        .sounds(BlockSoundGroup.MUD)
                        .strength(0.5f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_GRAVEL = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_gravel",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DIRT)
                        .sounds(BlockSoundGroup.GRAVEL)
                        .strength(0.6f))); //TODO: MAPCOLOR
        public static final Block ABYSS__INFECTED_PEAT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__infected_peat",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DIRT)
                        .sounds(BlockSoundGroup.MUD)
                        .strength(0.5f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STONE_RACKLE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stone_rackle",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.STONE)
                        .strength(1.5f, 6.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__BLARU_MOSS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_moss",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DIRT)
                        .sounds(BlockSoundGroup.ROOTED_DIRT)
                        .strength(0.5f))); //TODO: MAPCOLOR
        public static final Block ABYSS__GLOWING_BLARU_MOSS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__glowing_blaru_moss",
                new CarpetBlock(AbstractBlock.Settings
                        .copy(Blocks.MOSS_CARPET)
                        .sounds(BlockSoundGroup.MOSS_CARPET)
                        .luminance(state -> 6))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLARU_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_grass",
                new AbyssVegetation(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .sounds(BlockSoundGroup.NETHER_SPROUTS))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_SPORES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_spores",
                new AbyssVegetation(AbstractBlock.Settings
                        .copy(Blocks.WARPED_ROOTS)
                        .sounds(BlockSoundGroup.ROOTS))); //TODO: MAPCOLOR
        public static final Block ABYSS__TESLA_FLOWER = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__tesla_flower",
                new AbyssVegetation(AbstractBlock.Settings
                        .copy(Blocks.WARPED_ROOTS)
                        .sounds(BlockSoundGroup.ROOTS))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_VERSA = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_versa",
                new AbyssVegetation(AbstractBlock.Settings
                        .copy(Blocks.WARPED_ROOTS)
                        .sounds(BlockSoundGroup.ROOTS)
                        .luminance(state -> 7))); //TODO: MAPCOLOR
        public static final Block ABYSS__EXOLIUS_MAXIMUS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__exolius_maximus",
                new AbyssVegetation(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .sounds(BlockSoundGroup.ROOTS)
                        .luminance(state -> 3))); //TODO: MAPCOLOR
        public static final Block ABYSS__YOUNG_EXOLIUS_MAXIMUS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__young_exolius_maximus",
                new AbyssVegetation(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .sounds(BlockSoundGroup.ROOTS)
                        .luminance(state -> 3))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_grass",
                new AbyssVegetation(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .sounds(BlockSoundGroup.NETHER_SPROUTS))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLUE_VIGILANT_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blue_vigilant_grass",
                new BlueVigilantGrass(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .sounds(BlockSoundGroup.ROOTS)
                        .luminance(state -> state.get(BlueVigilantGrass.LIT) ? 10 : 6))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_MOSS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_moss",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DIRT)
                        .sounds(BlockSoundGroup.ROOTED_DIRT)
                        .strength(0.5f))); //TODO: MAPCOLOR
        public static final Block ABYSS__INFUSED_MAGMA = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__infused_magma",
                new MagmaBlock(AbstractBlock.Settings
                        .copy(Blocks.MAGMA_BLOCK)
                        .strength(0.5f)
                        .luminance(state -> 3)
                        .requiresTool()
                        .emissiveLighting(SkyBlock.BuiltinRegistries::alwaysPredicate))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_STONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_stone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.STONE)
                        .strength(1.5f, 6.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_STONE_OG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_stone_og",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.STONE)
                        .strength(1.5f, 6.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_DIAMOND_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_diamond_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DIAMOND_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_EMERALD_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_emerald_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.EMERALD_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_GOLD_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_gold_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.GOLD_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_IRON_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_iron_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_IGNISITHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_ignisithe_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_ABERYTHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_aberythe_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_ABORANYS_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_aboranys_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_FUSION_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_fusion_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_GARNITE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_garnite_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_GLACERYTHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_glacerythe_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_INCORYTHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_incorythe_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_LORAN_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_loran_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .strength(3.0f, 3.0f)
                        .requiresTool())); //TODO: MAPCOLOR
        public static final Block ABYSS__PURPLE_SHROOMLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__purple_shroomlight",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SHROOMLIGHT)
                        .strength(1.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__DARK_BLUE_SHROOMLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__dark_blue_shroomlight",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SHROOMLIGHT)
                        .strength(1.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLUE_SHROOMLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blue_shroomlight",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SHROOMLIGHT)
                        .strength(1.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__ABYSS_JUNGLE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_JUNGLE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abyss_jungle_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abyss_jungle_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_JUNGLE_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_leaves",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_LEAVES))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_JUNGLE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_JUNGLE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__ABYSS_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_JUNGLE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__BLARU_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM).strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLARU_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE).strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_BLARU_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_blaru_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_BLARU_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_blaru_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLARU_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_leaves",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_LEAVES))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLARU_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS).strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLARU_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__BLARU_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BLARU_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__FROZEN_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__FROZEN_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_FROZEN_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_frozen_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_FROZEN_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_frozen_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__FROZEN_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_leaves",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_LEAVES))); //TODO: MAPCOLOR
        public static final Block ABYSS__FROZEN_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__VERTICAL_FROZEN_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vertical_frozen_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__CARVED_FROZEN_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__carved_frozen_planks",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS))); //TODO: MAPCOLOR
        public static final Block ABYSS__FROZEN_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__FROZEN_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__FROZEN_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__SLIMED_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SLIMED_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_SLIMED_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_slimed_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_SLIMED_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_slimed_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSS_SLIME_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_slime_block",
                new SlimeBlock(AbstractBlock.Settings
                        .copy(Blocks.SLIME_BLOCK)
                        .strength(0.01f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SLIMED_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SLIMED_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__SLIMED_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SLIMED_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__VIGILANT_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_VIGILANT_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_vigilant_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_VIGILANT_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_vigilant_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_leaves",
                new LeavesBlock(AbstractBlock.Settings
                        .copy(Blocks.BUBBLE_CORAL_BLOCK)
                        .strength(1.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__VIGILANT_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__VIGILANT_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__ABYSCULK_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSCULK_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_ABYSCULK_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abysculk_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_ABYSCULK_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abysculk_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSCULK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSCULK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__ABYSCULK_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__ABYSCULK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__BOG_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BOG_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_BOG_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_bog_shroom_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_BOG_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_bog_shroom_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BOG_SHROOM_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_leaves",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.BRAIN_CORAL_BLOCK)
                        .luminance(state -> 10))); //TODO: MAPCOLOR
        public static final Block ABYSS__BOG_SHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BOG_SHROOM_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__BOG_SHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__BOG_SHROOM_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR


        public static final Block ABYSS__SAL_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SAL_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_SAL_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_sal_shroom_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__STRIPPED_SAL_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_sal_shroom_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SAL_SHROOM_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_leaves",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.BUBBLE_CORAL_BLOCK)
                        .luminance(state -> 10))); //TODO: MAPCOLOR
        public static final Block ABYSS__SAL_SHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SAL_SHROOM_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_stairs",
                new ModStairsBlock(BlockRegistries.ABYSS__SAL_SHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f))); //TODO: MAPCOLOR
        public static final Block ABYSS__SAL_SHROOM_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f))); //TODO: MAPCOLOR
        //ABYSS
        //SKYBLOCK MAIN-BLOCK
        public static final Block MCD__VOID_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__void_block",
                new VoidBlock(AbstractBlock.Settings
                        .copy(Blocks.SCULK)
                        .strength(3.0f)
                        .requiresTool()));  //TODO: MAPCOLOR
        public static final Block SP5__ENDMERALD_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_emerald_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__ENDMERALD_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_emerald_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.EMERALD_BLOCK)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.EMERALD_GREEN)));
        public static final Block SP5__ENDERITE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__enderite_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__ENDERITE_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__enderite_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.EMERALD_BLOCK)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__ASTEROID_RESIDUES = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__asteroid_residues",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__SOLID_ROCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__solid_rock",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .strength(4.0f)
                        .requiresTool()
                        .mapColor(MapColor.BLACK)));
        public static final Block MCD__OG_PURPUR_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__og_purpur_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.PURPUR_BLOCK)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool()
                        .strength(1.5F, 6.0F)
                        .mapColor(MapColor.MAGENTA)));
        public static final Block SP5__END_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_grass",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .sounds(BlockSoundGroup.GRASS)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool()
                        .strength(2.0F, 7.5F)
                        .mapColor(MapColor.TERRACOTTA_PURPLE)));
        public static final Block SP5__BLUISHE_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_end_stone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool()
                        .strength(3.0F, 9.0F)
                        .mapColor(MapColor.CYAN)));
        public static final Block SP5__END_GRASS_VEGETATION = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__ender_grass",
                new EndVegetation(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .sounds(BlockSoundGroup.GRASS)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__END_MUSHROOM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_fungus",
                new EndVegetation(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_FUNGUS)
                        .sounds(BlockSoundGroup.FUNGUS)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__BLUISHE_BUSH = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_bush",
                new EndVegetation(AbstractBlock.Settings
                        .copy(Blocks.WARPED_FUNGUS)
                        .sounds(BlockSoundGroup.GRASS)
                        .mapColor(MapColor.LAPIS_BLUE)));
        public static final Block SP5__BLUISHE_MUSHROOM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_fungus",
                new EndVegetation(AbstractBlock.Settings
                        .copy(Blocks.WARPED_FUNGUS)
                        .sounds(BlockSoundGroup.FUNGUS)
                        .mapColor(MapColor.LIGHT_BLUE)));
        public static final Block SP5__END_BUSH = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_bush",
                new EndVegetation(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .sounds(BlockSoundGroup.GRASS)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__END_FLOWER = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_flower",
                new EndFlower(AbstractBlock.Settings
                        .copy(Blocks.DANDELION)
                        .sounds(BlockSoundGroup.SPORE_BLOSSOM)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__WARPED_NAVI_PLANT = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__warped_navi_plant",
                new BaseTallPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.TALL_GRASS)
                        .offset(AbstractBlock.OffsetType.NONE)
                        .mapColor(MapColor.CYAN), BlockRegistries.SP5__END_GRASS));
        public static final Block SKYBLOCK__ANT_JAM_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__ant_jam_block",
                new SlimeBlock(AbstractBlock.Settings
                        .copy(Blocks.HONEY_BLOCK)
                        .mapColor(MapColor.LIGHT_GRAY)));
        public static final Block SKYBLOCK__SWEET_BERRY_JAM_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__sweet_berry_jam_block",
                new SlimeBlock(AbstractBlock.Settings
                        .copy(Blocks.HONEY_BLOCK)
                        .mapColor(MapColor.DARK_RED)));
        public static final Block SKYBLOCK__SUSPICIOUS_COARSE_DIRT = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__suspicious_coarse_dirt",
                new SuspiciousCoarseDirt(AbstractBlock.Settings
                        .copy(Blocks.COARSE_DIRT)
                        .strength(0.5f)
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block SP5__TRANSPARENT_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__transparent_block",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BLACK_STAINED_GLASS)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(0.5f)
                        .mapColor(MapColor.TERRACOTTA_PURPLE)));
        public static final Block SP5__END_WART_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_wart_block",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BLACK_STAINED_GLASS)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__BLUE_WART = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__blue_wart",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BLACK_STAINED_GLASS)
                        .sounds(BlockSoundGroup.MOSS_BLOCK)
                        .strength(0.5f)
                        .mapColor(MapColor.CYAN)));
        public static final Block SP5__CRACKED_END_STONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__cracked_end_stone_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__WARPED_END_STONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__warped_end_stone_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__END_STONE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stone_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__END_STONE_TILES = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stone_tiles",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__SMALL_END_STONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__small_end_stone_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__SMOOTH_END_STONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__smooth_end_stone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__CHISELED_END_STONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__CHISELED_END_STONE_CUBIC = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone_cubic",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__CHISELED_END_STONE_MAZE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone_maze",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block SP5__PURPLE_END_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__PURPLE_END_BRICK_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__WARPED_PURPLE_END_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__warped_purple_end_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__PURPLE_END_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_stairs",
                new StairsBlock(BlockRegistries.SP5__PURPLE_END_BRICKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICK_STAIRS)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__PURPLE_END_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICK_SLAB)
                        .strength(3.0f, 9.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__END_PURPLE_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.PURPUR_BLOCK)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
        public static final Block SP5__END_PURPLE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.END_STONE_BRICKS)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
        public static final Block SP5__ENDER_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__ender_block",
                new EnderBlock(AbstractBlock.Settings
                        .copy(Blocks.PURPUR_BLOCK)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
        public static final Block SP5__END_PURPLE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_stairs",
                new StairsBlock(BlockRegistries.SP5__END_PURPLE_BLOCK.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.PURPUR_STAIRS)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
        public static final Block SP5__END_PURPLE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.PURPUR_SLAB)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
        public static final Block SP5__END_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__END_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__STRIPPED_END_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_end_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_CRIMSON_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__STRIPPED_END_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_end_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__ENDLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__endlight",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SHROOMLIGHT)
                        .strength(1.0f)
                        .mapColor(MapColor.PINK)));
        public static final Block SP5__END_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__END_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stairs",
                new ModStairsBlock(BlockRegistries.SP5__END_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block SP5__END_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.PURPLE)));


        public static final Block SP5__BLUISHE_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__BLUISHE_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__BLUISHE_LIGHT_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_light_stem",
                new BluisheLightStemBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__BLUISHE_LIGHT_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_light_hyphae",
                new BluisheLightStemBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__STRIPPED_BLUISHE_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_bluishe_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__STRIPPED_BLUISHE_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_bluishe_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__BLUISHE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__BLUISHE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_stairs",
                new ModStairsBlock(BlockRegistries.SP5__BLUISHE_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.WARPED_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block SP5__BLUISHE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BLUE)));
        public static final Block FLOGICAL__AZALEA_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block FLOGICAL__AZALEA_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block FLOGICAL__STRIPPED_AZALEA_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__stripped_azalea_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block FLOGICAL__STRIPPED_AZALEA_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__stripped_azalea_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block FLOGICAL__AZALEA_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block FLOGICAL__AZALEA_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_stairs",
                new ModStairsBlock(BlockRegistries.FLOGICAL__AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.OAK_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        public static final Block FLOGICAL__AZALEA_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_MAGENTA)));
        //BUNCH O' SCULK
        public static final Block BOSC__SCULK_JAW = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__sculk_jaw",
                new SculkJawBlock(AbstractBlock.Settings
                        .copy(Blocks.SCULK)
                        .strength(1f)
                        .mapColor(MapColor.BLACK), Blocks.SCULK));
        public static final Block BOSC__DEAD_SCULK = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk",
                new SculkBlock(AbstractBlock.Settings
                        .copy(Blocks.SCULK)
                        .sounds(BlockSoundGroup.CORAL)
                        .mapColor(MapColor.BLACK)));
        public static final Block BOSC__DEAD_SCULK_JAW = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk_jaw",
                new SculkBlock(AbstractBlock.Settings
                        .copy(Blocks.SCULK)
                        .sounds(BlockSoundGroup.CORAL)
                        .mapColor(MapColor.BLACK)));
        public static final Block BOSC__DEAD_SCULK_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk_sprouts",
                new BaseShortPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .mapColor(MapColor.DEEPSLATE_GRAY), TagRegistries.Blocks.BOSC__DEAD_SCULK_GROUND));
        //BUNCH O' SCULK
        //SKYBLOCK - SCULK
        public static final Block SKYBLOCK__RED_SCULK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk",
                new SculkBlock(AbstractBlock.Settings
                        .copy(Blocks.SCULK)
                        .mapColor(MapColor.BLACK)));
        public static final Block SKYBLOCK__RED_SCULK_JAW = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk_jaw",
                new SculkJawBlock(AbstractBlock.Settings
                        .copy(Blocks.SCULK)
                        .strength(1f)
                        .mapColor(MapColor.BLACK), BlockRegistries.SKYBLOCK__RED_SCULK));
        public static final Block SKYBLOCK__SCULK_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__sculk_sprouts",
                new BaseShortPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .mapColor(MapColor.DIAMOND_BLUE), TagRegistries.Blocks.SKYBLOCK__SCULK_GROUND));
        public static final Block SKYBLOCK__RED_SCULK_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk_sprouts",
                new BaseShortPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .mapColor(MapColor.DARK_RED), TagRegistries.Blocks.SKYBLOCK__RED_SCULK_GROUND));
        //SKYBLOCK - SCULK
        //SKYBLOCK - UNKNOWN VEGETATION
        public static final Block SKYBLOCK__UNKNOWN_DIRT_NYLIUM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_dirt_nylium",
                new UnknownDirtNylium(AbstractBlock.Settings
                        .copy(Blocks.DIRT),1)); //TODO: MAPCOLOR
        public static final Block SKYBLOCK__UNKNOWN_DIRT = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_dirt",
                new UnknownDirt(AbstractBlock.Settings
                        .copy(Blocks.DIRT),1)); //TODO: MAPCOLOR
        public static final Block SKYBLOCK__UNKNOWN_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_sprouts",
                new BaseShortPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS), BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM)); //TODO: MAPCOLOR
        public static final Block SKYBLOCK__UNKNOWN_VEGETATION = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_vegetation",
                new BaseShortPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_ROOTS), BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM)); //TODO: MAPCOLOR
        //SKYBLOCK - UNKNOWN VEGETATION
        //SKYBLOCK VANILLA+
        public static final Block SKYBLOCK__DUCKWEED = SkyBlock.BuiltinRegistries.registerBlock("skyblock__duckweed",
                new WaterDecorPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.LILY_PAD)
                        .noCollision()
                        .noBlockBreakParticles()
                        .nonOpaque()
                        .mapColor(MapColor.DARK_GREEN)));
        public static final Block SKYBLOCK__SMALL_LILY_PADS = SkyBlock.BuiltinRegistries.registerBlock("skyblock__small_lily_pads",
                new WaterDecorPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.LILY_PAD)
                        .noCollision()
                        .noBlockBreakParticles()
                        .nonOpaque()
                        .mapColor(MapColor.DARK_GREEN)));
        public static final Block SKYBLOCK__CLOVER = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__clover",
                new CloverBlock(AbstractBlock.Settings
                        .copy(Blocks.SHORT_GRASS)
                        .offset(AbstractBlock.OffsetType.NONE)
                        .noBlockBreakParticles()
                        .sounds(BlockSoundGroup.CAVE_VINES)
                        .mapColor(MapColor.DARK_GREEN)));
        // crops

        public static final Block SKYBLOCK__CHILLI_PEPPER_CROP = SkyBlock.BuiltinRegistries.registerBlock("skyblock__chilli_pepper_crop",
                new ChilliPepperBlock(AbstractBlock.Settings
                        .copy(Blocks.CARROTS)
                        .sounds(BlockSoundGroup.CAVE_VINES)
                        .mapColor(MapColor.GREEN)));

        // crops

        public static final Block SKYBLOCK__DEEPSLATE_PLATINUM_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__deepslate_platinum_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DEEPSLATE_DIAMOND_ORE))); //TODO: MAPCOLOR
        public static final Block SKYBLOCK__DEEPSLATE_TITANIUM_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__deepslate_titanium_ore",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DEEPSLATE_DIAMOND_ORE) //TODO: MAPCOLOR
                        .strength(Blocks.OBSIDIAN.getHardness(), Blocks.OBSIDIAN.getBlastResistance())));
        public static final Block SKYBLOCK__WHITE_MUSHROOM_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__white_mushroom_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block SKYBLOCK__WHITE_MUSHROOM_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__white_mushroom_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block SKYBLOCK__STRIPPED_MUSHROOM_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_mushroom_stem",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_CRIMSON_STEM)
                        .strength(2.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__STRIPPED_MUSHROOM_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_mushroom_hyphae",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                        .strength(2.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__MUSHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__CARVED_MUSHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_mushroom_planks",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_PLANKS)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__VERTICAL_MUSHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__vertical_mushroom_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_PLANKS)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__MUSHROOM_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_stairs",
                new ModStairsBlock(BlockRegistries.SKYBLOCK__MUSHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__MUSHROOM_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__BOGGED_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_log",
                new BoggedWoodBlock(AbstractBlock.Settings
                        .copy(Blocks.MANGROVE_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.PALE_GREEN)));
        public static final Block SKYBLOCK__BOGGED_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_wood",
                new BoggedWoodBlock(AbstractBlock.Settings
                        .copy(Blocks.MANGROVE_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.PALE_GREEN)));
        public static final Block SKYBLOCK__BOGGED_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.MANGROVE_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.PALE_GREEN)));
        public static final Block SKYBLOCK__BOGGED_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_stairs",
                new ModStairsBlock(BlockRegistries.SKYBLOCK__BOGGED_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.MANGROVE_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.PALE_GREEN)));
        public static final Block SKYBLOCK__BOGGED_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.MANGROVE_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.PALE_GREEN)));
        public static final Block SKYBLOCK__FIR_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block SKYBLOCK__FIR_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block SKYBLOCK__STRIPPED_FIR_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_fir_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_SPRUCE_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block SKYBLOCK__STRIPPED_FIR_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_fir_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_SPRUCE_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final  Block SKYBLOCK__FIR_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_leaves",
                new LeavesBlock(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_LEAVES)
                        .mapColor(MapColor.DARK_GREEN)));
        public static final Block SKYBLOCK__FIR_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block SKYBLOCK__CARVED_FIR_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_fir_planks",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_PLANKS)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block SKYBLOCK__VERTICAL_FIR_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__vertical_fir_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_PLANKS)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block SKYBLOCK__FIR_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_stairs",
                new ModStairsBlock(BlockRegistries.SKYBLOCK__FIR_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block SKYBLOCK__FIR_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final  Block SKYBLOCK__AUTUMN_FIR_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__autumn_fir_leaves",
                new LeavesBlock(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_LEAVES)
                        .mapColor(MapColor.TERRACOTTA_ORANGE)));
        public static final  Block SKYBLOCK__AUTUMN_BIRCH_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__autumn_birch_leaves",
                new LeavesBlock(AbstractBlock.Settings
                        .copy(Blocks.BIRCH_LEAVES)
                        .mapColor(MapColor.YELLOW)));
        public static final Block SKYBLOCK__ANCIENT_PEDESTAL = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__ancient_pedestal",
                new AncientPedestalBlock(AbstractBlock.Settings
                        .copy(Blocks.BEDROCK)
                        .mapColor(MapColor.STONE_GRAY)));
        public static final Block SKYBLOCK__BLUE_BORDER_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__blue_border_block",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BEDROCK)
                        .nonOpaque()
                        .allowsSpawning(SkyBlock.BuiltinRegistries::neverPredicate)
                        .mapColor(MapColor.CLEAR)));
        public static final Block SKYBLOCK__RED_BORDER_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_border_block",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BEDROCK)
                        .nonOpaque()
                        .allowsSpawning(SkyBlock.BuiltinRegistries::neverPredicate)
                        .mapColor(MapColor.CLEAR)));
        public static final Block SKYBLOCK__GREEN_BORDER_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__green_border_block",
                new TransparentBlock(AbstractBlock.Settings
                        .copy(Blocks.BEDROCK)
                        .nonOpaque()
                        .allowsSpawning(SkyBlock.BuiltinRegistries::neverPredicate)
                        .mapColor(MapColor.CLEAR)));
        public static final Block SKYBLOCK__BLUEBERRY_BUSH = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__blueberry_bush",
                new BlueberryBush(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_LEAVES)
                        .sounds(BlockSoundGroup.AZALEA_LEAVES)
                        .mapColor(MapColor.CYAN)));
        public static final Block SKYBLOCK__BLUEBERRY_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__blueberry_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.LIGHT_BLUE)));
        public static final Block SKYBLOCK__CHILLI_PEPPER_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__chilli_pepper_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.RED)));
        public static final Block SKYBLOCK__GOLDEN_CHILLI_PEPPER_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__golden_chilli_pepper_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.YELLOW)));
        public static final Block SKYBLOCK__PUFFBALL_MUSHROOM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__puffball_mushroom",
                new PuffballMushroom(AbstractBlock.Settings
                        .copy(Blocks.BROWN_MUSHROOM)
                        .sounds(BlockSoundGroup.FUNGUS)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__puffball_mushroom_block",
                new PuffballMushroomBlock(AbstractBlock.Settings
                        .copy(Blocks.MUSHROOM_STEM)
                        .sounds(BlockSoundGroup.FUNGUS)
                        .mapColor(MapColor.WHITE_GRAY)));
        //SPORE PLANTER BOXES
        public static final Block SKYBLOCK__SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerBlock("skyblock__spore_planter_box",
                new EmptySporePlanterBox(AbstractBlock.Settings
                        .copy(Blocks.COARSE_DIRT)
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerBlock("skyblock__puffball_spore_planter_box",
                new SporePlanterBox(AbstractBlock.Settings
                        .copy(Blocks.COARSE_DIRT)
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.WHITE_GRAY), BlockRegistries.SKYBLOCK__PUFFBALL_MUSHROOM, 2, false));
        public static final Block SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerBlock("skyblock__red_mushroom_spore_planter_box",
                new SporePlanterBox(AbstractBlock.Settings
                        .copy(Blocks.COARSE_DIRT)
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.RED), Blocks.RED_MUSHROOM, 0.5, true));
        public static final Block SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerBlock("skyblock__brown_mushroom_spore_planter_box",
                new SporePlanterBox(AbstractBlock.Settings
                        .copy(Blocks.COARSE_DIRT)
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.BROWN), Blocks.BROWN_MUSHROOM, 0.5, true));
        //SPORE PLANTER BOXES
        public static final Block SKYBLOCK__BLOCK_OF_EXPERIENCE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__block_of_experience",
                new Block(AbstractBlock.Settings
                        .create()
                        .breakInstantly()
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                        .luminance(state -> 3)
                        .emissiveLighting(SkyBlock.BuiltinRegistries::alwaysPredicate)
                        .mapColor(MapColor.EMERALD_GREEN)));
        //---1.21.1+
        public static final Block SKYBLOCK__COMPRESSED_STEEL = SkyBlock.BuiltinRegistries.registerBlock("skyblock__compressed_steel",
                new CompressedSteelBlock(AbstractBlock.Settings
                        .create()
                        .mapColor(MapColor.GRAY)
                        .sounds(BlockSoundGroup.HEAVY_CORE)
                        .pistonBehavior(PistonBehavior.BLOCK)
                        .strength(Blocks.OBSIDIAN.getHardness(), Blocks.OBSIDIAN.getBlastResistance())
                        .mapColor(MapColor.IRON_GRAY)));
        //---1.21.1+
        //---1.22.0+
        public static final Block BP__PALE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_LOG)
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block BP__PALE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_WOOD)
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block BP__STRIPPED_PALE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__stripped_pale_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_LOG)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block BP__STRIPPED_PALE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__stripped_pale_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_WOOD)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block BP__PALE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block SKYBLOCK__CARVED_PALE_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_pale_oak_planks",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block QUARK__VERTICAL_PALE_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_pale_oak_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block BP__PALE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_stairs",
                new ModStairsBlock(BlockRegistries.BP__PALE_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.OAK_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block BP__PALE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block BP__PALE_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_leaves",
                new LeavesBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_LEAVES)
                        .mapColor(MapColor.WHITE_GRAY)));
        public static final Block BP__PALE_MOSS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_moss_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.MOSS_BLOCK)
                        .mapColor(MapColor.LIGHT_GRAY)));
        public static final Block BP__PALE_MOSS_CARPET = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_moss_carpet",
                new CarpetBlock(AbstractBlock.Settings
                        .copy(Blocks.MOSS_CARPET)
                        .mapColor(MapColor.LIGHT_GRAY)));
        //---1.22.0+
        //SKYBLOCK VANILLA+
        //SKYBLOCK TROPHIES
        public static final Block SKYBLOCK__PESTILENT_TROPHY = SkyBlock.BuiltinRegistries.registerBlock("skyblock__pestilent_trophy",
                new TrophyBlock(AbstractBlock.Settings
                        .create()
                        .strength(Blocks.IRON_BLOCK.getHardness(), Blocks.IRON_BLOCK.getBlastResistance())
                        .noBlockBreakParticles()
                        .sounds(BlockSoundGroup.NETHERITE)
                        .mapColor(MapColor.PALE_GREEN)));
        //SKYBLOCK TROPHIES
        //SKYBLOCK - CARVED PLANKS
        public static final Block SKYBLOCK__CARVED_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_oak_planks",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block SKYBLOCK__CARVED_SPRUCE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_spruce_planks",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_PLANKS)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        public static final Block SKYBLOCK__CARVED_DARK_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_dark_oak_planks",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.DARK_OAK_PLANKS)
                        .mapColor(MapColor.BROWN)));
        //SKYBLOCK - CARVED PLANKS
        //SKYBLOCK MAIN-BLOCK
        //MCD
        public static final Block MCD__MOSSIER_COBBLESTONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__mossier_cobblestone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.COBBLESTONE)
                        .strength(2.0F, 6.0F)
                        .mapColor(MapColor.CYAN)));
        public static final Block MCD__MOSSIER_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__mossier_oak_planks",
                new MossyOakPlanks(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .strength(2.0f, 3.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block MCD__MOSSIER_SPRUCE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__mossier_spruce_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_PLANKS)
                        .strength(2.0f, 3.0f)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        public static final Block MCD__BARREN_GRASS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__barren_grass_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.END_STONE)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool()
                        .strength(3.0F, 9.0F)
                        .mapColor(MapColor.YELLOW)));
        public static final Block MCD__MIDNIGHT_MOSS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__midnight_moss_block",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.MOSS_BLOCK)
                        .mapColor(MapColor.CYAN)));
        public static final Block MCD__MIDNIGHT_MOSS_CARPET = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__midnight_moss_carpet",
                new CarpetBlock(AbstractBlock.Settings
                        .copy(Blocks.MOSS_CARPET)
                        .mapColor(MapColor.CYAN)));
        public static final Block MCD__MIDNIGHT_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__midnight_sprouts",
                new ShortPlantBlock(AbstractBlock.Settings
                        .copy(Blocks.NETHER_SPROUTS)
                        .mapColor(MapColor.CYAN)));
        public static final Block MCD__POP_FLOWER = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__pop_flower",
                new PopFlowerBlock(AbstractBlock.Settings
                        .copy(Blocks.WARPED_ROOTS)
                        .mapColor(MapColor.CYAN)));
        //MCD
        //CUSTOM WORLD BLOCKS
        public static final Block MCD__STRONGHOLD_DECOR = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__stronghold_decor",
                new StrongholdDecorBlock(AbstractBlock.Settings
                        .copy(Blocks.BEDROCK)
                        .mapColor(MapColor.STONE_GRAY)));
        //CUSTOM WORLD BLOCKS
        //PEARFECTION
        public static final Block DIGPEAR__CALLERY_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_leaves",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.AZALEA_LEAVES)
                        .mapColor(MapColor.PALE_GREEN)));
        public static final Block DIGPEAR__FLOWERING_CALLERY_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__flowering_callery_leaves",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.FLOWERING_AZALEA_LEAVES)
                        .mapColor(MapColor.PALE_GREEN)));
        public static final Block DIGPEAR__CALLERY_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        public static final Block DIGPEAR__CALLERY_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        public static final Block DIGPEAR__STRIPPED_CALLERY_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__stripped_callery_log",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_LOG)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_YELLOW)));
        public static final Block DIGPEAR__STRIPPED_CALLERY_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__stripped_callery_wood",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.STRIPPED_OAK_WOOD)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_YELLOW)));
        public static final Block DIGPEAR__CALLERY_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_YELLOW)));
        public static final Block DIGPEAR__CALLERY_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_stairs",
                new ModStairsBlock(BlockRegistries.DIGPEAR__CALLERY_PLANKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.OAK_STAIRS)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_YELLOW)));
        public static final Block DIGPEAR__CALLERY_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.OAK_SLAB)
                        .strength(2.0f)
                        .mapColor(MapColor.TERRACOTTA_YELLOW)));
        //PEARFECTION
        //QUARK
        public static final Block QUARK__APPLE_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__apple_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.RED)));
        public static final Block QUARK__BEETROOT_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__beetroot_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.TERRACOTTA_PURPLE)));
        public static final Block QUARK__CARROT_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__carrot_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.TERRACOTTA_ORANGE)));
        public static final Block QUARK__POTATO_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__potato_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block QUARK__GOLDEN_APPLE_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__golden_apple_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.GOLD)));
        public static final Block QUARK__GOLDEN_CARROT_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__golden_carrot_crate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.GOLD)));
        public static final Block QUARK__SWEET_BERRY_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__sweet_berry_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.DARK_RED)));
        public static final Block QUARK__GLOW_BERRY_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__glow_berry_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.YELLOW)));
        public static final Block QUARK__COCOA_BEAN_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__cocoa_bean_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.BROWN)));
        public static final Block QUARK__GUNPOWDER_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__gunpowder_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.DEEPSLATE_GRAY)));
        public static final Block QUARK__NETHER_WART_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__nether_wart_sack",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WART_BLOCK)
                        .strength(1.0f)
                        .mapColor(MapColor.DARK_RED)));
        public static final Block QUARK__STICK_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__stick_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.BAMBOO_WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        public static final Block QUARK__SUGAR_CANE_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__sugar_cane_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.BAMBOO_WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.EMERALD_GREEN)));
        public static final Block QUARK__CACTUS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__cactus_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOL)
                        .strength(1.0f)
                        .mapColor(MapColor.DARK_GREEN)));
        public static final Block QUARK__CHORUS_FRUIT_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chorus_fruit_block",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.HAY_BLOCK)
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(1.0f)
                        .mapColor(MapColor.PURPLE)));
        public static final Block QUARK__ANDESITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_ANDESITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                        .mapColor(MapColor.STONE_GRAY)));
        public static final Block QUARK__ANDESITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_ANDESITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                        .mapColor(MapColor.STONE_GRAY)));
        public static final Block QUARK__CHISELED_ANDESITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_andesite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_ANDESITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                        .mapColor(MapColor.STONE_GRAY)));
        public static final Block QUARK__ANDESITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_brick_stairs",
                new ModStairsBlock(BlockRegistries.QUARK__ANDESITE_BRICKS.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.POLISHED_ANDESITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                        .mapColor(MapColor.STONE_GRAY)));
        public static final Block QUARK__ANDESITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_brick_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_ANDESITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                        .mapColor(MapColor.STONE_GRAY)));
        public static final Block QUARK__DIORITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_DIORITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                        .mapColor(MapColor.OFF_WHITE)));
        public static final Block QUARK__DIORITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_DIORITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                        .mapColor(MapColor.OFF_WHITE)));
        public static final Block QUARK__CHISELED_DIORITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_diorite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_DIORITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                        .mapColor(MapColor.OFF_WHITE)));
        public static final Block QUARK__DIORITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_brick_stairs",
                new ModStairsBlock(BlockRegistries.QUARK__DIORITE_BRICKS.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.POLISHED_DIORITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                        .mapColor(MapColor.OFF_WHITE)));
        public static final Block QUARK__DIORITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_brick_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_DIORITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                        .mapColor(MapColor.OFF_WHITE)));
        public static final Block QUARK__GRANITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_GRANITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block QUARK__GRANITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_GRANITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block QUARK__CHISELED_GRANITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_granite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_GRANITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block QUARK__GRANITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_brick_stairs",
                new ModStairsBlock(BlockRegistries.QUARK__GRANITE_BRICKS.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.POLISHED_GRANITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block QUARK__GRANITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_brick_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.POLISHED_GRANITE)
                        .sounds(BlockSoundGroup.STONE)
                        .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block QUARK__DRIPSTONE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__DRIPSTONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__CHISELED_DRIPSTONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_dripstone_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__POLISHED_DRIPSTONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));

        public static final Block QUARK__DRIPSTONE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_brick_stairs",
                new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__DRIPSTONE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__POLISHED_DRIPSTONE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone_stairs",
                new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__POLISHED_DRIPSTONE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__DRIPSTONE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_stairs",
                new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__DRIPSTONE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.DRIPSTONE_BLOCK)
                        .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                        .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block QUARK__CALCITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__CALCITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__CHISELED_CALCITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_calcite_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__POLISHED_CALCITE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(1.5f, 6.0f)
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__CALCITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_brick_stairs",
                new ModStairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__CALCITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_brick_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__POLISHED_CALCITE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite_stairs",
                new ModStairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__POLISHED_CALCITE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__CALCITE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_stairs",
                new ModStairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__CALCITE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.CALCITE)
                        .sounds(BlockSoundGroup.CALCITE)
                        .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__CAVE_ROOTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__cave_roots",
                new VineBlock(AbstractBlock.Settings
                        .copy(Blocks.VINE)
                        .noCollision()
                        .ticksRandomly()
                        .strength(0.2f)
                        .sounds(BlockSoundGroup.VINE)
                        .mapColor(MapColor.OAK_TAN)));
        //QUARK - VERTICAL PLANKS
        public static final Block QUARK__VERTICAL_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_oak_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OAK_PLANKS)
                        .mapColor(MapColor.OAK_TAN)));
        public static final Block QUARK__VERTICAL_SPRUCE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_spruce_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.SPRUCE_PLANKS)
                        .mapColor(MapColor.SPRUCE_BROWN)));
        public static final Block QUARK__VERTICAL_BIRCH_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_birch_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.BIRCH_PLANKS)
                        .mapColor(MapColor.PALE_YELLOW)));
        public static final Block QUARK__VERTICAL_JUNGLE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_jungle_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.JUNGLE_PLANKS)
                        .mapColor(MapColor.DIRT_BROWN)));
        public static final Block QUARK__VERTICAL_ACACIA_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_acacia_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.ACACIA_PLANKS)
                        .mapColor(MapColor.ORANGE)));
        public static final Block QUARK__VERTICAL_DARK_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_dark_oak_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.DARK_OAK_PLANKS)
                        .mapColor(MapColor.BROWN)));
        public static final Block QUARK__VERTICAL_MANGROVE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_mangrove_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.MANGROVE_PLANKS)
                        .mapColor(MapColor.RED)));
        public static final Block QUARK__VERTICAL_CHERRY_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_cherry_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CHERRY_PLANKS)
                        .mapColor(MapColor.TERRACOTTA_WHITE)));
        public static final Block QUARK__VERTICAL_BAMBOO_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_bamboo_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.BAMBOO_PLANKS)
                        .mapColor(MapColor.YELLOW)));
        public static final Block QUARK__VERTICAL_CRIMSON_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_crimson_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.CRIMSON_PLANKS)
                        .mapColor(MapColor.DULL_PINK)));
        public static final Block QUARK__VERTICAL_WARPED_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_warped_planks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.WARPED_PLANKS)
                        .mapColor(MapColor.DARK_AQUA)));
        //QUARK - VERTICAL PLANKS
        //QUARK
        //HALLOWEEN 2023
        public static final Block H__NODE = SkyBlock.BuiltinRegistries.registerBlockAndItem("h__node",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OBSIDIAN)
                        .mapColor(MapColor.BLACK)));
        //HALLOWEEN 2023
        //CHRISTMAS
        public static final Block SKYBLOCK__SNOWY_SHORT_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__snowy_short_grass",
                new SnowyShortGrassBlock(AbstractBlock.Settings
                        .copy(Blocks.SHORT_GRASS)
                        .mapColor(MapColor.DIAMOND_BLUE)));
        public static final Block SKYBLOCK__FROSTSLATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OBSIDIAN)
                        .mapColor(MapColor.TERRACOTTA_CYAN)));
        public static final Block SKYBLOCK__FROSTSLATE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_pillar",
                new PillarBlock(AbstractBlock.Settings
                        .copy(Blocks.OBSIDIAN)
                        .mapColor(MapColor.TERRACOTTA_CYAN)));
        public static final Block SKYBLOCK__FROSTSLATE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_bricks",
                new Block(AbstractBlock.Settings
                        .copy(Blocks.OBSIDIAN)
                        .mapColor(MapColor.TERRACOTTA_CYAN)));
        public static final Block SKYBLOCK__FROSTSLATE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_brick_stairs",
                new ModStairsBlock(BlockRegistries.SKYBLOCK__FROSTSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings
                        .copy(Blocks.OBSIDIAN)
                        .mapColor(MapColor.TERRACOTTA_CYAN)));
        public static final Block SKYBLOCK__FROSTSLATE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_brick_slab",
                new SlabBlock(AbstractBlock.Settings
                        .copy(Blocks.OBSIDIAN)
                        .mapColor(MapColor.TERRACOTTA_CYAN)));
        //CHRISTMAS

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for " + SkyBlock.MOD_ID);
        }
    }

    @Environment(value= EnvType.CLIENT)
    public static class BlockEntityRendererFactoryRegistries {
        private static final Map<BlockEntityType<?>, BlockEntityRendererFactory<?>> FACTORIES = Maps.newHashMap();

        public static <T extends BlockEntity> void register(BlockEntityType<? extends T> type, BlockEntityRendererFactory<T> factory) {
            FACTORIES.put(type, factory);
        }
        static {
            BlockEntityRendererFactories.register(BlockEntityRegistries.MCD__VOID_BLOCK_ENTITY, VoidBlockEntityRenderer::new);
        }
        public static void registerModBlockEntityRendererFactories () {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntityRendererFactories for " + SkyBlock.MOD_ID);
        }
    }

    public static class BlockEntityRegistries {
        public static final BlockEntityType<PopFlowerBlockEntity> MCD__POP_FLOWER_BLOCK_ENTITY = SkyBlock.BuiltinRegistries.registerBlockEntityType("mcd__pop_flower_blockentity",
                BlockEntityType.Builder.create(PopFlowerBlockEntity::new, BlockRegistries.MCD__POP_FLOWER).build());
        public static final BlockEntityType<VoidBlockEntity> MCD__VOID_BLOCK_ENTITY = SkyBlock.BuiltinRegistries.registerBlockEntityType("mcd__void_block__blockentity",
                BlockEntityType.Builder.create(VoidBlockEntity::new, BlockRegistries.MCD__VOID_BLOCK).build());
        public static final BlockEntityType<AncientPedestalBlockEntity> SKYBLOCK__ANCIENT_PEDESTAL_BLOCK_ENTITY = SkyBlock.BuiltinRegistries.registerBlockEntityType( "skyblock__ancient_pedestal__blockentity",
                BlockEntityType.Builder.create(AncientPedestalBlockEntity::new, BlockRegistries.SKYBLOCK__ANCIENT_PEDESTAL).build());

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntities for " + SkyBlock.MOD_ID);
        }
    }

    public static class BiomeRegistries {
        public static final RegistryKey<Biome> BP__PALE_GARDEN = SkyBlock.BuiltinRegistries.ofBiomeRegistry("bp__pale_garden");


        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Biomes for " + SkyBlock.MOD_ID);
        }
    }

    public static class BiomeEffectRegistries {

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering BiomeEffects for " + SkyBlock.MOD_ID);
        }
    }

    public static class GameRuleRegistries {
        public static final GameRules.Key<GameRules.IntRule> SKYBLOCK__GOLDEN_CROP_GROWTH_CHANCE = GameRuleRegistry.register("skyblock__goldenCropGrowthChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(25));
        public static final GameRules.Key<GameRules.IntRule> SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE = GameRuleRegistry.register("skyblock__rareMushroomGrowthChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(30));
        public static final GameRules.Key<GameRules.BooleanRule> SKYBLOCK__DO_ARROWS_BREAK_GLASS_BLOCKS = GameRuleRegistry.register("skyblock__doArrowsBreakGlassBlocks", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(true));
        public static final GameRules.Key<GameRules.BooleanRule> SKYBLOCK__DO_BLUEBERRIES_GROW = GameRuleRegistry.register("skyblock__doBlueberriesGrow", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(true));
        public static final GameRules.Key<GameRules.BooleanRule> MCD__POP_FLOWERS_ALWAYS_HIDE = GameRuleRegistry.register("mcd__popFlowersAlwaysHide", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(false));

        public static void register() {
            SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering GameRules for " + SkyBlock.MOD_ID);
        }
    }

    public static class ModelPredicateProviderRegistries {
        public static void registerModModels() {

            registerBow(ItemRegistries.MCD__SHORTBOW);
            registerBow(ItemRegistries.MCD__TWIN_BOW);
            registerCrossbow(ItemRegistries.MCD__AUTO_CROSSBOW);
            registerWrittenBookTextures(Items.WRITTEN_BOOK);
        }
        private static void registerWrittenBookTextures(Item book) {
            ModelPredicateProviderRegistry.register(book, Identifier.of("green"),
                    (stack, world, entity, seed) -> {
                        WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                        if (writtenBookContentComponent == null) {
                            return 0.0f;
                        }
                        String title = writtenBookContentComponent.title().toString();
                        if (title.contains("@green")) {
                            return 1.0f;
                        } else {
                            return 0.0f;
                        }
                    });
            ModelPredicateProviderRegistry.register(book, Identifier.of("contract"),
                    (stack, world, entity, seed) -> {
                        WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                        if (writtenBookContentComponent == null) {
                            return 0.0f;
                        }
                        String title = writtenBookContentComponent.title().toString();
                        if (title.contains("@contr")) {
                            return 1.0f;
                        } else {
                            return 0.0f;
                        }
                    });
            ModelPredicateProviderRegistry.register(book, Identifier.of("note"),
                    (stack, world, entity, seed) -> {
                        WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                        if (writtenBookContentComponent == null) {
                            return 0.0f;
                        }
                        String title = writtenBookContentComponent.title().toString();
                        if (title.contains("@note")) {
                            return 1.0f;
                        } else {
                            return 0.0f;
                        }
                    });
            ModelPredicateProviderRegistry.register(book, Identifier.of("laws"),
                    (stack, world, entity, seed) -> {
                        WrittenBookContentComponent writtenBookContentComponent = stack.get(DataComponentTypes.WRITTEN_BOOK_CONTENT);
                        if (writtenBookContentComponent == null) {
                            return 0.0f;
                        }
                        String title = writtenBookContentComponent.title().toString();
                        if (title.contains("@laws")) {
                            return 1.0f;
                        } else {
                            return 0.0f;
                        }
                    });
        }
        private static void registerEnchantedBookTextures(Item book) {
            ModelPredicateProviderRegistry.register(book, Identifier.of("test"),
                    (stack, world, entity, seed) -> {
                        ItemEnchantmentsComponent itemEnchantmentsComponent = stack.get(DataComponentTypes.ENCHANTMENTS);
                        if (itemEnchantmentsComponent == null) {
                            return 0.0f;
                        }
                        int maxLevel = 0;
                        for (RegistryEntry<Enchantment> enchantmentRegistryEntry: itemEnchantmentsComponent.getEnchantments()) {
                            int level = itemEnchantmentsComponent.getLevel(enchantmentRegistryEntry);
                            if (level > maxLevel) maxLevel = level;
                        }
                        if (maxLevel == 1) {
                            return 1.0f;
                        } else {
                            return 0.0f;
                        }
                    });
        }
        private static void registerBow(Item bow) {
            ModelPredicateProviderRegistry.register(bow, Identifier.of("pull"),
                    (stack, world, entity, seed) -> {
                        if (entity == null) {
                            return 0.0F;
                        } else {
                            return entity.getActiveItem() != stack ? 0.0F : (float)(stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / 20.0F;
                        }
                    });

            ModelPredicateProviderRegistry.register(bow, Identifier.of("pulling"),
                    (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
        }
        private static void registerCrossbow(Item crossbow) {
            ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("pull"), (stack, world, entity, seed) -> {
                if (entity == null) {
                    return 0.0F;
                } else {
                    return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / (float)CrossbowItem.getPullTime(stack, entity);
                }
            });
            ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
            ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("charged"), (stack, world, entity, seed) -> CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
            ModelPredicateProviderRegistry.register(crossbow, Identifier.ofVanilla("firework"), (stack, world, entity, seed) -> {
                ChargedProjectilesComponent chargedProjectilesComponent = stack.get(DataComponentTypes.CHARGED_PROJECTILES);
                return chargedProjectilesComponent != null && chargedProjectilesComponent.contains(Items.FIREWORK_ROCKET) ? 1.0F : 0.0F;
            });
        }

    }
    @Deprecated
    public static class ArmorTrimMaterialRegistries {  //TODO: this
        public static final RegistryKey<ArmorTrimMaterial> ENDERITE = ArmorTrimMaterialRegistries.of("enderite");
        public static final RegistryKey<ArmorTrimMaterial> FYBERITE = ArmorTrimMaterialRegistries.of("fyberite");
        public static final RegistryKey<ArmorTrimMaterial> END_EMERALD = ArmorTrimMaterialRegistries.of("end_emerald");

        public static void bootstrap(Registerable<ArmorTrimMaterial> registry) {
        }
        public static void oneTwentyBootstrap(Registerable<ArmorTrimMaterial> registry) {
            ArmorTrimMaterialRegistries.register(registry, ENDERITE, ItemRegistries.SP5__ENDERITE_INGOT, Style.EMPTY.withColor(10116294), 1.0f);
            ArmorTrimMaterialRegistries.register(registry, FYBERITE, ItemRegistries.SKYBLOCK__FYBERITE, Style.EMPTY.withColor(10116294), 1.0f);
        }
        private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex) {
            ArmorTrimMaterialRegistries.register(registry, key, ingredient, style, itemModelIndex, Map.of());
        }

        private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex, Map<RegistryEntry<ArmorMaterial>, String> overrideArmorMaterials) {
            ArmorTrimMaterial armorTrimMaterial = ArmorTrimMaterial.of(key.getValue().getPath(), ingredient, itemModelIndex, Text.translatable(Util.createTranslationKey("trim_material", key.getValue())).fillStyle(style), overrideArmorMaterials);
            registry.register(key, armorTrimMaterial);
        }
        private static RegistryKey<ArmorTrimMaterial> of(String id) {
            return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(id));
        }
    }

    public static class ArmorMaterialRegistries {
        /*NETHERITE("netherite", 37, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 3);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 3);
        }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
        });*/
        public static final RegistryEntry<ArmorMaterial> ENDERITE = SkyBlock.BuiltinRegistries.registerArmorMaterial("enderite",
                Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 2);
            map.put(ArmorItem.Type.CHESTPLATE, 3);
            map.put(ArmorItem.Type.HELMET, 1);
            map.put(ArmorItem.Type.BODY, 3);
        }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ItemRegistries.SP5__ENDERITE_INGOT});
        });
        //ENDERITE("enderite", 45, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        //    map.put(ArmorItem.Type.BOOTS, 6);
        //    map.put(ArmorItem.Type.LEGGINGS, 8);
        //    map.put(ArmorItem.Type.CHESTPLATE, 10);
        //    map.put(ArmorItem.Type.HELMET, 6);
        //}), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> Ingredient.ofItems(ModItems.SP5__ENDERITE_INGOT)),
        public static final RegistryEntry<ArmorMaterial> ABERYTHE = SkyBlock.BuiltinRegistries.registerArmorMaterial("aberythe",
                Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 5);
            map.put(ArmorItem.Type.LEGGINGS, 7);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 4);
        }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.2f, 0.2f, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ItemRegistries.ABYSS__ABERYTHE_GEM});
        });
        //ABERYTHE("aberythe", 41, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        //    map.put(ArmorItem.Type.BOOTS, 5);
        //    map.put(ArmorItem.Type.LEGGINGS, 7);
        //    map.put(ArmorItem.Type.CHESTPLATE, 8);
        //    map.put(ArmorItem.Type.HELMET, 4);
        //}), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.2f, 0.2f, () -> Ingredient.ofItems(ModItems.ABYSS__ABERYTHE_GEM)),
        public static final RegistryEntry<ArmorMaterial> H__ANOMALITE = SkyBlock.BuiltinRegistries.registerArmorMaterial("h__anomalite",
                Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 3);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 3);
        }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ItemRegistries.H__ANOMALITE_FRAGMENT});
        });
        //H__ANOMALITE("h__anomalite", 40, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        //    map.put(ArmorItem.Type.BOOTS, 3);
        //    map.put(ArmorItem.Type.LEGGINGS, 6);
        //    map.put(ArmorItem.Type.CHESTPLATE, 8);
        //    map.put(ArmorItem.Type.HELMET, 3);
        //}), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT));
    }

    public enum ToolMaterialRegistries implements ToolMaterial {

        ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2236, 11.0f, -1f, 19, () -> Ingredient.ofItems(ItemRegistries.SP5__ENDERITE_INGOT)),
        BENIKARD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2236, 0f, -1f, 15, () -> Ingredient.ofItems(Items.WATER_BUCKET)),
        ABERYTHE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 10.0f, -1f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
        FIRWOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 200, 2.0F, -1f, 15, () -> Ingredient.fromTag(TagRegistries.Items.SKYBLOCK__FIR_LOGS)),
        H__ANOMALITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 11.0f, -1f, 1, () -> Ingredient.ofItems(ItemRegistries.H__ANOMALITE_FRAGMENT)),
        H__ANOMALITE_EXOPLASMIC(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2000, 11.0f, -1f, 1, () -> Ingredient.ofItems(ItemRegistries.H__ANOMALITE_FRAGMENT)),
        H__ANOMALITE_ENDOPLASMIC(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 15.0f, -1f, 1, () -> Ingredient.ofItems(ItemRegistries.H__ANOMALITE_FRAGMENT));


        private final TagKey<Block> inverseTag;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Supplier<Ingredient> repairIngredient;

        ToolMaterialRegistries(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
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

    public static class FoodComponentRegistries {
        public static final FoodComponent SP5__ENDERITE_APPLE = new FoodComponent.Builder()
                .nutrition(4)
                .saturationModifier(1.2f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 3), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 2), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 3), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 2000, 2), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3200, 0), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4400, 4), 1.0f)
                .alwaysEdible()
                .build();
        public static final FoodComponent SP5__ENCHANTED_ENDERITE_APPLE = new FoodComponent.Builder()
                .nutrition(4)
                .saturationModifier(1.2f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1600, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 7000, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9000, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 7200, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 9000, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10000, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 9000, 0), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 5000, 0), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4400, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 8000, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 7000, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5000, 0), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 5000, 0), 1.0f)
                .alwaysEdible()
                .build();
        public static final FoodComponent SKYBLOCK__STEAM_DUMPLING = new FoodComponent.Builder()
                .nutrition(5)
                .saturationModifier(1.1f)
                .build();
        public static final FoodComponent SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER = new FoodComponent.Builder()
                .nutrition(7)
                .saturationModifier(1.4f)
                .build();
        public static final FoodComponent SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = new FoodComponent.Builder()
                .nutrition(9)
                .saturationModifier(1.9f)
                .build();
        public static final FoodComponent SKYBLOCK__BLUEBERRIES = new FoodComponent.Builder()
                .nutrition(5)
                .saturationModifier(0.5f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400, 4), 1.0f)
                .alwaysEdible()
                .build();
        public static final FoodComponent SKYBLOCK__CHILLI_PEPPER = new FoodComponent.Builder().nutrition(6).saturationModifier(1.0f)
                .build();
        public static final FoodComponent SKYBLOCK__GOLDEN_CHILLI_PEPPER = new FoodComponent.Builder()
                .nutrition(8)
                .saturationModifier(1.75f)
                .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 0), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f)
                .alwaysEdible()
                .build();
        public static final FoodComponent SKYBLOCK__PUFFBALL_MUSHROOM_FLESH = new FoodComponent.Builder()
                .nutrition(8)
                .saturationModifier(0.3F)
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 0.4f)
                .alwaysEdible()
                .build();
        public static final FoodComponent SKYBLOCK__COOKED_PUFFBALL_MUSHROOM_FLESH = new FoodComponent.Builder()
                .nutrition(10)
                .saturationModifier(1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 0.2f)
                .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200, 0), 1.0f)
                .alwaysEdible()
                .build();
        public static final FoodComponent SKYBLOCK__PUFFBALL_MUSHROOM_STEW = new FoodComponent.Builder()
                .nutrition(10)
                .saturationModifier(1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 0.2f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 0), 1.0f)
                .usingConvertsTo(Items.BOWL)
                .alwaysEdible()
                .build();
    }

}
