package za.ac.cput.project.behavioural.strategy;

/**
 * Created by student on 2015/03/13.
 */
public class ToBig implements Strategy{

    @Override
    public boolean checkSize(int size)
    {
        if(size >= 5)
            return true;
        else
            return false;
    }
}
