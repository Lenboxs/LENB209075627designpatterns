package za.ac.cput.project.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/13.
 */
public class SecondError extends ErrorLogger {
    public SecondError(int level) {
        this.level = level;
    }
    @Override
    public void write(String message)
    {
        System.out.println("second error::Logger" + message);
    }
}
