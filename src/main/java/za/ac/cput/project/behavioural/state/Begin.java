package za.ac.cput.project.behavioural.state;

/**
 * Created by student on 2015/03/13.
 */
public class Begin implements State {

    public void doAction(StateContext stateContext) {
        System.out.println("User is in start state");
        stateContext.setState(this);
    }

    public String toString(){
        return "Begin State";
    }
}
