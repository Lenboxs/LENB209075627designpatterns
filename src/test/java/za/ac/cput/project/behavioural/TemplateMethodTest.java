package za.ac.cput.project.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.behavioural.templatemethod.EatTimes;
import za.ac.cput.project.behavioural.templatemethod.Morning;

/**
 * Created by student on 2015/03/13.
 */
public class TemplateMethodTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testTemplateMethod() throws Exception {
        EatTimes et = new Morning();
        et.time();

        Assert.assertEquals("morning eating time start at 7h00",et);
    }

    @After
    public void tearDown() throws Exception {


    }
}
