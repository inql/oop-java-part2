package clicker.ui;

import clicker.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dawid on 17.08.2017.
 */
public class ClickListener implements ActionListener {

    private Calculator calc;
    private JLabel text;

    public ClickListener(Calculator calc, JLabel text) {
        this.calc = calc;
        this.text = text;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();
        this.text.setText(""+this.calc.giveValue());
    }
}
