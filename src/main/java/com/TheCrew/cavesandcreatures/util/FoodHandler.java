package com.TheCrew.cavesandcreatures.util;

import com.TheCrew.cavesandcreatures.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodHandler {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> AGED_APPLE = ITEMS.register("aged_apple", () -> new Item(new Item.Properties()
            .group(Main.TAB)
            .food(new Food.Builder()
                    .hunger(12)
                    .saturation(10f)
                    .effect(() -> new EffectInstance(Effects.NAUSEA,300,1),1f)
                    .build())


    ));
}
