package za.ac.cput.project.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.behavioural.mediator.User;

/**
 * Created by student on 2015/03/13.
 */
public class MediatorTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testMediator() throws Exception {

        User lenny = new User("lenny");
        User elton = new User("elton");

        lenny.postedMessage("awe! elton!");
        elton.postedMessage("awe! lenny!");

        Assert.assertNotNull(lenny);
        Assert.assertNotNull(elton);
    }

    @After
    public void tearDown() throws Exception {


    }
}
