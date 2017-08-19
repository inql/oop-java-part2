package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dawid on 19.08.2017.
 */
public class Employees {

    private List<Person> personList;

    public Employees()
    {
        this.personList = new ArrayList<>();
    }

    public void add(Person person)
    {
        this.personList.add(person);
    }

    public void add(List<Person> persons)
    {
        this.personList.addAll(persons);
    }

    public void print()
    {
        Iterator<Person> iterator = this.personList.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    public void print(Education education)
    {
        Iterator<Person> iterator = this.personList.iterator();

        while(iterator.hasNext())
        {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation()==education)
                System.out.println(nextPerson);
        }

    }

    public void fire(Education education)
    {
        Iterator<Person> iterator = this.personList.iterator();

        while(iterator.hasNext())
        {
            if(iterator.next().getEducation()==education)
                iterator.remove();
        }
    }

}
