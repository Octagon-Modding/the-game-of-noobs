
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import io.itch.awesomekalin.noob.block.entity.NoobChestBlockEntity;
import io.itch.awesomekalin.noob.NoobMod;

public class NoobModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, NoobMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NOOB_CHEST = register("noob_chest", NoobModBlocks.NOOB_CHEST, NoobChestBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
