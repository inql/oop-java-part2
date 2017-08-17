/**
 * Created by Dawid on 19.07.2017.
 */
public class Plane {

    public String getId() {
        return id;
    }

    private String id;
    private int capacity;

    public Plane(String id, int capacity)
    {
        this.id = id;
        this.capacity = capacity;
    }

    public String toString()
    {
        return this.id +" ("+this.capacity+" ppl)";
    }


}
