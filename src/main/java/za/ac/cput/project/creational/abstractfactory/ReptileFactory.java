package za.ac.cput.project.creational.abstractfactory;

/**
 * Created by student on 2015/03/13.
 */
public class ReptileFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {
        if("lizard".equals(type))
            return new Lizard();
        else
            return new Crocodile();
    }
}
