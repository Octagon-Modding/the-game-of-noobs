
package io.itch.awesomekalin.noob.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class LootTableStoneNoob extends ElementsNoobMod.ModElement {
	public LootTableStoneNoob(ElementsNoobMod instance) {
		super(instance, 175);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("noob", "blocks/noob_stone"));
	}
}
