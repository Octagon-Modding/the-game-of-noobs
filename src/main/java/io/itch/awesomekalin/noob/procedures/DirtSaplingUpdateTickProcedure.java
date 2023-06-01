package io.itch.awesomekalin.noob.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.block.Blocks;

import java.util.Map;

import io.itch.awesomekalin.noob.NoobMod;

public class DirtSaplingUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NoobMod.LOGGER.warn("Failed to load dependency world for procedure DirtSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NoobMod.LOGGER.warn("Failed to load dependency x for procedure DirtSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NoobMod.LOGGER.warn("Failed to load dependency y for procedure DirtSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NoobMod.LOGGER.warn("Failed to load dependency z for procedure DirtSaplingUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double RndNumber = 0;
		RndNumber = Math.random();
		if (RndNumber == 0.1) {
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("noob", "dirt_tree_1"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos(x, y, z),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else if (RndNumber == 0.2) {
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("noob", "dirt_tree_2"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos(x, y, z),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else if (RndNumber == 0.3) {
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("noob", "dirt_tree_3"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos(x, y, z),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
	}
}
