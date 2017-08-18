package applicationlogic;

/**
 * Created by Dawid on 18.08.2017.
 */
public class BasicCalculator implements Calculator {

    private int output;
    private int input;

    public BasicCalculator(int output, int input)
    {
        this.output = output;
        this.input = input;
    }

    @Override
    public void add() {
        this.output+=this.input;
    }

    @Override
    public void substract() {
        this.output-=this.input;
    }

    @Override
    public void reset() {
        this.output = 0;
    }

    @Override
    public int getValue() {
        return this.output;
    }

    @Override
    public boolean checkIfZIsZero() {
        return this.output==0;
    }
}
