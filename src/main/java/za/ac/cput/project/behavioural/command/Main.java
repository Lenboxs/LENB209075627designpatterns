package za.ac.cput.project.behavioural.command;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {
        supply s = new supply();

        Buy buy = new Buy(s);
        Sell sell = new Sell(s);

        Transaction transaction = new Transaction();
        transaction.takeOrder(buy);
        transaction.takeOrder(sell);

        transaction.placeOrders();
    }
}
