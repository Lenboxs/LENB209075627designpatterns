package za.ac.cput.project.behavioural.visitor;

/**
 * Created by student on 2015/03/13.
 */
public class CarPartDisplayVisitor implements CarPartVisitor{

    public void visit(Windows windows)
    {
        System.out.println("car windows");
    }
    public void visit(Body body)
    {
        System.out.println("car body");
    }
    public void visit(Engine engine)
    {
        System.out.println("car engine");
    }
}
