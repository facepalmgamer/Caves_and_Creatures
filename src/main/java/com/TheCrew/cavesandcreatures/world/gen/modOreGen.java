package com.TheCrew.cavesandcreatures.world.gen;

import com.TheCrew.cavesandcreatures.Main;
import com.TheCrew.cavesandcreatures.util.BlockHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class modOreGen
{
    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event)
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if (biome.getCategory() == Biome.Category.NETHER)
            {
                genOre(biome, 15, 8, 5, 80,  OreFeatureConfig.FillerBlockType.NETHERRACK, BlockHandler.ETHEREAL_GEM_ORE.get().getDefaultState(), 8);
            }
            else if (biome.getCategory() == Biome.Category.THEEND)
            {
                genOre(biome, 15, 8, 5, 50,  END_STONE, BlockHandler.ETHEREAL_GEM_ORE.get().getDefaultState(), 8);

            }
            else
            {
                genOre(biome, 15, 8, 5, 50,  OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockHandler.ETHEREAL_GEM_ORE.get().getDefaultState(), 8);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size)
    {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
