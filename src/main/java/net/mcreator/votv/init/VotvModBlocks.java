
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.votv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.votv.block.WashHandsPosterBlock;
import net.mcreator.votv.block.VentFanBlock;
import net.mcreator.votv.block.VentBlockBlock;
import net.mcreator.votv.block.SlotedFloorBlock;
import net.mcreator.votv.block.LowerBedRoomWallBlock;
import net.mcreator.votv.block.KerfurcrateBlock;
import net.mcreator.votv.block.KerfurCrateBlueBlock;
import net.mcreator.votv.block.HangInTherePosterBlock;
import net.mcreator.votv.block.GarageWallBlock;
import net.mcreator.votv.block.GarageFloorBlock;
import net.mcreator.votv.block.DrinkCoffeePosterBlock;
import net.mcreator.votv.block.CrateBlock;
import net.mcreator.votv.block.ConcreteWallBlock;
import net.mcreator.votv.block.CealingTileBlock;
import net.mcreator.votv.block.BedRoomWallBlock;
import net.mcreator.votv.block.AsphaltBlock;
import net.mcreator.votv.VotvMod;

public class VotvModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VotvMod.MODID);
	public static final RegistryObject<Block> KERFURCRATERED = REGISTRY.register("kerfurcratered", () -> new KerfurcrateBlock());
	public static final RegistryObject<Block> SLOTED_FLOOR = REGISTRY.register("sloted_floor", () -> new SlotedFloorBlock());
	public static final RegistryObject<Block> CONCRETE_WALL = REGISTRY.register("concrete_wall", () -> new ConcreteWallBlock());
	public static final RegistryObject<Block> KERFUR_CRATE_BLUE = REGISTRY.register("kerfur_crate_blue", () -> new KerfurCrateBlueBlock());
	public static final RegistryObject<Block> DRINK_COFFEE_POSTER = REGISTRY.register("drink_coffee_poster", () -> new DrinkCoffeePosterBlock());
	public static final RegistryObject<Block> WASH_HANDS_POSTER = REGISTRY.register("wash_hands_poster", () -> new WashHandsPosterBlock());
	public static final RegistryObject<Block> HANG_IN_THERE_POSTER = REGISTRY.register("hang_in_there_poster", () -> new HangInTherePosterBlock());
	public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
	public static final RegistryObject<Block> BED_ROOM_WALL = REGISTRY.register("bed_room_wall", () -> new BedRoomWallBlock());
	public static final RegistryObject<Block> LOWER_BED_ROOM_WALL = REGISTRY.register("lower_bed_room_wall", () -> new LowerBedRoomWallBlock());
	public static final RegistryObject<Block> GARAGE_WALL = REGISTRY.register("garage_wall", () -> new GarageWallBlock());
	public static final RegistryObject<Block> GARAGE_FLOOR = REGISTRY.register("garage_floor", () -> new GarageFloorBlock());
	public static final RegistryObject<Block> ASPHALT = REGISTRY.register("asphalt", () -> new AsphaltBlock());
	public static final RegistryObject<Block> VENT_BLOCK = REGISTRY.register("vent_block", () -> new VentBlockBlock());
	public static final RegistryObject<Block> CEALING_TILE = REGISTRY.register("cealing_tile", () -> new CealingTileBlock());
	public static final RegistryObject<Block> VENT_FAN = REGISTRY.register("vent_fan", () -> new VentFanBlock());
}
