package com.aylias.minecraft.mods.oneblock.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class OneBlockBuilder<T extends OneBlockBuilderTileEntityAbstract> extends BlockTileEntity<T> {

    Class<T> chosenClass;

    public OneBlockBuilder(Class<T> _chosenClass) {
        super(Material.ROCK);
        chosenClass = _chosenClass;
    }

    @Override
    public Class<T> getTileEntityClass() {
        return chosenClass;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        try {
            return chosenClass.newInstance();
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }
        return null;
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            T tileEntity = (T) worldIn.getTileEntity(pos);

            if (player.isCrouching()) {
                player.sendStatusMessage(tileEntity.getShiftRightClickText(), true);
            }

            Item clickedWith = player.getHeldItem(handIn).getItem();
            boolean valid = false;
            if (clickedWith == Items.EMERALD) {
                tileEntity.addEmerald();
                valid = true;
            } else if (clickedWith == Items.DIAMOND) {
                tileEntity.addDiamond();
                valid = true;
            } else if (clickedWith == Items.COAL) {
                tileEntity.addCoal();
                valid = true;
            } else if (clickedWith == Items.REDSTONE) {
                tileEntity.addRedstone();
                valid = true;
            }

            if (valid) {
                player.getHeldItem(handIn).setCount(player.getHeldItem(handIn).getCount() - 1);
            }
        }

        return ActionResultType.PASS;
    }
}
