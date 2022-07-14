package buoi3.simpleduckso1.v3;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
       System.out.println("I am a Rubber Duck");
        
    }

    @Override
    public void quack() {
        System.out.println("Chip Chip...");
        
    }
}
