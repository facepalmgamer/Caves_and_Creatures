package com.TheCrew.cavesandcreatures.util;

import com.TheCrew.cavesandcreatures.Main;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> FAERITE_INGOT = ITEMS.register("faerite_ingot",()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> OBLIVION_ORB = ITEMS.register("oblivion_orb", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> ETHEREAL_GEM_SHARD = ITEMS.register("ethereal_gem_shard", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> FEYWILD_RUNE = ITEMS.register("feywild_rune", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BURNER = ITEMS.register("burner", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> POTION_CAGE = ITEMS.register("potion_cage", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> HIDE = ITEMS.register("hide", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> SILK_BUNDLE = ITEMS.register("silk_bundle", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> SIP_BOTTLE = ITEMS.register("sip_bottle", ()->new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> SIP_WATER_BOTTLE = ITEMS.register("sip_water_bottle", ()->new Item(new Item.Properties().group(Main.TAB)));

}
