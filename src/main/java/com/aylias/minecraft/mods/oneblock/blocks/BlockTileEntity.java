package com.aylias.minecraft.mods.oneblock.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public abstract class BlockTileEntity<TE extends TileEntity> extends BasicBlock {

    public BlockTileEntity(Material material) {
        super(material, 5.0f, 5.0f, SoundType.STONE, 1, ToolType.PICKAXE);
    }

    public abstract Class<TE> getTileEntityClass();

    public TE getTileEntity(World world, BlockPos pos) {
        return (TE)world.getTileEntity(pos);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return null;
    }
}
