package za.ac.cput.project.creational.abstractfactory;

/**
 * Created by student on 2015/03/13.
 */
public class AbstractFactory {

    public SpeciesFactory getSpeciesFactory(String type){
        if("mammal".equals(type)){
            return new MammalFactory();
        }
        else
            return new ReptileFactory();
    }
}
