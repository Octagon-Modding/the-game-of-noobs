
package io.itch.awesomekalin.noob.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import io.itch.awesomekalin.noob.itemgroup.NoobTabItemGroup;
import io.itch.awesomekalin.noob.block.NoobPlanksBlock;
import io.itch.awesomekalin.noob.NoobModElements;

@NoobModElements.ModElement.Tag
public class NoobWooAxeItem extends NoobModElements.ModElement {
	@ObjectHolder("noob:noob_wood_axe")
	public static final Item block = null;

	public NoobWooAxeItem(NoobModElements instance) {
		super(instance, 158);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 26;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 3;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NoobPlanksBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(NoobTabItemGroup.tab)) {
		}.setRegistryName("noob_wood_axe"));
	}
}
