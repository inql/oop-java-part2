import java.io.File;
import java.util.Scanner;

/**
 * Created by Dawid on 07.08.2017.
 */
public class Printer {

    private final File f;
    private Scanner reader;

    public Printer(String fileName) throws Exception {
        this.f = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception
    {
        reader = new Scanner(this.f);

        while(reader.hasNextLine())
        {
            String line = reader.nextLine();
            if(line.contains(word))
                System.out.println(line);
        }

        reader.close();


    }


}
