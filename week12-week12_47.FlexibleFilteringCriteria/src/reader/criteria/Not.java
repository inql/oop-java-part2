package reader.criteria;

/**
 * Created by Dawid on 19.08.2017.
 */
public class Not implements Criterion {

    private Criterion input;

    public Not(Criterion input)
    {
        this.input = input;
    }


    @Override
    public boolean complies(String line) {
        return !this.input.complies(line);
    }
}
