package victorgponce.com.entityrenderdisabler.config;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;
import victorgponce.com.entityrenderdisabler.screens.ConfigScreen;

public class KeyRegistry {

    private static KeyBinding openConfigKey;
    private static KeyBinding entityRenderToggle;

    // Método para registrar los KeyBindings
    public static void register() {
        // Registrar el KeyBinding
        openConfigKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.entityrenderdisabler.openConfig",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                "category.entityrenderdisabler"
        ));

        entityRenderToggle = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.entityrenderdisabler.toggleRender",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_G,
                "category.entityrenderdisabler"
        ));

        // Listener para detectar cuando se presiona la tecla
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (openConfigKey.wasPressed()) {
                if (client != null) {
                    client.setScreen(new ConfigScreen());
                }
            }

            if (entityRenderToggle.wasPressed()) {
                ConfigHandler.config.modStatus = !ConfigHandler.config.modStatus;
                ConfigHandler.saveConfig();

                // Crear el texto base
                String togglerTextGet = Text.translatable("message.entityrenderdisabler.toggleRender").getString();
                MutableText togglerText = (MutableText) Text.of(togglerTextGet + " ");

                // Crear la parte del texto que cambia (true o false)
                String statusText = ConfigHandler.config.modStatus ? "TRUE" : "FALSE";
                MutableText status = (MutableText) Text.of(statusText);

                // Aplicar el color al texto según el estado
                if (ConfigHandler.config.modStatus) {
                    status.setStyle(status.getStyle().withColor(TextColor.fromRgb(0x55FF55))); // Verde para "TRUE"
                } else {
                    status.setStyle(status.getStyle().withColor(TextColor.fromRgb(0xFF5555))); // Rojo para "FALSE"
                }

                // Añadir la parte del texto que cambia (TRUE/FALSE) al mensaje final
                togglerText.append(status);

                // Enviar el mensaje
                sendVanillaMessage(togglerText);
            }
        });
    }

    public static void sendVanillaMessage(MutableText message)
    {
        World world = MinecraftClient.getInstance().world;

        if (world != null)
        {
            MinecraftClient.getInstance().inGameHud.setOverlayMessage(message, false);
        }
    }
}
