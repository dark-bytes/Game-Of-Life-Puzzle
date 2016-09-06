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
        GameState next = new GameState(new HashSet<>());
        for (Cell cell : aliveCells) {
            if (cell.twoOrThreeAliveNeighbours(aliveCells)) {
                next.aliveCells.add(cell);
            }
        }
        generateNewCell(next);
        return next;
    }

    private void generateNewCell(GameState next) {
        for (Cell cell : aliveCells) {

        }
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

}
