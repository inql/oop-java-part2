import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 03.08.2017.
 */
public class Jumper implements Comparable<Jumper>{

    public String getName() {
        return name;
    }

    private String name;
    private int totalPoints;
    private List<Integer> jumps;

    public Jumper(String name)
    {
        this.name = name;
        this.jumps = new ArrayList<Integer>();
    }

    public String toString()
    {
        return this.name+" ("+this.totalPoints+" points)";
    }

    public void addJump(int length, int points)
    {
        this.totalPoints+=points;
        this.jumps.add(length);
    }

    @Override
    public int compareTo(Jumper o) {
        return this.totalPoints - o.totalPoints;
    }

    public void printJumpLengths()
    {
        for(int value: jumps)
        {
            if(this.jumps.indexOf(value)==this.jumps.size()-1)
                System.out.print(value+" m ");
            else
                System.out.print(value+" m,");
        }
    }
}
