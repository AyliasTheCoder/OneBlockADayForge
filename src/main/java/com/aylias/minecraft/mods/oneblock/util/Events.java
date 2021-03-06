package com.aylias.minecraft.mods.oneblock.util;

import com.aylias.minecraft.mods.oneblock.ModBase;
import com.aylias.minecraft.mods.oneblock.blocks.OneBlockBuilderTileEntityAbstract;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Hashtable;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Events {
    public static Hashtable<TileEntityType<? extends OneBlockBuilderTileEntityAbstract>, String> toRegister = new Hashtable<>();

    @SubscribeEvent
    public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
        CustomTileEntityType.SMALL_WOODEN_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "small_wooden_one_block");
        CustomTileEntityType.SMALL_MODERN_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "small_modern_one_block");
        CustomTileEntityType.SMALL_MEDIVAL_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "small_medival_one_block");
        CustomTileEntityType.SMALL_BRICK_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "small_brick_one_block");
        CustomTileEntityType.MEDIUM_WOOD_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "medium_wood_one_block");
        CustomTileEntityType.MEDIUM_MEDIVAL_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "medium_medival_one_block");
        CustomTileEntityType.MEDIUM_BRICK_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "medium_brick_one_block");
        CustomTileEntityType.MEDIUM_MODERN_ONE_BLOCK_TAG.setRegistryName(ModBase.MODID, "medium_modern_one_block");

        event.getRegistry().register(CustomTileEntityType.SMALL_WOODEN_ONE_BLOCK_TAG);
        event.getRegistry().register(CustomTileEntityType.SMALL_MODERN_ONE_BLOCK_TAG);
        event.getRegistry().register(CustomTileEntityType.SMALL_MEDIVAL_ONE_BLOCK_TAG);
        event.getRegistry().register(CustomTileEntityType.SMALL_BRICK_ONE_BLOCK_TAG);
        event.getRegistry().register(CustomTileEntityType.MEDIUM_WOOD_ONE_BLOCK_TAG);
        event.getRegistry().register(CustomTileEntityType.MEDIUM_MEDIVAL_ONE_BLOCK_TAG);
        event.getRegistry().register(CustomTileEntityType.MEDIUM_BRICK_ONE_BLOCK_TAG);
        event.getRegistry().register(CustomTileEntityType.MEDIUM_MODERN_ONE_BLOCK_TAG);
    }
}
