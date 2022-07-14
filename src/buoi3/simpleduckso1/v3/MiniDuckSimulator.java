package buoi3.simpleduckso1.v3;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model2 = new ModelDuck();
        model2.display();
        model2.performFly();
        model2.setFlyBehavior(new FlyRocketPowered());
        model2.performFly();
 }
}
