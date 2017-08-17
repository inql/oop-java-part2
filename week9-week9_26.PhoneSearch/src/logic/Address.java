package logic;

/**
 * Created by Dawid on 07.08.2017.
 */
public class Address {

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    private String street;
    private String city;


    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String toString()
    {
        return "  address: "+street+" "+city;
    }




}
