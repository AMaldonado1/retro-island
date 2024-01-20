package com.outlook.a100maldo983.retroisland;

import com.outlook.a100maldo983.retroisland.retroblocks.ClassicGrassBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

public class ModBlocks {
    public static final DeferredRegister<Block> RETRO_ISLAND_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> CLASSIC_GRASS_BLOCK = RETRO_ISLAND_BLOCKS.register("classic_grass_block", ClassicGrassBlock::new);

}
