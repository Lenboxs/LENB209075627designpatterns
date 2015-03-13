package za.ac.cput.project.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.behavioural.strategy.Context;
import za.ac.cput.project.behavioural.strategy.Strategy;
import za.ac.cput.project.behavioural.strategy.ToBig;

/**
 * Created by student on 2015/03/13.
 */
public class StrategyTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testStrategy() throws Exception {

        int size = 3;

        Strategy toBig = new ToBig();
        Context context = new Context(size, toBig);
        System.out.println("perfect size (" + context.getSize() + ") to big " + context.getResult());

        Assert.assertFalse("False",context.getResult());

    }

    @After
    public void tearDown() throws Exception {


    }
}
