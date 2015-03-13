package za.ac.cput.project.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class Employee {

    private String name;
    private String dept;
    private List<Employee> subordinates;

    public Employee(String name,String dept) {
        this.name = name;
        this.dept = dept;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + "]\n");
    }
}
