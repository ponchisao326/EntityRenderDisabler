package com.victorgponce.entityrenderdisablerrewritefabric.client.config;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;

public class KeyRegistry {

    private static KeyBinding configKeyBinding;
    private static KeyBinding entityRenderToggle;
    private static final KeyBinding.Category ENTITY_RENDER_DISABLER_CAT = KeyBinding.Category.create(Identifier.of("entityrenderdisabler"));

    // Method to register KeyBindings
    public static void register() {
        // Register the KeyBinding for config
        configKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.entityrenderdisabler.openConfig",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                ENTITY_RENDER_DISABLER_CAT
        ));

        // Register the KeyBinding for toggling rendering
        entityRenderToggle = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.entityrenderdisabler.toggleRender",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_G,
                ENTITY_RENDER_DISABLER_CAT
        ));

        // Listener for key press detection
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (configKeyBinding.wasPressed()) {
                client.setScreen(YACLIntegration.createConfigScreen(client.currentScreen));
            }

            if (entityRenderToggle.wasPressed()) {
                // Toggle the global enabled state
                boolean newState = !ModConfig.isModEnabled();
                ModConfig.setModEnabled(newState);

                // Create the base text
                String togglerTextGet = Text.translatable("message.entityrenderdisabler.toggleRender").getString();
                MutableText togglerText = (MutableText) Text.of(togglerTextGet + " ");

                // Create the text part that changes (ON/OFF)
                String statusText = newState ? "ON" : "OFF";
                MutableText status = (MutableText) Text.of(statusText);

                // Apply color based on state
                if (newState) {
                    status.setStyle(status.getStyle().withColor(TextColor.fromRgb(0x55FF55))); // Green for "ON"
                } else {
                    status.setStyle(status.getStyle().withColor(TextColor.fromRgb(0xFF5555))); // Red for "OFF"
                }

                // Add the status part to the final message
                togglerText.append(status);

                // Send the message
                sendVanillaMessage(togglerText);
            }
        });
    }

    public static void sendVanillaMessage(MutableText message) {
        World world = MinecraftClient.getInstance().world;

        if (world != null) {
            MinecraftClient.getInstance().inGameHud.setOverlayMessage(message, false);
        }
    }
}