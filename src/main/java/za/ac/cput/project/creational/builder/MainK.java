package za.ac.cput.project.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public class MainK {
    public static void main(String[] args) {

        MealOrderBuilder mb = new HappyMeal();
        MealOrderDirector md = new MealOrderDirector(mb);
        md.constructMeal();
        Meal meal = md.getMeal();
        System.out.println("meal is : " + meal);
        mb = new FamilyMeal();
        md = new MealOrderDirector(mb);
        md.constructMeal();
        meal = md.getMeal();
        System.out.println("meal is : " + meal);
    }
}
