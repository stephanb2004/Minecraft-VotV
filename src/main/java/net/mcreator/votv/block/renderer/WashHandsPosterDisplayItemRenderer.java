package net.mcreator.votv.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.votv.block.model.WashHandsPosterDisplayModel;
import net.mcreator.votv.block.display.WashHandsPosterDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WashHandsPosterDisplayItemRenderer extends GeoItemRenderer<WashHandsPosterDisplayItem> {
	public WashHandsPosterDisplayItemRenderer() {
		super(new WashHandsPosterDisplayModel());
	}

	@Override
	public RenderType getRenderType(WashHandsPosterDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
