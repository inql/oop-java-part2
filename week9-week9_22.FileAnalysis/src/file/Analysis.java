package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Dawid on 07.08.2017.
 */
public class Analysis {

    private final File file;

    public Analysis(File file) throws Exception
    {
        this.file = file;
    }

    public int lines() throws FileNotFoundException
    {
        int numOfLines = 0;

        Scanner reader = new Scanner(file);

        while(reader.hasNextLine())
        {
            String line = reader.nextLine();
            numOfLines++;
        }

        reader.close();

        return numOfLines;
    }

    public int characters() throws FileNotFoundException
    {
        int numOfCharacters = 0;
        Scanner reader = new Scanner(file);

        numOfCharacters = lines();

        while(reader.hasNextLine())
        {
            String line = reader.nextLine();
            numOfCharacters+=line.length();
        }

        reader.close();

        return numOfCharacters;

    }
}
