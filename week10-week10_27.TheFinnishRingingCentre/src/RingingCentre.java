import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dawid on 08.08.2017.
 */
public class RingingCentre {

    private Map<Bird, List<String>> database;

    public RingingCentre()
    {
        this.database = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place)
    {
        if(database.get(bird) == null)
        {
            database.put(bird, new ArrayList<>());
        }
            database.get(bird).add(place);

    }

    public void observations(Bird bird)
    {

        if(database.get(bird)==null)
        {
            System.out.println(bird+" observations: 0");
        }
        else
        {
            System.out.println(bird+" observations: "+database.get(bird).size());
            for(String lol : database.get(bird))
            {
                System.out.println(lol);
            }
        }

    }



}
