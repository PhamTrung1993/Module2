package codegym;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien",30,"HT");
        Student studentOne = new Student("Nam",26,"HN");
        Student studentTwo = new Student("Anh",38,"HN");
        Student studentThree = new Student("Tung",38,"HN");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(studentOne);
        lists.add(studentTwo);
        lists.add(studentThree);

        Collections.sort(lists);
        for (Student st: lists) {
            System.out.println(st.toString());
        }

    AgeComparator ageComparator = new AgeComparator();
    Collections.sort(lists,ageComparator);
    System.out.println("So sanh theo tuoi: ");
    for (Student st: lists) {
        System.out.println(st.toString());
    }
    }
}
