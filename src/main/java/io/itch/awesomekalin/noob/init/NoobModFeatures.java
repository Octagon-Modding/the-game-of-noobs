
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import io.itch.awesomekalin.noob.world.features.plants.DirtSaplingFeature;
import io.itch.awesomekalin.noob.world.features.ores.NoobOreFeature;
import io.itch.awesomekalin.noob.world.features.ores.NoobChestFeature;
import io.itch.awesomekalin.noob.NoobMod;

@Mod.EventBusSubscriber
public class NoobModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, NoobMod.MODID);
	public static final RegistryObject<Feature<?>> NOOB_CHEST = REGISTRY.register("noob_chest", NoobChestFeature::new);
	public static final RegistryObject<Feature<?>> NOOB_ORE = REGISTRY.register("noob_ore", NoobOreFeature::new);
	public static final RegistryObject<Feature<?>> DIRT_SAPLING = REGISTRY.register("dirt_sapling", DirtSaplingFeature::new);
}
