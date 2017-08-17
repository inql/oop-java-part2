package farmsimulator;

import java.util.Random;

/**
 * Created by Dawid on 13.08.2017.
 */
public class Cow implements Milkable, Alive{

    private final int UDDER_MIN = 15;
    private final int UDDER_MAX = 40;
    private Random random = new Random();
    private double udderCap;
    private double amount;

    public String getName() {
        return name;
    }

    private String name;

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow()
    {
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.udderCap = UDDER_MIN + random.nextInt(UDDER_MAX - UDDER_MIN + 1);
        this.amount = 0.0;
    }
    public Cow(String name)
    {
        this.name = name;
        this.udderCap = UDDER_MIN + random.nextInt(UDDER_MAX - UDDER_MIN + 1);
        this.amount = 0.0;
    }

    public double getCapacity()
    {
        return this.udderCap;
    }

    public double getAmount()
    {
        return this.amount;
    }

    public String toString()
    {
        return this.name +" "+Math.ceil(this.amount)+"/"+Math.ceil(this.udderCap);
    }

    @Override
    public void liveHour() {
        this.amount += (7 + random.nextInt(20 - 7 + 1)) / 10.0;
        if (this.amount > this.udderCap) {
            this.amount = this.udderCap;
        }
    }

    @Override
    public double milk() {
        double milked = this.amount;
        this.amount = 0;
        return milked;
    }
}
