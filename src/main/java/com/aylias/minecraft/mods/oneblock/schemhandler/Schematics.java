package com.aylias.minecraft.mods.oneblock.schemhandler;

import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;

public class Schematics {

    public static final Schematic SMALL_HOUSE_WOODEN = new Schematic()
            .fillFromTo(-2, 2, -2, 2, Blocks.OAK_PLANKS, Direction.UP) // Oak Plank floor
            .walls(-3, 3, -3, 3, Blocks.OAK_LOG, Direction.UP) // Oak Wool Outline
            .single(0, 4, Blocks.OAK_STAIRS, Direction.NORTH) // Entrance Stairs
            .ascendLayer() // Go to layer 2
            .single(-2, -2, Blocks.CRAFTING_TABLE, Direction.EAST) // Crafting Table
            .single(-2, -1, Blocks.FURNACE, Direction.EAST) // Furnace
            .single(-2, 0, Blocks.CHEST, Direction.EAST) // Chest
            .walls(-3, 3, -3, 3, Blocks.OAK_PLANKS, Direction.UP) // Oak Plank Wall
            .remove(0, 3) // Hole for door
            .single(0, 3, Blocks.OAK_DOOR, Direction.NORTH) // Door
            .ascendLayer() // Go to layer 3
            .walls(-3, 3, -3, 3, Blocks.GLASS, Direction.UP) // Glass walls
            .remove(0, 3) // Hole for door
            .ascendLayer() // Go to layer 4
            .walls(-3, 3, -3, 3, Blocks.OAK_PLANKS, Direction.UP) // oak plank wall
            .ascendLayer() // go to layer 5
            .fillFromTo(-2, 2, -2, 2, Blocks.OAK_PLANKS, Direction.UP) // oak plank ceiling
            .walls(-3, 3, -3, 3, Blocks.OAK_LOG, Direction.UP) // oak wood outline
            .ascendLayer() // go to layer 6
            .walls(-3, 3, -3, 3, Blocks.OAK_FENCE, Direction.NORTH); // oak fence crown

    public static final Schematic SMALL_HOUSE_MODERN = new Schematic()
            .fillFromTo(-2, 2, -2, 2, Blocks.BROWN_WOOL, Direction.UP) // brown wool floor
            .walls(-3, 3, -3, 3, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // concrete outline
            .single(0, 4, Blocks.STONE_BRICK_STAIRS, Direction.NORTH) // entrance stairs
            .ascendLayer() // Go to layer 2
            .single(-2, -2, Blocks.CRAFTING_TABLE, Direction.EAST) // Crafting Table
            .single(-2, -1, Blocks.FURNACE, Direction.EAST) // Furnace
            .single(-2, 0, Blocks.CHEST, Direction.EAST) // Chest
            .walls(-3, 3, -3, 3, Blocks.WHITE_CONCRETE, Direction.UP) // concrete wall
            .remove(0, 3) // hole for door
            .single(0, 3, Blocks.OAK_DOOR, Direction.NORTH) // door
            .ascendLayer() // Go to layer 3
            .walls(-3, 3, -3, 3, Blocks.BLACK_STAINED_GLASS, Direction.UP) // windows
            .remove(0, 3) // hole for door
            .ascendLayer() // go to layer 4
            .walls(-3, 3, -3, 3, Blocks.WHITE_CONCRETE, Direction.UP) // concrete wall
            .ascendLayer() // go to layer 5
            .fillFromTo(-2, 2, -2, 2, Blocks.WHITE_CONCRETE, Direction.UP) // concrete ceiling
            .walls(-3, 3, -3, 3, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP); // concrete outline

    public static final Schematic SMALL_HOUSE_MEDIVAL = new Schematic()
            .fillFromTo(-2, 2, -2, 2, Blocks.COBBLESTONE, Direction.UP) // cobble floor
            .walls(-3, 3, -3, 3, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // chiseled stone brick outline
            .single(0, 4, Blocks.STONE_BRICK_STAIRS, Direction.NORTH) // entrance stairs
            .ascendLayer() // Go to layer 2
            .single(-2, -2, Blocks.CRAFTING_TABLE, Direction.EAST) // crafting table
            .single(-2, -1, Blocks.FURNACE, Direction.EAST) // furnace
            .single(-2, 0, Blocks.CHEST, Direction.EAST) // chest
            .walls(-3, 3, -3, 3, Blocks.STONE_BRICKS, Direction.UP) // stone brick wall
            .remove(0, 3) // hole for door
            .single(0, 3, Blocks.OAK_DOOR, Direction.NORTH) // door
            .ascendLayer() // Go to layer 3
            .walls(-3, 3, -3, 3, Blocks.LIGHT_GRAY_STAINED_GLASS, Direction.UP) // windows
            .remove(0, 3) // hole for door
            .ascendLayer() // go to layer 4
            .walls(-3, 3, -3, 3, Blocks.STONE_BRICKS, Direction.UP) // stone brick wall
            .ascendLayer() // go to layer 5
            .fillFromTo(-2, 2, -2, 2, Blocks.COBBLESTONE, Direction.UP) // cobble ceiling
            .walls(-3, 3, -3, 3, Blocks.CHISELED_STONE_BRICKS, Direction.UP)
            .ascendLayer()
            .walls(-3, 3, -3, 3, Blocks.STONE_BRICK_WALL, Direction.UP); // stone brick crown

    public static final Schematic SMALL_HOUSE_BRICK = new Schematic()
            .fillFromTo(-3, 3, -3, 3, Blocks.BRICKS, Direction.UP) // brick floor
            .single(0, 4, Blocks.BRICK_STAIRS, Direction.NORTH) // entrance stairs
            .ascendLayer() // Go to layer 2
            .single(-2, -2, Blocks.CRAFTING_TABLE, Direction.EAST) // crafting table
            .single(-2, -1, Blocks.FURNACE, Direction.EAST) // furnace
            .single(-2, 0, Blocks.CHEST, Direction.EAST) // chest
            .walls(-3, 3, -3, 3, Blocks.BRICKS, Direction.UP) // brick wall
            .remove(0, 3) // hole for door
            .single(0, 3, Blocks.OAK_DOOR, Direction.NORTH) // door
            .ascendLayer() // Go to layer 3
            .walls(-3, 3, -3, 3, Blocks.GLASS, Direction.UP) // windows
            .remove(0, 3) // hole for door
            .ascendLayer() // go to layer 4
            .walls(-3, 3, -3, 3, Blocks.BRICKS, Direction.UP) // brick wall
            .ascendLayer() // go to layer 5
            .fillFromTo(-3, 3, -3, 3, Blocks.BRICKS, Direction.UP) // brick ceiling
            .ascendLayer()
            .walls(-3, 3, -3, 3, Blocks.BRICK_WALL, Direction.UP); // brick wall crown

    public static final Schematic MEDIUM_HOUSE_WOOD = new Schematic()
            .fillFromTo(-3, 3, -5, 5, Blocks.OAK_PLANKS, Direction.UP) // oak plank floor
            .walls(-4, 4, -6, 6, Blocks.OAK_LOG, Direction.UP) // oak log trim
            .single(-5, 0, Blocks.OAK_STAIRS, Direction.EAST)
            .ascendLayer() // go to layer 2
            .walls(-4, 4, -6, 6, Blocks.OAK_PLANKS, Direction.UP) // oak plank walls
            .remove(-4, 0) // hole for door
            .single(-4, 0, Blocks.OAK_DOOR, Direction.EAST) // door
            .replace(-4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(-4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .single(3, 0, Blocks.CRAFTING_TABLE, Direction.WEST)
            .single(3, -1, Blocks.SMOKER, Direction.WEST)
            .single(3, 1, Blocks.BLAST_FURNACE, Direction.WEST)
            .single(3, -2, Blocks.CHEST, Direction.WEST)
            .single(3, 2, Blocks.CHEST, Direction.WEST)
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.GLASS, Direction.UP) // window
            .remove(-4, 0) // hole for door
            .replace(-4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(-4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.OAK_PLANKS, Direction.UP) // oak plank walls
            .replace(-4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(-4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .ascendLayer()
            .walls(-4, 4, -6, 6, Blocks.OAK_PLANKS, Direction.UP) // oak plank walls
            .replace(-4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, -6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(-4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .replace(4, 6, Blocks.OAK_LOG, Direction.UP) // oak log corners
            .ascendLayer()
            .fillFromTo(-3, 3, -5, 5, Blocks.OAK_PLANKS, Direction.UP) // oak plank ceiling
            .walls(-4, 4, -6, 6, Blocks.OAK_LOG, Direction.UP) // oak log trim
            .replace(0, 0, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, 5, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, -5, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, 6, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, -6, Blocks.GLOWSTONE, Direction.UP)
            .lineZ(-7,7, -5, Blocks.OAK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 5, Blocks.OAK_STAIRS, Direction.WEST)
            .ascendLayer()
            .lineZ(-7,7, -4, Blocks.OAK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 4, Blocks.OAK_STAIRS, Direction.WEST)
            .lineX(-3, 3, 6, Blocks.OAK_PLANKS, Direction.UP)
            .lineX(-3, 3, -6, Blocks.OAK_PLANKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -3, Blocks.OAK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 3, Blocks.OAK_STAIRS, Direction.WEST)
            .lineX(-2, 2, 6, Blocks.OAK_PLANKS, Direction.UP)
            .lineX(-2, 2, -6, Blocks.OAK_PLANKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -2, Blocks.OAK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 2, Blocks.OAK_STAIRS, Direction.WEST)
            .lineX(-1, 1, 6, Blocks.OAK_PLANKS, Direction.UP)
            .lineX(-1, 1, -6, Blocks.OAK_PLANKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -1, Blocks.OAK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 1, Blocks.OAK_STAIRS, Direction.WEST)
            .lineZ(-7, 7, 0, Blocks.OAK_PLANKS, Direction.UP);

    public static final Schematic MEDIUM_HOUSE_MEDIVAL = new Schematic()
            .fillFromTo(-3, 3, -5, 5, Blocks.COBBLESTONE, Direction.UP) // cobblestone floor
            .walls(-4, 4, -6, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick trim
            .single(-5, 0, Blocks.STONE_BRICK_STAIRS, Direction.EAST)
            .ascendLayer() // go to layer 2
            .walls(-4, 4, -6, 6, Blocks.STONE_BRICKS, Direction.UP) // cobblestone walls
            .remove(-4, 0) // hole for door
            .single(-4, 0, Blocks.OAK_DOOR, Direction.EAST) // door
            .replace(-4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .single(3, 0, Blocks.CRAFTING_TABLE, Direction.WEST)
            .single(3, -1, Blocks.SMOKER, Direction.WEST)
            .single(3, 1, Blocks.BLAST_FURNACE, Direction.WEST)
            .single(3, -2, Blocks.CHEST, Direction.WEST)
            .single(3, 2, Blocks.CHEST, Direction.WEST)
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.LIGHT_GRAY_STAINED_GLASS, Direction.UP) // window
            .remove(-4, 0) // hole for door
            .replace(-4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.STONE_BRICKS, Direction.UP) // cobblestone walls
            .replace(-4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .ascendLayer()
            .walls(-4, 4, -6, 6, Blocks.STONE_BRICKS, Direction.UP) // cobblestone walls
            .replace(-4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick corners
            .ascendLayer()
            .fillFromTo(-3, 3, -5, 5, Blocks.COBBLESTONE, Direction.UP) // cobblestone ceiling
            .walls(-4, 4, -6, 6, Blocks.CHISELED_STONE_BRICKS, Direction.UP) // stone brick trim
            .replace(0, 0, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, 5, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, -5, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, 6, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, -6, Blocks.GLOWSTONE, Direction.UP)
            .lineZ(-7,7, -5, Blocks.STONE_BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 5, Blocks.STONE_BRICK_STAIRS, Direction.WEST)
            .ascendLayer()
            .lineZ(-7,7, -4, Blocks.STONE_BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 4, Blocks.STONE_BRICK_STAIRS, Direction.WEST)
            .lineX(-3, 3, 6, Blocks.STONE_BRICKS, Direction.UP)
            .lineX(-3, 3, -6, Blocks.STONE_BRICKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -3, Blocks.STONE_BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 3, Blocks.STONE_BRICK_STAIRS, Direction.WEST)
            .lineX(-2, 2, 6, Blocks.STONE_BRICKS, Direction.UP)
            .lineX(-2, 2, -6, Blocks.STONE_BRICKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -2, Blocks.STONE_BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 2, Blocks.STONE_BRICK_STAIRS, Direction.WEST)
            .lineX(-1, 1, 6, Blocks.STONE_BRICKS, Direction.UP)
            .lineX(-1, 1, -6, Blocks.STONE_BRICKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -1, Blocks.STONE_BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 1, Blocks.STONE_BRICK_STAIRS, Direction.WEST)
            .lineZ(-7, 7, 0, Blocks.STONE_BRICKS, Direction.UP);

    public static final Schematic MEDIUM_HOUSE_BRICK = new Schematic()
            .fillFromTo(-4, 4, -6, 6, Blocks.BRICKS, Direction.UP) // brick floor
            .single(-5, 0, Blocks.BRICK_STAIRS, Direction.EAST)
            .ascendLayer() // go to layer 2
            .walls(-4, 4, -6, 6, Blocks.BRICKS, Direction.UP) // brick walls
            .remove(-4, 0) // hole for door
            .single(-4, 0, Blocks.OAK_DOOR, Direction.EAST) // door
            .replace(-4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .single(3, 0, Blocks.CRAFTING_TABLE, Direction.WEST)
            .single(3, -1, Blocks.SMOKER, Direction.WEST)
            .single(3, 1, Blocks.BLAST_FURNACE, Direction.WEST)
            .single(3, -2, Blocks.CHEST, Direction.WEST)
            .single(3, 2, Blocks.CHEST, Direction.WEST)
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.GLASS, Direction.UP) // window
            .remove(-4, 0) // hole for door
            .replace(-4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.BRICKS, Direction.UP) // brick walls
            .replace(-4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .ascendLayer()
            .walls(-4, 4, -6, 6, Blocks.BRICKS, Direction.UP) // brick walls
            .replace(-4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.BRICKS, Direction.UP) // stone brick corners
            .ascendLayer()
            .fillFromTo(-4, 4, -6, 6, Blocks.BRICKS, Direction.UP) // brick floor
            .replace(0, 0, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, 5, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, -5, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, 6, Blocks.GLOWSTONE, Direction.UP)
            .replace(0, -6, Blocks.GLOWSTONE, Direction.UP)
            .lineZ(-7,7, -5, Blocks.BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 5, Blocks.BRICK_STAIRS, Direction.WEST)
            .ascendLayer()
            .lineZ(-7,7, -4, Blocks.BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 4, Blocks.BRICK_STAIRS, Direction.WEST)
            .lineX(-3, 3, 6, Blocks.BRICKS, Direction.UP)
            .lineX(-3, 3, -6, Blocks.BRICKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -3, Blocks.BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 3, Blocks.BRICK_STAIRS, Direction.WEST)
            .lineX(-2, 2, 6, Blocks.BRICKS, Direction.UP)
            .lineX(-2, 2, -6, Blocks.BRICKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -2, Blocks.BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 2, Blocks.BRICK_STAIRS, Direction.WEST)
            .lineX(-1, 1, 6, Blocks.BRICKS, Direction.UP)
            .lineX(-1, 1, -6, Blocks.BRICKS, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -1, Blocks.BRICK_STAIRS, Direction.EAST)
            .lineZ(-7,7, 1, Blocks.BRICK_STAIRS, Direction.WEST)
            .lineZ(-7, 7, 0, Blocks.BRICKS, Direction.UP);

    public static final Schematic MEDIUM_HOUSE_MODERN = new Schematic()
            .fillFromTo(-3, 3, -5, 5, Blocks.BROWN_WOOL, Direction.UP) // cobblestone floor
            .walls(-4, 4, -6, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick trim
            .single(-5, 0, Blocks.QUARTZ_STAIRS, Direction.EAST)
            .ascendLayer() // go to layer 2
            .walls(-4, 4, -6, 6, Blocks.WHITE_CONCRETE, Direction.UP) // cobblestone walls
            .remove(-4, 0) // hole for door
            .single(-4, 0, Blocks.OAK_DOOR, Direction.EAST) // door
            .replace(-4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .single(3, 0, Blocks.CRAFTING_TABLE, Direction.WEST)
            .single(3, -1, Blocks.SMOKER, Direction.WEST)
            .single(3, 1, Blocks.BLAST_FURNACE, Direction.WEST)
            .single(3, -2, Blocks.CHEST, Direction.WEST)
            .single(3, 2, Blocks.CHEST, Direction.WEST)
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.WHITE_STAINED_GLASS, Direction.UP) // window
            .remove(-4, 0) // hole for door
            .replace(-4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .ascendLayer() // go to layer 3
            .walls(-4, 4, -6, 6, Blocks.WHITE_CONCRETE, Direction.UP) // cobblestone walls
            .replace(-4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .ascendLayer()
            .walls(-4, 4, -6, 6, Blocks.WHITE_CONCRETE, Direction.UP) // cobblestone walls
            .replace(-4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, -6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(-4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .replace(4, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick corners
            .ascendLayer()
            .fillFromTo(-3, 3, -5, 5, Blocks.COBBLESTONE, Direction.UP) // cobblestone ceiling
            .walls(-4, 4, -6, 6, Blocks.LIGHT_GRAY_CONCRETE, Direction.UP) // stone brick trim
            .replace(0, 0, Blocks.SEA_LANTERN, Direction.UP)
            .replace(0, 5, Blocks.SEA_LANTERN, Direction.UP)
            .replace(0, -5, Blocks.SEA_LANTERN, Direction.UP)
            .replace(0, 6, Blocks.SEA_LANTERN, Direction.UP)
            .replace(0, -6, Blocks.SEA_LANTERN, Direction.UP)
            .lineZ(-7,7, -5, Blocks.QUARTZ_STAIRS, Direction.EAST)
            .lineZ(-7,7, 5, Blocks.QUARTZ_STAIRS, Direction.WEST)
            .ascendLayer()
            .lineZ(-7,7, -4, Blocks.QUARTZ_STAIRS, Direction.EAST)
            .lineZ(-7,7, 4, Blocks.QUARTZ_STAIRS, Direction.WEST)
            .lineX(-3, 3, 6, Blocks.WHITE_CONCRETE, Direction.UP)
            .lineX(-3, 3, -6, Blocks.WHITE_CONCRETE, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -3, Blocks.QUARTZ_STAIRS, Direction.EAST)
            .lineZ(-7,7, 3, Blocks.QUARTZ_STAIRS, Direction.WEST)
            .lineX(-2, 2, 6, Blocks.WHITE_CONCRETE, Direction.UP)
            .lineX(-2, 2, -6, Blocks.WHITE_CONCRETE, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -2, Blocks.QUARTZ_STAIRS, Direction.EAST)
            .lineZ(-7,7, 2, Blocks.QUARTZ_STAIRS, Direction.WEST)
            .lineX(-1, 1, 6, Blocks.WHITE_CONCRETE, Direction.UP)
            .lineX(-1, 1, -6, Blocks.WHITE_CONCRETE, Direction.UP)
            .ascendLayer()
            .lineZ(-7,7, -1, Blocks.QUARTZ_STAIRS, Direction.EAST)
            .lineZ(-7,7, 1, Blocks.QUARTZ_STAIRS, Direction.WEST)
            .lineZ(-7, 7, 0, Blocks.WHITE_CONCRETE, Direction.UP);
}
