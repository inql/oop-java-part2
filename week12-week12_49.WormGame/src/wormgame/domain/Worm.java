package wormgame.domain;

import wormgame.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 20.08.2017.
 */
public class Worm {

    private Direction originalDirection;
    private List<Piece> pieceList;
    private int growth;
    private int length;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalDirection = originalDirection;
        this.pieceList = new ArrayList<>();
        this.pieceList.add(new Piece(originalX, originalY));
        this.growth = 0;
        this.length = this.pieceList.size();
    }

    public Direction getDirection() {
        return originalDirection;
    }

    public void setDirection(Direction dir) {
        this.originalDirection = dir;
    }

    public List<Piece> getPieces() {
        return pieceList;
    }

    public int getLength() {
        return pieceList.size();
    }

    public void move() {
        if (this.pieceList.size() < 3) {
            this.pieceList.add(this.calculateNewPiece());
        } else if (this.pieceList.size() >= 3) {
            if (this.growth == 0) {
                this.pieceList.add(this.calculateNewPiece());
                this.pieceList.remove(0);
            } else if (this.growth == 1) {
                this.pieceList.add(this.calculateNewPiece());
                this.growth = 0;
            }
        }


    }

    public Piece calculateNewPiece() {
        Piece head = getHead();
        Piece newHead = null;

        int x = head.getX();
        int y = head.getY();
        if (originalDirection == Direction.LEFT) {
            newHead = new Piece(x - 1, y);
        } else if (originalDirection == Direction.RIGHT) {
            newHead = new Piece(x + 1, y);
        } else if (originalDirection == Direction.UP) {
            newHead = new Piece(x, y - 1);
        } else if (originalDirection == Direction.DOWN) {
            newHead = new Piece(x, y + 1);
        }

        return newHead;
    }

    public void grow() {
        if (pieceList.size() >= 3)
            growth = 1;
    }

    public boolean runsInto(Piece piece) {
        for (Piece wormPiece : getPieces()) {
            if (wormPiece.runsInto(piece))
                return true;
        }
        return false;
    }

    public boolean runsIntoItself() {

        Piece head = pieceList.get(pieceList.size() - 1);

        for (int i = 0; i < pieceList.size() - 2; i++) {
            if (head.runsInto(pieceList.get(i)))
                return true;
        }
        return false;
    }

    public Piece getHead() {
        Piece head;
        if (this.pieceList.size() == 1) {
            head = this.pieceList.get(0);
        } else {
            head = this.pieceList.get(this.pieceList.size() - 1);
        }

        return head;
    }

}
