package codegym;

import java.util.Scanner;

public class NextDayCalculator {

    public static boolean leapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static int numberOfDaysInTheMonth(int month,int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                return 31;
            }
            case 2: {
                if (leapYear(year)) {
                    return 29;
                }
                return 28;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                return 30;
            }
            default:
                return 0;
        }
    }

    public static void theNextDay(int year, int month, int day) {
        int nextyear = year;
        int nextmonth = month;
        int nextday = day;

        if (year > 0 && month < 13 && day> 0 && day < numberOfDaysInTheMonth(month,year)) {
            nextday = day + 1;
            if (month != 12 && day == numberOfDaysInTheMonth(month,year)) {
                nextday = 1;
                nextmonth = month +1;
            } else if (month == 12 && day == numberOfDaysInTheMonth(month, year)) {
                nextday = 1;
                nextyear = nextyear +1;
                nextmonth = 1;

            }
            else if (month == 2){
                if (leapYear(year)) {
                    if (day == 29) {
                        nextday = 1;
                        nextmonth = month +1;
                    }
                }
                else {
                    if (day == 28) {
                        nextday = 1;
                        nextmonth = month + 1;
                    }
                }
            }
        }

        System.out.println("\n The Next day is: "+ nextday+" "+nextmonth+ " "+nextyear);

    }

    public static void main(String[] args) {
        int year,month,day;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Day: ");
            day = scanner.nextInt();
            System.out.println("Enter Month: ");
            month = scanner.nextInt();
            System.out.println("Enter Year: ");
           year = scanner.nextInt();
        }
        while (year < 0 || month < 1 || month > 12 || day < 0 || day > 31);
        theNextDay(year,month,day);
    }
}
