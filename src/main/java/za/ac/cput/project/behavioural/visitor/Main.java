package za.ac.cput.project.behavioural.visitor;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[]args)
    {
        CarPart engine = new Engine();
        engine.approve(new CarPartDisplayVisitor());
    }
}
