package com.TheCrew.cavesandcreatures.items;

import com.TheCrew.cavesandcreatures.Main;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class Pickaxe extends Item {
    public Pickaxe() {
        super(new Item.Properties().group(Main.TAB).addToolType(ToolType.PICKAXE,2));
    }
}
