package io.itch.awesomekalin.noob.procedure;

import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Map;

import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class ProcedureDirtSaplingPlantRightClicked extends ElementsNoobMod.ModElement {
	public ProcedureDirtSaplingPlantRightClicked(ElementsNoobMod instance) {
		super(instance, 170);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DirtSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DirtSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DirtSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DirtSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DirtSaplingPlantRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double RndNumber = 0;
		RndNumber = (double) Math.random();
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.DYE, (int) (1), 15).getItem())) {
			(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setCount(
					(int) (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount())
							- 1));
			if (((RndNumber) <= 0.2)) {
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("noob", "dirt_tree_3"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) (x - 4), (int) y, (int) (z - 5));
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
			} else if (((RndNumber) <= 0.4)) {
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("noob", "dirt_tree_2"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) (x - 1), (int) y, (int) (z - 1));
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
			} else if (((RndNumber) <= 0.6)) {
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("noob", "dirt_tree_1"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) (x - 2), (int) y, (int) (z - 2));
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
			}
		}
	}
}
