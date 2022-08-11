package geometry;

import resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super (side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    public double getArea() {
        return getSide()*getSide();
    }
    public void resize(double percent) {
        System.out.println(getArea() * percent);
    }
    public String toString() {
        return "A Square with side = "
                + getSide()
                +", which is a subclass of "
                + super.toString();
    }
}
