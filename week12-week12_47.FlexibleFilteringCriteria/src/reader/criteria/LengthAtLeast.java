package reader.criteria;

/**
 * Created by Dawid on 19.08.2017.
 */
public class LengthAtLeast implements Criterion {

    private int length;

    public LengthAtLeast(int length)
    {
        this.length = length;
    }

    @Override
    public boolean complies(String line) {
        return line.length()>=this.length;
    }
}
