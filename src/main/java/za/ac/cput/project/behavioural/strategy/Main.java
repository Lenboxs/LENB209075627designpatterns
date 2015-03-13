package za.ac.cput.project.behavioural.strategy;

/**
 * Created by student on 2015/03/13.
 */
public class Main {
    public static void main(String[] args) {

        int size = 3;

        Strategy toBig = new ToBig();
        Context context = new Context(size, toBig);

        System.out.println("perfect size (" + context.getSize() + ") to big " + context.getResult());

        Strategy toSmall = new ToSmall();
        context.setStrategy(toSmall);

        System.out.println("perfect size (" + context.getSize() + ") to small " + context.getResult());

        Strategy perfect = new Perfect();
        context.setStrategy(perfect);

        System.out.println("perfect size (" + context.getSize() + ") for me " + context.getResult());

    }

}
