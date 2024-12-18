package victorgponce.com.entityrenderdisabler.config;

import dev.isxander.yacl3.api.*;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ConfigKeyIntegration {

    public boolean allayOption = true;
    public boolean areaEffectCloudOption = true;
    public boolean armadilloOption = true;
    public boolean armorStandOption = true;
    public boolean arrowOption = true;
    public boolean axolotlOption = true;
    public boolean batOption = true;
    public boolean beeOption = true;
    public boolean blazeOption = true;
    public boolean blockDisplayOption = true;
    public boolean boatOption = true;
    public boolean camelOption = true;
    public boolean catOption = true;
    public boolean caveSpiderOption = true;
    public boolean chestBoatOption = true;
    public boolean chickenOption = true;
    public boolean codOption = true;
    public boolean cowOption = true;
    public boolean creeperOption = true;
    public boolean dolphinOption = true;
    public boolean donkeyOption = true;
    public boolean drownedOption = true;
    public boolean eggOption = true;
    public boolean elderGuardianOption = true;
    public boolean enderDragonOption = true;
    public boolean enderPearlOption = true;
    public boolean endermanOption = true;
    public boolean endermiteOption = true;
    public boolean evokerOption = true;
    public boolean experienceBottleOption = true;
    public boolean experienceOrbOption = true;
    public boolean fireworkRocketOption = true;
    public boolean foxOption = true;
    public boolean furnaceMinecartOption = true;
    public boolean ghastOption = true;
    public boolean giantOption = true;
    public boolean glowItemFrameOption = true;
    public boolean glowSquidOption = true;
    public boolean goatOption = true;
    public boolean guardianOption = true;
    public boolean horseOption = true;
    public boolean huskOption = true;
    public boolean ironGolemOption = true;
    public boolean itemOption = true;
    public boolean llamaOption = true;
    public boolean magmaCubeOption = true;
    public boolean minecartOption = true;
    public boolean mooshroomOption = true;
    public boolean muleOption = true;
    public boolean ocelotOption = true;
    public boolean pandaOption = true;
    public boolean parrotOption = true;
    public boolean pigOption = true;
    public boolean piglinOption = true;
    public boolean pillagerOption = true;
    public boolean polarBearOption = true;
    public boolean potionOption = true;
    public boolean pufferfishOption = true;
    public boolean rabbitOption = true;
    public boolean ravagerOption = true;
    public boolean salmonOption = true;
    public boolean sheepOption = true;
    public boolean shulkerOption = true;
    public boolean skeletonOption = true;
    public boolean slimeOption = true;
    public boolean snowGolemOption = true;
    public boolean snowballOption = true;
    public boolean spiderOption = true;
    public boolean squidOption = true;
    public boolean strayOption = true;
    public boolean tntOption = true;
    public boolean traderLlamaOption = true;
    public boolean tridentOption = true;
    public boolean turtleOption = true;
    public boolean villagerOption = true;
    public boolean vindicatorOption = true;
    public boolean wardenOption = true;
    public boolean witchOption = true;
    public boolean witherOption = true;
    public boolean witherSkeletonOption = true;
    public boolean wolfOption = true;
    public boolean zombieOption = true;
    public boolean zombieHorseOption = true;
    public boolean zombieVillagerOption = true;
    public boolean zombifiedPiglinOption = true;
    public boolean breezeWindChargeOption = true;
    public boolean commandBlockMinecartOption = true;
    public boolean dragonFireballOption = true;
    public boolean endCrystalOption = true;
    public boolean eyeOfEnderOption = true;
    public boolean fireballOption = true;
    public boolean itemDisplayOption = true;
    public boolean itemFrameOption = true;
    public boolean leashKnotOption = true;
    public boolean lightningBoltOption = true;
    public boolean llamaSpitOption = true;
    public boolean markerOption = true;
    public boolean ominousItemSpawnerOption = true;
    public boolean spectralArrowOption = true;
    public boolean striderOption = true;
    public boolean tadpoleOption = true;
    public boolean textDisplayOption = true;
    public boolean tntMinecartOption = true;
    public boolean wanderingTraderOption = true;
    public boolean windChargeOption = true;
    public boolean witherSkullOption = true;
    public boolean fishingBobberOption = true;

    public static boolean modStatus = true;

    public static Screen openMenu(Screen parent) {
        return YetAnotherConfigLib.createBuilder()
                .title(Text.literal("Mobs"))
                .category(ConfigCategory.createBuilder()
                        .name(Text.translatable("entity.entityrenderdisabler.categoryName"))
                        .tooltip(Text.translatable("entity.entityrenderdisabler.tooltip"))
                        .group(OptionGroup.createBuilder()
                                .name(Text.translatable("entity.entityrenderdisabler.name"))
                                .description(OptionDescription.of(Text.translatable("entity.entityrenderdisabler.description")))
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.allay"))
                                        .binding(ConfigHandler.config.allayOption,
                                                () -> ConfigHandler.config.allayOption,
                                                newVal -> {
                                                    ConfigHandler.config.allayOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.area_effect_cloud"))
                                        .binding(ConfigHandler.config.areaEffectCloudOption,
                                                () -> ConfigHandler.config.areaEffectCloudOption,
                                                newVal -> {
                                                    ConfigHandler.config.areaEffectCloudOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.armadillo"))
                                        .binding(ConfigHandler.config.armadilloOption,
                                                () -> ConfigHandler.config.armadilloOption,
                                                newVal -> {
                                                    ConfigHandler.config.armadilloOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.armor_stand"))
                                        .binding(ConfigHandler.config.armorStandOption,
                                                () -> ConfigHandler.config.armorStandOption,
                                                newVal -> {
                                                    ConfigHandler.config.armorStandOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.arrow"))
                                        .binding(ConfigHandler.config.arrowOption,
                                                () -> ConfigHandler.config.arrowOption,
                                                newVal -> {
                                                    ConfigHandler.config.arrowOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.axolotl"))
                                        .binding(ConfigHandler.config.axolotlOption,
                                                () -> ConfigHandler.config.axolotlOption,
                                                newVal -> {
                                                    ConfigHandler.config.axolotlOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.bat"))
                                        .binding(ConfigHandler.config.batOption,
                                                () -> ConfigHandler.config.batOption,
                                                newVal -> {
                                                    ConfigHandler.config.batOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.bee"))
                                        .binding(ConfigHandler.config.beeOption,
                                                () -> ConfigHandler.config.beeOption,
                                                newVal -> {
                                                    ConfigHandler.config.beeOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.blaze"))
                                        .binding(ConfigHandler.config.blazeOption,
                                                () -> ConfigHandler.config.blazeOption,
                                                newVal -> {
                                                    ConfigHandler.config.blazeOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.block_display"))
                                        .binding(ConfigHandler.config.blockDisplayOption,
                                                () -> ConfigHandler.config.blockDisplayOption,
                                                newVal -> {
                                                    ConfigHandler.config.blockDisplayOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.boat"))
                                        .binding(ConfigHandler.config.boatOption,
                                                () -> ConfigHandler.config.boatOption,
                                                newVal -> {
                                                    ConfigHandler.config.boatOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.camel"))
                                        .binding(ConfigHandler.config.camelOption,
                                                () -> ConfigHandler.config.camelOption,
                                                newVal -> {
                                                    ConfigHandler.config.camelOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.cat"))
                                        .binding(ConfigHandler.config.catOption,
                                                () -> ConfigHandler.config.catOption,
                                                newVal -> {
                                                    ConfigHandler.config.catOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.cave_spider"))
                                        .binding(ConfigHandler.config.caveSpiderOption,
                                                () -> ConfigHandler.config.caveSpiderOption,
                                                newVal -> {
                                                    ConfigHandler.config.caveSpiderOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.chest_boat"))
                                        .binding(ConfigHandler.config.chestBoatOption,
                                                () -> ConfigHandler.config.chestBoatOption,
                                                newVal -> {
                                                    ConfigHandler.config.chestBoatOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.chicken"))
                                        .binding(ConfigHandler.config.chickenOption,
                                                () -> ConfigHandler.config.chickenOption,
                                                newVal -> {
                                                    ConfigHandler.config.chickenOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.cod"))
                                        .binding(ConfigHandler.config.codOption,
                                                () -> ConfigHandler.config.codOption,
                                                newVal -> {
                                                    ConfigHandler.config.codOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.cow"))
                                        .binding(ConfigHandler.config.cowOption,
                                                () -> ConfigHandler.config.cowOption,
                                                newVal -> {
                                                    ConfigHandler.config.cowOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.creeper"))
                                        .binding(ConfigHandler.config.creeperOption,
                                                () -> ConfigHandler.config.creeperOption,
                                                newVal -> {
                                                    ConfigHandler.config.creeperOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.dolphin"))
                                        .binding(ConfigHandler.config.dolphinOption,
                                                () -> ConfigHandler.config.dolphinOption,
                                                newVal -> {
                                                    ConfigHandler.config.dolphinOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.donkey"))
                                        .binding(ConfigHandler.config.donkeyOption,
                                                () -> ConfigHandler.config.donkeyOption,
                                                newVal -> {
                                                    ConfigHandler.config.donkeyOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.drowned"))
                                        .binding(ConfigHandler.config.drownedOption,
                                                () -> ConfigHandler.config.drownedOption,
                                                newVal -> {
                                                    ConfigHandler.config.drownedOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.egg"))
                                        .binding(ConfigHandler.config.eggOption,
                                                () -> ConfigHandler.config.eggOption,
                                                newVal -> {
                                                    ConfigHandler.config.eggOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.elder_guardian"))
                                        .binding(ConfigHandler.config.elderGuardianOption,
                                                () -> ConfigHandler.config.elderGuardianOption,
                                                newVal -> {
                                                    ConfigHandler.config.elderGuardianOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.ender_dragon"))
                                        .binding(ConfigHandler.config.enderDragonOption,
                                                () -> ConfigHandler.config.enderDragonOption,
                                                newVal -> {
                                                    ConfigHandler.config.enderDragonOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.ender_pearl"))
                                        .binding(ConfigHandler.config.enderPearlOption,
                                                () -> ConfigHandler.config.enderPearlOption,
                                                newVal -> {
                                                    ConfigHandler.config.enderPearlOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.enderman"))
                                        .binding(ConfigHandler.config.endermanOption,
                                                () -> ConfigHandler.config.endermanOption,
                                                newVal -> {
                                                    ConfigHandler.config.endermanOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.endermite"))
                                        .binding(ConfigHandler.config.endermiteOption,
                                                () -> ConfigHandler.config.endermiteOption,
                                                newVal -> {
                                                    ConfigHandler.config.endermiteOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.evoker"))
                                        .binding(ConfigHandler.config.evokerOption,
                                                () -> ConfigHandler.config.evokerOption,
                                                newVal -> {
                                                    ConfigHandler.config.evokerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.experience_bottle"))
                                        .binding(ConfigHandler.config.experienceBottleOption,
                                                () -> ConfigHandler.config.experienceBottleOption,
                                                newVal -> {
                                                    ConfigHandler.config.experienceBottleOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.experience_orb"))
                                        .binding(ConfigHandler.config.experienceOrbOption,
                                                () -> ConfigHandler.config.experienceOrbOption,
                                                newVal -> {
                                                    ConfigHandler.config.experienceOrbOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.firework_rocket"))
                                        .binding(ConfigHandler.config.fireworkRocketOption,
                                                () -> ConfigHandler.config.fireworkRocketOption,
                                                newVal -> {
                                                    ConfigHandler.config.fireworkRocketOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.fox"))
                                        .binding(ConfigHandler.config.foxOption,
                                                () -> ConfigHandler.config.foxOption,
                                                newVal -> {
                                                    ConfigHandler.config.foxOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.furnace_minecart"))
                                        .binding(ConfigHandler.config.furnaceMinecartOption,
                                                () -> ConfigHandler.config.furnaceMinecartOption,
                                                newVal -> {
                                                    ConfigHandler.config.furnaceMinecartOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.ghast"))
                                        .binding(ConfigHandler.config.ghastOption,
                                                () -> ConfigHandler.config.ghastOption,
                                                newVal -> {
                                                    ConfigHandler.config.ghastOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.giant"))
                                        .binding(ConfigHandler.config.giantOption,
                                                () -> ConfigHandler.config.giantOption,
                                                newVal -> {
                                                    ConfigHandler.config.giantOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.glow_item_frame"))
                                        .binding(ConfigHandler.config.glowItemFrameOption,
                                                () -> ConfigHandler.config.glowItemFrameOption,
                                                newVal -> {
                                                    ConfigHandler.config.glowItemFrameOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.glow_squid"))
                                        .binding(ConfigHandler.config.glowSquidOption,
                                                () -> ConfigHandler.config.glowSquidOption,
                                                newVal -> {
                                                    ConfigHandler.config.glowSquidOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.goat"))
                                        .binding(ConfigHandler.config.goatOption,
                                                () -> ConfigHandler.config.goatOption,
                                                newVal -> {
                                                    ConfigHandler.config.goatOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.guardian"))
                                        .binding(ConfigHandler.config.guardianOption,
                                                () -> ConfigHandler.config.guardianOption,
                                                newVal -> {
                                                    ConfigHandler.config.guardianOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.horse"))
                                        .binding(ConfigHandler.config.horseOption,
                                                () -> ConfigHandler.config.horseOption,
                                                newVal -> {
                                                    ConfigHandler.config.horseOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.husk"))
                                        .binding(ConfigHandler.config.huskOption,
                                                () -> ConfigHandler.config.huskOption,
                                                newVal -> {
                                                    ConfigHandler.config.huskOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.iron_golem"))
                                        .binding(ConfigHandler.config.ironGolemOption,
                                                () -> ConfigHandler.config.ironGolemOption,
                                                newVal -> {
                                                    ConfigHandler.config.ironGolemOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.item"))
                                        .binding(ConfigHandler.config.itemOption,
                                                () -> ConfigHandler.config.itemOption,
                                                newVal -> {
                                                    ConfigHandler.config.itemOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.llama"))
                                        .binding(ConfigHandler.config.llamaOption,
                                                () -> ConfigHandler.config.llamaOption,
                                                newVal -> {
                                                    ConfigHandler.config.llamaOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.magma_cube"))
                                        .binding(ConfigHandler.config.magmaCubeOption,
                                                () -> ConfigHandler.config.magmaCubeOption,
                                                newVal -> {
                                                    ConfigHandler.config.magmaCubeOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.minecart"))
                                        .binding(ConfigHandler.config.minecartOption,
                                                () -> ConfigHandler.config.minecartOption,
                                                newVal -> {
                                                    ConfigHandler.config.minecartOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.mooshroom"))
                                        .binding(ConfigHandler.config.mooshroomOption,
                                                () -> ConfigHandler.config.mooshroomOption,
                                                newVal -> {
                                                    ConfigHandler.config.mooshroomOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.mule"))
                                        .binding(ConfigHandler.config.muleOption,
                                                () -> ConfigHandler.config.muleOption,
                                                newVal -> {
                                                    ConfigHandler.config.muleOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.ocelot"))
                                        .binding(ConfigHandler.config.ocelotOption,
                                                () -> ConfigHandler.config.ocelotOption,
                                                newVal -> {
                                                    ConfigHandler.config.ocelotOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.panda"))
                                        .binding(ConfigHandler.config.pandaOption,
                                                () -> ConfigHandler.config.pandaOption,
                                                newVal -> {
                                                    ConfigHandler.config.pandaOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.parrot"))
                                        .binding(ConfigHandler.config.parrotOption,
                                                () -> ConfigHandler.config.parrotOption,
                                                newVal -> {
                                                    ConfigHandler.config.parrotOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.pig"))
                                        .binding(ConfigHandler.config.pigOption,
                                                () -> ConfigHandler.config.pigOption,
                                                newVal -> {
                                                    ConfigHandler.config.pigOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.piglin"))
                                        .binding(ConfigHandler.config.piglinOption,
                                                () -> ConfigHandler.config.piglinOption,
                                                newVal -> {
                                                    ConfigHandler.config.piglinOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.pillager"))
                                        .binding(ConfigHandler.config.pillagerOption,
                                                () -> ConfigHandler.config.pillagerOption,
                                                newVal -> {
                                                    ConfigHandler.config.pillagerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.polar_bear"))
                                        .binding(ConfigHandler.config.polarBearOption,
                                                () -> ConfigHandler.config.polarBearOption,
                                                newVal -> {
                                                    ConfigHandler.config.polarBearOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.potion"))
                                        .binding(ConfigHandler.config.potionOption,
                                                () -> ConfigHandler.config.potionOption,
                                                newVal -> {
                                                    ConfigHandler.config.potionOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.pufferfish"))
                                        .binding(ConfigHandler.config.pufferfishOption,
                                                () -> ConfigHandler.config.pufferfishOption,
                                                newVal -> {
                                                    ConfigHandler.config.pufferfishOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.rabbit"))
                                        .binding(ConfigHandler.config.rabbitOption,
                                                () -> ConfigHandler.config.rabbitOption,
                                                newVal -> {
                                                    ConfigHandler.config.rabbitOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.ravager"))
                                        .binding(ConfigHandler.config.ravagerOption,
                                                () -> ConfigHandler.config.ravagerOption,
                                                newVal -> {
                                                    ConfigHandler.config.ravagerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.salmon"))
                                        .binding(ConfigHandler.config.salmonOption,
                                                () -> ConfigHandler.config.salmonOption,
                                                newVal -> {
                                                    ConfigHandler.config.salmonOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.sheep"))
                                        .binding(ConfigHandler.config.sheepOption,
                                                () -> ConfigHandler.config.sheepOption,
                                                newVal -> {
                                                    ConfigHandler.config.sheepOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.shulker"))
                                        .binding(ConfigHandler.config.shulkerOption,
                                                () -> ConfigHandler.config.shulkerOption,
                                                newVal -> {
                                                    ConfigHandler.config.shulkerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.skeleton"))
                                        .binding(ConfigHandler.config.skeletonOption,
                                                () -> ConfigHandler.config.skeletonOption,
                                                newVal -> {
                                                    ConfigHandler.config.skeletonOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.slime"))
                                        .binding(ConfigHandler.config.slimeOption,
                                                () -> ConfigHandler.config.slimeOption,
                                                newVal -> {
                                                    ConfigHandler.config.slimeOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.snow_golem"))
                                        .binding(ConfigHandler.config.snowGolemOption,
                                                () -> ConfigHandler.config.snowGolemOption,
                                                newVal -> {
                                                    ConfigHandler.config.snowGolemOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.snowball"))
                                        .binding(ConfigHandler.config.snowballOption,
                                                () -> ConfigHandler.config.snowballOption,
                                                newVal -> {
                                                    ConfigHandler.config.snowballOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.spider"))
                                        .binding(ConfigHandler.config.spiderOption,
                                                () -> ConfigHandler.config.spiderOption,
                                                newVal -> {
                                                    ConfigHandler.config.spiderOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.squid"))
                                        .binding(ConfigHandler.config.squidOption,
                                                () -> ConfigHandler.config.squidOption,
                                                newVal -> {
                                                    ConfigHandler.config.squidOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.stray"))
                                        .binding(ConfigHandler.config.strayOption,
                                                () -> ConfigHandler.config.strayOption,
                                                newVal -> {
                                                    ConfigHandler.config.strayOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.tnt"))
                                        .binding(ConfigHandler.config.tntOption,
                                                () -> ConfigHandler.config.tntOption,
                                                newVal -> {
                                                    ConfigHandler.config.tntOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.trader_llama"))
                                        .binding(ConfigHandler.config.traderLlamaOption,
                                                () -> ConfigHandler.config.traderLlamaOption,
                                                newVal -> {
                                                    ConfigHandler.config.traderLlamaOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.trident"))
                                        .binding(ConfigHandler.config.tridentOption,
                                                () -> ConfigHandler.config.tridentOption,
                                                newVal -> {
                                                    ConfigHandler.config.tridentOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.turtle"))
                                        .binding(ConfigHandler.config.turtleOption,
                                                () -> ConfigHandler.config.turtleOption,
                                                newVal -> {
                                                    ConfigHandler.config.turtleOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.villager"))
                                        .binding(ConfigHandler.config.villagerOption,
                                                () -> ConfigHandler.config.villagerOption,
                                                newVal -> {
                                                    ConfigHandler.config.villagerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.vindicator"))
                                        .binding(ConfigHandler.config.vindicatorOption,
                                                () -> ConfigHandler.config.vindicatorOption,
                                                newVal -> {
                                                    ConfigHandler.config.vindicatorOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.warden"))
                                        .binding(ConfigHandler.config.wardenOption,
                                                () -> ConfigHandler.config.wardenOption,
                                                newVal -> {
                                                    ConfigHandler.config.wardenOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.witch"))
                                        .binding(ConfigHandler.config.witchOption,
                                                () -> ConfigHandler.config.witchOption,
                                                newVal -> {
                                                    ConfigHandler.config.witchOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.wither"))
                                        .binding(ConfigHandler.config.witherOption,
                                                () -> ConfigHandler.config.witherOption,
                                                newVal -> {
                                                    ConfigHandler.config.witherOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.wither_skeleton"))
                                        .binding(ConfigHandler.config.witherSkeletonOption,
                                                () -> ConfigHandler.config.witherSkeletonOption,
                                                newVal -> {
                                                    ConfigHandler.config.witherSkeletonOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.wolf"))
                                        .binding(ConfigHandler.config.wolfOption,
                                                () -> ConfigHandler.config.wolfOption,
                                                newVal -> {
                                                    ConfigHandler.config.wolfOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.zombie"))
                                        .binding(ConfigHandler.config.zombieOption,
                                                () -> ConfigHandler.config.zombieOption,
                                                newVal -> {
                                                    ConfigHandler.config.zombieOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.zombie_horse"))
                                        .binding(ConfigHandler.config.zombieHorseOption,
                                                () -> ConfigHandler.config.zombieHorseOption,
                                                newVal -> {
                                                    ConfigHandler.config.zombieHorseOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.zombie_villager"))
                                        .binding(ConfigHandler.config.zombieVillagerOption,
                                                () -> ConfigHandler.config.zombieVillagerOption,
                                                newVal -> {
                                                    ConfigHandler.config.zombieVillagerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.zombified_piglin"))
                                        .binding(ConfigHandler.config.zombifiedPiglinOption,
                                                () -> ConfigHandler.config.zombifiedPiglinOption,
                                                newVal -> {
                                                    ConfigHandler.config.zombifiedPiglinOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.breeze_wind_charge"))
                                        .binding(ConfigHandler.config.breezeWindChargeOption,
                                                () -> ConfigHandler.config.breezeWindChargeOption,
                                                newVal -> {
                                                    ConfigHandler.config.breezeWindChargeOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.command_block_minecart"))
                                        .binding(ConfigHandler.config.commandBlockMinecartOption,
                                                () -> ConfigHandler.config.commandBlockMinecartOption,
                                                newVal -> {
                                                    ConfigHandler.config.commandBlockMinecartOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.dragon_fireball"))
                                        .binding(ConfigHandler.config.dragonFireballOption,
                                                () -> ConfigHandler.config.dragonFireballOption,
                                                newVal -> {
                                                    ConfigHandler.config.dragonFireballOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.end_crystal"))
                                        .binding(ConfigHandler.config.endCrystalOption,
                                                () -> ConfigHandler.config.endCrystalOption,
                                                newVal -> {
                                                    ConfigHandler.config.endCrystalOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.eye_of_ender"))
                                        .binding(ConfigHandler.config.eyeOfEnderOption,
                                                () -> ConfigHandler.config.eyeOfEnderOption,
                                                newVal -> {
                                                    ConfigHandler.config.eyeOfEnderOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.fireball"))
                                        .binding(ConfigHandler.config.fireballOption,
                                                () -> ConfigHandler.config.fireballOption,
                                                newVal -> {
                                                    ConfigHandler.config.fireballOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.item_display"))
                                        .binding(ConfigHandler.config.itemDisplayOption,
                                                () -> ConfigHandler.config.itemDisplayOption,
                                                newVal -> {
                                                    ConfigHandler.config.itemDisplayOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.item_frame"))
                                        .binding(ConfigHandler.config.itemFrameOption,
                                                () -> ConfigHandler.config.itemFrameOption,
                                                newVal -> {
                                                    ConfigHandler.config.itemFrameOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.leash_knot"))
                                        .binding(ConfigHandler.config.leashKnotOption,
                                                () -> ConfigHandler.config.leashKnotOption,
                                                newVal -> {
                                                    ConfigHandler.config.leashKnotOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.lightning_bolt"))
                                        .binding(ConfigHandler.config.lightningBoltOption,
                                                () -> ConfigHandler.config.lightningBoltOption,
                                                newVal -> {
                                                    ConfigHandler.config.lightningBoltOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.llama_spit"))
                                        .binding(ConfigHandler.config.llamaSpitOption,
                                                () -> ConfigHandler.config.llamaSpitOption,
                                                newVal -> {
                                                    ConfigHandler.config.llamaSpitOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.marker"))
                                        .binding(ConfigHandler.config.markerOption,
                                                () -> ConfigHandler.config.markerOption,
                                                newVal -> {
                                                    ConfigHandler.config.markerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.ominous_item_spawner"))
                                        .binding(ConfigHandler.config.ominousItemSpawnerOption,
                                                () -> ConfigHandler.config.ominousItemSpawnerOption,
                                                newVal -> {
                                                    ConfigHandler.config.ominousItemSpawnerOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.spectral_arrow"))
                                        .binding(ConfigHandler.config.spectralArrowOption,
                                                () -> ConfigHandler.config.spectralArrowOption,
                                                newVal -> {
                                                    ConfigHandler.config.spectralArrowOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.strider"))
                                        .binding(ConfigHandler.config.striderOption,
                                                () -> ConfigHandler.config.striderOption,
                                                newVal -> {
                                                    ConfigHandler.config.striderOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.tadpole"))
                                        .binding(ConfigHandler.config.tadpoleOption,
                                                () -> ConfigHandler.config.tadpoleOption,
                                                newVal -> {
                                                    ConfigHandler.config.tadpoleOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.text_display"))
                                        .binding(ConfigHandler.config.textDisplayOption,
                                                () -> ConfigHandler.config.textDisplayOption,
                                                newVal -> {
                                                    ConfigHandler.config.textDisplayOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.tnt_minecart"))
                                        .binding(ConfigHandler.config.tntMinecartOption,
                                                () -> ConfigHandler.config.tntMinecartOption,
                                                newVal -> {
                                                    ConfigHandler.config.tntMinecartOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.wandering_trader"))
                                        .binding(ConfigHandler.config.wanderingTraderOption,
                                                () -> ConfigHandler.config.wanderingTraderOption,
                                                newVal -> {
                                                    ConfigHandler.config.wanderingTraderOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.wind_charge"))
                                        .binding(ConfigHandler.config.windChargeOption,
                                                () -> ConfigHandler.config.windChargeOption,
                                                newVal -> {
                                                    ConfigHandler.config.windChargeOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.wither_skull"))
                                        .binding(ConfigHandler.config.witherSkullOption,
                                                () -> ConfigHandler.config.witherSkullOption,
                                                newVal -> {
                                                    ConfigHandler.config.witherSkullOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("entity.entityrenderdisabler.fishing_bobber"))
                                        .binding(ConfigHandler.config.fishingBobberOption,
                                                () -> ConfigHandler.config.fishingBobberOption,
                                                newVal -> {
                                                    ConfigHandler.config.fishingBobberOption = newVal;
                                                    ConfigHandler.saveConfig();
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .build())
                        .build())
                .build()
                .generateScreen(parent);
    }
}
