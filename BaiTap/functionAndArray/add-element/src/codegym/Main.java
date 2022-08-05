package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        int length = array.length;
        show(array);
        System.out.print("\n\r");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter add Number: ");
        int number = scanner.nextInt();

        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        int[] newArray = InsertX(array,length,number,index);
        show(newArray);

    }
    public static void show(int[] array){
        System.out.println("Array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static int[] InsertX(int[] array, int n, int number, int index) {
        int m = n+1;
        int[] arraynew = new int[m];
        for (int i = 0;i < index;i++){
            arraynew[i] = array[i];
        }
        arraynew[index] = number;
        for (int i = index + 1; i < m ;i++) {
            arraynew[i] = array[i-1];
        }
    return arraynew;
    }
}

