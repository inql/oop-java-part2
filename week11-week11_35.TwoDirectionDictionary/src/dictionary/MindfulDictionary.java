package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Dawid on 16.08.2017.
 */
public class MindfulDictionary {

    private Map<String, String> dict;
    private String fileName;



    public MindfulDictionary()
    {
        this.dict = new HashMap<>();
    }

    public MindfulDictionary(String file)
    {
        this();
        this.fileName = file;
    }

    public void add(String word, String translation)
    {
        if(!this.dict.containsKey(word))
            this.dict.put(word,translation);
    }

    public String translate(String word)
    {
        for(String item : this.dict.keySet())
        {
            if(item.equals(word))
                return this.dict.get(item);
            if(this.dict.get(item).equals(word))
                return item;
        }

        return null;
    }

    public void remove(String word)
    {

        String valueToBeRemoved ="";

        if(this.dict.keySet().contains(word))
            valueToBeRemoved = word;
        else
        {
            for(String item : this.dict.keySet())
            {
                if(this.dict.get(item).equals(word))
                {
                    valueToBeRemoved = item;
                }
            }
        }
        this.dict.remove(valueToBeRemoved);
    }

    public boolean load()
    {
        try
        {
            File file = new File(this.fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.dict.put(parts[0],parts[1]);
            }
            reader.close();
            return true;
        } catch (Exception e)
        {
            return false;
        }

    }

    public boolean save()
    {
        try
        {
            File file = new File(this.fileName);
            FileWriter writer = new FileWriter(this.fileName);
            for(String item : this.dict.keySet())
            {
                writer.write(item+":"+this.dict.get(item)+"\n");
            }
            writer.close();
            return true;
        } catch(Exception e)
        {
            return false;
        }
    }


}
