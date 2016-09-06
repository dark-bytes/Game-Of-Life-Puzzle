package com.gojek.bootcamp;
/*
    * Game of life (Read problem description)
 */

class GameOfLife {
    private GameState state;

    GameOfLife(GameState state) {
        this.state = state;
    }

    GameState nextTick() {
        return this.state.nextGameState();
    }
}
