package com.gojek.bootcamp;

import java.util.Scanner;

public class GameOfLifeApplication {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter Size of present State");
        int size = inp.nextInt();
        int[][] cell = new int[size][2];
        for(int i = 0;i < size;i++){
            cell[i][0] = inp.nextInt();
            cell[i][1] = inp.nextInt();
        }
        //GameState state = new GameState(cell);
        //GameOfLife gameOfLife = new GameOfLife(state);
        //System.out.println(gameOfLife.nextTick().toString());
    }
}
