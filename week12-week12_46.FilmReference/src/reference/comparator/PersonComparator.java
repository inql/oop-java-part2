package reference.comparator;

import reference.domain.Person;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by Dawid on 19.08.2017.
 */
public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }


    @Override
    public int compare(Person o1, Person o2) {
        return this.peopleIdentities.get(o2) - this.peopleIdentities.get(o1);
    }

}
