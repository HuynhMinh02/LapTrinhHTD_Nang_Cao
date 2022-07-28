package lambda;

public class DemoLambda {
    public static void main(String[] args) {
        Tester t = (n , a) -> {
            System.out.printf("Name: %s; Age: %s", n , a);;
        };
            t.hello("Nguyen Van A" , 18);
    }
}
