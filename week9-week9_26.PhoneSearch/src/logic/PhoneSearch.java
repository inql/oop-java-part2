package logic;

import java.util.*;

/**
 * Created by Dawid on 07.08.2017.
 */
public class PhoneSearch {

    private Map<Person, Set<String>> phoneBook;

    public PhoneSearch()
    {
        this.phoneBook = new HashMap<Person, Set<String>>();
    }

    public void addNumber(String whose, String value)
    {

        Person target = findSpecific(whose);

        if(target==null)
        {
            target = new Person(whose);
            phoneBook.put(target,new HashSet<String>());
        }
        phoneBook.get(target).add(value);

    }

    public void searchForANumber(String whose)
    {

        Person target = findSpecific(whose);

        if(phoneBook.containsKey(target))
        {
            for(String item : phoneBook.get(target))
            {
                System.out.println(" "+item);
            }
        }
        else
            System.out.println("  not found");

    }

    public void searchForAPersonByNumber(String number)
    {
        for(Person item: phoneBook.keySet())
        {
            if(phoneBook.get(item).contains(number))
            {
                System.out.println(" "+item.getName());
                return;
            }
        }
        System.out.println(" not found");
    }

    public void addAnAddress(String whose, Address newAddress)
    {
        Person target = findSpecific(whose);

        if(target==null)
        {
            target = new Person(whose,newAddress);
            phoneBook.put(target,new HashSet<String>());
        }
        else
        {
            target.setAddress(newAddress);
        }

    }

    public void showPersonalInfo(String whose)
    {
        Person target = findSpecific(whose);
        if(target==null)
            System.out.println("  not found");
        else
        {
            if(target.getAddress()==null)
            {
                System.out.println("  address unknown");
            }
            else
            {
                System.out.println(target.getAddress());
            }

            if(phoneBook.get(target).isEmpty())
            {
                System.out.println("  phone number not found");
            }
            else
            {
                System.out.println("  phone numbers:");
                for(String item : phoneBook.get(target))
                {
                    System.out.println("   "+item);
                }
            }

        }
    }

    public void deletePersonalInfo(String whose)
    {
        Person target = findSpecific(whose);
        if(target!=null)
        {
            phoneBook.remove(target);
        }
    }

    public void searchByKeywords(String key)
    {
        SortedSet<Person> keys = new TreeSet<Person>(phoneBook.keySet());
        if(!key.isEmpty())
        {
            boolean check = false;
            for(Person item : keys)
            {
               if(item.have(key))
                {
                    System.out.println("\n "+item.getName());
                    showPersonalInfo(item.getName());
                    check = true;
                }
            }
            if(check == false)
            {
                System.out.println(" keyword not found");
            }
        }
        else
        {
            for(Person item : keys)
            {
                System.out.println("\n "+item.getName());
                showPersonalInfo(item.getName());
            }
        }











            /*

        if(key.isEmpty())
        {
            for(Person item : keys)
            {
                System.out.println("\n "+item.getName());
                showPersonalInfo(item.getName());
            }
        }
        else
        {

            Set<Person> toShow = new HashSet<>();

            for(Person item : keys)
            {
                if(item.contains(key))
                    toShow.add(item);
            }
            if(toShow.isEmpty())
                System.out.println(" keyword not found");
            else
            {
                for(Person item : toShow)
                {
                    System.out.println("\n "+item.getName());
                    showPersonalInfo(item.getName());
                }
            }
        }

         */
    }



    private Person findSpecific(String name)
    {
        for(Person item : phoneBook.keySet())
        {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }




}
