package com.aylias.minecraft.mods.oneblock.blocks.mediumoneblocks;

import com.aylias.minecraft.mods.oneblock.blocks.OneBlockBuilderTileEntityAbstract;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematic;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematics;
import com.aylias.minecraft.mods.oneblock.util.CustomTileEntityType;
import net.minecraft.tileentity.ITickableTileEntity;

public class MediumBrickOneBlock extends OneBlockBuilderTileEntityAbstract implements ITickableTileEntity {

    public MediumBrickOneBlock() {
        super(CustomTileEntityType.MEDIUM_BRICK_ONE_BLOCK_TAG);
    }

    @Override
    public Schematic getToBuild() {
        return Schematic.fromOther(Schematics.MEDIUM_HOUSE_BRICK);
    }
}
