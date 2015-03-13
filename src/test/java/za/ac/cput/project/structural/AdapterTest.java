package za.ac.cput.project.structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.structural.adapter.Doc;

/**
 * Created by student on 2015/03/13.
 */
public class AdapterTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testAdapter() throws Exception {
        Doc d = new Doc();
        d.readDoc("doc","jimmy.doc");
        d.readDoc("pdf","tommy.pdf");

        Assert.assertNotNull(d);

    }

    @After
    public void tearDown() throws Exception {


    }
}
