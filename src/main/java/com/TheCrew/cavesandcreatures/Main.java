package com.TheCrew.cavesandcreatures;

import com.TheCrew.cavesandcreatures.util.BlockHandler;
import com.TheCrew.cavesandcreatures.util.FoodHandler;
import com.TheCrew.cavesandcreatures.util.ItemHandler;
import com.TheCrew.cavesandcreatures.util.ToolHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("cac")
public class Main
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cac";

    public Main()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BlockHandler.init();
        FoodHandler.init();
        ItemHandler.init();
        ToolHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
    //test commit

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    }

    public static final ItemGroup TAB = new ItemGroup("cac_tab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemHandler.OBLIVION_ORB.get());
        }
    };

}
