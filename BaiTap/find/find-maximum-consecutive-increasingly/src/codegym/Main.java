package codegym;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        String string = getString();

        findStringMaxLength(max, list, string);
        showString(max);

    }

    private static String getString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = input.nextLine();
        return string;
    }

    private static void showString(LinkedList<Character> max) {
        for (Character character: max) {
            System.out.print(character);
        }
        System.out.println();
    }

    private static void findStringMaxLength(LinkedList<Character> max, LinkedList<Character> list, String string) {
        for (int i = 0; i < string.length(); i++) {
            if ( list.size() > 1 && string.charAt(i) <= list.getLast() &&
            list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
    }
}
