package pdeu.drawing;

public class Circle extends Shape{
    private double Radius;
    
    public Circle(String c, String p, double r) {
        super(c, p);
        this.Radius = r;
    }

    public double calculateArea() {
        return Math.PI * Radius * Radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * Radius;
    }
}
