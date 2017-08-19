package movingfigure;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dawid on 18.08.2017.
 */
public class DrawingBoard extends JPanel {

    private Figure figure;

    public DrawingBoard(Figure figure)
    {
        super.setBackground(Color.WHITE);
        this.figure = figure;
    }


    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        figure.draw(g);
    }

}
