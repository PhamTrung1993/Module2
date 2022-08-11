package geometry;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(4,"pink",false);
        System.out.println(square.toString());
        System.out.println("Before resize:");
        square.resize(1);
        System.out.println("After resize: ");
        square.resize(3);
    }
}
