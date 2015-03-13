package za.ac.cput.project.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/13.
 */
public class ThirdError extends  ErrorLogger {

    public ThirdError(int level) {
        this.level = level;
    }
    @Override
    public void write(String message)
    {
        System.out.println("third error::Logger" + message);
    }
}
