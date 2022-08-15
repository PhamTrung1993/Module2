package codegym;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A side: ");
        double aside = scanner.nextDouble();
        System.out.println("Enter B side: ");
        double bside = scanner.nextDouble();
        System.out.println("Enter C side: ");
        double cside = scanner.nextDouble();


        System.out.println(CheckTriangle(aside,bside,cside));

    }

    public static String CheckTriangle(double aside,double bside,double cside) {
        if ((aside+bside > cside) && (aside+cside > bside) && (bside+cside > aside)) {
            if ((aside*aside == bside*bside+cside*cside) || (bside*bside == aside*aside + cside*cside)
                || (cside*cside == aside*aside + bside*bside)) {
                return "this is a right triangle";
            }
            else if (aside == bside && bside == cside) {
                return "This is an equilateral triangle";
            } else if (aside == bside || bside == cside || aside == cside) {
                return "This is an isosceles triangle";
            } else if ((aside*aside > bside*bside+cside*cside) || (bside*bside > cside*cside+aside*aside)
            ||(cside*cside > bside*bside+aside*aside)){
                return "This is an obtuse triangle";
            }
            else return "This is an ordinary triangle";
        }
        else {
            return "Three sides do not form a triangle";
        }
    }
}
