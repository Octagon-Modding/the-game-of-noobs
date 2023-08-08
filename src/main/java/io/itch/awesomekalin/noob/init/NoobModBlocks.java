
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NoobModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block NOOB_CHEST = register(new NoobChestBlock());
	public static final Block NOOB_DIM_PORTAL = register(new NoobDimPortalBlock());
	public static final Block NOOB_ORE = register(new NoobOreBlock());
	public static final Block NOOB_BLOCK = register(new NoobBlockBlock());
	public static final Block DIRT_WOOD = register(new DirtWoodBlock());
	public static final Block DIRT_LOG = register(new DirtLogBlock());
	public static final Block DIRT_PLANKS = register(new DirtPlanksBlock());
	public static final Block DIRT_LEAVES = register(new DirtLeavesBlock());
	public static final Block DIRT_STAIRS = register(new DirtStairsBlock());
	public static final Block DIRT_SLAB = register(new DirtSlabBlock());
	public static final Block DIRT_FENCE = register(new DirtFenceBlock());
	public static final Block DIRT_FENCE_GATE = register(new DirtFenceGateBlock());
	public static final Block DIRT_PRESSURE_PLATE = register(new DirtPressurePlateBlock());
	public static final Block DIRT_BUTTON = register(new DirtButtonBlock());
	public static final Block NOOB_WOOD = register(new NoobWoodBlock());
	public static final Block NOOB_LOG = register(new NoobLogBlock());
	public static final Block NOOB_PLANKS = register(new NoobPlanksBlock());
	public static final Block NOOB_LEAVES = register(new NoobLeavesBlock());
	public static final Block NOOB_STAIRS = register(new NoobStairsBlock());
	public static final Block NOOB_SLAB = register(new NoobSlabBlock());
	public static final Block NOOB_FENCE = register(new NoobFenceBlock());
	public static final Block NOOB_FENCE_GATE = register(new NoobFenceGateBlock());
	public static final Block NOOB_PRESSURE_PLATE = register(new NoobPressurePlateBlock());
	public static final Block NOOB_BUTTON = register(new NoobButtonBlock());
	public static final Block DIRT_SAPLING = register(new DirtSaplingBlock());
	public static final Block NOOB_COBBLESTONE = register(new NoobCobblestoneBlock());
	public static final Block NOOB_STONE = register(new NoobStoneBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DirtSaplingBlock.registerRenderLayer();
		}
	}
}
