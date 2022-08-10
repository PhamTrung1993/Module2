package codegym;

public class TestMovablePoint {
    public static void main(String[] args) {
        Movablepoint movablepoint = new Movablepoint();
        System.out.println(movablepoint.toString());

        movablepoint = new Movablepoint(4,7);
        System.out.println(movablepoint.toString());

        movablepoint = new Movablepoint(1,1,3,2);
        System.out.println(movablepoint.toString());
        movablepoint.Move();
        System.out.println(movablepoint.toString());


    }
}
