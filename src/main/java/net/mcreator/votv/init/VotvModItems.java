
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.votv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.votv.item.VotVtabItem;
import net.mcreator.votv.item.CheesesliceItem;
import net.mcreator.votv.VotvMod;

public class VotvModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VotvMod.MODID);
	public static final RegistryObject<Item> KERFUR_SPAWN_EGG = REGISTRY.register("kerfur_spawn_egg", () -> new ForgeSpawnEggItem(VotvModEntities.KERFUR, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHEESESLICE = REGISTRY.register("cheeseslice", () -> new CheesesliceItem());
	public static final RegistryObject<Item> VOT_VTAB = REGISTRY.register("vot_vtab", () -> new VotVtabItem());
	public static final RegistryObject<Item> KERFUR_CRATE = block(VotvModBlocks.KERFUR_CRATE, VotvModTabs.TAB_VOT_VMOD_ITEM);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
