package reader.criteria;

/**
 * Created by Dawid on 19.08.2017.
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {



    @Override
    public boolean complies(String line) {
        if(line.isEmpty())
            return false;
        if(line.charAt(line.length()-1)=='?' || line.charAt(line.length()-1)=='!')
            return true;
        return false;
    }
}
