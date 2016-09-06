package com.gojek.bootcamp;

/*
    *Defines State of game
 */

import java.util.ArrayList;
import java.util.*;

class GameState {
    private Set<Cell> aliveCells = new HashSet<>();

    GameState(Set<Cell> cells) {
        for (Cell cell : cells) {
            aliveCells.add(cell);
        }
    }

    GameState nextGameState() {
        GameState nextGameState = new GameState(new HashSet<>());
        for (Cell cell : aliveCells) {
            if (cell.twoOrThreeAliveNeighbours(aliveCells)) {
                nextGameState.aliveCells.add(cell);
            }
        }
        return nextGameState;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || (other.getClass() != this.getClass())) {
            return false;
        }
        GameState that = (GameState) other;
        return aliveCells.equals(that.aliveCells);
    }

    @Override
    public String toString() {
        return "GameState{" +
                "aliveCells=" + aliveCells +
                '}';
    }

    /*private GameState generateNewCell(GameState gameState) {
        for (List<Integer> aliveCell : aliveCells) {
            generateAliveCellInNeighbourOf(aliveCell, gameState);
        }
        return gameState;
    }

    private void generateAliveCellInNeighbourOf(List<Integer> cell, GameState gameState) {
        int dx[] = {1, -1, 0, 0, 1, 1, -1, -1};
        int dy[] = {0, 0, 1, -1, 1, -1, 1, -1};
        for (int i = 0; i < 8; i++) {
            int neighbourX = cell.get(0) + dx[i];
            int neighbourY = cell.get(1) + dy[i];
            List<Integer> neighbourCell = Arrays.asList(neighbourX, neighbourY);
            if (!(isCellExistIn(this, neighbourCell))) {
                if (countAliveNeighbours(neighbourCell) == 3 && !isCellExistIn(gameState, neighbourCell)) {
                    gameState.addCell(neighbourCell);
                }
            }
        }
    }

    private int countAliveNeighbours(List<Integer> cell) {
        int dx[] = {1, -1, 0, 0, 1, 1, -1, -1};
        int dy[] = {0, 0, 1, -1, 1, -1, 1, -1};
        int countAliveNeighbours = 0;
        for (int i = 0; i < 8; i++) {
            int neighbourX = cell.get(0) + dx[i];
            int neighbourY = cell.get(1) + dy[i];
            List<Integer> neighbourCell = Arrays.asList(neighbourX, neighbourY);
            if (isCellExistIn(this, neighbourCell)) {
                countAliveNeighbours++;
            }
        }
        return countAliveNeighbours;
    }

    private boolean isCellExistIn(GameState thisState, List<Integer> cell) {
        for (List<Integer> aliveCell : thisState.aliveCells) {
            if (aliveCell.get(0) == cell.get(0) && aliveCell.get(1) == cell.get(1)) {
                return true;
            }
        }
        return false;
    }

    private boolean compareTo(GameState givenState) {
        return this.aliveCells.size() == givenState.aliveCells.size() && areAliveCellsEqualTo(givenState);
    }

    private boolean areAliveCellsEqualTo(GameState other) {
        for (List<Integer> aliveCell : aliveCells) {
            boolean isCellNotEqual = true;
            for (List<Integer> otherAliveCell : other.aliveCells) {
                if (aliveCell.get(0) == otherAliveCell.get(0) && aliveCell.get(1) == otherAliveCell.get(1)) {
                    isCellNotEqual = false;
                    break;
                }
            }
            if (isCellNotEqual) {
                return false;
            }
        }
        return true;
    }

    private void addCell(List<Integer> newCell) {//cell
        aliveCells.add(newCell);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || (other.getClass() != this.getClass())) {
            return false;
        }
        GameState otherState = (GameState) other;
        return this.compareTo(otherState);
    }

    @Override
    public String toString() {
        return "GameState{" +
                "aliveCells=" + aliveCells +
                '}';
    }*/
}
