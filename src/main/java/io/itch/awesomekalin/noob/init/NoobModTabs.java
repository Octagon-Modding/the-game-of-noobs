
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NoobModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("noob", "noob_tab"),
				builder -> builder.title(Component.translatable("item_group.noob.noob_tab")).icon(() -> new ItemStack(NoobModBlocks.NOOB_CHEST.get())).displayItems((parameters, tabData) -> {
					tabData.accept(NoobModBlocks.NOOB_CHEST.get().asItem());
					tabData.accept(NoobModItems.NOOB_DIM.get());
					tabData.accept(NoobModItems.MUD_AXE.get());
					tabData.accept(NoobModItems.MUD_SWORD.get());
					tabData.accept(NoobModItems.MUD_PICKAXE.get());
					tabData.accept(NoobModItems.NOOB_DUST.get());
					tabData.accept(NoobModBlocks.NOOB_ORE.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_BLOCK.get().asItem());
					tabData.accept(NoobModItems.NOOB_PICKAXE.get());
					tabData.accept(NoobModItems.NOOB_AXE.get());
					tabData.accept(NoobModItems.NOOB_SWORD.get());
					tabData.accept(NoobModItems.NOOB_SHOVEL.get());
					tabData.accept(NoobModItems.NOOB_HOE.get());
					tabData.accept(NoobModItems.NOOB_ARMOR_HELMET.get());
					tabData.accept(NoobModItems.NOOB_ARMOR_CHESTPLATE.get());
					tabData.accept(NoobModItems.NOOB_ARMOR_LEGGINGS.get());
					tabData.accept(NoobModItems.NOOB_ARMOR_BOOTS.get());
					tabData.accept(NoobModItems.MUD_SHOVEL.get());
					tabData.accept(NoobModItems.MUD_HOE.get());
					tabData.accept(NoobModItems.MUD_SHOVEL_TOP.get());
					tabData.accept(NoobModItems.MUD_SHOVEL_BOTTOM.get());
					tabData.accept(NoobModItems.DIRT_ARMOUR_ARMOR_HELMET.get());
					tabData.accept(NoobModItems.DIRT_ARMOUR_ARMOR_CHESTPLATE.get());
					tabData.accept(NoobModItems.DIRT_ARMOUR_ARMOR_LEGGINGS.get());
					tabData.accept(NoobModItems.DIRT_ARMOUR_ARMOR_BOOTS.get());
					tabData.accept(NoobModItems.SALIVA.get());
					tabData.accept(NoobModItems.CREATIVE_GAUNTLET.get());
					tabData.accept(NoobModItems.THE_NOOB_SPAWN_EGG.get());
					tabData.accept(NoobModItems.NOOB_FOOD.get());
					tabData.accept(NoobModBlocks.DIRT_WOOD.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_LOG.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_PLANKS.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_LEAVES.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_STAIRS.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_SLAB.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_FENCE.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_FENCE_GATE.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_PRESSURE_PLATE.get().asItem());
					tabData.accept(NoobModBlocks.DIRT_BUTTON.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_WOOD.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_LOG.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_PLANKS.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_LEAVES.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_STAIRS.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_SLAB.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_FENCE.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_FENCE_GATE.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_PRESSURE_PLATE.get().asItem());
					tabData.accept(NoobModItems.DIRT_WOOD_PICKAXE.get());
					tabData.accept(NoobModBlocks.NOOB_BUTTON.get().asItem());
					tabData.accept(NoobModItems.DIRT_WOOD_AXE.get());
					tabData.accept(NoobModItems.DIRT_WOOD_SWORD.get());
					tabData.accept(NoobModItems.DIRT_WOOD_SHOVEL.get());
					tabData.accept(NoobModItems.DIRT_WOOD_HOE.get());
					tabData.accept(NoobModItems.NOOB_WOOD_PICKAXE.get());
					tabData.accept(NoobModItems.NOOB_WOOD_AXE.get());
					tabData.accept(NoobModItems.NOOB_WOOD_SWORD.get());
					tabData.accept(NoobModItems.NOOB_WOOD_SHOVEL.get());
					tabData.accept(NoobModItems.NOOB_WOOD_HOE.get());
					tabData.accept(NoobModBlocks.DIRT_SAPLING.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_COBBLESTONE.get().asItem());
					tabData.accept(NoobModBlocks.NOOB_STONE.get().asItem());
				}).withSearchBar());
	}
}
