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

    @Test
    public void expectNextStateEqualGivenStateCaseOne() {
        Set<Cell> cells = new HashSet<>();
        Set<Cell> nextCellState = new HashSet<>();
        cells.add(new Cell(new Coordinate(1, 2)));
        cells.add(new Cell(new Coordinate(1, 3)));
        cells.add(new Cell(new Coordinate(1, 1)));

        nextCellState.add(new Cell(new Coordinate(1, 2)));
        nextCellState.add(new Cell(new Coordinate(2, 2)));
        nextCellState.add(new Cell(new Coordinate(0, 2)));

        GameState state = new GameState(cells);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("State To Be Equal", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseTwo() {
        Set<Cell> cells = new HashSet<>();
        Set<Cell> nextCellState = new HashSet<>();
        cells.add(new Cell(new Coordinate(1, 1)));
        cells.add(new Cell(new Coordinate(1, 2)));
        cells.add(new Cell(new Coordinate(2, 1)));
        cells.add(new Cell(new Coordinate(2, 2)));
        nextCellState.add(new Cell(new Coordinate(1, 1)));
        nextCellState.add(new Cell(new Coordinate(1, 2)));
        nextCellState.add(new Cell(new Coordinate(2, 1)));
        nextCellState.add(new Cell(new Coordinate(2, 2)));

        GameState state = new GameState(cells);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Block Pattern - Still Life", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseThree() {
        Set<Cell> cells = new HashSet<>();
        Set<Cell> nextCellState = new HashSet<>();
        cells.add(new Cell(new Coordinate(0, 1)));
        cells.add(new Cell(new Coordinate(1, 0)));
        cells.add(new Cell(new Coordinate(2, 1)));
        cells.add(new Cell(new Coordinate(0, 2)));
        cells.add(new Cell(new Coordinate(1, 2)));

        nextCellState.add(new Cell(new Coordinate(0, 1)));
        nextCellState.add(new Cell(new Coordinate(1, 0)));
        nextCellState.add(new Cell(new Coordinate(2, 1)));
        nextCellState.add(new Cell(new Coordinate(0, 2)));
        nextCellState.add(new Cell(new Coordinate(1, 2)));

        GameState state = new GameState(cells);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Boat Pattern - Still life", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseFour() {
        Set<Cell> cells = new HashSet<>();
        Set<Cell> nextCellState = new HashSet<>();
        cells.add(new Cell(new Coordinate(1, 1)));
        cells.add(new Cell(new Coordinate(1, 0)));
        cells.add(new Cell(new Coordinate(1, 2)));

        nextCellState.add(new Cell(new Coordinate(1, 1)));
        nextCellState.add(new Cell(new Coordinate(0, 1)));
        nextCellState.add(new Cell(new Coordinate(2, 1)));

        GameState state = new GameState(cells);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Blinker pattern - oscillator", gameOfLife.nextTick(), expectedNewState);
    }

    @Test
    public void expectNextStateEqualGivenStateCaseFive() {
        Set<Cell> cells = new HashSet<>();
        Set<Cell> nextCellState = new HashSet<>();
        cells.add(new Cell(new Coordinate(1, 1)));
        cells.add(new Cell(new Coordinate(1, 2)));
        cells.add(new Cell(new Coordinate(1, 3)));
        cells.add(new Cell(new Coordinate(2, 2)));
        cells.add(new Cell(new Coordinate(2, 3)));
        cells.add(new Cell(new Coordinate(2, 4)));
        nextCellState.add(new Cell(new Coordinate(0, 2)));
        nextCellState.add(new Cell(new Coordinate(1, 1)));
        nextCellState.add(new Cell(new Coordinate(1, 4)));
        nextCellState.add(new Cell(new Coordinate(2, 1)));
        nextCellState.add(new Cell(new Coordinate(2, 4)));
        nextCellState.add(new Cell(new Coordinate(3, 3)));
        GameState state = new GameState(cells);
        GameState expectedNewState = new GameState(nextCellState);
        GameOfLife gameOfLife = new GameOfLife(state);
        Assert.assertEquals("Toad pattern - two phase oscillator", gameOfLife.nextTick(), expectedNewState);
    }
}