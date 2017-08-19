package reader.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 19.08.2017.
 */
public class AtLeastOne implements Criterion{

    List<Criterion> criteria;

    public AtLeastOne(Criterion... criteria)
    {
        this.criteria = new ArrayList<>();
        for(int i=0; i<criteria.length; i++)
        {
            this.criteria.add(criteria[i]);
        }
    }


    @Override
    public boolean complies(String line) {
        for(Criterion criterion : this.criteria)
        {
            if(criterion.complies(line))
                return true;
        }
        return false;
    }
}
