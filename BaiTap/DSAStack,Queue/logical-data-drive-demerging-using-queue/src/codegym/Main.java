package codegym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> maleQueue = new LinkedList<>();
        Queue<Person> femaleQueue = new LinkedList<>();
        ArrayList<Person> listPerson = inputData();
        showList(listPerson);
        processOldList(maleQueue, femaleQueue, listPerson);
        ArrayList newListPerson = createNewList(maleQueue,femaleQueue);
        showList(newListPerson);
    }
    private static ArrayList inputData() {
        Person person1 = new Person("Đức", "male","1993");
        Person person2 = new Person("Đạt", "male","1993");
        Person person3 = new Person("Anh", "female","1993");
        Person person4 = new Person("Hoài", "male","1993");
        Person person5 = new Person("Trang", "female","1993");
        Person person6 = new Person("Nga", "female","1993");

        ArrayList listPerson = new ArrayList<>();

        for (Person person : Arrays.asList(person1, person2, person3, person4, person5, person6)) {
            listPerson.add(person);
        }

        return listPerson;
    }
    private static void showList(ArrayList<Person> listPerson) {
        System.out.println(">>>>>>>>>>LIST<<<<<<<<<<");
        for (Person person : listPerson) {
            System.out.println(person);
        }
    }
    private static void processOldList(Queue<Person> maleQueue, Queue<Person> femaleQueue,ArrayList listPerson ) {
        for (Object person : listPerson) {
            Person holder = (Person) person;
            if (holder.getGender().equals("male")) {
                maleQueue.add(holder);
            } else femaleQueue.add(holder);
        }
    }
    private static  ArrayList createNewList(Queue<Person> maleQueue, Queue<Person> femaleQueue) {
        ArrayList newListPerson = new ArrayList<>();
        for (Queue<Person> people : Arrays.asList(femaleQueue, maleQueue)) {
            newListPerson.addAll(people);
        }
        return newListPerson;
    }
}
