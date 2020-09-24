package com.TheCrew.cavesandcreatures.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class BasicBrewingStand extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(6, 2, 9, 7, 4, 10),
            Block.makeCuboidShape(5, 1, 6, 11, 2, 12),
            Block.makeCuboidShape(10, 4, 6, 11, 4, 12),
            Block.makeCuboidShape(5, 4, 6, 6, 4, 12),
            Block.makeCuboidShape(12, 1, 8, 15, 2, 11),
            Block.makeCuboidShape(1, 1, 8, 4, 2, 11),
            Block.makeCuboidShape(3, 1, 12, 13, 6, 14),
            Block.makeCuboidShape(9, 2, 11, 10, 4, 12),
            Block.makeCuboidShape(9, 2, 9, 10, 4, 10),
            Block.makeCuboidShape(9, 2, 7, 10, 4, 8),
            Block.makeCuboidShape(1, 0, 4, 15, 1, 14),
            Block.makeCuboidShape(10, 2, 6, 11, 4, 6),
            Block.makeCuboidShape(5, 2, 6, 6, 4, 6),
            Block.makeCuboidShape(6, 2, 7, 7, 4, 8),
            Block.makeCuboidShape(6, 2, 11, 7, 4, 12)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(9, 2, 9, 10, 4, 10),
            Block.makeCuboidShape(6, 1, 5, 12, 2, 11),
            Block.makeCuboidShape(6, 4, 5, 12, 4, 6),
            Block.makeCuboidShape(6, 4, 10, 12, 4, 11),
            Block.makeCuboidShape(8, 1, 1, 11, 2, 4),
            Block.makeCuboidShape(8, 1, 12, 11, 2, 15),
            Block.makeCuboidShape(12, 1, 3, 14, 6, 13),
            Block.makeCuboidShape(11, 2, 6, 12, 4, 7),
            Block.makeCuboidShape(9, 2, 6, 10, 4, 7),
            Block.makeCuboidShape(7, 2, 6, 8, 4, 7),
            Block.makeCuboidShape(4, 0, 1, 14, 1, 15),
            Block.makeCuboidShape(6, 2, 5, 6, 4, 6),
            Block.makeCuboidShape(6, 2, 10, 6, 4, 11),
            Block.makeCuboidShape(7, 2, 9, 8, 4, 10),
            Block.makeCuboidShape(11, 2, 9, 12, 4, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(9, 2, 6, 10, 4, 7),
            Block.makeCuboidShape(5, 1, 4, 11, 2, 10),
            Block.makeCuboidShape(5, 4, 4, 6, 4, 10),
            Block.makeCuboidShape(10, 4, 4, 11, 4, 10),
            Block.makeCuboidShape(1, 1, 5, 4, 2, 8),
            Block.makeCuboidShape(12, 1, 5, 15, 2, 8),
            Block.makeCuboidShape(3, 1, 2, 13, 6, 4),
            Block.makeCuboidShape(6, 2, 4, 7, 4, 5),
            Block.makeCuboidShape(6, 2, 6, 7, 4, 7),
            Block.makeCuboidShape(6, 2, 8, 7, 4, 9),
            Block.makeCuboidShape(1, 0, 2, 15, 1, 12),
            Block.makeCuboidShape(5, 2, 10, 6, 4, 10),
            Block.makeCuboidShape(10, 2, 10, 11, 4, 10),
            Block.makeCuboidShape(9, 2, 8, 10, 4, 9),
            Block.makeCuboidShape(9, 2, 4, 10, 4, 5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(6, 2, 6, 7, 4, 7),
            Block.makeCuboidShape(4, 1, 5, 10, 2, 11),
            Block.makeCuboidShape(4, 4, 10, 10, 4, 11),
            Block.makeCuboidShape(4, 4, 5, 10, 4, 6),
            Block.makeCuboidShape(5, 1, 12, 8, 2, 15),
            Block.makeCuboidShape(5, 1, 1, 8, 2, 4),
            Block.makeCuboidShape(2, 1, 2, 4, 6, 12),
            Block.makeCuboidShape(4, 2, 9, 5, 4, 10),
            Block.makeCuboidShape(6, 2, 9, 7, 4, 10),
            Block.makeCuboidShape(8, 2, 9, 9, 4, 10),
            Block.makeCuboidShape(2, 0, 1, 12, 1, 15),
            Block.makeCuboidShape(10, 2, 10, 10, 4, 11),
            Block.makeCuboidShape(10, 2, 5, 10, 4, 6),
            Block.makeCuboidShape(8, 2, 6, 9, 4, 7),
            Block.makeCuboidShape(4, 2, 6, 5, 4, 7)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BasicBrewingStand() {
        super(AbstractBlock.Properties.create(Material.IRON)
        .hardnessAndResistance(5.5f,4.0f)
        .sound(SoundType.STONE)
        .harvestLevel(0)
        .harvestTool(ToolType.PICKAXE));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch (state.get(FACING))
        {
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return .4f;
    }
}

