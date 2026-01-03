package geometry;

import org.w3c.dom.ls.LSOutput;

public class TriangleTest {
    public static void main (String[] args) {
        Triangle t1 = new Triangle(
                new Point(0, 0), new Point(4, 0), new Point(0, 3)
        );
        Point p = new Point(1, 1);
        System.out.println("Area:" + t1.getArea());
        System.out.println("Perimeter:" + t1.getPerimeter());
    }
}
