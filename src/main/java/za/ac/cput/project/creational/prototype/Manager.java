package za.ac.cput.project.creational.prototype;

/**
 * Created by student on 2015/03/13.
 */
public class Manager implements Prototype{

    String name;
    public Manager(String name){
        this.name = name;
    }
    @Override
    public Prototype doClone() {
        return new Manager(name);
    }
    public String toString(){
        return "The Manager is: "+name;
    }
}
