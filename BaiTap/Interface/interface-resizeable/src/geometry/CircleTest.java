package geometry;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"red",true);
        System.out.println(circle.toString());
        System.out.println("Before resize:");
        circle.resize(1);
        System.out.println("After resize: ");
        circle.resize(1.5);
    }
}
