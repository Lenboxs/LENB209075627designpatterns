package za.ac.cput.project.behavioural.visitor;

/**
 * Created by student on 2015/03/13.
 */
public interface CarPartVisitor {
    public void visit(Windows windows);
    public void visit(Body body);
    public void visit(Engine engine);
}
