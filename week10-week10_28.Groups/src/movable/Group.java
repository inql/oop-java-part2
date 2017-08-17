package movable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 08.08.2017.
 */
public class Group implements  Movable{

    private List<Movable> movables;

    public Group()
    {
        this.movables = new ArrayList<>();
    }

    public String toString()
    {
        String result = "";
        for(Movable item : movables)
        {
            result+=item+"\n";
        }
        return result;
    }

    public void addToGroup(Movable movable)
    {
        movables.add(movable);
    }


    @Override
    public void move(int dx, int dy) {

        for(Movable item : movables)
        {
            item.move(dx,dy);
        }


    }
}
