/**
 * Created by Dawid on 17.07.2017.
 */
public class Thing {

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    private String name;
    private int weight;

    public Thing(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String toString()
    {
        return this.name+" ("+this.weight+" kg)";
    }



}
