package za.ac.cput.project.creational.prototype;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {

        Manager m1 = new Manager("Lenny");
        System.out.println("Manager 1: "+m1);

        Manager m2 = (Manager)m1.doClone();
        System.out.println("Manager 2: "+m2);

        Employee e1 = new Employee("James");
        System.out.println("Employee 1: "+e1);

        Employee e2 = (Employee)e1.doClone();
        System.out.println("Employee 2: "+e2);
    }
}
