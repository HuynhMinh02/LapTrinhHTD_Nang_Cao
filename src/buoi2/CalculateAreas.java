package buoi2;

public class CalculateAreas {
    Shape [] shapes;

    double sumTotal = 0;

    public CalculateAreas(Shape[] sh) {
        this.shapes = sh;
    }

    public double sumAreas() {
        sumTotal = 0;

        for (int i = 0; i < shapes.length; i++) {
            sumTotal = sumTotal + shapes[i].calcArea();
        }

        return sumTotal;
    }

    private double area;

    public double calcArea(Rectangle r) {
        area = r.length * r.width;

        return area;
    }

}
