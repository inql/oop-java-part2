package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 04.08.2017.
 */
public class Box implements Thing{

    private int maximumCapacity;
    private List<Thing> itemsInside;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.itemsInside = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing)
    {
        if(thing.getVolume()+this.getVolume()>maximumCapacity)
        {
            return false;
        }
        else
        {
            itemsInside.add(thing);
            return true;
        }
    }

    @Override
    public int getVolume() {
        int cap = 0;

        for(Thing item : itemsInside)
        {
            cap+=item.getVolume();
        }

        return cap;
    }
}
