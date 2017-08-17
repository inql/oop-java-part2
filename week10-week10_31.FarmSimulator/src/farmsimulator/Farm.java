package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 13.08.2017.
 */
public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<>();
    }

    public String toString()
    {
        String result = "Farm owner: "+this.owner+"\nBarn bulk tank: "+barn+"\n";
        if(this.cows.isEmpty())
            result+="No cows.";
        else
        {
            result+="Animals:\n";
            for(Cow item : cows)
            {
                result+="        "+item+"\n";
            }
        }
        return result;
    }

    public String getOwner()
    {
        return this.owner;
    }

    public void addCow(Cow cow)
    {
        this.cows.add(cow);
    }



    @Override
    public void liveHour() {
        for(Cow item : this.cows)
        {
            item.liveHour();
        }
    }

    public void manageCows()
    {
        this.barn.takeCareOf(this.cows);
    }

    public void installMilkingRobot(MilkingRobot robot)
    {
        this.barn.installMilkingRobot(robot);
    }


}
