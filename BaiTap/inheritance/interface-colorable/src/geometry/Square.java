package geometry;

import colorable.Colorable;

public class Square implements Colorable {
    boolean colorable = false;
    double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;

    }

    public Square(double side,boolean color) {
        this.side = side;
        this.colorable = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public void howToColor() {
        if (this.colorable) {
            System.out.println("Color all four side!");
        }
    }

    public String toString() {
        return "A Square with side = "
                + getSide()
                + " And Area = "
                +getArea();

    }

}
