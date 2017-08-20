package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Timer;

import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(width / 2, height / 2, Direction.DOWN);
        generateApple();
        addActionListener(this);
        setInitialDelay(2000);

    }

    public void generateApple() {

        this.apple = null;

        do {

            this.apple = new Apple(randomInt(0, width - 1), randomInt(0, height - 1));

        } while (this.worm.runsInto(this.apple));
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (!continues) {
            return;
        }

        worm.move();
        Piece head = worm.getHead();
        if (worm.runsInto(apple)) {
            worm.grow();
            generateApple();
        }
        if (worm.runsIntoItself() || head.getX() < 0 || head.getX() > width - 1 || head.getY() < 0 || head.getY() > height - 1) {
            continues = false;
        }
        updatable.update();
        setDelay(1000 / worm.getLength());


    }

    private int randomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

}
