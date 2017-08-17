package boxes;

/**
 * Created by Dawid on 13.08.2017.
 */
public class OneThingBox extends Box{


    private Thing thing;

    public OneThingBox()
    {
        this.thing = null;
    }

    @Override
    public void add(Thing thing) {
        if(this.thing==null)
            this.thing = thing;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.thing == null || thing == null)
            return false;
        return this.thing.equals(thing);
    }




}
