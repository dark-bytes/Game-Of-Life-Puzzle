package com.gojek.bootcamp;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestCell {
    @Test
    public void expectTwoOrThreeNeighboursForGivenCellCaseOne() throws Exception {
        Set<Cell> alive = new HashSet<>();
        Cell given = new Cell(new Coordinate(1, 2));
        alive.add(new Cell(new Coordinate(1, 3)));
        alive.add(new Cell(new Coordinate(1, 1)));
        Assert.assertEquals("Two or Three Neighbours", true, given.twoOrThreeAliveNeighbours(alive));
    }

    @Test
    public void expectGenerateNewCell() throws Exception {
        Set<Cell> alive = new HashSet<>();
        Set<Cell> newCells = new HashSet<>();
        Cell given = new Cell(new Coordinate(1, 2));
        alive.add(new Cell(new Coordinate(1, 2)));
        alive.add(new Cell(new Coordinate(1, 3)));
        alive.add(new Cell(new Coordinate(1, 1)));
        newCells.add(new Cell(new Coordinate(2, 2)));
        newCells.add(new Cell(new Coordinate(0, 2)));
        Assert.assertEquals("Two or Three Neighbours", newCells, given.generateNewCell(alive));
    }
}
