package buoi3.simpleduckso1.v3;

public class DecoyDuck extends Duck{

    @Override
    public void display() {
       System.out.println("I am a Decoy Duck");
        
    }
    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    
}
