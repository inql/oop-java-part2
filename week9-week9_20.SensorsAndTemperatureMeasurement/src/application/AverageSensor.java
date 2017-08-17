package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 05.08.2017.
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;


    public AverageSensor()
    {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor additional)
    {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for(Sensor item : sensors)
        {
            if(!item.isOn())
            {
                return false;
            }

        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor item : sensors)
        {
            item.on();
        }
    }

    @Override
    public void off() {
        for(Sensor item : sensors)
        {
            item.off();
        }
    }

    @Override
    public int measure() {
        if(sensors.isEmpty() || !isOn())
            throw new IllegalStateException();
        else
        {
            int value = 0;

            for(Sensor item : sensors)
            {
                value+=item.measure();
            }

            value/=sensors.size();
            readings.add(value);
            return value;
        }
    }

    public List<Integer> readings()
    {
        return readings;
    }
}
