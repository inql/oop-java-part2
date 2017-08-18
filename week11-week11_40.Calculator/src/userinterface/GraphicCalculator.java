package userinterface;

import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {

        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        JTextField upper = new JTextField("0");
        JTextField lower = new JTextField("");
        upper.setEnabled(false);



        container.add(upper);
        container.add(lower);
        container.add(new UIButtons(upper,lower));


    }

    public JFrame getFrame() {
        return frame;
    }
}