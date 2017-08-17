package application;

/**
 * Created by Dawid on 05.08.2017.
 */
public class ConstantSensor implements Sensor{

    private int value;

    public ConstantSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return value;
    }
}
