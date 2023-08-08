package io.itch.awesomekalin.noob.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import io.itch.awesomekalin.noob.init.NoobModItems;
import io.itch.awesomekalin.noob.NoobMod;

public class CreativeGauntletRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player)
			_player.setGameMode(GameType.CREATIVE);
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(NoobModItems.CREATIVE_GAUNTLET.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		NoobMod.queueServerWork(600, () -> {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
		});
	}
}
