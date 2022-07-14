package buoi3.simpleduckso1.v2;

public class Main {
    public static void main(String[] args) {
        
        Duck mallardDuck = new MallardDuck();

        Duck redheadDuck = new RedheadDuck();

        Duck rupperDuck = new RupperDuck();

        System.out.println("<<<<Star Program>>>");
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();

        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

        rupperDuck.display();
        rupperDuck.swim();
        rupperDuck.quack();
        rupperDuck.fly();


    }
}
