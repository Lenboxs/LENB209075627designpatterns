package za.ac.cput.project.structural.bridge;


/**
 * Created by student on 2015/03/13.
 */
public abstract class Transport {
    Engine engine;
    int mass;

    public abstract void drive();

    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void reportOnSpeed(int power){

        int ratio = mass / power;
        if(ratio < 3)
            System.out.println("The vehicle is going at a fast speed");
        else if(ratio > 3)
            System.out.println("The vehicle is going at an slow speed");

    }
}
