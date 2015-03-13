package za.ac.cput.project.structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.structural.composite.Employee;

/**
 * Created by student on 2015/03/13.
 */
public class CompositeTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testComposite() throws Exception {
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

        Assert.assertNotNull(CEO);
        Assert.assertNotNull(headMarketing);
        Assert.assertNotNull(headSales);

    }

    @After
    public void tearDown() throws Exception {


    }
}
