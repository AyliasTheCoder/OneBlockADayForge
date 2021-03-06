package com.aylias.minecraft.mods.oneblock.items;

import com.aylias.minecraft.mods.oneblock.ModBase;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ModBase.TAB));
    }
}
