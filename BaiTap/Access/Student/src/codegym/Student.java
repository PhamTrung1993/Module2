package codegym;

public class Student {
    String name;
    String classes;

    public Student() {
        name = "John";
        classes = "CO2";
    }
    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;

    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  String getClasses(){
        return classes;
    }
    public  void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString() {
        return  "Student name is: " + name +"\nClass : "+classes;
    }
}
