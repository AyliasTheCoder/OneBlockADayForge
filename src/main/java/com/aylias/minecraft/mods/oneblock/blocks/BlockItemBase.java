package com.aylias.minecraft.mods.oneblock.blocks;

import com.aylias.minecraft.mods.oneblock.ModBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {


    public BlockItemBase(Block block) {
        super(block, new Properties().group(ModBase.TAB));
    }
}
