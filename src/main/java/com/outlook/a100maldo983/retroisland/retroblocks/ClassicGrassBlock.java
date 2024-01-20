package com.outlook.a100maldo983.retroisland.retroblocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ClassicGrassBlock extends Block {
    public ClassicGrassBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK));
    }

}
