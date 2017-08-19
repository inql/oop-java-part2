package reader.criteria;

/**
 * Created by Dawid on 19.08.2017.
 */
public class Both implements Criterion {

    private Criterion first;
    private Criterion second;

    public Both(Criterion first, Criterion second)
    {
        this.first = first;
        this.second = second;
    }


    @Override
    public boolean complies(String line) {
        return this.first.complies(line) && this.second.complies(line);
    }
}
