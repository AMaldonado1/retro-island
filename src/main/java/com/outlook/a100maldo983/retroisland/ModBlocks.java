package com.outlook.a100maldo983.retroisland;

import com.outlook.a100maldo983.retroisland.retroblocks.ClassicGrassBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.outlook.a100maldo983.retroisland.RetroIsland.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> RETRO_ISLAND_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> CLASSIC_GRASS_BLOCK = RETRO_ISLAND_BLOCKS.register("classic_grass_block", ClassicGrassBlock::new);

}
