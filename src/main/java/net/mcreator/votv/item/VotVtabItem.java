
package net.mcreator.votv.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VotVtabItem extends Item {
	public VotVtabItem() {
		super(new Item.Properties().tab(null).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
