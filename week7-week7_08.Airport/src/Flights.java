import java.util.ArrayList;

/**
 * Created by Dawid on 19.07.2017.
 */
public class Flights {

    private ArrayList<Flight> list;

    public Flights()
    {
        this.list = new ArrayList<Flight>();
    }

    public void add(Flight flight)
    {
        this.list.add(flight);
    }

    public void printAll()
    {
        for(Flight item: this.list)
        {
            System.out.println(item);
        }
    }





}
