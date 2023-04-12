
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.itch.awesomekalin.noob.block.NoobOreBlock;
import io.itch.awesomekalin.noob.block.NoobDimPortalBlock;
import io.itch.awesomekalin.noob.block.NoobChestBlock;
import io.itch.awesomekalin.noob.block.NoobBlockBlock;
import io.itch.awesomekalin.noob.NoobMod;

public class NoobModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NoobMod.MODID);
	public static final RegistryObject<Block> NOOB_CHEST = REGISTRY.register("noob_chest", () -> new NoobChestBlock());
	public static final RegistryObject<Block> NOOB_DIM_PORTAL = REGISTRY.register("noob_dim_portal", () -> new NoobDimPortalBlock());
	public static final RegistryObject<Block> NOOB_ORE = REGISTRY.register("noob_ore", () -> new NoobOreBlock());
	public static final RegistryObject<Block> NOOB_BLOCK = REGISTRY.register("noob_block", () -> new NoobBlockBlock());
}
