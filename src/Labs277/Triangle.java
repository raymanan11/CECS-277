package Labs277;

public class Triangle extends GeometricObject{
    private int side1 = 1;
    private int side2 = 1;
    private int side3 = 1;

    public Triangle(String name) {
        super(name);
    }

    public void setSides(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return super.toString();
    }
}
