package victorgponce.com.entityrenderdisabler.mixin;

import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import victorgponce.com.entityrenderdisabler.config.ConfigHandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Mixin(EntityRenderer.class)
public abstract class EntityRenderMixin<T extends Entity> {

    // Crea un ExecutorService para manejar múltiples hilos.
    private static final ExecutorService executorService = Executors.newFixedThreadPool(2);

    @Inject(
            method = "shouldRender",
            at = @At("HEAD"),  // Inyectar antes de la ejecución
            cancellable = true
    )
    private void onRender(T entity, Frustum frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        if (!isRenderEnabled(entity) && ConfigHandler.config.modStatus) {
            // Si no debe renderizar, cancelamos el renderizado
            cir.cancel();
        }
    }

    private boolean isRenderEnabled(T entity) {
        // Usamos un hilo separado para obtener la configuración de renderizado
        try {
            Future<Boolean> future = executorService.submit(() -> checkRenderOption(entity));
            return future.get(); // Espera el resultado del hilo
        } catch (Exception e) {
            e.printStackTrace();
            return true; // Si algo falla, por defecto renderizamos la entidad
        }
    }

    private boolean checkRenderOption(T entity) {
        // Revisa la configuración en tiempo real
        switch (entity.getType().toString()) {
            case "entity.minecraft.allay": return ConfigHandler.config.allayOption;
            case "entity.minecraft.area_effect_cloud": return ConfigHandler.config.areaEffectCloudOption;
            case "entity.minecraft.armadillo": return ConfigHandler.config.armadilloOption;
            case "entity.minecraft.armor_stand": return ConfigHandler.config.armorStandOption;
            case "entity.minecraft.arrow": return ConfigHandler.config.arrowOption;
            case "entity.minecraft.axolotl": return ConfigHandler.config.axolotlOption;
            case "entity.minecraft.bat": return ConfigHandler.config.batOption;
            case "entity.minecraft.bee": return ConfigHandler.config.beeOption;
            case "entity.minecraft.blaze": return ConfigHandler.config.blazeOption;
            case "entity.minecraft.block_display": return ConfigHandler.config.blockDisplayOption;
            case "entity.minecraft.boat": return ConfigHandler.config.boatOption;
            case "entity.minecraft.camel": return ConfigHandler.config.camelOption;
            case "entity.minecraft.cat": return ConfigHandler.config.catOption;
            case "entity.minecraft.cave_spider": return ConfigHandler.config.caveSpiderOption;
            case "entity.minecraft.chest_boat": return ConfigHandler.config.chestBoatOption;
            case "entity.minecraft.chicken": return ConfigHandler.config.chickenOption;
            case "entity.minecraft.cod": return ConfigHandler.config.codOption;
            case "entity.minecraft.cow": return ConfigHandler.config.cowOption;
            case "entity.minecraft.creeper": return ConfigHandler.config.creeperOption;
            case "entity.minecraft.dolphin": return ConfigHandler.config.dolphinOption;
            case "entity.minecraft.donkey": return ConfigHandler.config.donkeyOption;
            case "entity.minecraft.drowned": return ConfigHandler.config.drownedOption;
            case "entity.minecraft.egg": return ConfigHandler.config.eggOption;
            case "entity.minecraft.elder_guardian": return ConfigHandler.config.elderGuardianOption;
            case "entity.minecraft.ender_dragon": return ConfigHandler.config.enderDragonOption;
            case "entity.minecraft.ender_pearl": return ConfigHandler.config.enderPearlOption;
            case "entity.minecraft.enderman": return ConfigHandler.config.endermanOption;
            case "entity.minecraft.endermite": return ConfigHandler.config.endermiteOption;
            case "entity.minecraft.evoker": return ConfigHandler.config.evokerOption;
            case "entity.minecraft.experience_bottle": return ConfigHandler.config.experienceBottleOption;
            case "entity.minecraft.experience_orb": return ConfigHandler.config.experienceOrbOption;
            case "entity.minecraft.firework_rocket": return ConfigHandler.config.fireworkRocketOption;
            case "entity.minecraft.fox": return ConfigHandler.config.foxOption;
            case "entity.minecraft.furnace_minecart": return ConfigHandler.config.furnaceMinecartOption;
            case "entity.minecraft.ghast": return ConfigHandler.config.ghastOption;
            case "entity.minecraft.giant": return ConfigHandler.config.giantOption;
            case "entity.minecraft.glow_item_frame": return ConfigHandler.config.glowItemFrameOption;
            case "entity.minecraft.glow_squid": return ConfigHandler.config.glowSquidOption;
            case "entity.minecraft.goat": return ConfigHandler.config.goatOption;
            case "entity.minecraft.guardian": return ConfigHandler.config.guardianOption;
            case "entity.minecraft.horse": return ConfigHandler.config.horseOption;
            case "entity.minecraft.husk": return ConfigHandler.config.huskOption;
            case "entity.minecraft.iron_golem": return ConfigHandler.config.ironGolemOption;
            case "entity.minecraft.item": return ConfigHandler.config.itemOption;
            case "entity.minecraft.llama": return ConfigHandler.config.llamaOption;
            case "entity.minecraft.magma_cube": return ConfigHandler.config.magmaCubeOption;
            case "entity.minecraft.minecart": return ConfigHandler.config.minecartOption;
            case "entity.minecraft.mooshroom": return ConfigHandler.config.mooshroomOption;
            case "entity.minecraft.mule": return ConfigHandler.config.muleOption;
            case "entity.minecraft.ocelot": return ConfigHandler.config.ocelotOption;
            case "entity.minecraft.panda": return ConfigHandler.config.pandaOption;
            case "entity.minecraft.parrot": return ConfigHandler.config.parrotOption;
            case "entity.minecraft.pig": return ConfigHandler.config.pigOption;
            case "entity.minecraft.piglin": return ConfigHandler.config.piglinOption;
            case "entity.minecraft.pillager": return ConfigHandler.config.pillagerOption;
            case "entity.minecraft.polar_bear": return ConfigHandler.config.polarBearOption;
            case "entity.minecraft.potion": return ConfigHandler.config.potionOption;
            case "entity.minecraft.pufferfish": return ConfigHandler.config.pufferfishOption;
            case "entity.minecraft.rabbit": return ConfigHandler.config.rabbitOption;
            case "entity.minecraft.ravager": return ConfigHandler.config.ravagerOption;
            case "entity.minecraft.salmon": return ConfigHandler.config.salmonOption;
            case "entity.minecraft.sheep": return ConfigHandler.config.sheepOption;
            case "entity.minecraft.shulker": return ConfigHandler.config.shulkerOption;
            case "entity.minecraft.skeleton": return ConfigHandler.config.skeletonOption;
            case "entity.minecraft.slime": return ConfigHandler.config.slimeOption;
            case "entity.minecraft.snow_golem": return ConfigHandler.config.snowGolemOption;
            case "entity.minecraft.snowball": return ConfigHandler.config.snowballOption;
            case "entity.minecraft.spider": return ConfigHandler.config.spiderOption;
            case "entity.minecraft.squid": return ConfigHandler.config.squidOption;
            case "entity.minecraft.stray": return ConfigHandler.config.strayOption;
            case "entity.minecraft.tnt": return ConfigHandler.config.tntOption;
            case "entity.minecraft.trader_llama": return ConfigHandler.config.traderLlamaOption;
            case "entity.minecraft.trident": return ConfigHandler.config.tridentOption;
            case "entity.minecraft.turtle": return ConfigHandler.config.turtleOption;
            case "entity.minecraft.villager": return ConfigHandler.config.villagerOption;
            case "entity.minecraft.vindicator": return ConfigHandler.config.vindicatorOption;
            case "entity.minecraft.warden": return ConfigHandler.config.wardenOption;
            case "entity.minecraft.witch": return ConfigHandler.config.witchOption;
            case "entity.minecraft.wither": return ConfigHandler.config.witherOption;
            case "entity.minecraft.wither_skeleton": return ConfigHandler.config.witherSkeletonOption;
            case "entity.minecraft.wolf": return ConfigHandler.config.wolfOption;
            case "entity.minecraft.zombie": return ConfigHandler.config.zombieOption;
            case "entity.minecraft.zombie_horse": return ConfigHandler.config.zombieHorseOption;
            case "entity.minecraft.zombie_villager": return ConfigHandler.config.zombieVillagerOption;
            case "entity.minecraft.zombified_piglin": return ConfigHandler.config.zombifiedPiglinOption;
            case "entity.minecraft.breeze_wind_charge": return ConfigHandler.config.breezeWindChargeOption;
            case "entity.minecraft.command_block_minecart": return ConfigHandler.config.commandBlockMinecartOption;
            case "entity.minecraft.dragon_fireball": return ConfigHandler.config.dragonFireballOption;
            case "entity.minecraft.end_crystal": return ConfigHandler.config.endCrystalOption;
            case "entity.minecraft.eye_of_ender": return ConfigHandler.config.eyeOfEnderOption;
            case "entity.minecraft.fireball": return ConfigHandler.config.fireballOption;
            case "entity.minecraft.item_display": return ConfigHandler.config.itemDisplayOption;
            case "entity.minecraft.item_frame": return ConfigHandler.config.itemFrameOption;
            case "entity.minecraft.leash_knot": return ConfigHandler.config.leashKnotOption;
            case "entity.minecraft.lightning_bolt": return ConfigHandler.config.lightningBoltOption;
            case "entity.minecraft.llama_spit": return ConfigHandler.config.llamaSpitOption;
            case "entity.minecraft.marker": return ConfigHandler.config.markerOption;
            case "entity.minecraft.ominous_item_spawner": return ConfigHandler.config.ominousItemSpawnerOption;
            case "entity.minecraft.spectral_arrow": return ConfigHandler.config.spectralArrowOption;
            case "entity.minecraft.strider": return ConfigHandler.config.striderOption;
            case "entity.minecraft.tadpole": return ConfigHandler.config.tadpoleOption;
            case "entity.minecraft.text_display": return ConfigHandler.config.textDisplayOption;
            case "entity.minecraft.tnt_minecart": return ConfigHandler.config.tntMinecartOption;
            case "entity.minecraft.wandering_trader": return ConfigHandler.config.wanderingTraderOption;
            case "entity.minecraft.wind_charge": return ConfigHandler.config.windChargeOption;
            case "entity.minecraft.wither_skull": return ConfigHandler.config.witherSkullOption;
            case "entity.minecraft.fishing_bobber": return ConfigHandler.config.fishingBobberOption;
            default: return true;
        }
    }
}
