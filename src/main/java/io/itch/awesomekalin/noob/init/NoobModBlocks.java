
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.itch.awesomekalin.noob.block.NoobWoodBlock;
import io.itch.awesomekalin.noob.block.NoobStoneBlock;
import io.itch.awesomekalin.noob.block.NoobStairsBlock;
import io.itch.awesomekalin.noob.block.NoobSlabBlock;
import io.itch.awesomekalin.noob.block.NoobPressurePlateBlock;
import io.itch.awesomekalin.noob.block.NoobPlanksBlock;
import io.itch.awesomekalin.noob.block.NoobOreBlock;
import io.itch.awesomekalin.noob.block.NoobLogBlock;
import io.itch.awesomekalin.noob.block.NoobLeavesBlock;
import io.itch.awesomekalin.noob.block.NoobFenceGateBlock;
import io.itch.awesomekalin.noob.block.NoobFenceBlock;
import io.itch.awesomekalin.noob.block.NoobDimPortalBlock;
import io.itch.awesomekalin.noob.block.NoobCobblestoneBlock;
import io.itch.awesomekalin.noob.block.NoobChestBlock;
import io.itch.awesomekalin.noob.block.NoobButtonBlock;
import io.itch.awesomekalin.noob.block.NoobBlockBlock;
import io.itch.awesomekalin.noob.block.DirtWoodBlock;
import io.itch.awesomekalin.noob.block.DirtStairsBlock;
import io.itch.awesomekalin.noob.block.DirtSlabBlock;
import io.itch.awesomekalin.noob.block.DirtSaplingBlock;
import io.itch.awesomekalin.noob.block.DirtPressurePlateBlock;
import io.itch.awesomekalin.noob.block.DirtPlanksBlock;
import io.itch.awesomekalin.noob.block.DirtLogBlock;
import io.itch.awesomekalin.noob.block.DirtLeavesBlock;
import io.itch.awesomekalin.noob.block.DirtFenceGateBlock;
import io.itch.awesomekalin.noob.block.DirtFenceBlock;
import io.itch.awesomekalin.noob.block.DirtButtonBlock;
import io.itch.awesomekalin.noob.NoobMod;

public class NoobModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NoobMod.MODID);
	public static final RegistryObject<Block> NOOB_CHEST = REGISTRY.register("noob_chest", () -> new NoobChestBlock());
	public static final RegistryObject<Block> NOOB_DIM_PORTAL = REGISTRY.register("noob_dim_portal", () -> new NoobDimPortalBlock());
	public static final RegistryObject<Block> NOOB_ORE = REGISTRY.register("noob_ore", () -> new NoobOreBlock());
	public static final RegistryObject<Block> NOOB_BLOCK = REGISTRY.register("noob_block", () -> new NoobBlockBlock());
	public static final RegistryObject<Block> DIRT_WOOD = REGISTRY.register("dirt_wood", () -> new DirtWoodBlock());
	public static final RegistryObject<Block> DIRT_LOG = REGISTRY.register("dirt_log", () -> new DirtLogBlock());
	public static final RegistryObject<Block> DIRT_PLANKS = REGISTRY.register("dirt_planks", () -> new DirtPlanksBlock());
	public static final RegistryObject<Block> DIRT_LEAVES = REGISTRY.register("dirt_leaves", () -> new DirtLeavesBlock());
	public static final RegistryObject<Block> DIRT_STAIRS = REGISTRY.register("dirt_stairs", () -> new DirtStairsBlock());
	public static final RegistryObject<Block> DIRT_SLAB = REGISTRY.register("dirt_slab", () -> new DirtSlabBlock());
	public static final RegistryObject<Block> DIRT_FENCE = REGISTRY.register("dirt_fence", () -> new DirtFenceBlock());
	public static final RegistryObject<Block> DIRT_FENCE_GATE = REGISTRY.register("dirt_fence_gate", () -> new DirtFenceGateBlock());
	public static final RegistryObject<Block> DIRT_PRESSURE_PLATE = REGISTRY.register("dirt_pressure_plate", () -> new DirtPressurePlateBlock());
	public static final RegistryObject<Block> DIRT_BUTTON = REGISTRY.register("dirt_button", () -> new DirtButtonBlock());
	public static final RegistryObject<Block> NOOB_WOOD = REGISTRY.register("noob_wood", () -> new NoobWoodBlock());
	public static final RegistryObject<Block> NOOB_LOG = REGISTRY.register("noob_log", () -> new NoobLogBlock());
	public static final RegistryObject<Block> NOOB_PLANKS = REGISTRY.register("noob_planks", () -> new NoobPlanksBlock());
	public static final RegistryObject<Block> NOOB_LEAVES = REGISTRY.register("noob_leaves", () -> new NoobLeavesBlock());
	public static final RegistryObject<Block> NOOB_STAIRS = REGISTRY.register("noob_stairs", () -> new NoobStairsBlock());
	public static final RegistryObject<Block> NOOB_SLAB = REGISTRY.register("noob_slab", () -> new NoobSlabBlock());
	public static final RegistryObject<Block> NOOB_FENCE = REGISTRY.register("noob_fence", () -> new NoobFenceBlock());
	public static final RegistryObject<Block> NOOB_FENCE_GATE = REGISTRY.register("noob_fence_gate", () -> new NoobFenceGateBlock());
	public static final RegistryObject<Block> NOOB_PRESSURE_PLATE = REGISTRY.register("noob_pressure_plate", () -> new NoobPressurePlateBlock());
	public static final RegistryObject<Block> NOOB_BUTTON = REGISTRY.register("noob_button", () -> new NoobButtonBlock());
	public static final RegistryObject<Block> DIRT_SAPLING = REGISTRY.register("dirt_sapling", () -> new DirtSaplingBlock());
	public static final RegistryObject<Block> NOOB_COBBLESTONE = REGISTRY.register("noob_cobblestone", () -> new NoobCobblestoneBlock());
	public static final RegistryObject<Block> NOOB_STONE = REGISTRY.register("noob_stone", () -> new NoobStoneBlock());
}
