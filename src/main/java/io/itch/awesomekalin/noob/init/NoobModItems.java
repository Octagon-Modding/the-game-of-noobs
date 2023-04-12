
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import io.itch.awesomekalin.noob.item.SalivaItem;
import io.itch.awesomekalin.noob.item.NoobSwordItem;
import io.itch.awesomekalin.noob.item.NoobShovelItem;
import io.itch.awesomekalin.noob.item.NoobPickaxeItem;
import io.itch.awesomekalin.noob.item.NoobHoeItem;
import io.itch.awesomekalin.noob.item.NoobFoodItem;
import io.itch.awesomekalin.noob.item.NoobDustItem;
import io.itch.awesomekalin.noob.item.NoobDimItem;
import io.itch.awesomekalin.noob.item.NoobAxeItem;
import io.itch.awesomekalin.noob.item.NoobArmorItem;
import io.itch.awesomekalin.noob.item.MudSwordItem;
import io.itch.awesomekalin.noob.item.MudShovelTopItem;
import io.itch.awesomekalin.noob.item.MudShovelItem;
import io.itch.awesomekalin.noob.item.MudShovelBottomItem;
import io.itch.awesomekalin.noob.item.MudPickaxeItem;
import io.itch.awesomekalin.noob.item.MudHoeItem;
import io.itch.awesomekalin.noob.item.MudAxeItem;
import io.itch.awesomekalin.noob.item.DirtArmourArmorItem;
import io.itch.awesomekalin.noob.item.CreativeGauntletItem;
import io.itch.awesomekalin.noob.NoobMod;

public class NoobModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NoobMod.MODID);
	public static final RegistryObject<Item> NOOB_CHEST = block(NoobModBlocks.NOOB_CHEST, NoobModTabs.TAB_NOOB_TAB);
	public static final RegistryObject<Item> NOOB_DIM = REGISTRY.register("noob_dim", () -> new NoobDimItem());
	public static final RegistryObject<Item> MUD_AXE = REGISTRY.register("mud_axe", () -> new MudAxeItem());
	public static final RegistryObject<Item> MUD_SWORD = REGISTRY.register("mud_sword", () -> new MudSwordItem());
	public static final RegistryObject<Item> MUD_PICKAXE = REGISTRY.register("mud_pickaxe", () -> new MudPickaxeItem());
	public static final RegistryObject<Item> NOOB_DUST = REGISTRY.register("noob_dust", () -> new NoobDustItem());
	public static final RegistryObject<Item> NOOB_ORE = block(NoobModBlocks.NOOB_ORE, NoobModTabs.TAB_NOOB_TAB);
	public static final RegistryObject<Item> NOOB_BLOCK = block(NoobModBlocks.NOOB_BLOCK, NoobModTabs.TAB_NOOB_TAB);
	public static final RegistryObject<Item> NOOB_PICKAXE = REGISTRY.register("noob_pickaxe", () -> new NoobPickaxeItem());
	public static final RegistryObject<Item> NOOB_AXE = REGISTRY.register("noob_axe", () -> new NoobAxeItem());
	public static final RegistryObject<Item> NOOB_SWORD = REGISTRY.register("noob_sword", () -> new NoobSwordItem());
	public static final RegistryObject<Item> NOOB_SHOVEL = REGISTRY.register("noob_shovel", () -> new NoobShovelItem());
	public static final RegistryObject<Item> NOOB_HOE = REGISTRY.register("noob_hoe", () -> new NoobHoeItem());
	public static final RegistryObject<Item> NOOB_ARMOR_HELMET = REGISTRY.register("noob_armor_helmet", () -> new NoobArmorItem.Helmet());
	public static final RegistryObject<Item> NOOB_ARMOR_CHESTPLATE = REGISTRY.register("noob_armor_chestplate", () -> new NoobArmorItem.Chestplate());
	public static final RegistryObject<Item> NOOB_ARMOR_LEGGINGS = REGISTRY.register("noob_armor_leggings", () -> new NoobArmorItem.Leggings());
	public static final RegistryObject<Item> NOOB_ARMOR_BOOTS = REGISTRY.register("noob_armor_boots", () -> new NoobArmorItem.Boots());
	public static final RegistryObject<Item> MUD_SHOVEL = REGISTRY.register("mud_shovel", () -> new MudShovelItem());
	public static final RegistryObject<Item> MUD_HOE = REGISTRY.register("mud_hoe", () -> new MudHoeItem());
	public static final RegistryObject<Item> MUD_SHOVEL_TOP = REGISTRY.register("mud_shovel_top", () -> new MudShovelTopItem());
	public static final RegistryObject<Item> MUD_SHOVEL_BOTTOM = REGISTRY.register("mud_shovel_bottom", () -> new MudShovelBottomItem());
	public static final RegistryObject<Item> DIRT_ARMOUR_ARMOR_HELMET = REGISTRY.register("dirt_armour_armor_helmet",
			() -> new DirtArmourArmorItem.Helmet());
	public static final RegistryObject<Item> DIRT_ARMOUR_ARMOR_CHESTPLATE = REGISTRY.register("dirt_armour_armor_chestplate",
			() -> new DirtArmourArmorItem.Chestplate());
	public static final RegistryObject<Item> DIRT_ARMOUR_ARMOR_LEGGINGS = REGISTRY.register("dirt_armour_armor_leggings",
			() -> new DirtArmourArmorItem.Leggings());
	public static final RegistryObject<Item> DIRT_ARMOUR_ARMOR_BOOTS = REGISTRY.register("dirt_armour_armor_boots",
			() -> new DirtArmourArmorItem.Boots());
	public static final RegistryObject<Item> SALIVA = REGISTRY.register("saliva", () -> new SalivaItem());
	public static final RegistryObject<Item> CREATIVE_GAUNTLET = REGISTRY.register("creative_gauntlet", () -> new CreativeGauntletItem());
	public static final RegistryObject<Item> THE_NOOB = REGISTRY.register("the_noob_spawn_egg",
			() -> new ForgeSpawnEggItem(NoobModEntities.THE_NOOB, -13421569, -10027009, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB)));
	public static final RegistryObject<Item> NOOB_FOOD = REGISTRY.register("noob_food", () -> new NoobFoodItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
