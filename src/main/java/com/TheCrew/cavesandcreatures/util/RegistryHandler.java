package com.TheCrew.cavesandcreatures.util;

import com.TheCrew.cavesandcreatures.Main;
import com.TheCrew.cavesandcreatures.blocks.BlockBase;
import com.TheCrew.cavesandcreatures.blocks.BlockItemBase;
import com.TheCrew.cavesandcreatures.blocks.EtherealGemOre;
import com.TheCrew.cavesandcreatures.blocks.FaeriteOre;
import com.TheCrew.cavesandcreatures.items.ItemBase;
import com.TheCrew.cavesandcreatures.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
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
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ItemBase::new);
    public static final RegistryObject<Item> OBLIVION_ORB = ITEMS.register("oblivion_orb", ItemBase::new);
    public static final RegistryObject<Item> ETHEREAL_GEM_SHARD = ITEMS.register("ethereal_gem_shard", ItemBase::new);
    public static final RegistryObject<Item> FEYWILD_RUNE = ITEMS.register("feywild_rune", ItemBase::new);

    //Tools
    public static final RegistryObject<PickaxeItem> FAERITE_PICKAXE = ITEMS.register("faerite_pickaxe", () ->
            new PickaxeItem(ModItemTier.FAERITE, 1, -2.8f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<ShovelItem> FAERITE_SHOVEL = ITEMS.register("faerite_shovel", () ->
            new ShovelItem(ModItemTier.FAERITE, 1f, -3f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<SwordItem> FAERITE_SWORD = ITEMS.register("faerite_sword", () ->
            new SwordItem(ModItemTier.FAERITE, 3, -2.4f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<AxeItem> FAERITE_AXE = ITEMS.register("faerite_axe", () ->
            new AxeItem(ModItemTier.FAERITE, 5.5f, -3f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<HoeItem> FAERITE_HOE = ITEMS.register("faerite_hoe", () ->
            new HoeItem(ModItemTier.FAERITE, -3, 0f, new Item.Properties().group(Main.TAB)));







    //Blocks
    public static final RegistryObject<Block> FAERITE_ORE = BLOCKS.register("faerite_ore", FaeriteOre::new);
    public static final RegistryObject<Block> AGED_STONE_BRICK = BLOCKS.register("aged_stone_brick", BlockBase::new);
    public static final RegistryObject<Block> CRACKED_AGED_STONE_BRICK = BLOCKS.register("cracked_aged_stone_brick", BlockBase::new);
    public static final RegistryObject<Block> MELTED_AGED_STONE_BRICK = BLOCKS.register("melted_aged_stone_brick", BlockBase::new);
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = BLOCKS.register("reinforced_obsidian", BlockBase::new);
    public static final RegistryObject<Block> ETHEREAL_GEM_ORE = BLOCKS.register("ethereal_gem_ore", EtherealGemOre::new);


    //Block Items
    public static final RegistryObject<Item> FAERITE_ORE_ITEM = ITEMS.register("faerite_ore", () -> new BlockItemBase(FAERITE_ORE.get()));
    public static final RegistryObject<Item> AGED_STONE_BRICK_ITEM = ITEMS.register("aged_stone_brick", () -> new BlockItemBase(AGED_STONE_BRICK.get()));
    public static final RegistryObject<Item> CRACKED_AGED_STONE_BRICK_ITEM = ITEMS.register("cracked_aged_stone_brick", () -> new BlockItemBase(CRACKED_AGED_STONE_BRICK.get()));
    public static final RegistryObject<Item> MELTED_AGED_STONE_BRICK_ITEM = ITEMS.register("melted_aged_stone_brick", () -> new BlockItemBase(MELTED_AGED_STONE_BRICK.get()));
    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_ITEM = ITEMS.register("reinforced_obsidian", () -> new BlockItemBase(REINFORCED_OBSIDIAN.get()));
    public static final RegistryObject<Item> ETHEREAL_GEM_ORE_ITEM = ITEMS.register("ethereal_gem_ore", () -> new BlockItemBase(ETHEREAL_GEM_ORE.get()));
}