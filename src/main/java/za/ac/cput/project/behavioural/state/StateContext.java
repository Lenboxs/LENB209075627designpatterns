package za.ac.cput.project.behavioural.state;

/**
 * Created by student on 2015/03/13.
 */
public class StateContext {

    private State state;

    public StateContext(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
