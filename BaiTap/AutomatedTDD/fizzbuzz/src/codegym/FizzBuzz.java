package codegym;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
        }
        while (number < 0 || number > 100);

        System.out.println(checkFizzBuzz(number));

        System.out.println(convertZeroToHundred(number));
    }

    public static String checkFizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        int isDozen = number / 10;
        int isUnit = number % 10;

        if (isBuzz && isFizz) {
            return "FizzBuzz";
        }
        else if (isFizz || (isDozen == 3) || (isUnit == 3)) {
            return "Fizz";
        }
        else if (isBuzz || (isDozen == 5)) {
            return "Buzz";
        }
        else return number + "";
    }

    public static String convertZeroToHundred(int number) {
        int isDozen = number / 10;
        int isUnit = number % 10;

        return numbersIntoLetters(isDozen) + numbersIntoLetters(isUnit);
    }
    public static String numbersIntoLetters(int number) {
        switch (number) {
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            case 0:
                return "mươi";
            default:
                return "Lỗi";
        }
    }
}
