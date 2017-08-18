package userinterface;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dawid on 18.08.2017.
 */
public class UIButtons extends JPanel {

    private JTextField output;
    private JTextField input;

    public UIButtons(JTextField output, JTextField input)
    {
        super(new GridLayout(1,3));
        this.output = output;
        this.input = input;
        createComponents();
    }

    private void createComponents()
    {
        JButton zero = new JButton("Z");
        zero.addActionListener(new CalculatorZ(this.input,this.output,zero));
        JButton plus = new JButton("+");
        plus.addActionListener(new CalculatorP(this.input, this.output,zero ));
        JButton minus = new JButton("-");
        minus.addActionListener(new CalculatorM(this.input,this.output,zero));
        zero.setEnabled(false);
        add(plus);
        add(minus);
        add(zero);
    }


}
