package net.mcreator.votv.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.votv.entity.KurfurEntity;

public class KurfurModel extends AnimatedGeoModel<KurfurEntity> {
	@Override
	public ResourceLocation getAnimationResource(KurfurEntity entity) {
		return new ResourceLocation("votv", "animations/kurfur.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KurfurEntity entity) {
		return new ResourceLocation("votv", "geo/kurfur.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KurfurEntity entity) {
		return new ResourceLocation("votv", "textures/entities/" + entity.getTexture() + ".png");
	}

}
