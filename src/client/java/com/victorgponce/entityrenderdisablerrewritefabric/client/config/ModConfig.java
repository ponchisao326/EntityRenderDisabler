package com.victorgponce.entityrenderdisablerrewritefabric.client.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.victorgponce.entityrenderdisablerrewritefabric.client.EntityrenderdisablerrewritefabricClient;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ModConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File CONFIG_FILE = FabricLoader.getInstance().getConfigDir()
            .resolve(EntityrenderdisablerrewritefabricClient.MOD_ID + ".json").toFile();
    private static boolean modEnabled = true;

    // Map of entity ID to render state (true = render, false = don't render)
    private static Map<String, Boolean> entityRenderStates = new HashMap<>();

    public static boolean isEntityVisible(String entityId) {
        return entityRenderStates.getOrDefault(entityId, true);
    }

    public static void setEntityVisible(String entityId, boolean visible) {
        entityRenderStates.put(entityId, visible);
        save();
    }

    public static boolean isModEnabled() {
        return modEnabled;
    }

    public static void setModEnabled(boolean enabled) {
        modEnabled = enabled;
        save();
    }

    public static void load() {
        try {
            if (CONFIG_FILE.exists()) {
                JsonObject json = GSON.fromJson(new FileReader(CONFIG_FILE), JsonObject.class);

                // Load the mod enabled state if present
                if (json.has("modEnabled")) {
                    modEnabled = json.get("modEnabled").getAsBoolean();
                }

                // Load entity states
                Type type = new TypeToken<Map<String, Boolean>>() {}.getType();
                if (json.has("entities")) {
                    entityRenderStates = GSON.fromJson(json.get("entities"), type);
                } else {
                    entityRenderStates = new HashMap<>();
                }
            } else {
                entityRenderStates = new HashMap<>();
                save(); // Create default config
            }
        } catch (IOException e) {
            EntityrenderdisablerrewritefabricClient.LOGGER.error("Failed to load config", e);
            entityRenderStates = new HashMap<>();
        }
    }

    public static void save() {
        try {
            CONFIG_FILE.getParentFile().mkdirs();
            try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
                JsonObject json = new JsonObject();
                json.addProperty("modEnabled", modEnabled);
                json.add("entities", GSON.toJsonTree(entityRenderStates));
                GSON.toJson(json, writer);
            }
        } catch (IOException e) {
            EntityrenderdisablerrewritefabricClient.LOGGER.error("Failed to save config", e);
        }
    }

    // Actually not used, added for good practice
    public static Map<String, Boolean> getEntityRenderStates() {
        return entityRenderStates;
    }
}