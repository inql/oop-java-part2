package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dawid on 13.08.2017.
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private Collection<Thing> things;


    public MaxWeightBox(int maxWeight)
    {
        if(maxWeight>=0)
            this.maxWeight = maxWeight;
        else
            throw new IllegalArgumentException();
        this.things = new ArrayList<>();

    }



    @Override
    public void add(Thing thing) {
        if(this.volume()+thing.getWeight()<=this.maxWeight)
        {
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.things.contains(thing))
            return true;
        return false;
    }

    private int volume()
    {
        int volume = 0;
        for(Thing item : this.things)
        {
            volume+=item.getWeight();
        }

        return volume;
    }




}
