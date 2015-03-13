package za.ac.cput.project.structural.bridge;

/**
 * Created by student on 2015/03/13.
 */
public class V12Engin implements Engine{

    int power;

    public V12Engin(){
        power = 350;
    }

    @Override
    public int move() {
        System.out.println("The v12 engine is running");
        return power;
    }

}
