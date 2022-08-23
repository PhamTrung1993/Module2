package codegym;

public class TriangleException extends Throwable{

    public TriangleException() {
        super("IllegalTriangleException");
    }

    public TriangleException(String string) {
        super(string);
    }
}
