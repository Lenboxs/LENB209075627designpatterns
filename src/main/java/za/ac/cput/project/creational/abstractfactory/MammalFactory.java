package za.ac.cput.project.creational.abstractfactory;

/**
 * Created by student on 2015/03/13.
 */
public class MammalFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {
        if("wolf".equals(type)){
            return new Wolf();
        }
        else
            return new Lion();
    }
}
