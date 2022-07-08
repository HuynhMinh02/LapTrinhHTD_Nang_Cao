package buoi1;

public class OutputAreas {
    double areas = 0;

    public OutputAreas (double area) {
        this.areas = area;
    }

    public void console(){
        System.out.println("Total of all areas = " + areas);
    }

    public void HTML(){
        System.out.println("<HTML>");
        System.out.println("Total of all areas = " + areas);
        System.out.println("<HTML>");
    }
}
