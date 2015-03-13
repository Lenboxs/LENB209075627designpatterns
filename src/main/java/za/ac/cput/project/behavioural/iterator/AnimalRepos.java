package za.ac.cput.project.behavioural.iterator;

/**
 * Created by student on 2015/03/13.
 */
public class AnimalRepos implements Container {
    public String animal[] = {"cat", "dog", "snake", "fish"};

    @Override
    public Iterator getIterator() {
        return new AnimalIter();
    }

    public class AnimalIter implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < animal.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return animal[index++];
            }
            return null;
        }
    }
}