package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 04.08.2017.
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things)
    {
        List<Box> result = new ArrayList<>();

        result.add(new Box(boxesVolume));

        int i = 0;

        for(Thing item : things)
        {
            if(!result.get(i).addThing(item))
            {
                result.add(new Box(boxesVolume));
                i++;
                result.get(i).addThing(item);
            }
        }

        return result;
    }
}
