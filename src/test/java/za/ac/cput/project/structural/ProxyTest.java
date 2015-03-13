package za.ac.cput.project.structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.structural.proxy.Picture;
import za.ac.cput.project.structural.proxy.Proxy;

/**
 * Created by student on 2015/03/13.
 */
public class ProxyTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testProxy() throws Exception {

        Picture picture = new Proxy("Family.jpg");
        picture.print();

        Assert.assertNotNull(picture);
    }

    @After
    public void tearDown() throws Exception {


    }
}
