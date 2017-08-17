import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Dawid on 19.07.2017.
 */
public class Dictionary {

    private HashMap<String, String> database;

    public Dictionary()
    {
        this.database = new HashMap<String, String>();
    }

    public String translate(String word)
    {
        if(this.database.containsKey(word))
            return this.database.get(word);
        return null;
    }

    public void add(String word, String translation)
    {
        this.database.put(word,translation);
    }

    public int amountOfWords()
    {
        return this.database.size();
    }

    public ArrayList<String> translationList()
    {
        ArrayList<String> list = new ArrayList<String>();

        for(String key: this.database.keySet())
        {
            list.add(key+" = "+this.database.get(key));
        }

        return list;

    }



}
