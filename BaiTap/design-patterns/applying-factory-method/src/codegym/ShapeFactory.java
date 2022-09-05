package codegym;

public class ShapeFactory {
    private ShapeFactory() {
    }
    public static final Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case TRIANGLE :
                return new Triangle();
            case SQUARE :
                return new Square();
            case RECTANGLE :
                return new Rectangle();
            default:
                throw new IllegalArgumentException("This Shape type is unsupported");
        }
    }
    public enum ShapeType {
        TRIANGLE,SQUARE,RECTANGLE
    }
}
