package za.ac.cput.project.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.behavioural.iterator.AnimalRepos;
import za.ac.cput.project.behavioural.iterator.Iterator;

/**
 * Created by student on 2015/03/13.
 */
public class IteratorTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testIterator() throws Exception {

        AnimalRepos animalRepos = new AnimalRepos();

        for(Iterator iter = animalRepos.getIterator(); iter.hasNext();){
            String animal = (String)iter.next();
            System.out.println("Animal : " + animal);
        }

        Assert.assertNotNull(animalRepos);

    }

    @After
    public void tearDown() throws Exception {


    }
}
