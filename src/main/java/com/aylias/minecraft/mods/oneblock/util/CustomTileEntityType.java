package com.aylias.minecraft.mods.oneblock.util;

import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumBrickOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumMedivalOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumModernOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks.MediumWoodOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallBrickOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallMedivalOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallModernOneBlock;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallWoodenOneBlock;
import net.minecraft.tileentity.TileEntityType;

public class CustomTileEntityType {

    public static TileEntityType<SmallWoodenOneBlock> SMALL_WOODEN_ONE_BLOCK_TAG = TileEntityType.Builder.create(SmallWoodenOneBlock::new, RegistryHandler.SMALL_WOODEN_ONE_BLOCK.get()).build(null);
    public static TileEntityType<SmallModernOneBlock> SMALL_MODERN_ONE_BLOCK_TAG = TileEntityType.Builder.create(SmallModernOneBlock::new, RegistryHandler.SMALL_MODERN_ONE_BLOCK.get()).build(null);
    public static TileEntityType<SmallMedivalOneBlock> SMALL_MEDIVAL_ONE_BLOCK_TAG = TileEntityType.Builder.create(SmallMedivalOneBlock::new, RegistryHandler.SMALL_MEDIVAL_ONE_BLOCK.get()).build(null);
    public static TileEntityType<SmallBrickOneBlock> SMALL_BRICK_ONE_BLOCK_TAG = TileEntityType.Builder.create(SmallBrickOneBlock::new, RegistryHandler.SMALL_BRICK_ONE_BLOCK.get()).build(null);
    public static TileEntityType<MediumWoodOneBlock> MEDIUM_WOOD_ONE_BLOCK_TAG = TileEntityType.Builder.create(MediumWoodOneBlock::new, RegistryHandler.MEDIUM_WOOD_ONE_BLOCK.get()).build(null);
    public static TileEntityType<MediumMedivalOneBlock> MEDIUM_MEDIVAL_ONE_BLOCK_TAG = TileEntityType.Builder.create(MediumMedivalOneBlock::new, RegistryHandler.MEDIUM_MEDIVAL_ONE_BLOCK.get()).build(null);
    public static TileEntityType<MediumBrickOneBlock> MEDIUM_BRICK_ONE_BLOCK_TAG = TileEntityType.Builder.create(MediumBrickOneBlock::new, RegistryHandler.MEDIUM_BRICK_ONE_BLOCK.get()).build(null);
    public static TileEntityType<MediumModernOneBlock> MEDIUM_MODERN_ONE_BLOCK_TAG = TileEntityType.Builder.create(MediumModernOneBlock::new, RegistryHandler.MEDIUM_MODERN_ONE_BLOCK.get()).build(null);
}
