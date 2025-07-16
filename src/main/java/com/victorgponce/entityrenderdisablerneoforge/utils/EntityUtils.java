package com.victorgponce.entityrenderdisablerneoforge.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EntityUtils {
    /**
     * Formats entity ID like "minecraft:zombie" to "Zombie"
     */
    public static String formatEntityName(String entityId) {
        // Extract just the entity name part (after the colon)
        String name = entityId.substring(entityId.lastIndexOf(':') + 1);
        return formatName(name);
    }

    /**
     * Formats mod ID like "minecraft" to "Minecraft"
     */
    public static String formatModName(String modId) {
        return formatName(modId);
    }

    /**
     * Helper method to format names by capitalizing each word
     */
    private static String formatName(String name) {
        // Replace underscores with spaces and capitalize words
        return Arrays.stream(name.split("_"))
                .map(word -> word.isEmpty() ? "" :
                        word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}