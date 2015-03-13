package za.ac.cput.project.structural.proxy;

/**
 * Created by student on 2015/03/13.
 */
public class Main {
    public static void main(String[] args) {
        Picture picture = new Proxy("Family.jpg");

        picture.print();
        System.out.println("");

        picture.print();
    }
}
