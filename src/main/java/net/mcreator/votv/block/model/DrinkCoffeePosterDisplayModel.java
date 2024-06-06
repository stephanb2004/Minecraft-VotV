package net.mcreator.votv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.votv.block.display.DrinkCoffeePosterDisplayItem;

public class DrinkCoffeePosterDisplayModel extends AnimatedGeoModel<DrinkCoffeePosterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrinkCoffeePosterDisplayItem animatable) {
		return new ResourceLocation("votv", "animations/poster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrinkCoffeePosterDisplayItem animatable) {
		return new ResourceLocation("votv", "geo/poster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrinkCoffeePosterDisplayItem entity) {
		return new ResourceLocation("votv", "textures/blocks/votvposter.png");
	}
}
