package moving.domain;

/**
 * Created by Dawid on 04.08.2017.
 */
public class Item implements Thing, Comparable<Item>{

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String toString()
    {
        return name+" ("+volume+" dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        return this.getVolume() - o.getVolume();
    }
}
