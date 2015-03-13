package za.ac.cput.project.structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.structural.decorator.BorderDecorator;
import za.ac.cput.project.structural.decorator.Form;
import za.ac.cput.project.structural.decorator.Square;

/**
 * Created by student on 2015/03/13.
 */
public class DecoratorTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDecorator() throws Exception {
        Form square= new Square();
        Form bordersquare = new BorderDecorator(new Square());
        square.design();
        bordersquare.design();
        Assert.assertNotNull(square);
        Assert.assertNotNull(bordersquare);
    }

    @After
    public void tearDown() throws Exception {


    }
}
