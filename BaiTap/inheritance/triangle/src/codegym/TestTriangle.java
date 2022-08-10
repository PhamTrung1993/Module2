package codegym;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());

        triangle = new Triangle(5,3,4);
        System.out.println(triangle.toString());

        triangle = new Triangle(5,2,6,"red",true);
        System.out.println(triangle.toString());
    }
}
