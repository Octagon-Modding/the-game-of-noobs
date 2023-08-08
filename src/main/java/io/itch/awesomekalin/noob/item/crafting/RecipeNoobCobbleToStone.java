
package io.itch.awesomekalin.noob.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.itch.awesomekalin.noob.block.BlockNoobStone;
import io.itch.awesomekalin.noob.block.BlockNoobCobblestone;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class RecipeNoobCobbleToStone extends ElementsNoobMod.ModElement {
	public RecipeNoobCobbleToStone(ElementsNoobMod instance) {
		super(instance, 176);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockNoobCobblestone.block, (int) (1)), new ItemStack(BlockNoobStone.block, (int) (1)), 1F);
	}
}
