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

    public boolean hasWinner() {

        for (int row = 0; row < 3; row++) {
            if (cells[row][0] != ' ' &&
                    cells[row][0] == cells[row][1] &&
                    cells[row][1] == cells[row][2]) {

                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (cells[0][col] != ' ' &&
                    cells[0][col] == cells[1][col] &&
                    cells[1][col] == cells[2][col]) {

                return true;
            }
        }

        if (cells[0][0] != ' ' &&
                cells[0][0] == cells[1][1] &&
                cells[1][1] == cells[2][2]) {

            return true;
        }

        if (cells[0][2] != ' ' &&
                cells[0][2] == cells[1][1] &&
                cells[1][1] == cells[2][0]) {

            return true;
        }

        return false;
    }

    public boolean isFull() {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (cells[row][col] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}