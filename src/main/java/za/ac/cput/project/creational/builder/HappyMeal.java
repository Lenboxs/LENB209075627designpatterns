package za.ac.cput.project.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public class HappyMeal implements MealOrderBuilder{

    private Meal meal;

    public HappyMeal(){
        meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink(" coke ");
    }

    @Override
    public void buildFood() {
        meal.setFood("burger");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("ice cream");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
