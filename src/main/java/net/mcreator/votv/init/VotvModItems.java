
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.votv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.votv.VotvMod;

public class VotvModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VotvMod.MODID);
	public static final RegistryObject<Item> KERFUR_SPAWN_EGG = REGISTRY.register("kerfur_spawn_egg", () -> new ForgeSpawnEggItem(VotvModEntities.KERFUR, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
