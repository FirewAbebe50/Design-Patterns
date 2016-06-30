package cs525.labs.memento;

/**
 *
 * @author OWNER
 */
public class Originator {
    
    private Person state;
    
    public void set(Person state){
       System.out.println("Originator: Setting State");
       this.state = state;
    }
    
    public Memento saveToMemento(){
        System.out.println("Originator: Save to Memento");
        return new Memento(state);
    }
    
    public void restoreFromMemento(Memento m){
        state = m.getSavedState();
        System.out.println("Originator: get Saved Memento");
    }
}
