package buoi1;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("Start Program");

        Circle circle = new Circle(1);

        Shape[] shapeArray = new Shape[1];
        shapeArray[0] = circle;

        CalculateAreas ca = new CalculateAreas(shapeArray);

        CalculateAreas sum = new CalculateAreas(shapeArray);
        OutputAreas oAreas = new OutputAreas(sum.sumAreas());

        oAreas.console();

        oAreas.HTML();

        Rectangle r = new Rectangle(6, 6);

        System.out.println("Area = " + ca.calcArea(r));
    }
}
