
public class Main {

    public static void main(String[] Container) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container)
    {
        Suitcase suitcase;

        for(int i=1; i<=100; i++)
        {
            suitcase = new Suitcase(i);
            suitcase.addThing(new Thing("Brick", i));
            container.addSuitcase(suitcase);
        }
    }

}
