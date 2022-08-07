package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] newArray = createArray();
        show(newArray);
        minValue(newArray);
    }

    public static int enterInt() {
        Scanner ip = new Scanner(System.in);
        int number;
        try {
            number = ip.nextInt();
        } catch (Exception e) {
            System.out.println("Retype: ");
            number = enterInt();
        }
        return number;
    }

    public static int[] createArray() {
        int length;
        do {
            System.out.print("enter the number of elements: ");
            length = enterInt();
        } while (length <= 0);
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Array[" + i + "] : ");
            array[i] = enterInt();
        }
        return array;
    }
    public static void  show(int[] array) {
        System.out.println("Array is: ");
        for (int i = 0; i < array.length; i++) {

                System.out.print(array[i]+"\t");

        }
    }
    public static void minValue(int [] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The smallest value in the array is: " + min);
    }
}
