
package io.itch.awesomekalin.noob.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import io.itch.awesomekalin.noob.NoobModElements;

@NoobModElements.ModElement.Tag
public class NoobSwordItem extends NoobModElements.ModElement {
	@ObjectHolder("noob:noob_sword")
	public static final Item block = null;
	public NoobSwordItem(NoobModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return -2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("noob_sword"));
	}
}
