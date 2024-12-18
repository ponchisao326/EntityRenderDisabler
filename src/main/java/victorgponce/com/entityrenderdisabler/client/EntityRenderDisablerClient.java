package victorgponce.com.entityrenderdisabler.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import victorgponce.com.entityrenderdisabler.config.ConfigHandler;
import victorgponce.com.entityrenderdisabler.config.KeyRegistry;

public class EntityRenderDisablerClient implements ClientModInitializer {

    public static final String MOD_ID_CLIENT = "entityrenderdisabler";
    public static final Logger LOGGER_CLIENT = LoggerFactory.getLogger(MOD_ID_CLIENT);
    public static EntityRenderDisablerClient INSTANCE;

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        LOGGER_CLIENT.info("[Entity Render Disabler] The mod is being initialized");
        LOGGER_CLIENT.info("[Entity Render Disabler] Created by Ponchisao326");

        // Cargamos la configuración
        ConfigHandler.loadConfig();
        KeyRegistry.register();
    }

    public void reloadConfig() {
        ConfigHandler.loadConfig();
        LOGGER_CLIENT.info("[Entity Render Disabler] Configuration reloaded.");
    }
}
