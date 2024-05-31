package com.outlook.a100maldo983.retroisland.retroitems;

import com.outlook.a100maldo983.retroisland.ModItems;
import com.outlook.a100maldo983.retroisland.RetroIsland;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RetroIsland.MODID);

    public static final RegistryObject<CreativeModeTab> RETRO_ISLAND_TAB = CREATIVE_MODE_TAB.register("retro_island_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLASSIC_GRASS_ITEM_BLOCK.get()))
                    .title(Component.translatable("creativetab.retroisland"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CLASSIC_GRASS_ITEM_BLOCK.get());
                        output.accept(ModItems.CLASSIC_MISSING_TEXTURE_ITEM_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
