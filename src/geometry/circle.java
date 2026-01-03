package geometry;

public class circle {
    private double x;
    private double y;
    private double radius;

    public circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public boolean contains(double x, double y) {
        double dx = x - this.x;
        double dy = y - this.y;
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist <= radius;
    }
    public boolean contains(circle c){
        return contains(c.getX() , c.getY());
    }
    public boolean overlaps(circle c){
        double dx = c.getX() - this.x;
        double dy = c.getY() - this.y;
        double dist = Math.sqrt(dx * dx - dy * dy);
        return dist <= (this.radius + c.getRadius());
    }
}
