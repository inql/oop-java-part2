package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(10, 10);
        board.initiateRandomCells(0.1);

        GameOfLifeTester tester = new GameOfLifeTester(board);
        tester.play();
    }
}
