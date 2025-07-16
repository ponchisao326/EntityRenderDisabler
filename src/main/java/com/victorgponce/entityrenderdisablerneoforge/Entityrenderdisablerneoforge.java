package com.victorgponce.entityrenderdisablerneoforge;

import com.mojang.logging.LogUtils;
import com.victorgponce.entityrenderdisablerneoforge.config.ModConfig;
import com.victorgponce.entityrenderdisablerneoforge.config.YACLIntegration;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.slf4j.Logger;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

@Mod(Entityrenderdisablerneoforge.MODID)
public class Entityrenderdisablerneoforge {
    public static final String MODID = "entityrenderdisablerneoforge";
    public static final Logger LOGGER = LogUtils.getLogger();

    // Map to store entities grouped by mod
    public static final Map<String, Map<String, EntityType<?>>> entitiesByMod = new ConcurrentHashMap<>();

    public Entityrenderdisablerneoforge(IEventBus modEventBus, ModContainer modContainer) {
        // Initialize config
        ModConfig.load();

        // Register client setup
        modEventBus.addListener(this::clientSetup);

        // Register YACL config
        YACLIntegration.register(entitiesByMod);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // Collect all entity types and organize by mod
            BuiltInRegistries.ENTITY_TYPE.forEach(entityType -> {
                ResourceLocation id = BuiltInRegistries.ENTITY_TYPE.getKey(entityType);
                String modId = id.getNamespace();
                String entityId = id.toString();

                entitiesByMod.putIfAbsent(modId, new TreeMap<>());
                entitiesByMod.get(modId).put(entityId, entityType);
            });

            LOGGER.info("Entity Render Disabler loaded with {} mods containing entities", entitiesByMod.size());
        });
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Entity Render Disabler client setup");
        }

        @SubscribeEvent
        public static void registerKeyMappings(RegisterKeyMappingsEvent event) {

        }
    }

    public static Map<String, Map<String, EntityType<?>>> getEntitiesByMod() {
        return entitiesByMod;
    }
}