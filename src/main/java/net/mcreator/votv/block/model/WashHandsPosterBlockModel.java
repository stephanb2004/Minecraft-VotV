package net.mcreator.votv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.votv.block.entity.WashHandsPosterTileEntity;

public class WashHandsPosterBlockModel extends AnimatedGeoModel<WashHandsPosterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WashHandsPosterTileEntity animatable) {
		return new ResourceLocation("votv", "animations/poster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WashHandsPosterTileEntity animatable) {
		return new ResourceLocation("votv", "geo/poster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WashHandsPosterTileEntity entity) {
		return new ResourceLocation("votv", "textures/blocks/votvposter2.png");
	}
}
