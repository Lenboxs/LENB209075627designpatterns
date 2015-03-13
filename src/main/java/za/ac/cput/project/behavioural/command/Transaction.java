package za.ac.cput.project.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class Transaction {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.run();
        }
        orderList.clear();
    }
}
