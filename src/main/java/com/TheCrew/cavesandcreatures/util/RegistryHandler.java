package com.TheCrew.cavesandcreatures.util;

import com.TheCrew.cavesandcreatures.Main;
import com.TheCrew.cavesandcreatures.blocks.BlockBase;
import com.TheCrew.cavesandcreatures.blocks.BlockItemBase;
import com.TheCrew.cavesandcreatures.blocks.FaeriteOre;
import com.TheCrew.cavesandcreatures.items.ItemBase;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> FAERITE_INGOT = ITEMS.register("faerite_ingot", ItemBase::new);
    public static final RegistryObject<Item> FAERITE_PICKAXE = ITEMS.register("faerite_pickaxe", ItemBase::new);
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ItemBase::new);
    public static final RegistryObject<Item> OBLIVION_ORB = ITEMS.register("oblivion_orb", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> FAERITE_ORE = BLOCKS.register("faerite_ore", FaeriteOre::new);
    public static final RegistryObject<Block> AGED_STONE_BRICK = BLOCKS.register("aged_stone_brick", BlockBase::new);
    public static final RegistryObject<Block> CRACKED_AGED_STONE_BRICK = BLOCKS.register("cracked_aged_stone_brick", BlockBase::new);
    public static final RegistryObject<Block> MELTED_AGED_STONE_BRICK = BLOCKS.register("melted_aged_stone_brick", BlockBase::new);
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = BLOCKS.register("reinforced_obsidian", BlockBase::new);


    //Block Items
    public static final RegistryObject<Item> FAERITE_ORE_ITEM = ITEMS.register("faerite_ore", () -> new BlockItemBase(FAERITE_ORE.get()));
    public static final RegistryObject<Item> AGED_STONE_BRICK_ITEM = ITEMS.register("aged_stone_brick", () -> new BlockItemBase(AGED_STONE_BRICK.get()));
    public static final RegistryObject<Item> CRACKED_AGED_STONE_BRICK_ITEM = ITEMS.register("cracked_aged_stone_brick", () -> new BlockItemBase(CRACKED_AGED_STONE_BRICK.get()));
    public static final RegistryObject<Item> MELTED_AGED_STONE_BRICK_ITEM = ITEMS.register("melted_aged_stone_brick", () -> new BlockItemBase(MELTED_AGED_STONE_BRICK.get()));
    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_ITEM = ITEMS.register("reinforced_obsidian", () -> new BlockItemBase(REINFORCED_OBSIDIAN.get()));

}