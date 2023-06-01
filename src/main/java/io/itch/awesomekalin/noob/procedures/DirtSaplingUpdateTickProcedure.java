package io.itch.awesomekalin.noob.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DirtSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RndNumber = 0;
		RndNumber = Math.random();
		if (RndNumber == 0.1) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("noob", "dirt_tree_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (RndNumber == 0.2) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("noob", "dirt_tree_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (RndNumber == 0.3) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("noob", "dirt_tree_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
