package game;

import gameoflife.GameOfLifeBoard;

import java.util.Random;

/**
 * Created by Dawid on 19.08.2017.
 */
public class PersonalBoard extends GameOfLifeBoard {


    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
        if(x>=0 && x<getWidth() && y>=0 && y<getHeight())
            getBoard()[x][y] = true;
    }

    @Override
    public void turnToDead(int x, int y) {
        if(x>=0 && x<getWidth() && y>=0 && y<getHeight())
            getBoard()[x][y] = false;
    }

    @Override
    public boolean isAlive(int x, int y) {
        if(x>=0 && x<getWidth() && y>=0 && y<getHeight())
            return getBoard()[x][y];
        return false;
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for(int i=0; i<getWidth(); i++)
        {
            for(int j=0; j<getHeight(); j++)
            {
                Random r = new Random();
                double d = r.nextDouble();
                if(d<probabilityForEachCell)
                    turnToLiving(i,j);
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {

        int value = 0;
        for(int i = x-1; i<=x+1; i++)
        {
            for(int j = y-1; j<=y+1; j++)
                try
                {
                    if(i==x && j==y)
                        continue;
                    if(getBoard()[i][j])
                        value++;


                }catch (ArrayIndexOutOfBoundsException e)
                {
                    continue;
                }
        }

        return value;


    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if(livingNeighbours < 2 || livingNeighbours > 3)
            turnToDead(x,y);
        if(livingNeighbours == 3)
            turnToLiving(x,y);
    }
}
