package com.aylias.minecraft.mods.oneblock.blocks;

import com.aylias.minecraft.mods.oneblock.ModBase;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematic;
import com.aylias.minecraft.mods.oneblock.schemhandler.Schematics;
import com.aylias.minecraft.mods.oneblock.util.CustomTileEntityType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

public abstract class OneBlockBuilderTileEntityAbstract extends TileEntity implements ITickableTileEntity {

    int ticksBetweenBlocks = 24*60*60*20;
    int ticksRemaining;
    int redstoneAdded = 0;
    int coalAdded = 0;
    int emeraldAdded = 0;
    int diamondAdded = 0;

    // TemplateManager manager;

    Schematic toBuild = getToBuild();

    public OneBlockBuilderTileEntityAbstract(TileEntityType<?> tileEntityType) {
        super(tileEntityType);
        ticksBetweenBlocks = 20;
        ticksRemaining = 20;
        /*
        TemplateManager manager = world.getServer().func_241755_D_().getStructureTemplateManager();
        if (!world.isRemote) {
            BlockPos temp = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
            Template template = manager.getTemplate(new ResourceLocation(ModBase.MODID, "schematics/small_house"));
            template.func_215386_a(temp, new PlacementSettings(), Blocks.ACACIA_WOOD, true);
        }
         */
    }

    public abstract Schematic getToBuild();

    @Override
    public void tick() {
        if (!world.isRemote) {
            ticksRemaining--;
            if (ticksRemaining == 0) {
                if (toBuild.hasMore()) {
                    Schematic.BlockAndPos blockAndPos = toBuild.getNext();
                    BlockPos newPos = pos.add(blockAndPos.pos.getX(), blockAndPos.pos.getY(), blockAndPos.pos.getZ());
                    if (world.getBlockState(newPos).getBlock() != Blocks.BEDROCK) {
                        world.playSound(newPos.getX(), newPos.getY(), newPos.getZ(), world.getBlockState(newPos).getSoundType().getBreakSound(), SoundCategory.BLOCKS, 1, 1, false);
                        world.playSound(newPos.getX(), newPos.getY(), newPos.getZ(), blockAndPos.block.getDefaultState().getSoundType().getPlaceSound(), SoundCategory.BLOCKS, 1, 1, false);
                        world.destroyBlock(newPos, true);

                        if (blockAndPos.block == Blocks.OAK_DOOR
                                || blockAndPos.block == Blocks.DARK_OAK_DOOR
                                || blockAndPos.block == Blocks.ACACIA_DOOR
                                || blockAndPos.block == Blocks.BIRCH_DOOR
                                || blockAndPos.block == Blocks.IRON_DOOR
                                || blockAndPos.block == Blocks.JUNGLE_DOOR
                                || blockAndPos.block == Blocks.SPRUCE_DOOR) {
                            world.setBlockState(newPos,
                                    blockAndPos.block.getDefaultState().with(HorizontalBlock.HORIZONTAL_FACING, blockAndPos.facing).with(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
                            newPos = pos.add(blockAndPos.pos.getX(), blockAndPos.pos.getY() + 1, blockAndPos.pos.getZ());
                            world.setBlockState(newPos,
                                    blockAndPos.block.getDefaultState().with(HorizontalBlock.HORIZONTAL_FACING, blockAndPos.facing).with(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER));
                        } else {

                            try {
                                world.setBlockState(newPos,
                                        blockAndPos.block.getDefaultState().with(BlockStateProperties.FACING, blockAndPos.facing));
                            } catch (Exception e) {
                                try {
                                    world.setBlockState(newPos,
                                            blockAndPos.block.getDefaultState().with(BlockStateProperties.HORIZONTAL_FACING, blockAndPos.facing));
                                } catch (Exception e2) {
                                    world.setBlockState(newPos,
                                            blockAndPos.block.getDefaultState());
                                }
                            }
                        }
                    } else {
                        world.setBlockState(pos,
                                Blocks.AIR.getDefaultState());
                    }
                }

                ticksRemaining = calculateTime(ticksBetweenBlocks);
            }
        }
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putInt("ticksRemaining", ticksRemaining);
        compound.putInt("index", toBuild.getIndex());
        compound.putInt("diamonds", diamondAdded);
        compound.putInt("emeralds", emeraldAdded);
        compound.putInt("coal", coalAdded);
        compound.putInt("redstone", redstoneAdded);

        return super.write(compound);
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT compound) {
        ticksRemaining = compound.getInt("ticksRemaining");
        toBuild.setIndex(compound.getInt("index"));
        diamondAdded = compound.getInt("diamonds");
        emeraldAdded = compound.getInt("emeralds");
        coalAdded = compound.getInt("coal");
        redstoneAdded = compound.getInt("redstone");

        super.func_230337_a_(state, compound);
    }

    public void addEmerald() {
        emeraldAdded += 20;
    }

    public void addCoal() {
        coalAdded += 10;
    }

    public void addRedstone() {
        redstoneAdded++;
    }

    public void addDiamond() {
        diamondAdded += 35;
    }

    public int calculateTime(int in) {
        // apply emerald
        if (emeraldAdded > 0) {
            emeraldAdded--;
            in /= 2;
        }

        // apply diamond
        if (diamondAdded > 0) {
            diamondAdded--;
            in /= 2;
        }

        // apply coal
        if (coalAdded > 0) {
            coalAdded--;
            in *= .95;
        }

        // apply redstone
        for (int a = 0; a < redstoneAdded; a++) {
            in *= .9;
        }


        return in;
    }

    public IFormattableTextComponent getShiftRightClickText() {

        StringTextComponent toReturn = new StringTextComponent("Info: ");

        return toReturn.func_240701_a_(TextFormatting.WHITE)
                .func_230529_a_(new StringTextComponent(ticksRemaining/20 + " | "))
                .func_240701_a_(TextFormatting.RED)
                .func_230529_a_(new StringTextComponent(Integer.toString(redstoneAdded)))
                .func_240701_a_(TextFormatting.WHITE)
                .func_230529_a_(new StringTextComponent(" | "))
                .func_240701_a_(TextFormatting.GREEN)
                .func_230529_a_(new StringTextComponent(Integer.toString(emeraldAdded)))
                .func_240701_a_(TextFormatting.WHITE)
                .func_230529_a_(new StringTextComponent(" | "))
                .func_240701_a_(TextFormatting.AQUA)
                .func_230529_a_(new StringTextComponent(Integer.toString(diamondAdded)))
                .func_240701_a_(TextFormatting.WHITE)
                .func_230529_a_(new StringTextComponent(" | "))
                .func_240701_a_(TextFormatting.BLACK)
                .func_230529_a_(new StringTextComponent(Integer.toString(coalAdded)));
    }
}
