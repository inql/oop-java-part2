package people;

/**
 * Created by Dawid on 08.08.2017.
 */
public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return this.name+"\n  "+this.address;
    }

}
