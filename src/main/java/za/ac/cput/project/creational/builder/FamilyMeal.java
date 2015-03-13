package za.ac.cput.project.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public class FamilyMeal  implements MealOrderBuilder{

    private Meal meal;

    public FamilyMeal(){
        meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink(" 2lt coke ");
    }

    @Override
    public void buildFood() {
        meal.setFood("12 piece chicken");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("6 ice cream");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
