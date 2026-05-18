package org.example;

public class Board {

    private char[][] cells;

    public Board() {
        cells = new char[3][3];
        clear();
    }

    public void clear() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                cells[row][col] = ' ';
            }
        }
    }

    public void print() {
        for (int row = 0; row < 3; row++) {
            System.out.println("-------------");

            for (int col = 0; col < 3; col++) {
                System.out.print("| " + cells[row][col] + " ");
            }

            System.out.println("|");
        }

        System.out.println("-------------");
    }

    public void place(int x, int y, char marker) {
        cells[x][y] = marker;
    }
}