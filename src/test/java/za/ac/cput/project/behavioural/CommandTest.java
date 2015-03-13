package za.ac.cput.project.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.behavioural.command.Buy;
import za.ac.cput.project.behavioural.command.Sell;
import za.ac.cput.project.behavioural.command.Transaction;
import za.ac.cput.project.behavioural.command.supply;

/**
 * Created by student on 2015/03/13.
 */
public class CommandTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCommand() throws Exception {
        supply s = new supply();

        Buy buy = new Buy(s);
        Sell sell = new Sell(s);

        Transaction transaction = new Transaction();
        transaction.takeOrder(buy);
        transaction.takeOrder(sell);

        transaction.placeOrders();

        Assert.assertNotNull(transaction);

    }

    @After
    public void tearDown() throws Exception {


    }
}
