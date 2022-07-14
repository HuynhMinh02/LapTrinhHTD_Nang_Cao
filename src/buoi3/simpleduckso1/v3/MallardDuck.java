package buoi3.simpleduckso1.v3;

public class MallardDuck extends Duck implements Flyable , Quackable{
    
    @Override
    public void display() {
       System.out.println("I am a Mallard Duck");
        
    }

    @Override
    public void fly() {
     System.out.println("I can Fly...");
        
    }

    @Override
    public void quack() {
        System.out.println("Cap cap");
    }
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
