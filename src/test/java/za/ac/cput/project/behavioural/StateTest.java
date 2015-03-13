package za.ac.cput.project.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.behavioural.state.Begin;
import za.ac.cput.project.behavioural.state.StateContext;

/**
 * Created by student on 2015/03/13.
 */
public class StateTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testState() throws Exception {
        StateContext stateContext = new StateContext();

        Begin begin = new Begin();
        begin.doAction(stateContext);

        Assert.assertNotNull(stateContext);
    }

    @After
    public void tearDown() throws Exception {


    }
}
