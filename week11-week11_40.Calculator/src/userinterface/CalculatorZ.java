package userinterface;

import applicationlogic.BasicCalculator;
import applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dawid on 18.08.2017.
 */
public class CalculatorZ extends CalculatorRoot implements ActionListener {


    public CalculatorZ(JTextField input, JTextField output, JButton z) {
        super(input,output,z);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        load().reset();
        setNewValues();



    }
}
