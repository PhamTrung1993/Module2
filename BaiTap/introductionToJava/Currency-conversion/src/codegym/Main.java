package codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter money :");
        double usd = scanner.nextDouble();
        int rate = 23000;
        double vnd = usd * rate;

        System.out.printf("Amount of money " + vnd);

    }

}
