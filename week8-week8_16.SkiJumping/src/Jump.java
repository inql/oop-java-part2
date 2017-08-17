import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Dawid on 03.08.2017.
 */
public class Jump {

    private Random random;

    public int getLength() {
        return length;
    }

    private int length;
    private List<Integer> votes;

    public Jump()
    {
        this.votes = new ArrayList<Integer>();
    }

    public void goJump()
    {
        this.length = generate(60,120);
        for(int i = 0; i<5; i++)
        {
            this.votes.add(generate(10,20));
        }
    }

    public int generate(int low, int high)
    {
        this.random = new Random();
        return random.nextInt(high-low)+low;
    }

    public int getScore()
    {
        Collections.sort(this.votes);

        int total = 0;

        for(int item : this.votes)
        {
            total+=item;
        }

        //remove the smallest and the greatest

        total-=Collections.min(this.votes);
        total-=Collections.max(this.votes);

        //add jump value

        total+=this.length;

        return total;
    }


    public String toString()
    {
        return "    length: "+this.length+"\n    judge votes: "+this.votes.toString();
    }



}
