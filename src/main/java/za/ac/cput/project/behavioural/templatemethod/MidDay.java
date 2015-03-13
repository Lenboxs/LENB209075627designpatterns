package za.ac.cput.project.behavioural.templatemethod;

/**
 * Created by student on 2015/03/13.
 */
public class MidDay extends EatTimes{
    @Override
    void startTime()
    {
        System.out.println("midday eating time start at 1h00");
    }
    @Override
    void endTime()
    {
        System.out.println("midday eating time end at 2h00");
    }
}
