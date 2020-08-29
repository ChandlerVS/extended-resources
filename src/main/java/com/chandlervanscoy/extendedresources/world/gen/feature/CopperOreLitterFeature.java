package com.chandlervanscoy.extendedresources.world.gen.feature;

import com.chandlervanscoy.extendedresources.block.ExtendedBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class CopperOreLitterFeature extends Feature<DefaultFeatureConfig> {
    private final BlockState blockState;

    public CopperOreLitterFeature(BlockState theBlockState, Codec<DefaultFeatureConfig> configCodec) {
        super(configCodec);
        blockState = theBlockState;
    }

    @Override
    public boolean generate(StructureWorldAccess world, ChunkGenerator chunkGenerator, Random random, BlockPos blockPos, DefaultFeatureConfig featureConfig) {
        BlockPos topPos = world.getTopPosition(Heightmap.Type.WORLD_SURFACE, blockPos);
        Direction offset = Direction.NORTH;
        world.setBlockState(topPos.up(0).offset(offset), blockState, 3);
        world.setBlockState(topPos.up(1).offset(offset), blockState, 3);
        world.setBlockState(topPos.east(1).offset(offset), blockState, 3);
        world.setBlockState(topPos.west(1).offset(offset), blockState, 3);
        world.setBlockState(topPos.south(1).offset(offset), blockState, 3);
        world.setBlockState(topPos.north(1).offset(offset), blockState, 3);
        return true;
    }
}
