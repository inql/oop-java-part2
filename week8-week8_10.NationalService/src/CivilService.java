/**
 * Created by Dawid on 20.07.2017.
 */
public class CivilService implements NationalService {

    private int daysLeft;

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if(daysLeft>0)
        daysLeft-=1;
    }

    public CivilService()
    {
        this.daysLeft = 362;
    }
}
