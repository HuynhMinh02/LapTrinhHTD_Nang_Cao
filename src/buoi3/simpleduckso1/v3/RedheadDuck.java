package buoi3.simpleduckso1.v3;

public class RedheadDuck extends Duck implements Flyable , Quackable{
    @Override
    public void display() {
       System.out.println("I am a Red head Duck");
        
    }

    @Override
    public void fly() {
        System.out.println("Flying....");
        
    }
    @Override
    public void quack() {
        System.out.println("Cap cap");
    }
}
