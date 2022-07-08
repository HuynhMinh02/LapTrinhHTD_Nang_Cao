public class Square extends Shape {

    private double side;

    public Square (double s) {
        side = s;
    }
    @Override
    public double calcArea() {
        area = side * side;
        return (area);
    }

}
