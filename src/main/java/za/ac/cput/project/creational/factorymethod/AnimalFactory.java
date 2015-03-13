package za.ac.cput.project.creational.factorymethod;

/**
 * Created by student on 2015/03/13.
 */
public class AnimalFactory {

    public Animal getAnimal(String type){
        if("reptile".equals(type)){
            return new Snake();
        }
        else
            return new Cat();
    }
}
