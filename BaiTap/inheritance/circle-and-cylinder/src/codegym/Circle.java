package codegym;

public class Circle {
    protected double radius;
    String color;
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius,String color)  {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public  void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius*radius*3.14;
    }
    public String toString() {
        return  "A Circle with redius : " + radius +" and color: "+ color + " and Area : "+ (radius*radius*3.14);
    }
}
