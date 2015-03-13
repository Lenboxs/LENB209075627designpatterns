package za.ac.cput.project.structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.structural.facade.JobMaker;

/**
 * Created by student on 2015/03/13.
 */
public class FacadeTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testFacade() throws Exception {

        JobMaker jobMaker = new JobMaker();

        jobMaker.workDoctor();

        Assert.assertNotNull(jobMaker);

    }

    @After
    public void tearDown() throws Exception {


    }
}
