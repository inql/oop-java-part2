package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dawid on 07.08.2017.
 */
public class WordInspection {

    private final File file;

    public WordInspection(File file) throws Exception
    {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException
    {
        Scanner reader = new Scanner(file);

        int wordCount = 0;

        while(reader.hasNextLine())
        {
            String line = reader.nextLine();
            wordCount++;
        }

        reader.close();

        return wordCount;

    }

    public List<String> wordsContainingZ() throws FileNotFoundException
    {
        List<String> result = new ArrayList<>();
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine())
        {
            String word = reader.nextLine();
            if(word.contains("z"))
            {
                result.add(word);
            }
        }

        return result;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException
    {
        List<String> result = new ArrayList<>();
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine())
        {
            String word = reader.nextLine();
            if(word.charAt(word.length()-1)=='l')
                result.add(word);
        }

        return result;
    }

    public List<String> palindromes() throws FileNotFoundException
    {
        List<String> result = new ArrayList<>();
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine())
        {
            String word = reader.nextLine();
            if(word.equals(getReversed(word)))
                result.add(word);
        }
        reader.close();
        return result;
    }

    private String getReversed(String word)
    {
        String result = "";
        for(int i = word.length()-1; i>=0; i--)
        {
            result+=word.charAt(i);
        }

        return result;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException
    {
        List<String> result = new ArrayList<>();
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine())
        {
            String word = reader.nextLine();
            if(checkIfWordContainAllVowels(word))
                result.add(word);
        }

        reader.close();
        return result;
    }

    private boolean checkIfWordContainAllVowels(String word)
    {
        String checkList = "aeiouyäö";
        int validation = 0;
        for(int i = 0; i<checkList.length(); i++)
        {
            if(word.contains(checkList.substring(i,i+1)))
                validation++;
        }
        if(validation==8)
            return true;
        else
            return false;
    }


}
