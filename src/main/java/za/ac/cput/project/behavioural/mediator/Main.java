package za.ac.cput.project.behavioural.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {
        User lenny = new User("lenny");
        User elton = new User("elton");

        lenny.postedMessage("awe! elton!");
        elton.postedMessage("awe! lenny!");
    }
}
