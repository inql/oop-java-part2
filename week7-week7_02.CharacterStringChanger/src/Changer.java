import java.util.ArrayList;

/**
 * Created by Dawid on 12.07.2017.
 */
public class Changer {

    private ArrayList<Change> list;

    public Changer() {
        this.list = new ArrayList<Change>();
    }

    public void addChange(Change change)
    {
        list.add(change);
    }

    public String change(String characterString)
    {
        for(Change item:list)
        {
            characterString = item.change(characterString);
        }
        return characterString;
    }

}
