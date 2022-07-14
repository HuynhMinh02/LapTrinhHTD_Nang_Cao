package buoi3.simpleduckso1.v3;
import buoi3.simpleduckso1.v3.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Duck decoyDuck1 = new DecoyDuck();

        Duck mallardDuck1 = new MallardDuck();
        
        Duck redheadDuck1 = new RedheadDuck();

        Duck rubberDuck1 = new RubberDuck();

        decoyDuck1.display();
        decoyDuck1.swim();
        
        mallardDuck1.display();
        mallardDuck1.swim();

        redheadDuck1.display();
        redheadDuck1.swim();


        rubberDuck1.display();
        rubberDuck1.swim();

        System.out.println("Start Program");

        Duck mallard1 = new MallardDuck();
        mallard1.performQuack();
        mallard1.performFly();

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        rubberDuck.display();
        rubberDuck.performQuack();
        decoyDuck.performQuack();

        ModelDuck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();

        Duck model2 = new ModelDuck();
        model2.display();
        model2.performFly();
        model2.setFlyBehavior(new FlyRocketPowered());
        model2.performFly();

    }
}
