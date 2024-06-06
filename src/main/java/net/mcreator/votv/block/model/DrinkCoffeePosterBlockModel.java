package net.mcreator.votv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.votv.block.entity.DrinkCoffeePosterTileEntity;

public class DrinkCoffeePosterBlockModel extends AnimatedGeoModel<DrinkCoffeePosterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrinkCoffeePosterTileEntity animatable) {
		return new ResourceLocation("votv", "animations/poster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrinkCoffeePosterTileEntity animatable) {
		return new ResourceLocation("votv", "geo/poster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrinkCoffeePosterTileEntity entity) {
		return new ResourceLocation("votv", "textures/blocks/votvposter.png");
	}
}
