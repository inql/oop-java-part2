import java.util.Scanner;

/**
 * Created by Dawid on 19.07.2017.
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary)
    {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start()
    {
        System.out.println("Statements:\n\tadd - adds a word pair to the dictionary\n\ttranslate - asks a word and prints its translation\n\tquit - quit the text user interface\n");
        boolean check = true;
        while(check)
        {
            System.out.print("Statement: ");
            String choice = reader.nextLine();
            switch(choice)
            {
                case "quit":
                    System.out.println("Cheers!");
                    check = false;
                    break;
                case "add":
                    add(reader);
                    break;
                case "translate":
                    translate(reader);
                    break;
                default:
                    System.out.println("Unknown statement");
                    break;
            }
            System.out.println();
        }
    }

    public void add(Scanner reader)
    {
        System.out.print("In Finnish: ");
        String fin = reader.nextLine();
        System.out.print("Translation: ");
        String tran = reader.nextLine();
        this.dictionary.add(fin,tran);
    }

    public void translate(Scanner reader)
    {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: "+this.dictionary.translate(word));
    }


}
