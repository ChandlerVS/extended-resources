package com.chandlervanscoy.extendedresources;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.chandlervanscoy.extendedresources.block.ExtendedBlocks;
import com.chandlervanscoy.extendedresources.item.ExtendedItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ExtendedResources implements ModInitializer {
    @Override
    public void onInitialize() {
        ExtendedBlocks.registerBlocks();
        ExtendedBlocks.registerFeatures();
        ExtendedItems.registerItems();
    }
}
