package za.ac.cput.project.behavioural.templatemethod;

/**
 * Created by student on 2015/03/13.
 */
public abstract class EatTimes {

    abstract void startTime();
    abstract void endTime();

    public final void time()
    {
        startTime();
        endTime();
    }

}
