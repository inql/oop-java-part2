
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    public  String getRegCode() {
        return regCode;
    }public String getCountry() {
        return country;
    }private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object)
    {
        if(object == null)
            return false;

        if(getClass() != object.getClass())
            return false;

        RegistrationPlate compared = (RegistrationPlate) object;

        if(!this.regCode.equals(compared.getRegCode()) || this.regCode.isEmpty())
            return false;
        if(!this.country.equals(compared.getCountry()) || this.country.isEmpty())
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        if(this.regCode.isEmpty() || this.country.isEmpty())
            return 7;

        return this.regCode.hashCode() + this.country.hashCode();
    }

}