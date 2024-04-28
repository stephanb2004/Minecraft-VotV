
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.votv.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class VotvModTabs {
	public static CreativeModeTab TAB_VOT_VMOD_ITEM;

	public static void load() {
		TAB_VOT_VMOD_ITEM = new CreativeModeTab("tabvot_vmod_item") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(VotvModItems.VOT_VTAB.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
