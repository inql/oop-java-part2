import java.util.ArrayList;

/**
 * Created by Dawid on 17.07.2017.
 */
public class Container {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight)
    {
        this.suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }


    public int totalWeight()
    {
        int actWeight = 0;
        for(Suitcase item:suitcases)
        {
            actWeight+=item.totalWeight();
        }
        return actWeight;
    }

    public void addSuitcase(Suitcase suitcase)
    {
        if(!(this.totalWeight()+suitcase.totalWeight()>this.maxWeight))
            suitcases.add(suitcase);
    }

    public String toString()
    {
        return suitcases.size() + " suitcases ("+this.totalWeight()+" kg)";
    }

    public void printThings()
    {
        for(Suitcase item:suitcases)
        {
            item.printThings();
        }
    }


}
