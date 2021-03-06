package buoi2;


public class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double calcArea(){
        area = 3.14 * (radius * radius);

        return area;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }
    
}
