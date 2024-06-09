package net.mcreator.votv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.votv.block.display.WashHandsPosterDisplayItem;

public class WashHandsPosterDisplayModel extends AnimatedGeoModel<WashHandsPosterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WashHandsPosterDisplayItem animatable) {
		return new ResourceLocation("votv", "animations/poster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WashHandsPosterDisplayItem animatable) {
		return new ResourceLocation("votv", "geo/poster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WashHandsPosterDisplayItem entity) {
		return new ResourceLocation("votv", "textures/blocks/votvposter2.png");
	}
}
