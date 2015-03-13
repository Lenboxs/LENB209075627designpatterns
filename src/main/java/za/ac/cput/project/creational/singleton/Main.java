package za.ac.cput.project.creational.singleton;

/**
 * Created by student on 2015/03/13.
 */
public class Main {
    public static void main(String[] args) {

        Singleton singletonExample = Singleton.getInstance();
        singletonExample.sayHello();
    }
}
