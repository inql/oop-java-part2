package tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Dawid on 07.08.2017.
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    private Map<String, Integer> database;

    //<Word,numberOfDuplicates>

    public PersonalDuplicateRemover()
    {
        this.database = new HashMap<>();
    }


    @Override
    public void add(String characterString) {
        if(database.containsKey(characterString))
        {
            database.put(characterString,database.get(characterString)+1);
        }
        else
        {
            database.put(characterString,0);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        int result = 0;
        for(String item : database.keySet())
        {
            result+=database.get(item);
        }
        return result;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
      //  if(database.keySet().isEmpty())
        //    return null;
       // else
        //{
            Set<String> result = new HashSet<>();
            for(String item : database.keySet())
            {
                result.add(item);
            }

            return result;
      //  }

    }

    @Override
    public void empty() {

        database.clear();

    }
}
