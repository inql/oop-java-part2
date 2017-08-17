import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Dawid on 20.07.2017.
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String > owners;

    public VehicleRegister()
    {
        this.owners = new HashMap<RegistrationPlate, String >();
    }

    public boolean add(RegistrationPlate plate, String owner)
    {
        if(owners.containsKey(plate))
            return false;
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate)
    {
        if(!owners.containsKey(plate))
            return null;
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate)
    {
        if(!owners.containsKey(plate))
            return false;
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates()
    {
        for(RegistrationPlate item : owners.keySet())
        {
            System.out.println(item);
        }
    }

    public void printOwners()
    {
        ArrayList<String> alPrinted = new ArrayList<String>();
        for(String item: owners.values())
        {
            if(!alPrinted.contains(item))
            {
                System.out.println(item);
                alPrinted.add(item);
            }
        }
    }




}
