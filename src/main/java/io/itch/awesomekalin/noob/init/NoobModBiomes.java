
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import io.itch.awesomekalin.noob.world.biome.NoobBioBiome;
import io.itch.awesomekalin.noob.NoobMod;

public class NoobModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, NoobMod.MODID);
	public static final RegistryObject<Biome> NOOB_BIO = REGISTRY.register("noob_bio", () -> NoobBioBiome.createBiome());
}
