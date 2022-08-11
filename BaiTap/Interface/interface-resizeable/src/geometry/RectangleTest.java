package geometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4,"blue",false);
        System.out.println(rectangle.toString());
        System.out.println("Before resize:");
        rectangle.resize(1);
        System.out.println("After resize: ");
        rectangle.resize(2);
    }
}
