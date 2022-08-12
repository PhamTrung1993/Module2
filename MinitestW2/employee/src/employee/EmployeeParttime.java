package employee;

public class EmployeeParttime extends Employee {
    private double workinghours;

    public EmployeeParttime(int employeecode, String name, int age, String number, String email, double workinghours) {
        super(employeecode, name, age, number, email);
        this.workinghours = workinghours;
    }

    public double getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(double workinghours) {
        this.workinghours = workinghours;
    }
    public double SalaryIsReceived(){
        return (workinghours*100000);
    }
    @Override
    public String toString() {
        return  super.toString()+
                "EmployeeParttime{" +
                "workinghours=" + workinghours +
                "Salary = "+SalaryIsReceived() +
                '}';
    }
}
