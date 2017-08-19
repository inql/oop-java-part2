package gameoflife;

/**
 * Created by Dawid on 19.08.2017.
 */
public abstract class GameOfLifeBoard {

    private int width;
    private int height;
    private boolean[][] board;

    public GameOfLifeBoard(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new boolean[width][height];
    }

    public boolean[][] getBoard()
    {
        return this.board;
    }

    public int getWidth(){return this.width;}

    public int getHeight(){return this.height;}

    public void playTurn(){

    }

    public abstract void turnToLiving(int x, int y);
    public abstract void turnToDead(int x, int y);
    public abstract boolean isAlive(int x, int y);
    public abstract void initiateRandomCells(double probabilityForEachCell);
    public abstract int getNumberOfLivingNeighbours(int x, int y);
    public abstract void manageCell(int x, int y, int livingNeighbours);



}
