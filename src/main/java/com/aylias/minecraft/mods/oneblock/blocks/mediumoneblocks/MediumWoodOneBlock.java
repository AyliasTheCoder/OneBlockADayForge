package com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks;

import com.aylias.minecraft.mods.oneblock.blocks.OneBlockBuilderTileEntityAbstract;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematic;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematics;
import com.aylias.minecraft.mods.oneblock.util.CustomTileEntityType;
import net.minecraft.tileentity.ITickableTileEntity;

public class MediumWoodOneBlock extends OneBlockBuilderTileEntityAbstract implements ITickableTileEntity {

    public MediumWoodOneBlock() {
        super(CustomTileEntityType.MEDIUM_WOOD_ONE_BLOCK_TAG);
    }

    @Override
    public Schematic getToBuild() {
        return Schematic.fromOther(Schematics.MEDIUM_HOUSE_WOOD);
    }
}
