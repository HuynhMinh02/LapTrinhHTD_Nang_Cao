package buoi5.observers;

public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        
        simpleSubject.setValue(80);
    }
}
