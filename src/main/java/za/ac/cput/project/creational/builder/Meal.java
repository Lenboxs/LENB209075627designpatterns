package za.ac.cput.project.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public class Meal {

    private String drink;
    private String food;
    private String dessert;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }
    public String toString (){
        return "drink : " + drink + " , food : " + food + " , dessert : " + dessert ;
    }
}
