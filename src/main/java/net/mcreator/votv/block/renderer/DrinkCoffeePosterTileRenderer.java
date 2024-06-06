package net.mcreator.votv.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.votv.block.model.DrinkCoffeePosterBlockModel;
import net.mcreator.votv.block.entity.DrinkCoffeePosterTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DrinkCoffeePosterTileRenderer extends GeoBlockRenderer<DrinkCoffeePosterTileEntity> {
	public DrinkCoffeePosterTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new DrinkCoffeePosterBlockModel());
	}

	@Override
	public RenderType getRenderType(DrinkCoffeePosterTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
