package farmsimulator;

import java.util.Collection;

/**
 * Created by Dawid on 13.08.2017.
 */
public class Barn {

    private BulkTank bulkTank;
    private MilkingRobot robot;

    public Barn(BulkTank tank)
    {
        this.bulkTank = tank;
    }

    public BulkTank getBulkTank()
    {
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot)
    {
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.bulkTank);
    }

    public void takeCareOf(Cow cow)
    {
        try
        {
            this.robot.milk(cow);
        }
        catch(Exception e)
        {
            throw new IllegalStateException();
        }
    }

    public void takeCareOf(Collection<Cow> cows)
    {
        for(Cow item : cows)
        {
            takeCareOf(item);
        }
    }

    public String toString()
    {
        return Math.ceil(this.bulkTank.getVolume())+"/"
                +Math.ceil(this.bulkTank.getCapacity());
    }



}
