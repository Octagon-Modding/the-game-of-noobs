
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import io.itch.awesomekalin.noob.world.inventory.NoobChestGUIMenu;
import io.itch.awesomekalin.noob.NoobMod;

public class NoobModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NoobMod.MODID);
	public static final RegistryObject<MenuType<NoobChestGUIMenu>> NOOB_CHEST_GUI = REGISTRY.register("noob_chest_gui", () -> IForgeMenuType.create(NoobChestGUIMenu::new));
}
