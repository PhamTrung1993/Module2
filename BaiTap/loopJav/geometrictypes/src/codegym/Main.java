package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (botton-left)");
            System.out.println("3. Print the square triangle (top-left)");
            System.out.println("4. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter width: ");
                    int width = input.nextInt();
                    System.out.println("Ennter height: ");
                    int height = input.nextInt();
                    System.out.println(" ");
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter Hight: ");
                    int hight2 = input.nextInt();
                    for (int i = 1; i <= hight2; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Enter Hight: ");
                    int hight3 = input.nextInt();
                    for (int i = hight3; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Enter Hight: ");
                    int hight4 = input.nextInt();
                    int k = 0;
                    for (int i = 1; i <= hight4; ++i, k = 0) {
                        for (int j = 1; j <= hight4 - i; ++j) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.print("\n");
                    }
                    System.out.println(" ");
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!!");
            }
        }
    }
}
