package reader.criteria;

/**
 * Created by Dawid on 19.08.2017.
 */
public class AllLines implements Criterion {

    public AllLines()
    {

    }


    @Override
    public boolean complies(String line) {
        return true;
    }
}
