package movingfigure;

import java.awt.*;

/**
 * Created by Dawid on 18.08.2017.
 */
public class Square extends Figure {

    private int sideLength;

    public Square(int x, int y, int sideLength)
    {
        super(x,y);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(),getY(),this.sideLength,this.sideLength);
    }
}
