package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    protected double length;
    protected double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getArea() {
//        double area = this.length * this.width;
//        return double area;
        return this.length * this.width;
    }

    public double getPerimeter() {
        return this.length + this.length + this.width + this.width;
    }
}
