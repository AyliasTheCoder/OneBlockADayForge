package com.aylias.minecraft.mods.oneblock.util;

import com.aylias.minecraft.mods.oneblock.ModBase;
import com.aylias.minecraft.mods.oneblock.blocks.BlockItemBase;
import com.aylias.minecraft.mods.oneblock.blocks.OneBlockBuilder;
import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumBrickOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumMedivalOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumModernOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumWoodOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallBrickOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallMedivalOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallModernOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallWoodenOneBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModBase.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModBase.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items

    // Blocks
    public static final RegistryObject<Block> SMALL_WOODEN_ONE_BLOCK = BLOCKS.register("small_wooden_one_block", () -> new OneBlockBuilder(SmallWoodenOneBlock.class));
    public static final RegistryObject<Block> SMALL_MODERN_ONE_BLOCK = BLOCKS.register("small_modern_one_block", () -> new OneBlockBuilder(SmallModernOneBlock.class));
    public static final RegistryObject<Block> SMALL_MEDIVAL_ONE_BLOCK = BLOCKS.register("small_medival_one_block", () -> new OneBlockBuilder(SmallMedivalOneBlock.class));
    public static final RegistryObject<Block> SMALL_BRICK_ONE_BLOCK = BLOCKS.register("small_brick_one_block", () -> new OneBlockBuilder(SmallBrickOneBlock.class));
    public static final RegistryObject<Block> MEDIUM_WOOD_ONE_BLOCK = BLOCKS.register("medium_wood_one_block", () -> new OneBlockBuilder(MediumWoodOneBlock.class));
    public static final RegistryObject<Block> MEDIUM_MEDIVAL_ONE_BLOCK = BLOCKS.register("medium_medival_one_block", () -> new OneBlockBuilder(MediumMedivalOneBlock.class));
    public static final RegistryObject<Block> MEDIUM_BRICK_ONE_BLOCK = BLOCKS.register("medium_brick_one_block", () -> new OneBlockBuilder(MediumBrickOneBlock.class));
    public static final RegistryObject<Block> MEDIUM_MODERN_ONE_BLOCK = BLOCKS.register("medium_modern_one_block", () -> new OneBlockBuilder(MediumModernOneBlock.class));

    // Block Items
    public static final RegistryObject<Item> SMALL_WOODEN_ONE_BLOCK_ITEM = ITEMS.register("small_wooden_one_block", () -> new BlockItemBase(SMALL_WOODEN_ONE_BLOCK.get()));
    public static final RegistryObject<Item> SMALL_MODERN_ONE_BLOCK_ITEM = ITEMS.register("small_modern_one_block", () -> new BlockItemBase(SMALL_MODERN_ONE_BLOCK.get()));
    public static final RegistryObject<Item> SMALL_MEDIVAL_ONE_BLOCK_ITEM = ITEMS.register("small_medival_one_block", () -> new BlockItemBase(SMALL_MEDIVAL_ONE_BLOCK.get()));
    public static final RegistryObject<Item> SMALL_BRICK_ONE_BLOCK_ITEM = ITEMS.register("small_brick_one_block", () -> new BlockItemBase(SMALL_BRICK_ONE_BLOCK.get()));
    public static final RegistryObject<Item> MEDIUM_WOOD_ONE_BLOCK_ITEM = ITEMS.register("medium_wood_one_block", () -> new BlockItemBase(MEDIUM_WOOD_ONE_BLOCK.get()));
    public static final RegistryObject<Item> MEDIUM_MEDIVAL_ONE_BLOCK_ITEM = ITEMS.register("medium_medival_one_block", () -> new BlockItemBase(MEDIUM_MEDIVAL_ONE_BLOCK.get()));
    public static final RegistryObject<Item> MEDIUM_BRICK_ONE_BLOCK_ITEM = ITEMS.register("medium_brick_one_block", () -> new BlockItemBase(MEDIUM_BRICK_ONE_BLOCK.get()));
    public static final RegistryObject<Item> MEDIUM_MODERN_ONE_BLOCK_ITEM = ITEMS.register("medium_modern_one_block", () -> new BlockItemBase(MEDIUM_MODERN_ONE_BLOCK.get()));

}
