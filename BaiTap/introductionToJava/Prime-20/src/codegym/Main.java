package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount prime: ");
        int number = scanner.nextInt();
        int count = 0;


        System.out.println(number+ " prime is :");
            for (int n = 2; n < 1000; n++) {
                boolean check = true;
                if (count < number) {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {

                    System.out.print(n);
                    System.out.print("\t");
                    count++;
                }
            }
                else
                    break;
        }
    }
}
