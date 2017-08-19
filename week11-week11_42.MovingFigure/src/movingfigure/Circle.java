package movingfigure;

import java.awt.*;

/**
 * Created by Dawid on 18.08.2017.
 */
public class Circle extends Figure {

    private int diameter;

    public Circle(int x, int y, int diameter)
    {
        super(x,y);
        this.diameter = diameter;
    }



    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(getX(),getY(),this.diameter,this.diameter);
    }
}
