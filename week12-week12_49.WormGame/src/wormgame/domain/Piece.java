package wormgame.domain;

/**
 * Created by Dawid on 20.08.2017.
 */
public class Piece {

    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece) {
        return this.getX() == piece.getX() && this.getY() == piece.getY();
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
