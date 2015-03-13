package za.ac.cput.project.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public interface MealOrderBuilder {

    public void buildDrink ();
    public void buildFood();
    public void buildDessert();
    public Meal getMeal();
}
