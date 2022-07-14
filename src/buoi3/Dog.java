package buoi3;

public class Dog extends Manmal {
    
    DogNoise behaviour = new DogNoise();

    public String makeNoise(){
        return behaviour.makeNoise();
    }
}
