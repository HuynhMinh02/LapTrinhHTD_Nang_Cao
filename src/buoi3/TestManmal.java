package buoi3;

public class TestManmal {
    public static void main(String[] args) {
        System.out.println("Star Program");

        Manmal cat = new Cat();
        Manmal dog = new Dog();

        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dog says " + dog.makeNoise());

    }
}
