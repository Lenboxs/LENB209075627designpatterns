package za.ac.cput.project.behavioural.strategy;

/**
 * Created by student on 2015/03/13.
 */
public class Context {
    int size;
    Strategy strategy;

    public Context(int size, Strategy strategy) {
        this.size = size;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getSize() {
        return size;
    }

    public boolean getResult() {
        return strategy.checkSize(size);
    }
}
