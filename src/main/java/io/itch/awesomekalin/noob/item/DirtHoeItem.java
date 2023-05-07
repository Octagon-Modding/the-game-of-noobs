
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import io.itch.awesomekalin.noob.init.NoobModTabs;
import io.itch.awesomekalin.noob.init.NoobModBlocks;

public class DirtHoeItem extends HoeItem {
	public DirtHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 10;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NoobModBlocks.DIRT_PLANKS.get()));
			}
		}, 0, -3f, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
	}
}
