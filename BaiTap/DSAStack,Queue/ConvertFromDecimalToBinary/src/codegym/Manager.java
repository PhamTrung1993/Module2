package codegym;

import java.util.Stack;

public class Manager {
    public static void extractedHexa(Stack<String> stack16, int number) {
        int countDivisible = 0;
        int count = 0;
        while (countDivisible != 1){
            int remember16 = number % 16;
            int rememberDivisible = number /16;
            if (rememberDivisible == 0)
                countDivisible++;

            stack16.push(numbercovertHexa(remember16));
            number = rememberDivisible;
            count++;
        }
        System.out.println("\n Hexa number is: ");
        for (int i = 0; i <count; i++) {
            System.out.print(stack16.pop());
        }
    }


    public static void extractedBinary(Stack<Integer> stack2, int number) {
        while (number != 0 ) {
            int remember1 = number % 2;
            stack2.push(remember1);
            number /= 2;
        }

        System.out.println("\n Binary number is: ");
        while (!(stack2.isEmpty())) {
            System.out.print(stack2.pop());
        }
    }

    static String numbercovertHexa(int number){
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
