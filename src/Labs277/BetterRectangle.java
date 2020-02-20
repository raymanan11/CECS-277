package Labs277;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void getPerimeter() {
        System.out.println("Perimeter is " + 2 * (width + height));
    }

    public void getArea() {
        System.out.println("Area is " + width * height);
    }

    public static void main(String[] args) {
        /*
			Rectangle r = new Rectangle(1,2,3,4);
			r.getArea();
			r.getPerimeter();
		/*
			Rectangle s = new BetterRectangle(1,2,3,4);
			s.getArea();
			s.getPerimeter();


         */

        /*
			BetterRectangle t = new BetterRectangle(1,2,3,4);
			t.getArea();
			t.getPerimeter();

			BetterRectangle u = new Rectangle(1,2,3,4);
			u.getArea();
			u.getPerimeter();

        }

         */
    }
}
