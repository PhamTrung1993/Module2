package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,i,check;
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        show(array, n);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter check Number: ");
        int number = scanner.nextInt();

        System.out.println("\n\r");
        check = checkX(array, number);
        if (check == 1) {
            System.out.println("Number not found in array ");
        } else {
            for (c = i = 0; i < n; i++) {
                if (array[i] != number) {
                    array[c] = array[i];
                    c++;
                }
            }
            n = c;
            show(array,n);
        }
    }

    public static void show(int[] array,int length){
        System.out.println("Array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static int checkX(int[] array,int number){
        for (int i = 0; i <array.length; i++) {
            if (number == array[i]) {
                return  0;

            }
        }
        return 1;
    }

}
