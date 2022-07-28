package lambda;

public class TesterImpl implements Tester {

    @Override
    public void hello(String name, int age) {
        // TODO Auto-generated method stub
        System.out.printf("Name: %s ; Age: %S ", name , age);
    }
    
}
