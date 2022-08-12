package employee;

public abstract class Employee {
    private int employeecode ;
    private String name;
    private int age;
    private String number;
    private String email;

    public Employee() {
    }
    public abstract double SalaryIsReceived();
    public Employee(int employeecode, String name, int age, String number, String email) {
        this.employeecode = employeecode;
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
    }


    public int getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(int employeecode) {
        this.employeecode = employeecode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeecode=" + employeecode +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }
}
