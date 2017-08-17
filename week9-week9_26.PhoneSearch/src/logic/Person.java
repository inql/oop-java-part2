package logic;

/**
 * Created by Dawid on 07.08.2017.
 */
public class Person implements Comparable<Person>{

    private String name;
    private Address address;

    public Person(String name)
    {
        this.name = name;
        this.address = null;
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    public boolean have(String keyword)
    {
        if((this.name!= null && this.name.contains(keyword)) || (this.address!=null && this.address.getCity().contains(keyword)) || (this.address!= null && this.address.getStreet().contains(keyword)))
            return true;
        else
            return false;
    }
}
