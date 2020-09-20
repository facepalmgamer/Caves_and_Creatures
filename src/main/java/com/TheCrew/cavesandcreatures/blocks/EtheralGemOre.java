package com.TheCrew.cavesandcreatures.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EtheralGemOre extends Block
{
    public EtheralGemOre( ) {
        super(Block.Properties.create(Material.ROCK)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(7.0f,7.0f)
                .sound(SoundType.METAL)
        );
    }
}
