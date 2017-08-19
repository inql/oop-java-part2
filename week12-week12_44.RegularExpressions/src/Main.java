import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        if(clockTime(input))
            System.out.println("ok");
        else
            System.out.println("not ok");
    }

    public static boolean isAWeekDay(String string)
    {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun"))
            return true;
        return false;
    }

    public static boolean allVowels(String string)
    {
        if(string.matches("[aeiouyäö]*"))
            return true;
        return false;
    }

    public static boolean clockTime(String string)
    {
        if(string.matches("^(?:2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9]$"))
            return true;
        return false;
    }
}
