package za.ac.cput.project.structural.decorator;

/**
 * Created by student on 2015/03/13.
 */
public class Main {
    public static void main(String[] args) {

        Form square= new Square();

        Form bordersquare = new BorderDecorator(new Square());

        Form borderRectangle = new BorderDecorator(new Triangle());
        System.out.println("Square with no border");
        square.design();

        System.out.println("\nSquare border");
        bordersquare.design();

        System.out.println("\nTriangle border");
        borderRectangle.design();
    }
}
