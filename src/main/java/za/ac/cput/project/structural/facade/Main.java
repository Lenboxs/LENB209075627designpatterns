package za.ac.cput.project.structural.facade;

/**
 * Created by student on 2015/03/13.
 */
public class Main {
    public static void main(String[] args) {
        JobMaker jobMaker = new JobMaker();

        jobMaker.workDoctor();
        jobMaker.workItGuy();
        jobMaker.workPoliceman();

    }
}
