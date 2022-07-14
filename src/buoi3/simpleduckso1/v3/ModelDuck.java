package buoi3.simpleduckso1.v3;

public class ModelDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I'm a mode DUCK");
        
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
}
