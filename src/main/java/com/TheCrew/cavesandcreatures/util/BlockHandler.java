package com.TheCrew.cavesandcreatures.util;

import com.TheCrew.cavesandcreatures.Main;
import com.TheCrew.cavesandcreatures.blocks.BasicBrewingStand;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
    public static final RegistryObject<Block> FAERITE_ORE = BLOCKS.register("faerite_ore",()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(7.0f,7.0f)));
    public static final RegistryObject<Block> AGED_STONE_BRICK = BLOCKS.register("aged_stone_brick", ()-> new Block(AbstractBlock.Properties.from(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_AGED_STONE_BRICK = BLOCKS.register("cracked_aged_stone_brick", ()-> new Block(AbstractBlock.Properties.from(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> MELTED_AGED_STONE_BRICK = BLOCKS.register("melted_aged_stone_brick", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(1.5f,6.0f)
            .setLightLevel((BlockState) -> 12)
    ));
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = BLOCKS.register("reinforced_obsidian", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(3)
            .hardnessAndResistance(100f,2400f)
    ));
    public static final RegistryObject<Block> ETHEREAL_GEM_ORE = BLOCKS.register("ethereal_gem_ore", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(7.0f,7.0f)
    ));

    //custom Blocks
    public static final RegistryObject<Block> BASIC_BREWING_STAND = BLOCKS.register("basic_brewing_stand", BasicBrewingStand::new );


    //Block Items
    public static final RegistryObject<Item> FRITE_ORE_ITEM = ITEMS.register("faerite_ore", ()-> new BlockItem(FAERITE_ORE.get(), new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> AGED_STONE_BRICK_ITEM = ITEMS.register("aged_stone_brick", () -> new BlockItem(AGED_STONE_BRICK.get(),new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> CRACKED_AGED_STONE_BRICK_ITEM = ITEMS.register("cracked_aged_stone_brick", () -> new BlockItem(CRACKED_AGED_STONE_BRICK.get(),new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> MELTED_AGED_STONE_BRICK_ITEM = ITEMS.register("melted_aged_stone_brick", () -> new BlockItem(MELTED_AGED_STONE_BRICK.get(),new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_ITEM = ITEMS.register("reinforced_obsidian", () -> new BlockItem(REINFORCED_OBSIDIAN.get(),new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> ETHEREAL_GEM_ORE_ITEM = ITEMS.register("ethereal_gem_ore", () -> new BlockItem(ETHEREAL_GEM_ORE.get(),new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BASIC_BREWING_STAND_ITEM = ITEMS.register("basic_brewing_stand", () -> new BlockItem(BASIC_BREWING_STAND.get(),new Item.Properties().group(Main.TAB)));


}
