package buoi5;

public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleSubject sS1 = new SimpleSubject();
        SimpleSubject sS2 = new SimpleSubject();

        SimpleObservers simpleObservers = new SimpleObservers(simpleSubject);
        SimpleObservers sO1 = new SimpleObservers(sS1);
        SimpleObservers sO2 = new SimpleObservers(sS2);
        simpleSubject.setValue(80);
        
        

        simpleSubject.removeObservers(simpleObservers);

    }
}
