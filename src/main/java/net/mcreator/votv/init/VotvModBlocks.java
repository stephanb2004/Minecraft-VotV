
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.votv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.votv.block.KerfurCrateBlock;
import net.mcreator.votv.VotvMod;

public class VotvModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VotvMod.MODID);
	public static final RegistryObject<Block> KERFUR_CRATE = REGISTRY.register("kerfur_crate", () -> new KerfurCrateBlock());
}
