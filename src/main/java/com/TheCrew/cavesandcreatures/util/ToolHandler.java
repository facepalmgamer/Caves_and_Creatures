package com.TheCrew.cavesandcreatures.util;

import com.TheCrew.cavesandcreatures.Main;
import com.TheCrew.cavesandcreatures.enums.ModArmorMaterial;
import com.TheCrew.cavesandcreatures.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //faerite
    public static final RegistryObject<SwordItem> FAERITE_SWORD = ITEMS.register("faerite_sword", () ->
            new SwordItem(ModItemTier.FAERITE, 3, -2.4f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<ShovelItem> FAERITE_SHOVEL = ITEMS.register("faerite_shovel", () ->
            new ShovelItem(ModItemTier.FAERITE, 1f, -3f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<PickaxeItem> FAERITE_PICKAXE = ITEMS.register("faerite_pickaxe", () ->
            new PickaxeItem(ModItemTier.FAERITE, 1, -2.8f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<AxeItem> FAERITE_AXE = ITEMS.register("faerite_axe", () ->
            new AxeItem(ModItemTier.FAERITE, 5.5f, -3f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<HoeItem> FAERITE_HOE = ITEMS.register("faerite_hoe", () ->
            new HoeItem(ModItemTier.FAERITE, -3, 0f, new Item.Properties().group(Main.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> FAERITE_HELMET = ITEMS.register("faerite_helmet", () ->
            new ArmorItem(ModArmorMaterial.FAERITE, EquipmentSlotType.HEAD, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<ArmorItem> FAERITE_CHESTPLATE = ITEMS.register("faerite_chestplate", () ->
            new ArmorItem(ModArmorMaterial.FAERITE, EquipmentSlotType.CHEST, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<ArmorItem> FAERITE_LEGGINGS = ITEMS.register("faerite_leggings", () ->
            new ArmorItem(ModArmorMaterial.FAERITE, EquipmentSlotType.LEGS, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<ArmorItem> FAERITE_BOOTS = ITEMS.register("faerite_boots", () ->
            new ArmorItem(ModArmorMaterial.FAERITE, EquipmentSlotType.FEET, new Item.Properties().group(Main.TAB)));
}
