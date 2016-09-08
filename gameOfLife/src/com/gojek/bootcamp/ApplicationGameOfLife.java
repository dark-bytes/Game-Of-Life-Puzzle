package com.gojek.bootcamp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ApplicationGameOfLife {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Size of present State");
        Set<Cell> cells = new HashSet<>();
        int size = inp.nextInt();
        for (int i = 0; i < size; i++) {
            int x = inp.nextInt();
            int y = inp.nextInt();
            cells.add(new Cell(new Coordinate(x, y)));
        }
        GameState state = new GameState(cells);
        GameOfLife gameOfLife = new GameOfLife(state);
        System.out.println(gameOfLife.nextTick());
    }
}
