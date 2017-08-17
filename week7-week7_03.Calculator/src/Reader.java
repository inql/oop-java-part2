import java.util.Scanner;

/**
 * Created by Dawid on 12.07.2017.
 */
public class Reader {

    private Scanner input;

    public Reader()
    {
        this.input = new Scanner(System.in);
    }


    public String readString()
    {
        return input.nextLine();
    }

    public int readInteger()
    {
        return Integer.parseInt(input.nextLine());
    }


}
