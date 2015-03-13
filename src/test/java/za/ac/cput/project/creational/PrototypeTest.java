package za.ac.cput.project.creational;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.creational.prototype.Manager;

/**
 * Created by student on 2015/03/13.
 */
public class PrototypeTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testPrototype() throws Exception {
        Manager m1 = new Manager("Lenny");
        Assert.assertNotNull(m1);
    }

    @After
    public void tearDown() throws Exception {


    }
}
