package za.ac.cput.project.creational;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.creational.singleton.Singleton;

/**
 * Created by student on 2015/03/13.
 */
public class SingletonTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testSingleton() throws Exception {
        Singleton singletonExample = Singleton.getInstance();
        singletonExample.sayHello();

        Assert.assertNotNull(singletonExample);

    }

    @After
    public void tearDown() throws Exception {


    }
}
