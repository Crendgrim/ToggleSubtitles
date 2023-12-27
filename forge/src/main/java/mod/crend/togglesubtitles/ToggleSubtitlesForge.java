package mod.crend.togglesubtitles;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(ToggleSubtitles.MOD_ID)
public class ToggleSubtitlesForge {
	public ToggleSubtitlesForge() { }

	@Mod.EventBusSubscriber(value = Dist.CLIENT)
	public static class ClientEventBusSubscriber {
		@SubscribeEvent
		static void onClientTick(TickEvent.ClientTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				ModKeyBindings.clientTick(Minecraft.getInstance());
			}
		}
	}

	@Mod.EventBusSubscriber(modid = ToggleSubtitles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ModEventBusSubscriber {
		@SubscribeEvent
		static void onKeyMappingsRegister(RegisterKeyMappingsEvent event) {
			event.register(ModKeyBindings.TOGGLE_SUBTITLES);
		}
	}
}
