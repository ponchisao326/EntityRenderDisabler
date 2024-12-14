package victorgponce.com.entityrenderdisabler.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import victorgponce.com.entityrenderdisabler.client.EntityrenderdisablerClient;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigHandler {
    private static final File CONFIG_FILE = new File("config/entity_render_disabler.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static ModMenuIntegration config = new ModMenuIntegration();

    public static void loadConfig() {
        if (CONFIG_FILE.exists()) {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                config = GSON.fromJson(reader, ModMenuIntegration.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            saveConfig(); // Crear archivo con valores por defecto
        }
    }


    public static void saveConfig() {
        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            GSON.toJson(config, writer);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // Captura cualquier excepción inesperada y muestra un mensaje
            System.err.println("[Entity Render Disabler] Error al guardar la configuración.");
            e.printStackTrace();
        }
    }


}
