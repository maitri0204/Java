package pdeu.drawing;

public class Rectangle extends Shape{
    private double Length;
    private double Breadth;
    
    public Rectangle(String c, String p, double l, double b) {
        super(c, p);
        this.Length = l;
        this.Breadth = b;
    }

    public double calculateArea() {
        return Length * Breadth;
    }

    public double calculatePerimeter() {
        return 2 * (Length * Breadth);
    }
}
