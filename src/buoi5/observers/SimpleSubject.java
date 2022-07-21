package buoi5.observers;

import java.util.Observable;

public class SimpleSubject extends Observable {
    private int value = 0;

    public SimpleSubject() {
    }

    public SimpleSubject(int value) {
        this.value = value;
        setChanged();
        notifyObservers();
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
