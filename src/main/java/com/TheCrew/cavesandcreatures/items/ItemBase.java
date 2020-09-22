package com.TheCrew.cavesandcreatures.items;

import com.TheCrew.cavesandcreatures.Main;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item
{


    public ItemBase() {
        super(new Item.Properties().group(Main.TAB));
    }
}
