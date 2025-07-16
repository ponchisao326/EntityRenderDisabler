package com.victorgponce.entityrenderdisablerneoforge.mixin;

import com.victorgponce.entityrenderdisablerneoforge.Entityrenderdisablerneoforge;
import com.victorgponce.entityrenderdisablerneoforge.config.ModConfig;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityRenderer.class)
public abstract class RenderDisabler<T extends Entity> {

    @Inject(
            method = "shouldRender",
            at = @At("HEAD"),
            cancellable = true
    )
    private void onRender(T entity, Frustum frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        // First check if mod is enabled
        if (!ModConfig.isModEnabled()) {
            return; // If mod is disabled, don't affect rendering
        }

        // Get entity ID in the proper format
        String entityId = BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType()).toString();

        // Check if this entity is configured to be visible
        if (!ModConfig.isEntityVisible(entityId)) {
            cir.setReturnValue(false);
            cir.cancel();
        }
    }

}
