package net.mcreator.votv.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.votv.init.VotvModBlockEntities;
import net.mcreator.votv.block.renderer.DrinkCoffeePosterTileRenderer;
import net.mcreator.votv.VotvMod;

@Mod.EventBusSubscriber(modid = VotvMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(VotvModBlockEntities.DRINK_COFFEE_POSTER.get(), DrinkCoffeePosterTileRenderer::new);
	}
}
