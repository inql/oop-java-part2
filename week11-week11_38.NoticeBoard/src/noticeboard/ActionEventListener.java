package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dawid on 17.08.2017.
 */
public class ActionEventListener implements ActionListener {

    public ActionEventListener(JTextField input, JLabel output) {
        this.input = input;
        this.output = output;
    }

    private JTextField input;
    private JLabel output;

    @Override
    public void actionPerformed(ActionEvent e) {
        this.output.setText(this.input.getText());
        this.input.setText("");
    }
}
