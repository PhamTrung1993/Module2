package codegym;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        String inputString = getString();
        int[] frequentChar = new int[255];
        findChar(inputString, frequentChar);
        showAmount(frequentChar);
    }

    private static void showAmount(int[] frequentChar) {
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("the most appearing letter is: '" + character + "' with a frequency of " + max + " time");
    }

    private static void findChar(String inputString, int[] frequentChar) {
        for (int i = 0; i < inputString.length(); i++) {

            int ascii = inputString.charAt(i);

            frequentChar[ascii] += 1;
        }
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        return inputString;
    }
}
