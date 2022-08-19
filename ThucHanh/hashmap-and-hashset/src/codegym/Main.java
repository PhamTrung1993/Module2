package codegym;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("Nam",20,"HN");
        Student studentTwo = new Student("Hung",21,"HN");
        Student studentThree = new Student("Ha",22,"HN");
        // write your code here
        //HasMap có thể tạo ra các đối tượng có value giống nhau
        Map<Integer , Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,studentOne);
        studentMap.put(2,studentOne);
        studentMap.put(3,studentOne);
        studentMap.put(4,studentOne);
        for (Map.Entry<Integer, Student> student: studentMap.entrySet()) {
            System.out.println(student.toString());
        }


        System.out.println(".........Set");
        // Khống thể tạo ra đối tượng có value giống nhau
        Set<Student> students = new HashSet<Student>();
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentOne);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
