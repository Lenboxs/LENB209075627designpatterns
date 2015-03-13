package za.ac.cput.project.behavioural.command;

/**
 * Created by student on 2015/03/13.
 */
public class Buy implements Order{
    private supply sup;

    public Buy(supply sup)
    {
        this.sup = sup;
    }

    public void run()
    {
        sup.buying();
    }
}
