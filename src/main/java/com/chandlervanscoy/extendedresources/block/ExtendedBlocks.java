package com.chandlervanscoy.extendedresources.block;

import com.chandlervanscoy.extendedresources.ExtendedResources;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ExtendedBlocks {
    public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0f));
    public static final Block NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(2.5f));
    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final Block ANTIMONY_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(2.5f));

    public static final ConfiguredFeature<?, ?> FEATURE_COPPER_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, COPPER_ORE.getDefaultState(), 8))
            .method_30377(16).spreadHorizontally().repeat(8);
    public static final ConfiguredFeature<?, ?> FEATURE_NICKEL_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, NICKEL_ORE.getDefaultState(), 8))
            .method_30377(16).spreadHorizontally().repeat(8);
    public static final ConfiguredFeature<?, ?> FEATURE_TITANIUM_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, TITANIUM_ORE.getDefaultState(), 8))
            .method_30377(16).spreadHorizontally().repeat(8);
    public static final ConfiguredFeature<?, ?> FEATURE_ANTIMONY_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ANTIMONY_ORE.getDefaultState(), 8))
            .method_30377(16).spreadHorizontally().repeat(8);

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("extendedresources", "copper_ore"), ExtendedBlocks.COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier("extendedresources", "copper_ore"), new BlockItem(ExtendedBlocks.COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("extendedresources", "nickel_ore"), ExtendedBlocks.NICKEL_ORE);
        Registry.register(Registry.ITEM, new Identifier("extendedresources", "nickel_ore"), new BlockItem(ExtendedBlocks.NICKEL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("extendedresources", "titanium_ore"), ExtendedBlocks.TITANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("extendedresources", "titanium_ore"), new BlockItem(ExtendedBlocks.TITANIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("extendedresources", "antimony_ore"), ExtendedBlocks.ANTIMONY_ORE);
        Registry.register(Registry.ITEM, new Identifier("extendedresources", "antimony_ore"), new BlockItem(ExtendedBlocks.ANTIMONY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerFeatures() {
        BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_FEATURE, "copper_ore", FEATURE_COPPER_ORE);
        BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_FEATURE, "nickel_ore", FEATURE_NICKEL_ORE);
        BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_FEATURE, "titanium_ore", FEATURE_TITANIUM_ORE);
        BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_FEATURE, "antimony_ore", FEATURE_ANTIMONY_ORE);
    }
}
