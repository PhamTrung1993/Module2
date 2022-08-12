package employee;

import java.util.Comparator;

public class EmployeeFulltimeComparator implements Comparator<EmployeeFullTime> {

    public int compare(EmployeeFullTime e1, EmployeeFullTime e2) {
       if (e1.SalaryIsReceived() > e2.SalaryIsReceived()) return 1;
       else if (e1.SalaryIsReceived() < e2.SalaryIsReceived()) {
           return -1;
       }
       else return 0;
    }
}
