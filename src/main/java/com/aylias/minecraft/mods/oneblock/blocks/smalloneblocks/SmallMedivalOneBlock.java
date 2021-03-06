package com.aylias.minecraft.mods.oneblock.blocks.smalloneblocks;

import com.aylias.minecraft.mods.oneblock.blocks.OneBlockBuilderTileEntityAbstract;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematic;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematics;
import com.aylias.minecraft.mods.oneblock.util.CustomTileEntityType;
import net.minecraft.tileentity.ITickableTileEntity;

public class SmallMedivalOneBlock extends OneBlockBuilderTileEntityAbstract implements ITickableTileEntity {

    public SmallMedivalOneBlock() {
        super(CustomTileEntityType.SMALL_MEDIVAL_ONE_BLOCK_TAG);
    }

    @Override
    public Schematic getToBuild() {
        return Schematic.fromOther(Schematics.SMALL_HOUSE_MEDIVAL);
    }
}
