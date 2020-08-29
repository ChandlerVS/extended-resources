package com.chandlervanscoy.extendedresources.world.biome;

import com.chandlervanscoy.extendedresources.mixin.BuiltinBiomesMixin;
import com.chandlervanscoy.extendedresources.world.gen.feature.ExtendedFeatures;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public abstract class ExtendedBiomes {
    public static abstract class Keys {
        private static final RegistryKey<Biome> COPPER_ORE_PLAINS = registerBiomeKey("copper_ore_plains");
        private static final RegistryKey<Biome> NICKEL_ORE_PLAINS = registerBiomeKey("nickel_ore_plains");
    }

    private static RegistryKey<Biome> registerBiomeKey(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier("extendedresources", name));
    }

    private static Biome registerBiome(int rawId, RegistryKey<Biome> registryKey, Biome biome) {
        BuiltinBiomesMixin.getByRawId().put(rawId, registryKey);
        return (Biome) BuiltinRegistries.set(BuiltinRegistries.BIOME, rawId, registryKey, biome);
    }

    public static void registerBiomes() {
        registerBiome(401, Keys.COPPER_ORE_PLAINS, BiomeCreator.createOrePlains(ExtendedFeatures.COPPER_ORE_LITTER_FEATURE));
        registerBiome(402, Keys.NICKEL_ORE_PLAINS, BiomeCreator.createOrePlains(ExtendedFeatures.NICKEL_ORE_LITTER_FEATURE));
    }
}
