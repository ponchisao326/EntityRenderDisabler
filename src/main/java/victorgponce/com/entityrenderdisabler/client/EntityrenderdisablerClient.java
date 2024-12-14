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

import java.util.HashMap;
import java.util.Map;

    public class EntityrenderdisablerClient implements ClientModInitializer {

    public static final String MOD_ID_CLIENT = "entityrenderdisabler";
    public static final Logger LOGGER_CLIENT = LoggerFactory.getLogger(MOD_ID_CLIENT);

    @Override
    public void onInitializeClient() {
        LOGGER_CLIENT.info("[Entity Render Disabler] The mod is being initialized");
        LOGGER_CLIENT.info("[Entity Render Disabler] Created by Ponchisao326");

        // Cargamos la configuración
        ConfigHandler.loadConfig();

        // Registra los entity renderers basandose en la config
        registerEntityRenderers();
    }

        private void registerEntityRenderers() {
            Map<EntityType<?>, Boolean> entityConfigMap = new HashMap<>();

            entityConfigMap.put(EntityType.ALLAY, ConfigHandler.config.allayOption);
            entityConfigMap.put(EntityType.AREA_EFFECT_CLOUD, ConfigHandler.config.areaEffectCloudOption);
            entityConfigMap.put(EntityType.ARMADILLO, ConfigHandler.config.armadilloOption);
            entityConfigMap.put(EntityType.ARMOR_STAND, ConfigHandler.config.armorStandOption);
            entityConfigMap.put(EntityType.ARROW, ConfigHandler.config.arrowOption);
            entityConfigMap.put(EntityType.AXOLOTL, ConfigHandler.config.axolotlOption);
            entityConfigMap.put(EntityType.BAT, ConfigHandler.config.batOption);
            entityConfigMap.put(EntityType.BEE, ConfigHandler.config.beeOption);
            entityConfigMap.put(EntityType.BLAZE, ConfigHandler.config.blazeOption);
            entityConfigMap.put(EntityType.BLOCK_DISPLAY, ConfigHandler.config.blockDisplayOption);
            entityConfigMap.put(EntityType.BOAT, ConfigHandler.config.boatOption);
            entityConfigMap.put(EntityType.CAMEL, ConfigHandler.config.camelOption);
            entityConfigMap.put(EntityType.CAT, ConfigHandler.config.catOption);
            entityConfigMap.put(EntityType.CAVE_SPIDER, ConfigHandler.config.caveSpiderOption);
            entityConfigMap.put(EntityType.CHEST_BOAT, ConfigHandler.config.chestBoatOption);
            entityConfigMap.put(EntityType.CHICKEN, ConfigHandler.config.chickenOption);
            entityConfigMap.put(EntityType.COD, ConfigHandler.config.codOption);
            entityConfigMap.put(EntityType.COW, ConfigHandler.config.cowOption);
            entityConfigMap.put(EntityType.CREEPER, ConfigHandler.config.creeperOption);
            entityConfigMap.put(EntityType.DOLPHIN, ConfigHandler.config.dolphinOption);
            entityConfigMap.put(EntityType.DONKEY, ConfigHandler.config.donkeyOption);
            entityConfigMap.put(EntityType.DROWNED, ConfigHandler.config.drownedOption);
            entityConfigMap.put(EntityType.EGG, ConfigHandler.config.eggOption);
            entityConfigMap.put(EntityType.ELDER_GUARDIAN, ConfigHandler.config.elderGuardianOption);
            entityConfigMap.put(EntityType.ENDER_DRAGON, ConfigHandler.config.enderDragonOption);
            entityConfigMap.put(EntityType.ENDER_PEARL, ConfigHandler.config.enderPearlOption);
            entityConfigMap.put(EntityType.ENDERMAN, ConfigHandler.config.endermanOption);
            entityConfigMap.put(EntityType.ENDERMITE, ConfigHandler.config.endermiteOption);
            entityConfigMap.put(EntityType.EVOKER, ConfigHandler.config.evokerOption);
            entityConfigMap.put(EntityType.EXPERIENCE_BOTTLE, ConfigHandler.config.experienceBottleOption);
            entityConfigMap.put(EntityType.EXPERIENCE_ORB, ConfigHandler.config.experienceOrbOption);
            entityConfigMap.put(EntityType.FIREWORK_ROCKET, ConfigHandler.config.fireworkRocketOption);
            entityConfigMap.put(EntityType.FOX, ConfigHandler.config.foxOption);
            entityConfigMap.put(EntityType.FURNACE_MINECART, ConfigHandler.config.furnaceMinecartOption);
            entityConfigMap.put(EntityType.GHAST, ConfigHandler.config.ghastOption);
            entityConfigMap.put(EntityType.GIANT, ConfigHandler.config.giantOption);
            entityConfigMap.put(EntityType.GLOW_ITEM_FRAME, ConfigHandler.config.glowItemFrameOption);
            entityConfigMap.put(EntityType.GLOW_SQUID, ConfigHandler.config.glowSquidOption);
            entityConfigMap.put(EntityType.GOAT, ConfigHandler.config.goatOption);
            entityConfigMap.put(EntityType.GUARDIAN, ConfigHandler.config.guardianOption);
            entityConfigMap.put(EntityType.HORSE, ConfigHandler.config.horseOption);
            entityConfigMap.put(EntityType.HUSK, ConfigHandler.config.huskOption);
            entityConfigMap.put(EntityType.IRON_GOLEM, ConfigHandler.config.ironGolemOption);
            entityConfigMap.put(EntityType.ITEM, ConfigHandler.config.itemOption);
            entityConfigMap.put(EntityType.LLAMA, ConfigHandler.config.llamaOption);
            entityConfigMap.put(EntityType.MAGMA_CUBE, ConfigHandler.config.magmaCubeOption);
            entityConfigMap.put(EntityType.MINECART, ConfigHandler.config.minecartOption);
            entityConfigMap.put(EntityType.MOOSHROOM, ConfigHandler.config.mooshroomOption);
            entityConfigMap.put(EntityType.MULE, ConfigHandler.config.muleOption);
            entityConfigMap.put(EntityType.OCELOT, ConfigHandler.config.ocelotOption);
            entityConfigMap.put(EntityType.PANDA, ConfigHandler.config.pandaOption);
            entityConfigMap.put(EntityType.PARROT, ConfigHandler.config.parrotOption);
            entityConfigMap.put(EntityType.PIG, ConfigHandler.config.pigOption);
            entityConfigMap.put(EntityType.PIGLIN, ConfigHandler.config.piglinOption);
            entityConfigMap.put(EntityType.PILLAGER, ConfigHandler.config.pillagerOption);
            entityConfigMap.put(EntityType.POLAR_BEAR, ConfigHandler.config.polarBearOption);
            entityConfigMap.put(EntityType.POTION, ConfigHandler.config.potionOption);
            entityConfigMap.put(EntityType.PUFFERFISH, ConfigHandler.config.pufferfishOption);
            entityConfigMap.put(EntityType.RABBIT, ConfigHandler.config.rabbitOption);
            entityConfigMap.put(EntityType.RAVAGER, ConfigHandler.config.ravagerOption);
            entityConfigMap.put(EntityType.SALMON, ConfigHandler.config.salmonOption);
            entityConfigMap.put(EntityType.SHEEP, ConfigHandler.config.sheepOption);
            entityConfigMap.put(EntityType.SHULKER, ConfigHandler.config.shulkerOption);
            entityConfigMap.put(EntityType.SKELETON, ConfigHandler.config.skeletonOption);
            entityConfigMap.put(EntityType.SLIME, ConfigHandler.config.slimeOption);
            entityConfigMap.put(EntityType.SNOW_GOLEM, ConfigHandler.config.snowGolemOption);
            entityConfigMap.put(EntityType.SNOWBALL, ConfigHandler.config.snowballOption);
            entityConfigMap.put(EntityType.SPIDER, ConfigHandler.config.spiderOption);
            entityConfigMap.put(EntityType.SQUID, ConfigHandler.config.squidOption);
            entityConfigMap.put(EntityType.STRAY, ConfigHandler.config.strayOption);
            entityConfigMap.put(EntityType.TNT, ConfigHandler.config.tntOption);
            entityConfigMap.put(EntityType.TRADER_LLAMA, ConfigHandler.config.traderLlamaOption);
            entityConfigMap.put(EntityType.TRIDENT, ConfigHandler.config.tridentOption);
            entityConfigMap.put(EntityType.TURTLE, ConfigHandler.config.turtleOption);
            entityConfigMap.put(EntityType.VILLAGER, ConfigHandler.config.villagerOption);
            entityConfigMap.put(EntityType.VINDICATOR, ConfigHandler.config.vindicatorOption);
            entityConfigMap.put(EntityType.WARDEN, ConfigHandler.config.wardenOption);
            entityConfigMap.put(EntityType.WITCH, ConfigHandler.config.witchOption);
            entityConfigMap.put(EntityType.WITHER, ConfigHandler.config.witherOption);
            entityConfigMap.put(EntityType.WITHER_SKELETON, ConfigHandler.config.witherSkeletonOption);
            entityConfigMap.put(EntityType.WOLF, ConfigHandler.config.wolfOption);
            entityConfigMap.put(EntityType.ZOMBIE, ConfigHandler.config.zombieOption);
            entityConfigMap.put(EntityType.ZOMBIE_HORSE, ConfigHandler.config.zombieHorseOption);
            entityConfigMap.put(EntityType.ZOMBIE_VILLAGER, ConfigHandler.config.zombieVillagerOption);
            entityConfigMap.put(EntityType.ZOMBIFIED_PIGLIN, ConfigHandler.config.zombifiedPiglinOption);
            entityConfigMap.put(EntityType.BREEZE_WIND_CHARGE, ConfigHandler.config.breezeWindChargeOption);
            entityConfigMap.put(EntityType.COMMAND_BLOCK_MINECART, ConfigHandler.config.commandBlockMinecartOption);
            entityConfigMap.put(EntityType.DRAGON_FIREBALL, ConfigHandler.config.dragonFireballOption);
            entityConfigMap.put(EntityType.END_CRYSTAL, ConfigHandler.config.endCrystalOption);
            entityConfigMap.put(EntityType.EYE_OF_ENDER, ConfigHandler.config.eyeOfEnderOption);
            entityConfigMap.put(EntityType.FIREBALL, ConfigHandler.config.fireballOption);
            entityConfigMap.put(EntityType.ITEM_DISPLAY, ConfigHandler.config.itemDisplayOption);
            entityConfigMap.put(EntityType.ITEM_FRAME, ConfigHandler.config.itemFrameOption);
            entityConfigMap.put(EntityType.LEASH_KNOT, ConfigHandler.config.leashKnotOption);
            entityConfigMap.put(EntityType.LIGHTNING_BOLT, ConfigHandler.config.lightningBoltOption);
            entityConfigMap.put(EntityType.LLAMA_SPIT, ConfigHandler.config.llamaSpitOption);
            entityConfigMap.put(EntityType.MARKER, ConfigHandler.config.markerOption);
            entityConfigMap.put(EntityType.OMINOUS_ITEM_SPAWNER, ConfigHandler.config.ominousItemSpawnerOption);
            entityConfigMap.put(EntityType.SPECTRAL_ARROW, ConfigHandler.config.spectralArrowOption);
            entityConfigMap.put(EntityType.STRIDER, ConfigHandler.config.striderOption);
            entityConfigMap.put(EntityType.TADPOLE, ConfigHandler.config.tadpoleOption);
            entityConfigMap.put(EntityType.TEXT_DISPLAY, ConfigHandler.config.textDisplayOption);
            entityConfigMap.put(EntityType.TNT_MINECART, ConfigHandler.config.tntMinecartOption);
            entityConfigMap.put(EntityType.WANDERING_TRADER, ConfigHandler.config.wanderingTraderOption);
            entityConfigMap.put(EntityType.WIND_CHARGE, ConfigHandler.config.windChargeOption);
            entityConfigMap.put(EntityType.WITHER_SKULL, ConfigHandler.config.witherSkullOption);
            entityConfigMap.put(EntityType.FISHING_BOBBER, ConfigHandler.config.fishingBobberOption);

            // Itera sobre el mapa para registrar los renderizadores
            entityConfigMap.forEach((entityType, isEnabled) -> {
                if (!isEnabled) {
                    EntityRendererRegistry.register(entityType, NoRenderEntityRenderer::new);
                }
            });
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
