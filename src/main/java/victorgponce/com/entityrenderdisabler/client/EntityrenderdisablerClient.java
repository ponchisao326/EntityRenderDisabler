    package victorgponce.com.entityrenderdisabler.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.slf4j.LoggerFactory;
import victorgponce.com.entityrenderdisabler.config.ConfigHandler;

import java.util.HashMap;
import java.util.Map;

    public class EntityrenderdisablerClient implements ClientModInitializer {

    public static final String MOD_ID_CLIENT = "entityrenderdisabler";
    public static final Logger LOGGER_CLIENT = LoggerFactory.getLogger(MOD_ID_CLIENT);
    public static EntityrenderdisablerClient INSTANCE;

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        LOGGER_CLIENT.info("[Entity Render Disabler] The mod is being initialized");
        LOGGER_CLIENT.info("[Entity Render Disabler] Created by Ponchisao326");

        // Cargamos la configuración
        ConfigHandler.loadConfig();
    }

    public void reloadConfig() {
        ConfigHandler.loadConfig();
        LOGGER_CLIENT.info("[Entity Render Disabler] Configuration reloaded.");
    }
}
