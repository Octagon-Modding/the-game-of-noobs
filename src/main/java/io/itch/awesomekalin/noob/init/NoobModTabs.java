
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class NoobModTabs {
	public static CreativeModeTab TAB_NOOB_TAB;

	public static void load() {
		TAB_NOOB_TAB = new CreativeModeTab("tabnoob_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(NoobModBlocks.NOOB_CHEST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
