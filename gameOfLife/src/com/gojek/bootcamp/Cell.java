package com.gojek.bootcamp;

import java.util.HashSet;
import java.util.Set;

// Represents cell in game of life

class Cell {
    Coordinate point;

    Cell(Coordinate point) {
        this.point = point;
    }

    Set<Cell> generateNewCell(Set<Cell> aliveCells) {
        Set<Coordinate> deadCells = deadCell(coordinatesOf(aliveCells));
        Set<Cell> alive = new HashSet<>();
        for (Coordinate deadCell : deadCells) {
            if (threeAliveNeighbours(deadCell, aliveCells)) {
                alive.add(new Cell(deadCell));
            }
        }
        return alive;
    }

    boolean twoOrThreeAliveNeighbours(Set<Cell> alive) {
        Set<Coordinate> points = point.neighbour();
        points.retainAll(coordinatesOf(alive));
        return (points.size() == 2 || points.size() == 3);
    }

    private boolean threeAliveNeighbours(Coordinate cell, Set<Cell> alive) {
        Set<Coordinate> points = cell.neighbour();
        points.retainAll(coordinatesOf(alive));
        return points.size() == 3;
    }

    private Set<Coordinate> deadCell(Set<Coordinate> aliveCells) {
        Set<Coordinate> points = point.neighbour();
        points.removeAll(aliveCells);
        return points;
    }

    private Set<Coordinate> coordinatesOf(Set<Cell> cells) {
        Set<Coordinate> point = new HashSet<>();
        for (Cell cell : cells) {
            point.add(cell.point);
        }
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return point.equals(cell.point);

    }

    @Override
    public int hashCode() {
        return point.hashCode();
    }

    @Override
    public String toString() {
        return "Cell{" +
                "point=" + point +
                '}';
    }

}
