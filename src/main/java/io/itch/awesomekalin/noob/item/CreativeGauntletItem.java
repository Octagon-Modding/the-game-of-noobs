
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import io.itch.awesomekalin.noob.procedures.CreativeGauntletRightClickedProcedure;
import io.itch.awesomekalin.noob.init.NoobModTabs;

public class CreativeGauntletItem extends Item {
	public CreativeGauntletItem() {
		super(new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CreativeGauntletRightClickedProcedure.execute(world, entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		CreativeGauntletRightClickedProcedure.execute(context.getLevel(), context.getPlayer());
		return retval;
	}
}
