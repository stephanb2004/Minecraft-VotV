
package net.mcreator.votv.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.votv.init.VotvModTabs;

public class CheeseCubeItem extends Item {
	public CheeseCubeItem() {
		super(new Item.Properties().tab(VotvModTabs.TAB_VOT_VMOD_ITEM).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 3;
	}
}
