package za.ac.cput.project.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public class MealOrderDirector {
    private MealOrderBuilder mob = null;

    public MealOrderDirector ( MealOrderBuilder mob ){
        this.mob = mob;
    }
    public void constructMeal (){
        mob.buildDrink ();
        mob.buildFood();
        mob.buildDessert();
    }
    public Meal getMeal(){
        return mob.getMeal();
    }
}
