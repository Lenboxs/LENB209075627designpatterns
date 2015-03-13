package za.ac.cput.project.structural.bridge;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {

        Transport tr = new Farrie(new V12Engin()) ;
        tr.drive();
        tr.setEngine(new FiveCylEngin());
        tr.drive();

        tr = new Toyota(new FiveCylEngin());
        tr.drive();
        tr.setEngine(new V12Engin());
        tr.drive();

    }
}
