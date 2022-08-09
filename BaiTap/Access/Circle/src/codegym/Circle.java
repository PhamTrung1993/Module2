package codegym;

public class Circle {
    double radius;
    String color;
    public Circle() {
        radius = 1;
        color = "red";
    }

    public Circle(double radius)  {
        this.radius = radius;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public  void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (this.radius*this.radius*3.14);
    }
    public String outPut() {
        return  "A Circle with redius : " + radius +" and color: "+ color + " and Area : "+ (radius*radius*3.14);
    }
}
