package movingfigure;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(0,0,50);

        UserInterface ui = new UserInterface(square);
        SwingUtilities.invokeLater(ui);
    }
}
