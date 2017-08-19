package movingfigure;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 18.08.2017.
 */
public class CompoundFigure extends Figure{

    private List<Figure> figures;

    public CompoundFigure()
    {
        super(0,0);
        this.figures = new ArrayList<>();
    }

    public void add(Figure f)
    {
        this.figures.add(f);
    }


    @Override
    public void draw(Graphics graphics) {
        for(Figure f : this.figures)
        {
            f.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy)
    {

        for(Figure f : this.figures)
        {
            f.move(dx,dy);
        }
    }
}
