/**
 * Created by Dawid on 19.07.2017.
 */
public class Flight {

    private Plane plane;
    private String from;
    private String to;

    public Flight(Plane plane, String from, String to)
    {
        this.plane = plane;
        this.from = from;
        this.to = to;
    }

    public String toString()
    {
        return this.plane + " ("+this.from+"-"+this.to+")";
    }


}
