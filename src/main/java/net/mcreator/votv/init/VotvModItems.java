
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
import net.mcreator.votv.item.CheeseCubeItem;
import net.mcreator.votv.block.display.WashHandsPosterDisplayItem;
import net.mcreator.votv.block.display.HangInTherePosterDisplayItem;
import net.mcreator.votv.block.display.DrinkCoffeePosterDisplayItem;
import net.mcreator.votv.VotvMod;

public class VotvModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VotvMod.MODID);
	public static final RegistryObject<Item> KERFUR_SPAWN_EGG = REGISTRY.register("kerfur_spawn_egg", () -> new ForgeSpawnEggItem(VotvModEntities.KERFUR, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHEESESLICE = REGISTRY.register("cheeseslice", () -> new CheesesliceItem());
	public static final RegistryObject<Item> VOT_VTAB = REGISTRY.register("vot_vtab", () -> new VotVtabItem());
	public static final RegistryObject<Item> KERFURCRATERED = block(VotvModBlocks.KERFURCRATERED, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> CHEESE_CUBE = REGISTRY.register("cheese_cube", () -> new CheeseCubeItem());
	public static final RegistryObject<Item> SLOTED_FLOOR = block(VotvModBlocks.SLOTED_FLOOR, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> CONCRETE_WALL = block(VotvModBlocks.CONCRETE_WALL, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> KERFUR_CRATE_BLUE = block(VotvModBlocks.KERFUR_CRATE_BLUE, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> DRINK_COFFEE_POSTER = REGISTRY.register(VotvModBlocks.DRINK_COFFEE_POSTER.getId().getPath(),
			() -> new DrinkCoffeePosterDisplayItem(VotvModBlocks.DRINK_COFFEE_POSTER.get(), new Item.Properties().tab(VotvModTabs.TAB_VOT_VMOD_ITEM)));
	public static final RegistryObject<Item> WASH_HANDS_POSTER = REGISTRY.register(VotvModBlocks.WASH_HANDS_POSTER.getId().getPath(),
			() -> new WashHandsPosterDisplayItem(VotvModBlocks.WASH_HANDS_POSTER.get(), new Item.Properties().tab(VotvModTabs.TAB_VOT_VMOD_ITEM)));
	public static final RegistryObject<Item> HANG_IN_THERE_POSTER = REGISTRY.register(VotvModBlocks.HANG_IN_THERE_POSTER.getId().getPath(),
			() -> new HangInTherePosterDisplayItem(VotvModBlocks.HANG_IN_THERE_POSTER.get(), new Item.Properties().tab(VotvModTabs.TAB_VOT_VMOD_ITEM)));
	public static final RegistryObject<Item> CRATE = block(VotvModBlocks.CRATE, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> BED_ROOM_WALL = block(VotvModBlocks.BED_ROOM_WALL, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> LOWER_BED_ROOM_WALL = block(VotvModBlocks.LOWER_BED_ROOM_WALL, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> GARAGE_WALL = block(VotvModBlocks.GARAGE_WALL, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> GARAGE_FLOOR = block(VotvModBlocks.GARAGE_FLOOR, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> ASPHALT = block(VotvModBlocks.ASPHALT, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> VENT_BLOCK = block(VotvModBlocks.VENT_BLOCK, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> CEALING_TILE = block(VotvModBlocks.CEALING_TILE, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> VENT_FAN = block(VotvModBlocks.VENT_FAN, VotvModTabs.TAB_VOT_VMOD_ITEM);
	public static final RegistryObject<Item> CHEESE_WHEEL = block(VotvModBlocks.CHEESE_WHEEL, VotvModTabs.TAB_VOT_VMOD_ITEM);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
