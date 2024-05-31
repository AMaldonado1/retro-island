package com.outlook.a100maldo983.retroisland.retroblocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ClassicMissingTextureBlock extends Block {
    public ClassicMissingTextureBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.BEDROCK));
    }
}
