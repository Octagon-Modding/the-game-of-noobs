
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.itch.awesomekalin.noob.init.NoobModTabs;
import io.itch.awesomekalin.noob.init.NoobModItems;

public class NoobShovelItem extends ShovelItem {
	public NoobShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 46;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NoobModItems.NOOB_DUST.get()));
			}
		}, 1, -3f, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
	}
}
