public class Square extends Shape {

    protected double side;

    public Square (double s) {
        side = s;
    }
    @Override
    public double calcArea() {
        area = side * side;
        return (area);
    }
    @Override
    public double getArea() {
        return side*side;
    }

}
