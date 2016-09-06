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
}