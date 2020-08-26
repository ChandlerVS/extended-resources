package com.chandlervanscoy.extendedresources.mixin;

import com.chandlervanscoy.extendedresources.block.ExtendedBlocks;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public abstract class DefaultBiomeFeaturesMixin {
    @Inject(method = "addDefaultOres", at = @At("TAIL"))
    private static void injectMethod(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ExtendedBlocks.FEATURE_COPPER_ORE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ExtendedBlocks.FEATURE_ANTIMONY_ORE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ExtendedBlocks.FEATURE_NICKEL_ORE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ExtendedBlocks.FEATURE_TITANIUM_ORE);
    }
}
