package buoi3.simpleduckso1.v3;
import buoi3.simpleduckso1.v3.*;

public class Main {
    public static void main(String[] args) {
        
        Duck decoyDuck = new DecoyDuck();

        Duck mallardDuck = new MallardDuck();
        
        Duck redheadDuck = new RedheadDuck();

        Duck rubberDuck = new RubberDuck();

        decoyDuck.display();
        decoyDuck.swim();
        
        mallardDuck.display();
        mallardDuck.swim();

        redheadDuck.display();
        redheadDuck.swim();


        rubberDuck.display();
        rubberDuck.swim();

        System.out.println("Start Program");

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

    }
}
