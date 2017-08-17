import java.util.HashMap;

/**
 * Created by Dawid on 19.07.2017.
 */
public class PromissoryNote {

    private HashMap<String, Double> loans;

    public PromissoryNote()
    {
        this.loans = new HashMap<String,Double>();
    }

    public void setLoan(String toWhom, double value)
    {
        if(this.loans.containsKey(toWhom))
        {
            this.loans.remove(toWhom);
        }
        this.loans.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose)
    {
        if(!this.loans.containsKey(whose))
            return 0;
        return this.loans.get(whose);
    }

}
