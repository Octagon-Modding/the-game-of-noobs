
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import io.itch.awesomekalin.noob.world.features.plants.DirtSaplingFeature;
import io.itch.awesomekalin.noob.world.features.ores.NoobOreFeature;
import io.itch.awesomekalin.noob.world.features.ores.NoobChestFeature;
import io.itch.awesomekalin.noob.NoobMod;

@Mod.EventBusSubscriber
public class NoobModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, NoobMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> NOOB_CHEST = register("noob_chest", NoobChestFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NoobChestFeature.GENERATE_BIOMES, NoobChestFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NOOB_ORE = register("noob_ore", NoobOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NoobOreFeature.GENERATE_BIOMES, NoobOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIRT_SAPLING = register("dirt_sapling", DirtSaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DirtSaplingFeature.GENERATE_BIOMES, DirtSaplingFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
