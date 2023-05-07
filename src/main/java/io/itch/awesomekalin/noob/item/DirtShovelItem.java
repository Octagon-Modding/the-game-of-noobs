
package io.itch.awesomekalin.noob.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import io.itch.awesomekalin.noob.itemgroup.NoobTabItemGroup;
import io.itch.awesomekalin.noob.block.DirtPlanksBlock;
import io.itch.awesomekalin.noob.NoobModElements;

@NoobModElements.ModElement.Tag
public class DirtShovelItem extends NoobModElements.ModElement {
	@ObjectHolder("noob:dirt_wood_shovel")
	public static final Item block = null;
	public DirtShovelItem(NoobModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(DirtPlanksBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(NoobTabItemGroup.tab)) {
		}.setRegistryName("dirt_wood_shovel"));
	}
}
