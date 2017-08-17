import java.util.Comparator;

/**
 * Created by Dawid on 02.08.2017.
 */
public class SortAgainstSuit implements Comparator<Card> {
    public int compare(Card card1, Card card2)
    {
        return card1.getSuit() - card2.getSuit();
    }
}
