package farmsimulator;

/**
 * Created by Dawid on 13.08.2017.
 */
public class BulkTank {

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    private double capacity;
    private double volume;

    public BulkTank()
    {
        this.capacity = 2000.00;
        this.volume = 0.00;
    }

    public BulkTank(double capacity)
    {
        this.capacity = capacity;
        this.volume = 0.00;
    }

    public double howMuchFreeSpace()
    {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount)
    {
        if(amount + this.volume >= this.capacity)
            this.volume = this.capacity;
        else
            this.volume+=amount;
    }

    public double getFromTank(double amount)
    {
        if(this.volume-amount<=0)
        {
            this.volume = 0.00;
            return volume;
        }
        else
        {
            this.volume-=amount;
            return amount;
        }
    }

    public String toString()
    {
        return Math.ceil(this.volume)+"/"+Math.ceil(this.capacity);
    }



}
