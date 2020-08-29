package com.chandlervanscoy.extendedresources.mixin.interfaces;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public interface BiomeManager {
    Biome registerAdditionalBiome(int rawId, RegistryKey<Biome> registryKey, Biome biome);
}
