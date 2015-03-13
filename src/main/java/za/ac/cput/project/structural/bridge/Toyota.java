package za.ac.cput.project.structural.bridge;

/**
 * Created by student on 2015/03/13.
 */
public class Toyota extends Transport {

    public Toyota(Engine engine){
        this.mass = 600;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe Toyota is driving");
        int power = engine.move();
        reportOnSpeed(power);
    }
}
