import java.util.ArrayList;

/**
 * Created by Dawid on 17.07.2017.
 */
public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight)
    {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing)
    {
        if(!(this.totalWeight()+thing.getWeight()>this.maxWeight))
            things.add(thing);
    }

    public String toString()
    {
        if(things.size()==0)
            return "empty ("+this.totalWeight()+" kg)";
        if(things.size()==1)
            return things.size()+" thing ("+this.totalWeight()+" kg)";
        return things.size()+" things ("+this.totalWeight()+" kg)";
    }

    public void printThings()
    {
        for(Thing item:things)
        {
            System.out.println(item);
        }
    }

    public int totalWeight()
    {
        int actWeight = 0;
        for(Thing item:things)
        {
            actWeight+=item.getWeight();
        }
        return actWeight;
    }

    public Thing heaviestThing()
    {
        if(things.isEmpty())
            return null;
        else
        {
            Thing heaviest = things.get(0);
            for(int i=1; i<things.size(); i++)
            {
                if(heaviest.getWeight()<things.get(i).getWeight())
                    heaviest = things.get(i);
            }
            return heaviest;
        }
    }



}
