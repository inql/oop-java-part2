import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dawid on 02.08.2017.
 */
public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cardList;

    public Hand() { this.cardList = new ArrayList<Card>();}

    public void add(Card card)
    {
        this.cardList.add(card);
    }

    public void print()
    {
        for(Card item: this.cardList)
        {
            System.out.println(item);
        }
    }

    public int getTotalValue()
    {
        int value = 0;

        for(Card item: this.cardList)
        {
            value+=item.getValue();
        }

        return value;
    }



    public void sort()
    {
        Card key = null;
        Card temp = null;
        int index = 0;
        for(int i = 0; i<this.cardList.size(); i++)
        {
            key = this.cardList.get(i);
            for(int j = i; j< this.cardList.size(); j++)
            {
                if(key.compareTo(this.cardList.get(j)) == 1)
                {
                    key = this.cardList.get(j);
                    index = j;
                }

            }
            temp = this.cardList.get(i);
            this.cardList.add(i,key);
            this.cardList.add(index,temp);
            this.cardList.remove(i+1);
            this.cardList.remove(index+1);
        }
    }
    @Override
    public int compareTo(Hand o) {
        if(this.getTotalValue() > o.getTotalValue())
        {
            return 1;
        }
        else if (this.getTotalValue() < o.getTotalValue())
        {
            return -1;
        }
        else
            return 0;
    }

    public void sortAgainstSuit()
    {
        Collections.sort(this.cardList, new SortAgainstSuitAndValue());
    }
}
