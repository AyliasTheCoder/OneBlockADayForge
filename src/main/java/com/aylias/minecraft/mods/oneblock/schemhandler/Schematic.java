package com.aylias.minecraft.mods.oneblock.schemhandler;

import com.aylias.minecraft.mods.oneblock.blocks.OneBlockBuilderTileEntityAbstract;
import com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks.SmallWoodenOneBlock;
import com.aylias.minecraft.mods.oneblock.util.CustomTileEntityType;
import com.aylias.minecraft.mods.oneblock.util.Events;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class Schematic {

    List<Block> blocks = new ArrayList<>();
    List<BlockPos> offsets = new ArrayList<>();
    List<Direction> facings = new ArrayList<>();
    int index = 0;
    int size = 0;
    int buildLayer = 0;

    public boolean hasMore() {
        return index < size;
    }

    public void resetIndex() {
        index = 0;
    }

    public BlockAndPos getNext() {
        Block nextBlock = blocks.get(index);
        BlockPos nextPos = offsets.get(index);
        Direction nextFacing = facings.get(index);
        index++;

        BlockAndPos toReturn = new BlockAndPos(nextBlock, nextPos, nextFacing);
        return toReturn;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int _index) {
        index = _index;
    }

    public static Schematic fromOther(Schematic other) {
        Schematic toReturn = new Schematic();
        toReturn.blocks = other.blocks;
        toReturn.offsets = other.offsets;
        toReturn.facings = other.facings;
        toReturn.updateSize();
        return toReturn;
    }

    // Build Functions

    public void updateSize() {
        size = blocks.size();
    }

    public Schematic ascendLayer() {
        buildLayer++;
        size = blocks.size();
        return this;
    }

    public Schematic fillFromTo(int x1, int x2, int z1, int z2, Block block, Direction facing) {
        for (int x = x1; x <= x2; x++) {
            for (int z = z1; z <= z2; z++) {
                blocks.add(block);
                offsets.add(new BlockPos(x, buildLayer, z));
                facings.add(facing);
            }
        }

        size = blocks.size();
        return this;
    }

    public Schematic lineX(int start, int end, int z, Block block, Direction facing) {
        for (int x = start; x <= end; x++) {
            blocks.add(block);
            offsets.add(new BlockPos(x, buildLayer, z));
            facings.add(facing);
        }

        size = blocks.size();
        return this;
    }

    public Schematic lineZ(int start, int end, int x, Block block, Direction facing) {
        for (int z = start; z <= end; z++) {
            blocks.add(block);
            offsets.add(new BlockPos(x, buildLayer, z));
            facings.add(facing);
        }

        size = blocks.size();
        return this;
    }

    public Schematic walls(int x1, int x2, int z1, int z2, Block block, Direction facing) {
        lineX(x1, x2, z1, block, facing);
        lineX(x1, x2, z2, block, facing);
        lineZ(z1 + 1, z2 - 1, x1, block, facing);
        lineZ(z1 + 1, z2 - 1, x2, block, facing);

        size = blocks.size();
        return this;
    }

    public Schematic single(int x, int z, Block block, Direction facing) {
        blocks.add(block);
        offsets.add(new BlockPos(x, buildLayer, z));
        facings.add(facing);

        return this;
    }

    public Schematic remove(int x, int z) {
        for (int idx = 0; idx < blocks.size(); idx++) {
            BlockPos tempPos = offsets.get(idx);
            if (tempPos.getX() == x && tempPos.getZ() == z && tempPos.getY() == buildLayer) {
                offsets.remove(idx);
                blocks.remove(idx);
                facings.remove(idx);
                break;
            }
        }

        size = blocks.size();
        return this;
    }

    public Schematic replace(int x, int z, Block block, Direction facing) {
        remove(x, z);
        single(x, z, block, facing);

        return this;
    }

    public static class BlockAndPos {
        public Block block;
        public BlockPos pos;
        public Direction facing;

        public BlockAndPos(Block _block, BlockPos _pos, Direction _facing) {
            block = _block;
            pos = _pos.add(0, 1, 0);
            facing = _facing;
        }
    }
}
