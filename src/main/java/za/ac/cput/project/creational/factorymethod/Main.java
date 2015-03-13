package za.ac.cput.project.creational.factorymethod;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {

        AnimalFactory af = new AnimalFactory();

        Animal a1 = af.getAnimal("feline");
        System.out.println("a1 sound: "+a1.makeSound());

        Animal a2 = af.getAnimal("reptile");
        System.out.println("a2 sound: "+a2.makeSound());

    }
}
