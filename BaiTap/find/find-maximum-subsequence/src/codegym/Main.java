package codegym;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string = getString();

        LinkedList<Character> max = new LinkedList<>();

        findArray(string, max);
    }

    private static String getString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = input.nextLine();
        return string;
    }

    private static void findArray(String string, LinkedList<Character> max) {
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));

            stringComparison(string, max, list);
        }
        show(max);
    }

    private static void show(LinkedList<Character> max) {
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }

    private static void stringComparison(String string, LinkedList<Character> max, LinkedList<Character> list) {
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) > list.getLast()) {

                list.add(string.charAt(j));
            }
        }
        if (list.size() > max.size()) {
            max.clear();;
            max.addAll(list);
        }
        list.clear();
    }
}
