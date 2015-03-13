package za.ac.cput.project.behavioural.state;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    public static void main(String[] args) {
        StateContext stateContext = new StateContext();

        Begin begin = new Begin();
        begin.doAction(stateContext);

        System.out.println(stateContext.getState().toString());

        End end = new End();
        end.doAction(stateContext);

        System.out.println(stateContext.getState().toString());
    }
}
