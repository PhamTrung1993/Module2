package codegym;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ListTest = new MyLinkedList(10);
        ListTest.addFirst(11);
        ListTest.addFirst(12);
        ListTest.addFirst(13);
        ListTest.addLast(9);
        ListTest.addLast(8);
        ListTest.addLast(7);
        ListTest.printList();

        ListTest.add(2,15);
        ListTest.add(3,16);
        ListTest.printList();

        ListTest.remove(5);
        ListTest.remove(10);
        ListTest.removeFirst();
        ListTest.removeLast();
        ListTest.printList();

        System.out.println(ListTest.indexOf(8));
        System.out.println(ListTest.isContain(9));
    }
}
