package net.mcreator.votv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.votv.block.display.HangInTherePosterDisplayItem;

public class HangInTherePosterDisplayModel extends AnimatedGeoModel<HangInTherePosterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HangInTherePosterDisplayItem animatable) {
		return new ResourceLocation("votv", "animations/poster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangInTherePosterDisplayItem animatable) {
		return new ResourceLocation("votv", "geo/poster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangInTherePosterDisplayItem entity) {
		return new ResourceLocation("votv", "textures/blocks/votvposter3.png");
	}
}
