package za.ac.cput.project.structural.composite;

/**
 * Created by student on 2015/03/13.
 */
public class Main {
    public static void main(String[] args) {

        Employee CEO = new Employee("John","CEO");

        Employee headSales = new Employee("Robert","Head Sales");

        Employee headMarketing = new Employee("Michel","Head Marketing");

        Employee clerk1 = new Employee("Laura","Marketing");
        Employee clerk2 = new Employee("Bob","Marketing");

        Employee salesExecutive1 = new Employee("Richard","Sales");
        Employee salesExecutive2 = new Employee("Rob","Sales");

        CEO.add(headSales);
        CEO.add(headMarketing);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);



        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

}
