package za.ac.cput.project.behavioural.visitor;

/**
 * Created by student on 2015/03/13.
 */
public class Engine implements CarPart {
    @Override
    public void approve(CarPartVisitor carPartVisitor)
    {
        carPartVisitor.visit(this);
    }
}
