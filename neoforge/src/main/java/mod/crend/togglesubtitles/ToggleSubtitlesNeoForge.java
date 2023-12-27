package mod.crend.togglesubtitles;

import mod.crend.togglesubtitles.ModKeyBindings;
import mod.crend.togglesubtitles.ToggleSubtitles;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.event.TickEvent;

@Mod(ToggleSubtitles.MOD_ID)
public class ToggleSubtitlesNeoForge {
	public ToggleSubtitlesNeoForge() { }

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
