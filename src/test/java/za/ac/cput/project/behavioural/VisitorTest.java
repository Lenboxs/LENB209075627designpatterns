package za.ac.cput.project.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.behavioural.visitor.CarPart;
import za.ac.cput.project.behavioural.visitor.CarPartDisplayVisitor;
import za.ac.cput.project.behavioural.visitor.Engine;

/**
 * Created by student on 2015/03/13.
 */
public class VisitorTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testVisitor() throws Exception {
        CarPart engine = new Engine();
        engine.approve(new CarPartDisplayVisitor());

        Assert.assertEquals("Car engine",engine);

    }

    @After
    public void tearDown() throws Exception {


    }
}
