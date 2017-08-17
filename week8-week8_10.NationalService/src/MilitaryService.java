/**
 * Created by Dawid on 20.07.2017.
 */
public class MilitaryService implements NationalService {

    private int daysLeft;

    public MilitaryService(int daysLeft)
    {
        this.daysLeft = daysLeft;
    }



    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if(daysLeft>0)
            daysLeft-=1;
    }
}
