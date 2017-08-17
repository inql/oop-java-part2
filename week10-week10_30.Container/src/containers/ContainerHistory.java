package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dawid on 12.08.2017.
 */
public class ContainerHistory{

    private ArrayList<Double> history;

    public ContainerHistory()
    {
        this.history = new ArrayList<>();
    }

    public void add(double amount)
    {
        history.add(amount);
    }

    public void reset()
    {
        history.clear();
    }

    public String toString()
    {
        return history.toString();
    }

    public double maxValue()
    {
        if(history.isEmpty())
            return 0.0;
        double max = history.get(0);
        for(double item : history)
        {
            if(max < item)
                max = item;
        }

        return max;
    }

    public double minValue()
    {
        if(history.isEmpty())
            return 0.0;
        double min = history.get(0);
        for(double item : history)
        {
            if(min > item)
                min = item;
        }

        return min;

    }

    public double sum()
    {
        double sum = 0.0;
        for(double item : history)
        {
            sum+=item;
        }

        return sum;
    }

    public double average()
    {
        return sum()/history.size();
    }

    public double greatestFluctuation()
    {
       double maxFluctuation = 0.0;
       if(history.isEmpty() || history.size()==1)
       {
           return maxFluctuation;
       }
       else
       {
           for(int i = 0; i<history.size()-1; i++)
           {
               double first = history.get(i);
               double second = history.get(i+1);
               double diff = Math.abs(first-second);
               if(diff>maxFluctuation)
                   maxFluctuation=diff;
           }
       }
       return maxFluctuation;
    }

    public double variance()
    {

            double firstPart = 0.0;
            double mean = average();
            for(double item : history)
            {
                firstPart+=Math.pow((item-mean),2);
            }
            return firstPart/(history.size()-1);

    }



}
