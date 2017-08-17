package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator logic;

    public UserInterface(Calculator logic)
    {
        this.logic = logic;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        JLabel text = new JLabel("0");
        JButton button = new JButton("Click!");

        ClickListener listener = new ClickListener(this.logic, text);

        button.addActionListener(listener);

        container.add(text,BorderLayout.CENTER);
        container.add(button,BorderLayout.SOUTH);


    }

    public JFrame getFrame() {
        return frame;
    }
}
