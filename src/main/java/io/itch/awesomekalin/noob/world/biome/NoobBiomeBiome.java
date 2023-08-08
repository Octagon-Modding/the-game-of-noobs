
package io.itch.awesomekalin.noob.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;

import io.itch.awesomekalin.noob.world.features.treedecorators.NoobBiomeTrunkDecorator;
import io.itch.awesomekalin.noob.world.features.treedecorators.NoobBiomeLeaveDecorator;
import io.itch.awesomekalin.noob.world.features.treedecorators.NoobBiomeFruitDecorator;
import io.itch.awesomekalin.noob.init.NoobModBlocks;

import com.google.common.collect.ImmutableList;

public class NoobBiomeBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-2f, 2f), Climate.Parameter.span(-2f, 2f), Climate.Parameter.span(-2f, 2f), Climate.Parameter.span(-2f, 2f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-2f, 2f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-2f, 2f), Climate.Parameter.span(-2f, 2f), Climate.Parameter.span(-2f, 2f), Climate.Parameter.span(-2f, 2f), Climate.Parameter.point(1.0f), Climate.Parameter.span(-2f, 2f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-52429).waterFogColor(-52429).skyColor(7972607).foliageColorOverride(-10066177).grassColorOverride(-10066177)
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.EXPLOSION, 1f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("noob:tree_noob_biome",
						FeatureUtils.register("noob:tree_noob_biome", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NoobModBlocks.NOOB_LOG.get().defaultBlockState()), new MegaJungleTrunkPlacer(7, 2, 19),
										BlockStateProvider.simple(NoobModBlocks.NOOB_LEAVES.get().defaultBlockState()), new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2), new TwoLayersFeatureSize(1, 1, 2))
										.decorators(ImmutableList.of(NoobBiomeLeaveDecorator.INSTANCE, NoobBiomeTrunkDecorator.INSTANCE, NoobBiomeFruitDecorator.INSTANCE)).build()),
						List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(1f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
