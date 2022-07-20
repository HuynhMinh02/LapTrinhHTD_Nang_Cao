package buoi5;

import java.util.ArrayList;
import java.util.List;


public class SimpleSubject implements Subject {
    private List<Observers> observers;
    private int value = 0;

    public SimpleSubject(){
        observers = new ArrayList<Observers>();
    }
    
    @Override
    public void register(Observers o) {
        // TODO Auto-generated method stub
        observers.add(o);
        
    }

    @Override
    public void removeObservers(Observers o) {
        // TODO Auto-generated method stub
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (Observers observer : observers) {
            observer.update(value);
        }
        
    }
    public void setValue(int value) {
        this.value = value;
        notifyObservers();

    }
    
}
