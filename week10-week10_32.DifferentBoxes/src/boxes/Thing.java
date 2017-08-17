package boxes;

public class Thing{

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        if(weight >= 0)
            this.weight = weight;
        else
            throw new IllegalArgumentException();

    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o==null)
            return false;
        if(o.getClass()!=this.getClass())
            return false;

        Thing compared = (Thing) o;

        if((this.name == null) ? (compared.name != null) : !this.name.equals(compared.getName()))
        {
            return false;
        }

        return true;



    }

    @Override
    public int hashCode()
    {
        int hash = 12;
        return 11 * hash + (this.name!=null?this.name.hashCode():0);

    }

}
