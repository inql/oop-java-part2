import java.util.ArrayList;

/**
 * Created by Dawid on 19.07.2017.
 */
public class Planes {

    private ArrayList<Plane> list;


    public Planes() {
        this.list = new ArrayList<Plane>();
    }

    public void add(Plane plane)
    {
        this.list.add(plane);
    }

    public void printAll()
    {
        for(Plane item: this.list)
        {
            System.out.println(item);
        }
    }

    public Plane findPlane(String id)
    {
        for(Plane item:this.list)
        {
            if(item.getId().equals(id))
                return item;
        }
        return null;
    }
}
