package buoi3.simpleduckso1;

public class TestMain {
    public static void main(String[] args) {
        
        Duck mallardDuck = new MallardDuck();

        Duck redheadDuck = new RedheadDuck();
        System.out.println("<<<<Star Program>>>");
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();

        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
    }
}
