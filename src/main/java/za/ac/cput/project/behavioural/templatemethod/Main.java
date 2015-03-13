package za.ac.cput.project.behavioural.templatemethod;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String [] args)
    {
        EatTimes et = new Morning();
        et.time();
        System.out.println();
        et = new MidDay();
        et.time();
        System.out.println();
        et = new Night();
        et.time();


    }
}
