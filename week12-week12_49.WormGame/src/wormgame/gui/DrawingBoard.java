package wormgame.gui;

import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dawid on 20.08.2017.
 */
public class DrawingBoard extends JPanel implements Updatable {

    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        super.setBackground(Color.WHITE);
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Worm worm = this.wormGame.getWorm();
        Apple apple = this.wormGame.getApple();
        graphics.setColor(Color.red);
        graphics.fillOval(apple.getX() * pieceLength, apple.getY() * pieceLength, pieceLength, pieceLength);
        graphics.setColor(Color.BLACK);
        for (Piece piece : worm.getPieces()) {
            graphics.fill3DRect(piece.getX() * pieceLength, piece.getY() * pieceLength, pieceLength, pieceLength, true);
        }
    }

    @Override
    public void update() {
        repaint();
    }
}
