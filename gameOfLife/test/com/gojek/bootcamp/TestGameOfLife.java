package com.gojek.bootcamp;

import org.junit.Assert;
import org.junit.*;

import java.util.HashSet;
import java.util.Set;

public class TestGameOfLife {

    @Test
    public void expectNoAliveCellWhenOneAndOne() {
        Set<Cell> cells = new HashSet<>();
        cells.add(new Cell(new Coordinate(1, 1)));
        cells.add(new Cell(new Coordinate(3, 1)));
        Set<Cell> nextCellState = new HashSet<>();
        GameState state = new GameState(cells);
        GameState newState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("No alive cells", gameOfLife.nextTick(), newState);
    }
    /*
    @Test
    public void expectNextStateEqualGivenStateCaseOne() {
        int[][] cell = {{1, 2}, {1, 3}, {1, 1}};
        int[][] cell1 = {{1, 2}, {2, 2}, {0, 2}};
        GameState state = new GameState(cell);
        GameState expectedNewState = new GameState(cell1);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("State To Be Equal", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseTwo() {
        int[][] cell = {{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        int[][] nextCellState = {{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        GameState state = new GameState(cell);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Block Pattern - Still Life", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseThree() {
        int[][] cell = {{0, 1}, {1, 0}, {2, 1}, {0, 2}, {1, 2}};
        int[][] nextCellState = {{0, 1}, {1, 0}, {2, 1}, {0, 2}, {1, 2}};
        GameState state = new GameState(cell);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Boat Pattern - Still life", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseFour() {
        int[][] cell = {{1, 1}, {1, 0}, {1, 2}};
        int[][] nextCellState = {{1, 1}, {0, 1}, {2, 1}};
        GameState state = new GameState(cell);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Blinker pattern - oscillator", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseFive() {
        int[][] cell = {{1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {2, 4}};
        int[][] nextCellState = {{0, 2}, {1, 1}, {1, 4}, {2, 1}, {2, 4}, {3, 3}};
        GameState state = new GameState(cell);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Toad pattern - two phase oscillator", gameOfLife.nextTick(), expectedNewState);
    }*/
}