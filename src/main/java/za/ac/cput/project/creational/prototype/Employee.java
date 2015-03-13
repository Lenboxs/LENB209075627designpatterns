package za.ac.cput.project.creational.prototype;

/**
 * Created by student on 2015/03/13.
 */
public class Employee implements Prototype{

    String name;
    public Employee(String name){
        this.name = name;
    }
    @Override
    public Prototype doClone() {
        return new Employee(name);
    }
    public String toString(){
        return "This Employee is: "+name;
    }
}
