import java.util.ArrayList;

/**
 * Created by Dawid on 25.07.2017.
 */
public class Box implements ToBeStored {

    private ArrayList<ToBeStored> things;
    private double maxWeight;

    public Box(double maxWeight)
    {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored item)
    {
        if(this.weight()+item.weight()<=this.maxWeight)
            this.things.add(item);
    }


    @Override
    public double weight() {

        double actWeight = 0.0;

        for(ToBeStored item:this.things)
        {
            actWeight+=item.weight();
        }
        return actWeight;
    }

    @Override
    public String toString()
    {
        return "Box: "+this.things.size()+" things, total weight "+weight()+" kg";
    }
}
