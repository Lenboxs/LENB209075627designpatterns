package za.ac.cput.project.structural.facade;

/**
 * Created by student on 2015/03/13.
 */
public class JobMaker {

    private Job doctor;
    private Job policeman;
    private Job itguy;

    public JobMaker() {
        doctor = new Doctor();
        policeman = new Policeman();
        itguy = new ItGuy();
    }

    public void workDoctor()
    {
        doctor.work();
    }
    public void workPoliceman()
    {
        policeman.work();
    }
    public void workItGuy()
    {
        itguy.work();
    }
}
