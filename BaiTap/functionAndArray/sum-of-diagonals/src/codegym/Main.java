package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] newArray = createArray();
        show(newArray);
        int sumForwardDiagonal = forwardDiagonal(newArray);
        int sumReverseDiagonal = reverseDiagonal(newArray);
        int sumTotal = sumForwardDiagonal + sumReverseDiagonal;
        System.out.println("Sum of diagonals is: " + sumTotal);
    }
    public static int enterInt() {
        Scanner ip = new Scanner(System.in);
        int number;
        try {
            number=ip.nextInt();
        }
        catch(Exception e){
            System.out.println("Nhap lai: ");
            number=enterInt();
        }
        return number;
    }
    public static int[][] createArray() {
        int row,col;
        do {
            System.out.print("Enter row of the array: ");
            row = enterInt();
        } while (row <= 0);
        do {
            System.out.print("Enter columns of the array: ");
            col= enterInt();
        } while (col <= 0);
        int array[][] = new int[row][col];
        System.out.println("Enter value of the matrix " + row + " x " + col + " : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Array["+(i+1)+"]["+(j+1)+"]: ");
                array[i][j] = enterInt();

            }
        }
        return array;
    }
    public static void  show(int[][] array) {
        System.out.println("Array is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    public static int forwardDiagonal(int [][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j =0; j < array[0].length; j++) {
                if (j == i){
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }
    public static int reverseDiagonal(int [][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == ((array[0].length-1) - i)) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }
}
