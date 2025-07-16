package com.victorgponce.entityrenderdisablerrewritefabric.client.config;

import com.victorgponce.entityrenderdisablerrewritefabric.client.EntityrenderdisablerrewritefabricClient;
import com.victorgponce.entityrenderdisablerrewritefabric.client.utils.EntityUtils;
import dev.isxander.yacl3.api.*;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EntityType;
import net.minecraft.text.Text;

import java.util.Map;

public class YACLIntegration {
    // The register method is just for initialization purposes
    public static void register(Map<String, Map<String, EntityType<?>>> entitiesByMod) {
        // Just Crickets
    }

    public static Screen createConfigScreen(Screen parent) {
        // Create a fresh configuration instance each time
        return buildConfig().generateScreen(parent);
    }

    private static YetAnotherConfigLib buildConfig() {
        // Get entities from the client class
        Map<String, Map<String, EntityType<?>>> entitiesByMod =
                EntityrenderdisablerrewritefabricClient.getEntitiesByMod();

        // Create a new builder
        YetAnotherConfigLib.Builder builder = YetAnotherConfigLib.createBuilder()
                .title(Text.translatable("config.entityrenderdisabler.title"))
                .save(ModConfig::save);

        // Add categories for each mod
        for (Map.Entry<String, Map<String, EntityType<?>>> modEntry : entitiesByMod.entrySet()) {
            String modId = modEntry.getKey();
            Map<String, EntityType<?>> entities = modEntry.getValue();

            // Skip if mod has no entities
            if (entities.isEmpty()) continue;

            // Create category for current mod
            ConfigCategory.Builder categoryBuilder = ConfigCategory.createBuilder()
                    .name(Text.literal(EntityUtils.formatModName(modId)));

            // Create option group for current mod's entities
            OptionGroup.Builder groupBuilder = OptionGroup.createBuilder()
                    .name(Text.literal(EntityUtils.formatModName(modId) + " Entities"));

            // Add options for each entity
            for (Map.Entry<String, EntityType<?>> entityEntry : entities.entrySet()) {
                String entityId = entityEntry.getKey();

                Option<Boolean> option = Option.<Boolean>createBuilder()
                        .name(Text.literal(EntityUtils.formatEntityName(entityId)))
                        .description(OptionDescription.of(Text.translatable("config.entityrenderdisabler.description")))
                        .binding(
                                true,
                                () -> ModConfig.isEntityVisible(entityId),
                                value -> ModConfig.setEntityVisible(entityId, value)
                        )
                        .controller(TickBoxControllerBuilder::create)
                        .build();

                groupBuilder.option(option);
            }

            categoryBuilder.group(groupBuilder.build());
            builder.category(categoryBuilder.build());
        }

        return builder.build();
    }
}