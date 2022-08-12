package employee;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employeeOne = new EmployeeFullTime(001, "Đêm", 25, "0986111111", "Đông@gmail.com", 2500000, 500000, 22500000);
        Employee employeeTwo = new EmployeeFullTime(002, "Hạ", 24, "0986111111", "Qua@gmail.com", 2000000, 500000, 27500000);
        Employee employeeThree = new EmployeeFullTime(003, "Trắng", 26, "0986111111", "ĐI@gmail.com", 1500000, 200000, 1600000);
        Employee employeeFour = new EmployeeParttime(004, "Thu", 22, "0986111111", "Xuân@gmail.com", 160);
        Employee employeeFive = new EmployeeParttime(005, "Cuối", 21, "0986111111", "Lại@gmail.com", 165);
        Employee employeeSix = new EmployeeParttime(006, "Cùng", 20, "0986111111", "Tới@gmail.com", 164.5);

        Employee listEmployee[] = {employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive, employeeSix};

        double average = Average(listEmployee);
        System.out.println(average);

        lowerThanAverageSalary(listEmployee, average);
        totalSalaryEmployeeParttime(listEmployee);
        salaryComparison(listEmployee);


    }

    public static double Average(Employee[] array) {
        int sum = 0;
        int average;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            sum += array[i].SalaryIsReceived();
        }

        average = sum / length;
        return average;
    }

    public static void lowerThanAverageSalary(Employee[] array, double avg) {
        int count = 0;
        System.out.println("list of full-time employees whose salary is lower than the average salary of employees in the company: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof EmployeeFullTime) {
                EmployeeFullTime employees = (EmployeeFullTime) array[i];
                double Salary = employees.SalaryIsReceived();
                if (Salary < avg) {
                    count++;
                    System.out.println(count + ".");
                    System.out.println(employees.toString());
                }
            }
        }
    }

    public static void totalSalaryEmployeeParttime(Employee[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof EmployeeFullTime) {
                EmployeeFullTime employees = (EmployeeFullTime) array[i];
                sum += employees.SalaryIsReceived();


            }
        }
        System.out.println("Total part-time employee salary: " +sum);
    }
    public static void salaryComparison(Employee[] array){
        EmployeeFullTime[] employees = new EmployeeFullTime[3];
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof EmployeeFullTime) {
                employees[i] = (EmployeeFullTime) array[i];

            }
        }
        System.out.println("Pre-sorted: ");
        for (EmployeeFullTime employee : employees
             ) {
            System.out.println(employee);
         }

        Comparator employeeFulltimeComparator = new EmployeeFulltimeComparator();
        Arrays.sort(employees,employeeFulltimeComparator);

        System.out.println("After - sorted: ");
        for (EmployeeFullTime employee : employees
        ) {
            System.out.println(employee);
        }
       }
}
