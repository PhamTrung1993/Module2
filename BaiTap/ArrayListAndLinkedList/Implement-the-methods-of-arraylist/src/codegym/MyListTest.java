package codegym;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addElement("AnCol");
        list.addElement("Bourbon");
        list.addElement("Gin");
        list.addElement("Rum");
        list.addElement("Chevoren");

        list.showArray();


        System.out.println(list.indexOf("Chivas"));
        System.out.println(list.indexOf("Rum"));

        list.remove(2);
        list.add("Chivas",3);
        list.showArray();

        MyList<String> clone = list.clone();
        System.out.println(clone.contains("Chevoren"));
        System.out.println(clone.contains("Cadilac"));
        System.out.println(clone.getElement(2));
        System.out.println(clone.setSize());
        clone.clear();
        System.out.println(clone.setSize());
        clone.showArray();
    }

}
