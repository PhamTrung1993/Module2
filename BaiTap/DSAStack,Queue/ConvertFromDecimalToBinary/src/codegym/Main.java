package codegym;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        Stack<Integer> stackBinary = new Stack<Integer>();
        Stack<String> stackHexa = new Stack<String>();

        System.out.println("Enter decimals: ");
        int number = scanner.nextInt();

        Manager.extractedBinary(stackBinary, number);
        System.out.print("\n");

        Manager.extractedHexa(stackHexa, number);
    }


}
