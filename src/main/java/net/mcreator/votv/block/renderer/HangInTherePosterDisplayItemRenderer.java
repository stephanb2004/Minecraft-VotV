package net.mcreator.votv.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.votv.block.model.HangInTherePosterDisplayModel;
import net.mcreator.votv.block.display.HangInTherePosterDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HangInTherePosterDisplayItemRenderer extends GeoItemRenderer<HangInTherePosterDisplayItem> {
	public HangInTherePosterDisplayItemRenderer() {
		super(new HangInTherePosterDisplayModel());
	}

	@Override
	public RenderType getRenderType(HangInTherePosterDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
