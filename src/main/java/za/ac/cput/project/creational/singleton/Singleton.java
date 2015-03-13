package za.ac.cput.project.creational.singleton;

/**
 * Created by student on 2015/03/13.
 */
public class Singleton {

    private static Singleton singleton = null;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if( singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public String sayHello(){

        return "Hello";
    }
}
