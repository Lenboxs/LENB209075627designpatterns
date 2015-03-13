package za.ac.cput.project.behavioural.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void postedMessage(String message)
    {
        MessageBoard.message(this,message);
    }
}
