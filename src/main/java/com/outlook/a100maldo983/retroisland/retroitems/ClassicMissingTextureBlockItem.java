package com.outlook.a100maldo983.retroisland.retroitems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static com.outlook.a100maldo983.retroisland.ModBlocks.CLASSIC_MISSING_TEXTURE_BLOCK;

public class ClassicMissingTextureBlockItem extends BlockItem {
    public ClassicMissingTextureBlockItem(){
        super(CLASSIC_MISSING_TEXTURE_BLOCK.get(), new Item.Properties());
    }
}
