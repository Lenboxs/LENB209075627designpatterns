package za.ac.cput.project.structural.facade;

/**
 * Created by student on 2015/03/13.
 */
public class Doctor implements Job{

    @Override
    public void work()
    {
        System.out.println("Doctor::work()");
    }
}
