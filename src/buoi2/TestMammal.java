package buoi2;
public class TestMammal {
    public static void main(String[] args) {
        System.out.println("Start Program");

        Mammal cat = new Mammal();
        cat.setSpeaker(new CatNoise());

        Mammal dog = new Mammal(new DogNoise());
        dog.setSpeaker(new DogNoise());

        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dogg says " + dog.makeNoise());




    }
}
