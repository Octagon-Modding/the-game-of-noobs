
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.itch.awesomekalin.noob.init.NoobModTabs;
import io.itch.awesomekalin.noob.init.NoobModBlocks;

public class NoobWooShovelItem extends ShovelItem {
	public NoobWooShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 26;
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
				return 3;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NoobModBlocks.NOOB_PLANKS.get()));
			}
		}, 1, -3f, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
	}
}
