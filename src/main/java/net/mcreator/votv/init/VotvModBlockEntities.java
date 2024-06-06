
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.votv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.votv.block.entity.DrinkCoffeePosterTileEntity;
import net.mcreator.votv.VotvMod;

public class VotvModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, VotvMod.MODID);
	public static final RegistryObject<BlockEntityType<DrinkCoffeePosterTileEntity>> DRINK_COFFEE_POSTER = REGISTRY.register("drink_coffee_poster",
			() -> BlockEntityType.Builder.of(DrinkCoffeePosterTileEntity::new, VotvModBlocks.DRINK_COFFEE_POSTER.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
