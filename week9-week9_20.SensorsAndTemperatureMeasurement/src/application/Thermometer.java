package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
 * Created by Dawid on 05.08.2017.
 */
public class Thermometer implements Sensor{

    private boolean state;

    public Thermometer() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public int measure() {
        if(isOn())
        {
            return ThreadLocalRandom.current().nextInt(-30,30+1);
        }
        else
            throw new IllegalStateException();

    }
}
