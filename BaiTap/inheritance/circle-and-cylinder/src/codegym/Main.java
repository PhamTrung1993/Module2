package codegym;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5,"red");
        System.out.println(circle);


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(4.5,"Green");
        System.out.println(cylinder);
        cylinder = new Cylinder(3.0,4.0,"Pink");
        System.out.println(cylinder);
    }
}
