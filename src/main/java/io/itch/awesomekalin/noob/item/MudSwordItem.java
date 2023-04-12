
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import io.itch.awesomekalin.noob.procedures.MudAxeMobIsHitWithToolProcedure;
import io.itch.awesomekalin.noob.init.NoobModTabs;

public class MudSwordItem extends SwordItem {
	public MudSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 10;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return -1.8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MudAxeMobIsHitWithToolProcedure.execute(entity, itemstack);
		return retval;
	}
}
