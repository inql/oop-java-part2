package reference.domain;

/**
 * Created by Dawid on 19.08.2017.
 */
public class Person {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
