
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public int hashCode()
    {
        return this.ringingYear * this.latinName.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        if(o==null)
            return false;
        if(o.getClass()!=this.getClass())
            return false;

        Bird compared = (Bird) o;

        return compared.latinName.equals(this.latinName) && compared.ringingYear==this.ringingYear;
    }



}




