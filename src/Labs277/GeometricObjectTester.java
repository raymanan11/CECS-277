package Labs277;

import java.util.ArrayList;

public class GeometricObjectTester {
    public static void main(String[] args) {
        ArrayList<GeometricObject> objects = new ArrayList<>();

        Circle object1 = new Circle("Circle");
        Rectangle object2 = new Rectangle("Rectangle");
        Triangle object3 = new Triangle("Triangle");

        object1.setRadius(4);

        object2.setHeight(5);
        object2.setWidth(6);

        object3.setSides(4, 5, 6);

        objects.add(object1);
        objects.add(object2);
        objects.add(object3);

        for(GeometricObject object : objects) {
            System.out.println(object.toString());
            if (object instanceof Circle) {
                System.out.println("Diameter is " + ((Circle) object).getDiameter());
            }
            System.out.println("Area is " + object.getArea());
            System.out.println("Perimeter is " + object.getPerimeter());
            System.out.println();
        }
    }
}
