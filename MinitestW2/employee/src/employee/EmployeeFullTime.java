package employee;

public class EmployeeFullTime extends Employee{
    private int prizemoney;
    private int forfeit;
    private int basicsalary;

    public EmployeeFullTime(int employeecode, String name, int age, String number, String email, int prizemoney, int forfeit, int basicsalary) {
        super(employeecode, name, age, number, email);
        this.prizemoney = prizemoney;
        this.forfeit = forfeit;
        this.basicsalary = basicsalary;
    }
    public double SalaryIsReceived(){
        return basicsalary+(prizemoney - forfeit);
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Employee FullTime{" +
                "prize money=" + prizemoney +
                ", forfeit=" + forfeit +
                ", basic salary=" + basicsalary +
                ",Salary= " + SalaryIsReceived() +
                '}';
    }
}
