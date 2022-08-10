package codegym;

public class TestShade {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());

        shape = new Shape("red",false);
        System.out.println(shape.toString());
    }
}
