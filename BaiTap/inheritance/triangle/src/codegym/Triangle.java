package codegym;

public class Triangle extends Shape{
    double  side1 = 1.0,
            side2 = 1.0,
            side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1,double side2, double side3, String color, boolean filled){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double par = (side1 + side2 + side3)/2;
        return  Math.sqrt(par*(par-side1)*(par-side2) * (par-side3));
    }

    public double getPerimeter(){
        return (side1+side2+side3);
    }

    public String toString() {
        return "A Triangle with side: " + side1 +", " + side2 + ", "+side3 +", area = "
                + getArea()
                + ", perimeter = "
                + getPerimeter()
                + super.toString();
    }
}
