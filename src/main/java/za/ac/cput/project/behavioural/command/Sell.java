package za.ac.cput.project.behavioural.command;

/**
 * Created by student on 2015/03/13.
 */
public class Sell implements Order{
    private supply sup;

    public Sell(supply sup)
    {
        this.sup = sup;
    }

    public void run()
    {
        sup.selling();
    }
}
