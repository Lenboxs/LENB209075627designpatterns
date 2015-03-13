package za.ac.cput.project.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/13.
 */
public class FirstError extends ErrorLogger {

    public FirstError(int level) {
        this.level = level;
    }
    @Override
    public void write(String message)
    {
        System.out.println("first error::Logger" + message);
    }
}
