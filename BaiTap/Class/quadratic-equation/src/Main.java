import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation ptb2 = new QuadraticEquation();
        Scanner input = new Scanner(System.in);
        System.out.println("Solve quadratic equation: ");
        System.out.println("Enter a: ");
        ptb2.a = input.nextDouble();
        System.out.println("Enter b: ");
        ptb2.b = input.nextDouble();
        System.out.println("Enter c: ");
        ptb2.c = input.nextDouble();

        ptb2.solve();
    }
}


