package mod.crend.togglesubtitles;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public class ToggleSubtitles {
	public static final String MOD_ID = "togglesubtitles";

	private static final Component ON = Component.translatable("togglesubtitles.enabled").withStyle(ChatFormatting.GREEN);
	private static final Component OFF = Component.translatable("togglesubtitles.disabled").withStyle(ChatFormatting.RED);

	public static void toggle(Minecraft instance) {
		boolean active = !instance.options.showSubtitles().get();
		instance.options.showSubtitles().set(active);
		instance.player.displayClientMessage(Component.translatable("togglesubtitles.toggled_subtitles", active ? ON : OFF), true);
	}
}
