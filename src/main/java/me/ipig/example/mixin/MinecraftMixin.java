package me.ipig.example.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * An example mixin using SpongePowered's Mixin library and ObjectWeb ASM.
 *
 * @see Inject
 * @see Mixin
 */
@Mixin(Minecraft.class)
public class MinecraftMixin {

}

