package geometry;

public class CircleTest {
    public static void main (String[] args) {
        circle c1 = new circle();
        System.out.println(("c1: (" + c1.getX() + "," + c1.getY() + "," + c1.getRadius() + ")"));

        circle c2 = new circle(6 , 8 , 5);
        System.out.println(("c2: (" + c2.getX() + "," + c2.getY() + "," + c2.getRadius() + ")"));

        System.out.println("Area of c2 = " + c2.getArea());
        System.out.println("Perimeter of c2 = " + c2.getPerimeter());

        System.out.println("Contains point (3,4): " + c1.contains(3, 4));
        System.out.println("Contains circle c2: " + c1.contains(c2));
    }
}
