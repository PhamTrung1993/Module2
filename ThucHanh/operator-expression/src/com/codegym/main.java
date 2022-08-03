package com.codegym;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng Scanner;

        System.out.println("Enter Width: ");
        width = scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Enter Height: ");
        height = scanner.nextFloat(); //Nhập chiều dài

        float area = width * height ;

        System.out.println("Area is : " + area);
    }
}
