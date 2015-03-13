package za.ac.cput.project.structural.bridge;

/**
 * Created by student on 2015/03/13.
 */
public class Farrie extends Transport{

    public Farrie(Engine engine){
        this.mass = 500;
        this.engine = engine;
    }
    @Override
    public void drive() {
        System.out.println("\nThe Farrie is driving");
        int power = engine.move();
        reportOnSpeed(power);
    }
}
