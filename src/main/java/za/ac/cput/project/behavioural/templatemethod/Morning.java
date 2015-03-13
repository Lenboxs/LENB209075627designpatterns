package za.ac.cput.project.behavioural.templatemethod;

/**
 * Created by student on 2015/03/13.
 */
public class Morning extends EatTimes{

    @Override
    void startTime()
    {
        System.out.println("morning eating time start at 7h00");
    }
    @Override
    void endTime()
    {
        System.out.println("morning eating time end at 8h00");
    }

}
