package Labs277;


public class Circle extends GeometricObject {
    private int radius;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public String toString() {
        return super.toString();
    }
}
