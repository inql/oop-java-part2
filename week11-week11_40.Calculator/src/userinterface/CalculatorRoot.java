package userinterface;

import applicationlogic.BasicCalculator;
import applicationlogic.Calculator;

import javax.swing.*;

/**
 * Created by Dawid on 18.08.2017.
 */
public class CalculatorRoot {

    private Calculator bc;

    public CalculatorRoot(JTextField input, JTextField output, JButton z) {
        this.input = input;
        this.output = output;
        this.z = z;
    }

    private JTextField input;
    private JTextField output;
    private JButton z;

    protected Calculator load()
    {
        try
        {
            this.bc = new BasicCalculator(Integer.parseInt(this.output.getText()),Integer.parseInt(this.input.getText()));
        } catch(NumberFormatException e)
        {
            this.bc = new BasicCalculator(Integer.parseInt(this.output.getText()),0);
        }
        return this.bc;
    }

    private void zCheck()
    {
        if(this.bc.checkIfZIsZero())
            this.z.setEnabled(false);
        else
            this.z.setEnabled(true);
    }

    protected void setNewValues()
    {
        this.output.setText(this.bc.getValue()+"");
        this.input.setText("");
        zCheck();
    }


}
