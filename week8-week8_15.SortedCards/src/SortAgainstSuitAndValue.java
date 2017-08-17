import java.util.Comparator;

/**
 * Created by Dawid on 03.08.2017.
 */
public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compare(Card card1, Card card2)
    {
        int result = card1.getSuit() - card2.getSuit();
        if(result == 0 )
        {
            return card1.getValue() - card2.getValue();
        }
        else
        {
            return result;
        }
    }
}
