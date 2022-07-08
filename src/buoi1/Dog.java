package buoi1;

public class Dog implements IEat , IMakeNoise {

    @Override
    public void eat() {

        System.out.println("Dog is eating");
        
    }

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        System.out.println("Dog is making noise");
    }
    
}

