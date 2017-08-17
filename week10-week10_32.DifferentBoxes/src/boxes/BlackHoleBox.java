package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dawid on 13.08.2017.
 */
public class BlackHoleBox extends Box {

    private Collection<Thing> things;

    public BlackHoleBox()
    {
        this.things = new ArrayList<>();
    }


    @Override
    public void add(Thing thing) {
        this.things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
