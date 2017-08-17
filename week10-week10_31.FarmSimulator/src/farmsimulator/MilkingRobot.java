package farmsimulator;

/**
 * Created by Dawid on 13.08.2017.
 */
public class MilkingRobot {

    private BulkTank bulkTank;

    public MilkingRobot()
    {
        this.bulkTank = null;
    }

    public BulkTank getBulkTank()
    {
        if(this.bulkTank==null)
            return null;
        return this.bulkTank;
    }

    public void setBulkTank(BulkTank tank)
    {
        this.bulkTank = tank;
    }

    public void milk(Milkable milkable)
    {
        try
        {
            double amount = milkable.milk();
            this.bulkTank.addToTank(amount);
        }
        catch(Exception e)
        {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }


}
