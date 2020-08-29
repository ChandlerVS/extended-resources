package com.chandlervanscoy.extendedresources;

import com.chandlervanscoy.extendedresources.block.ExtendedBlocks;
import com.chandlervanscoy.extendedresources.item.ExtendedItems;
import com.chandlervanscoy.extendedresources.mixin.BuiltinBiomesMixin;
import com.chandlervanscoy.extendedresources.world.biome.BiomeCreator;
import com.chandlervanscoy.extendedresources.world.biome.ExtendedBiomes;
import com.chandlervanscoy.extendedresources.world.gen.feature.CopperOreLitterFeature;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BuiltinBiomes;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;

public class ExtendedResources implements ModInitializer {
    @Override
    public void onInitialize() {
        ExtendedBlocks.registerBlocks();
        ExtendedBlocks.registerFeatures();
        ExtendedItems.registerItems();
        ExtendedBiomes.registerBiomes();
    }
}
