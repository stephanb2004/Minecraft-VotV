package net.mcreator.votv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.votv.block.entity.HangInTherePosterTileEntity;

public class HangInTherePosterBlockModel extends AnimatedGeoModel<HangInTherePosterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HangInTherePosterTileEntity animatable) {
		return new ResourceLocation("votv", "animations/poster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangInTherePosterTileEntity animatable) {
		return new ResourceLocation("votv", "geo/poster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangInTherePosterTileEntity entity) {
		return new ResourceLocation("votv", "textures/blocks/votvposter3.png");
	}
}
