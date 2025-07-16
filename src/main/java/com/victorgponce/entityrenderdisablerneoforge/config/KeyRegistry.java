package com.victorgponce.entityrenderdisablerneoforge.config;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

@EventBusSubscriber(value = Dist.CLIENT)
public class KeyRegistry {

    private static KeyMapping configKeyBinding;
    private static KeyMapping entityRenderToggle;

    @EventBusSubscriber(value = Dist.CLIENT)
    public static class KeyRegistration {
        @SubscribeEvent
        public static void registerKeyBindings(RegisterKeyMappingsEvent event) {
            // Register the KeyBinding for config
            configKeyBinding = new KeyMapping(
                    "key.entityrenderdisabler.openConfig",
                    GLFW.GLFW_KEY_O,
                    "category.entityrenderdisabler"
            );
            event.register(configKeyBinding);

            // Register the KeyBinding for toggling rendering
            entityRenderToggle = new KeyMapping(
                    "key.entityrenderdisabler.toggleRender",
                    GLFW.GLFW_KEY_G,
                    "category.entityrenderdisabler"
            );
            event.register(entityRenderToggle);
        }
    }

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        if (configKeyBinding.consumeClick()) {
            Minecraft.getInstance().setScreen(YACLIntegration.createConfigScreen(Minecraft.getInstance().screen));
        }

        if (entityRenderToggle.consumeClick()) {
            // Toggle the global enabled state
            boolean newState = !ModConfig.isModEnabled();
            ModConfig.setModEnabled(newState);

            // Create the base text
            String togglerTextGet = Component.translatable("message.entityrenderdisabler.toggleRender").getString();
            MutableComponent togglerText = Component.literal(togglerTextGet + " ");

            // Create the text part that changes (ON/OFF)
            String statusText = newState ? "ON" : "OFF";
            MutableComponent status = Component.literal(statusText);

            // Apply color based on state
            if (newState) {
                status.withStyle(ChatFormatting.GREEN); // Green for "ON"
            } else {
                status.withStyle(ChatFormatting.RED); // Red for "OFF"
            }

            // Add the status part to the final message
            togglerText.append(status);

            // Send the message
            sendVanillaMessage(togglerText);
        }
    }

    public static void sendVanillaMessage(MutableComponent message) {
        Level world = Minecraft.getInstance().level;

        if (world != null) {
            Minecraft.getInstance().gui.setOverlayMessage(message, false);
        }
    }
}