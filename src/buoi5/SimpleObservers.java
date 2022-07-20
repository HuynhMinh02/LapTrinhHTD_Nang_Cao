package buoi5;

public class SimpleObservers implements Observers {
    private int value;
    private Subject simpleSubject;

    public SimpleObservers(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.removeObservers(this);
    }

    @Override
    public void update(int value) {
        // TODO Auto-generated method stub
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }

}
