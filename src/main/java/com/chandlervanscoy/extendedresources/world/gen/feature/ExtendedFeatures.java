package com.chandlervanscoy.extendedresources.world.gen.feature;

import com.chandlervanscoy.extendedresources.block.ExtendedBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class ExtendedFeatures {
    public static final Feature<DefaultFeatureConfig> COPPER_ORE_LITTER = Registry.register(Registry.FEATURE, new Identifier("extendedresources", "copper_ore_litter"), new CopperOreLitterFeature(ExtendedBlocks.COPPER_ORE.getDefaultState(), DefaultFeatureConfig.CODEC));
    public static final ConfiguredFeature<?, ?> COPPER_ORE_LITTER_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("extendedresources", "copper_ore_litter_feature"), COPPER_ORE_LITTER.configure(FeatureConfig.DEFAULT).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(4))));

    public static final Feature<DefaultFeatureConfig> NICKEL_ORE_LITTER = Registry.register(Registry.FEATURE, new Identifier("extendedresources", "nickel_ore_litter"), new CopperOreLitterFeature(ExtendedBlocks.NICKEL_ORE.getDefaultState(), DefaultFeatureConfig.CODEC));
    public static final ConfiguredFeature<?, ?> NICKEL_ORE_LITTER_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("extendedresources", "nickel_ore_litter_feature"), NICKEL_ORE_LITTER.configure(FeatureConfig.DEFAULT).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(4))));
}
