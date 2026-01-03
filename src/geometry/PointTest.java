package geometry;

public class PointTest {
    public static void main(String[] args){
        Point p1 = new Point();
        System.out.println("p1: (" + p1.getX() + "," + p1.getY() + ")" );

        Point p2 = new Point(3,4);
        System.out.println("p2: (" + p2.getX() + "," + p2.getY() + ")" );

        System.out.println("Dist p1 to p2:" + p1.distance(p2));
        System.out.println("Dist p1 to (6,8):" + p1.distance(6 , 8));
    }

}
