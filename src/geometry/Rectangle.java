package geometry;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }
    public Rectangle(double x ,  double y , double width , double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y =y;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
    public boolean contains(double px, double py) {
        return px >= x - width / 2 &&
                px <= x + width / 2 &&
                py >= y - height / 2 &&
                py <= y + height / 2;
    }
    public boolean contains(Rectangle r){
        return contains(r.x - r.width / 2, r.y - r.height / 2) && contains(r.x + r.width / 2, r.y + r.height / 2);
    }
    public boolean overlaps(Rectangle r) {
        return Math.abs(x - r.x) < (width+r.width) / 2 && Math.abs(y - r.y) < (height + r.height) / 2;
    }
}
