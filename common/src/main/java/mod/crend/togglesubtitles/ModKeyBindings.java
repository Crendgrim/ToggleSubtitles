package mod.crend.togglesubtitles;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class ModKeyBindings {
	public static final KeyMapping TOGGLE_SUBTITLES = new KeyMapping(
			"key.togglesubtitles.toggle-subtitles",
			InputConstants.Type.KEYSYM,
			GLFW.GLFW_KEY_I,
			KeyMapping.CATEGORY_MISC
	);


	public static void clientTick(Minecraft instance) {
		while (TOGGLE_SUBTITLES.consumeClick()) {
			ToggleSubtitles.toggle(instance);
		}
	}
}
