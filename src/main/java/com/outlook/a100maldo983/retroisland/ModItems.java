package com.outlook.a100maldo983.retroisland;

import com.outlook.a100maldo983.retroisland.retroitems.ClassicGrassBlockItem;
import com.outlook.a100maldo983.retroisland.retroitems.ClassicMissingTextureBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.outlook.a100maldo983.retroisland.RetroIsland.MODID;

public class ModItems {

    public static final DeferredRegister<Item> RETRO_ISLAND_BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> CLASSIC_GRASS_ITEM_BLOCK = RETRO_ISLAND_BLOCK_ITEMS.register(
            "classic_grass_block", ClassicGrassBlockItem::new);

    public static final RegistryObject<Item> CLASSIC_MISSING_TEXTURE_ITEM_BLOCK = RETRO_ISLAND_BLOCK_ITEMS.register(
            "classic_missing_texture_block", ClassicMissingTextureBlockItem::new);
}
