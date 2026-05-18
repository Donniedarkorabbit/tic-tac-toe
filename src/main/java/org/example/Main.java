package org.example;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();

        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');

        System.out.println("Current game:");
        board.print();

        if (board.hasWinner()) {
            System.out.println("Player X wins!");
        }

        System.out.println();
        System.out.println("Starting new game...");
        System.out.println();

        board.clear();

        board.print();
    }
}