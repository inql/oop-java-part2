package clicker.applicationlogic;

/**
 * Created by Dawid on 17.08.2017.
 */
public class PersonalCalculator implements Calculator {

    private int value;

    public PersonalCalculator()
    {
        this.value = 0;
    }



    @Override
    public int giveValue() {
        return this.value;
    }

    @Override
    public void increase() {
        this.value++;
    }
}
