package geometry;

public class TriangleTest {
    public static void main (String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 2);
        Triangle t1 = new Triangle(p1, p2, p3);
        Point p = new Point(1, 1);
        System.out.println("Area:" + t1.getArea());
        System.out.println("Perimeter:" + t1.getPerimeter());
    }
}
