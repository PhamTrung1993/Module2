package codegym;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE);
        shape1.draw();
        System.out.println();
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.ShapeType.SQUARE);
        shape2.draw();
        System.out.println();
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.ShapeType.TRIANGLE);
        shape3.draw();

    }
}
