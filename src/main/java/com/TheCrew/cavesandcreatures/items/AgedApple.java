package com.TheCrew.cavesandcreatures.items;

import com.TheCrew.cavesandcreatures.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;



public class AgedApple extends Item {


    public AgedApple() {
        super(new Item.Properties()
                .group(Main.TAB)
                .food(new Food.Builder()
                        .hunger(12)
                        .saturation(10f)
                        .effect(() -> new EffectInstance(Effects.NAUSEA,300,1),1f)
                        .build())


        );
    }
}
