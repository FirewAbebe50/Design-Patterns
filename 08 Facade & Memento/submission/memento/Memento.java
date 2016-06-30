package cs525.labs.memento;

/**
 *
 * @author OWNER
 */
public class Memento {
    
    private Person state;
    
    public Memento(Person stateToSave){
        state = stateToSave;
    }

    public Person getSavedState() {
        return state;
    }
    
}
