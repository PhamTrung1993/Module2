package codegym;

public class Cylinder extends Circle {
    protected double heigh = 1.0;

    public Cylinder() {
        super();

    }

    public Cylinder(double radius, String color) {
        super(radius, color);

    }

    public Cylinder(double heigh, double radius, String color) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public double getVolume() {
        return radius*radius*heigh*Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder radius = " + radius + ", heigh = " + heigh + ", color " + color;
    }

}
