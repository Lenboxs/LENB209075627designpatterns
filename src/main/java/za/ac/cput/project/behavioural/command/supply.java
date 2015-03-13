package za.ac.cput.project.behavioural.command;

/**
 * Created by student on 2015/03/13.
 */
public class supply {

    private String productName = "top";
    private int quantity = 25;

    public void buying()
    {
        System.out.println("Supplies Product : "+productName+" - Quantity : "+ quantity+" bought");
    }
    public void selling()
    {
        System.out.println("Supplies Product : "+productName+" - Quantity : "+ quantity+" sold");
    }
}
