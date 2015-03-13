package za.ac.cput.project.structural.bridge;

/**
 * Created by student on 2015/03/13.
 */
public class FiveCylEngin implements Engine{

    int power;

    public FiveCylEngin(){
        power = 100;
    }

    @Override
    public int move() {
        System.out.println("The Five Cylinder Engine is running");
        return power;
    }

}
