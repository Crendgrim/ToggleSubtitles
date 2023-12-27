package mod.crend.togglesubtitles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public class ToggleSubtitlesFabric implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		KeyBindingHelper.registerKeyBinding(ModKeyBindings.TOGGLE_SUBTITLES);
		ClientTickEvents.END_CLIENT_TICK.register(ModKeyBindings::clientTick);
	}
}
