    package victorgponce.com.entityrenderdisabler.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.slf4j.LoggerFactory;
import victorgponce.com.entityrenderdisabler.config.ConfigHandler;

    public class EntityrenderdisablerClient implements ClientModInitializer {

    public static final String MOD_ID_CLIENT = "entityrenderdisabler";
    public static final Logger LOGGER_CLIENT = LoggerFactory.getLogger(MOD_ID_CLIENT);

    @Override
    public void onInitializeClient() {
        LOGGER_CLIENT.info("[Entity Render Disabler] The mod is being initialized");
        LOGGER_CLIENT.info("[Entity Render Disabler] Created by Ponchisao326");

        // Cargamos la configuración
        ConfigHandler.loadConfig();

        // Se registra el piglin
        EntityRendererRegistry.register(EntityType.PIGLIN, NoRenderEntityRenderer::new);
    }

    private static class NoRenderEntityRenderer<T extends Entity> extends EntityRenderer<T> {
        protected NoRenderEntityRenderer(EntityRendererFactory.Context context) {
            super(context);
        }

        @Override
        public void render(T entity, float yaw, float tickDelta, MatrixStack matrices, net.minecraft.client.render.VertexConsumerProvider vertexConsumers, int light) {
            // Se deshabilida el render.

        }

        @Override
        public Identifier getTexture(T entity) {
            return null; // Quitamos la textura pues no se renderiza.
        }
    }
}
