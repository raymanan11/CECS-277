package Labs277;

public class Rectangle extends GeometricObject{
    private int width;
    private int height;

    public Rectangle(String name) {
        super(name);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return super.toString();
    }
}
