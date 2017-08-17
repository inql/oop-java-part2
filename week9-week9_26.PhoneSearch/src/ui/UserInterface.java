package ui;

import logic.Address;
import logic.PhoneSearch;

import java.util.Scanner;

/**
 * Created by Dawid on 07.08.2017.
 */
public class UserInterface {

    private Scanner reader;
    private PhoneSearch database;

    public UserInterface()
    {
        this.reader = new Scanner(System.in);
        this.database = new PhoneSearch();
    }

    public void start()
    {

        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit\n");

        String choice = "";
        do {

            System.out.print("command: ");
            choice = reader.nextLine();
            String given1, given2, given3;
            switch(choice)
            {
                case "1":
                    given1 = askByPerson(reader);
                    System.out.print("number: ");
                    given2 = reader.nextLine();
                    database.addNumber(given1,given2);
                    break;
                case "2":
                    database.searchForANumber(askByPerson(reader));
                    break;
                case "3":
                    database.searchForAPersonByNumber(askByNumber(reader));
                    break;
                case "4":
                    given1 = askByAddress(reader);
                    System.out.print("street: ");
                    given2 = reader.nextLine();
                    System.out.print("city: ");
                    given3 = reader.nextLine();
                    database.addAnAddress(given1, new Address(given2, given3));
                    break;
                case "5":
                    database.showPersonalInfo(askByInfo(reader));
                    break;
                case "6":
                    database.deletePersonalInfo(askByInfo(reader));
                    break;
                case "7":
                    System.out.print("keyword (if empty, all listed): ");
                    given1 = reader.nextLine();
                    database.searchByKeywords(given1);
                    break;
                default:
                    break;
            }
            System.out.println();
        }while(!choice.equals("x"));
    }

    private String askByPerson(Scanner reader)
    {
        System.out.print("whose number: ");
        String given = reader.nextLine();
        return given;
    }

    private String askByNumber(Scanner reader)
    {
        System.out.print("number: ");
        String given = reader.nextLine();
        return given;
    }

    private String askByAddress(Scanner reader)
    {
        System.out.print("whose address: ");
        String given = reader.nextLine();
        return given;
    }

    private String askByInfo(Scanner reader)
    {
        System.out.print("whose information: ");
        String given = reader.nextLine();
        return given;
    }


}
