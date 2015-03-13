package za.ac.cput.project.behavioural.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class MessageBoard {

    public static void message(User user, String message)
    {
        System.out.println(" [" + user.getName() + "] : " + message);
    }
}
