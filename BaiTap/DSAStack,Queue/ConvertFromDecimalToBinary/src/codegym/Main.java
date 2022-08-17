package codegym;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<String> stack16 = new Stack<String>();
        System.out.println("Enter decimals: ");
        int number = scanner.nextInt();
        while (number != 0 ) {
             int remember1 = number % 2;
             stack2.push(remember1);
             number /= 2;
        }

        System.out.println("\n Binary number is: ");
        while (!(stack2.isEmpty())) {
            System.out.print(stack2.pop());
        }
        System.out.print("\n");
        System.out.println("Enter decimals: ");
        int number2 = scanner.nextInt();
        int count0 = 0;
        int count =0;
        while (count0 != 1){
            int remember16 = number2 % 16;
            int remember161 = number2/16;
            if (remember161 == 0)
                count0++;

            stack16.push(numbercovert16(remember16));
            number2 = remember161;
            count++;
        }
        System.out.println("\n Hexa number is: ");
        for (int i = 0; i <count; i++) {
            System.out.print(stack16.pop());
        }
    }

    static String numbercovert16(int number){
        return switch (number) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> "0";
        };
    }
}
