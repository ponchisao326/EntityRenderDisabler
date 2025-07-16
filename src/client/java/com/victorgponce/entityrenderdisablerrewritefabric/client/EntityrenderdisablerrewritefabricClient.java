package com.victorgponce.entityrenderdisablerrewritefabric.client;

import com.victorgponce.entityrenderdisablerrewritefabric.client.config.KeyRegistry;
import com.victorgponce.entityrenderdisablerrewritefabric.client.config.ModConfig;
import com.victorgponce.entityrenderdisablerrewritefabric.client.config.YACLIntegration;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.TreeMap;

public class EntityrenderdisablerrewritefabricClient implements ClientModInitializer {

    public static final String MOD_ID = "entityrenderdisabler";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Map of entities grouped by mod
    private static Map<String, Map<String, EntityType<?>>> entitiesByMod;

    @Override
    public void onInitializeClient() {
        // Initialize config
        ModConfig.load();

        // Collect and group entities
        collectEntities();

        // Register YACL config
        YACLIntegration.register(entitiesByMod);

        // Register key binding for config screen
        KeyRegistry.register();

        LOGGER.info("Entity Render Disabler initialized");
    }

    private void collectEntities() {
        entitiesByMod = new TreeMap<>();

        Registries.ENTITY_TYPE.forEach(entityType -> {
            Identifier id = Registries.ENTITY_TYPE.getId(entityType);
            String modId = id.getNamespace();
            String entityId = id.toString();

            entitiesByMod.putIfAbsent(modId, new TreeMap<>());
            entitiesByMod.get(modId).put(entityId, entityType);
        });
    }

    public static Map<String, Map<String, EntityType<?>>> getEntitiesByMod() {
        return entitiesByMod;
    }
}