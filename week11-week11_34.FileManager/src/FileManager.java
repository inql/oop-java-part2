
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {

        List<String> result = new ArrayList<>();
        File filex = new File(file);
        Scanner reader = new Scanner(filex);
        while(reader.hasNextLine())
        {
            String line = reader.nextLine();
            result.add(line);
        }
        reader.close();
        return result;
    }

    public void save(String file, String text) throws IOException {

        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {

        FileWriter writer = new FileWriter(file);
        for(String item : texts)
        {
            writer.write(item);
            writer.write("\n");
        }
        writer.close();
    }
}
