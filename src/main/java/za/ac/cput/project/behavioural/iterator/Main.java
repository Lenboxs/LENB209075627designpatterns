package za.ac.cput.project.behavioural.iterator;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {
        AnimalRepos animalRepos = new AnimalRepos();

        for(Iterator iter = animalRepos.getIterator(); iter.hasNext();){
            String animal = (String)iter.next();
            System.out.println("Animal : " + animal);
        }
    }
}
