package za.ac.cput.project.creational.abstractfactory;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {

        AbstractFactory af = new AbstractFactory();

        SpeciesFactory sf1 = af.getSpeciesFactory("reptile");

        Animal a1 = sf1.getAnimal("crocodile");
        System.out.println("a1 sound: "+a1.makeSound());

        Animal a2 = sf1.getAnimal("lizard");
        System.out.println("a2 sound: "+a2.makeSound());

        SpeciesFactory sf2 = af.getSpeciesFactory("mammal");
        Animal a3 = sf1.getAnimal("wolf");
        System.out.println("a3 sound: "+a3.makeSound());

        Animal a4 = sf1.getAnimal("lion");
        System.out.println("a4 sound: "+a4.makeSound());

    }
}
