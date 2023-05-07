
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.itch.awesomekalin.noob.init.NoobModTabs;
import io.itch.awesomekalin.noob.init.NoobModBlocks;

public class NoobWooSwordItem extends SwordItem {
	public NoobWooSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 26;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return -1f;
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
		}, 3, -3f, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
	}
}
