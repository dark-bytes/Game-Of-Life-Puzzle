package com.gojek.bootcamp;

import java.util.Set;
// Represents cell in game

public class Cell {
    Coordinate point;

    Cell(Coordinate point) {
        this.point = point;
    }

    boolean twoOrThreeAliveNeighbours(Set<Cell> aliveCells) {
        Set<Coordinate> points = point.neighbourPoints();
        int countAliveCells = countAliveNeighbours(points, aliveCells);
        return (countAliveCells == 2 || countAliveCells == 3);
    }

    private int countAliveNeighbours(Set<Coordinate> points, Set<Cell> aliveCells) {
        int count = 0;
        for (Cell cell : aliveCells) {
            if (points.contains(cell.point)) {
                count++;
            }
        }
        return count;
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
