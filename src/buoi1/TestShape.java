
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

        System.out.println("Calc Rectangle");

        Rectangle r = new Rectangle(6, 6);

        System.out.println("Area = " + ca.calcArea(r));

        System.out.println("Calc Square");

        Square s = new Square(5);

        System.out.println("Area = " + ca.calcArea(s));

        System.out.println("UU VIET HON ");

        System.out.println("Calc Rectangle");

        Rectangle r1 = new Rectangle(10, 9);

        System.out.println("Area = " + ca.calcArea(r1));

        System.out.println("Calc Square");

        Square s1 = new Square(10);

        System.out.println("Area = " + ca.calcArea(s1));

        System.out.println("Calc Circle");

        Circle c1 = new Circle(5);

        System.out.println("Area = " + ca.calcArea(c1));

    }
}
