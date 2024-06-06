
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.votv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.votv.block.SlotedFloorBlock;
import net.mcreator.votv.block.KerfurcrateBlock;
import net.mcreator.votv.block.KerfurCrateBlueBlock;
import net.mcreator.votv.block.DrinkCoffeePosterBlock;
import net.mcreator.votv.block.ConcreteWallBlock;
import net.mcreator.votv.VotvMod;

public class VotvModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VotvMod.MODID);
	public static final RegistryObject<Block> KERFURCRATERED = REGISTRY.register("kerfurcratered", () -> new KerfurcrateBlock());
	public static final RegistryObject<Block> SLOTED_FLOOR = REGISTRY.register("sloted_floor", () -> new SlotedFloorBlock());
	public static final RegistryObject<Block> CONCRETE_WALL = REGISTRY.register("concrete_wall", () -> new ConcreteWallBlock());
	public static final RegistryObject<Block> KERFUR_CRATE_BLUE = REGISTRY.register("kerfur_crate_blue", () -> new KerfurCrateBlueBlock());
	public static final RegistryObject<Block> DRINK_COFFEE_POSTER = REGISTRY.register("drink_coffee_poster", () -> new DrinkCoffeePosterBlock());
}
