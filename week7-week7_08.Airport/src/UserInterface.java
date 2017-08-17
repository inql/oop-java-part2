import java.util.Scanner;

/**
 * Created by Dawid on 19.07.2017.
 */
public class UserInterface {

    private Scanner reader;
    private Flights flights;
    private Planes planes;

    public UserInterface(Scanner reader, Flights flights, Planes planes)
    {
        this.reader = reader;
        this.flights = flights;
        this.planes = planes;
    }

    public void start()
    {
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
        boolean check = true;
        while(check)
        {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String choice = this.reader.nextLine();
            switch (choice)
            {
                case "1":
                    addAirplane();
                    break;
                case "2":
                    addFlight();
                    break;
                case "x":
                    check = false;
                    System.out.println();
                    break;
                default:
                    break;
            }

        }
        check = true;
        System.out.println("Flight service");
        System.out.println("------------\n");
        while(check)
        {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String choice = this.reader.nextLine();
            switch (choice)
            {
                case "1":
                    this.planes.printAll();
                    break;
                case "2":
                    this.flights.printAll();
                    break;
                case "3":
                    System.out.println(planeInfo());
                    break;
                case "x":
                    check = false;
                    System.out.println();
                    break;
                default:
                    break;
            }
            System.out.println();
        }
    }

    public void addAirplane()
    {
        System.out.println("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.println("Give plane capacity: ");
        int cap = Integer.parseInt(this.reader.nextLine());
        this.planes.add(new Plane(id,cap));
    }

    public void addFlight()
    {
        System.out.println("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.println("Give departure airport code: ");
        String from = this.reader.nextLine();
        System.out.println("Give destination airport code: ");
        String to = this.reader.nextLine();
        this.flights.add(new Flight(this.planes.findPlane(id),from,to));
    }

    public Plane planeInfo()
    {
        System.out.println("Give plane ID: ");
        String id = this.reader.nextLine();
        Plane found = this.planes.findPlane(id);
        return found;
    }


}