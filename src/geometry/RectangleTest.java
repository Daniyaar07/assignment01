package geometry;

public class RectangleTest {
    public static void main (String[] args ){
        Rectangle r1 = new Rectangle(0 , 0 , 4 ,2);
        Rectangle r2 = new Rectangle(1 , 0 , 2, 1);
        System.out.println("Area of r1 = " + r1.getArea() );
        System.out.println("Perimeter of r1 = " + r1.getPerimeter());
        System.out.println("Contains point (1, 0 )" + r1.contains(1 , 0));
        System.out.println("Contains r2 " + r1.contains(r2));
        System.out.println("Overlaps r2 " + r1.overlaps(r2));
    }
}
