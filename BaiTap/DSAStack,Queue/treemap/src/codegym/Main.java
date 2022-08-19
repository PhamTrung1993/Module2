package codegym;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "hello body hello bady";
        string = string.replaceAll(",","");
        String[] array = string.split(" ");

        TreeMap<String,Integer>map = new TreeMap<String,Integer>();
        extracted(array, map);
        show(map);
    }

    private static void show(TreeMap<String, Integer> map) {
        String key;
        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            key = (String)i.next();
            System.out.println("Word ' " + key +" ' appears " + map.get(key) + " times");
        }
    }

    private static void extracted(String[] array, TreeMap<String, Integer> map) {
        String key;
        Integer value;
        for (int i = 0; i < array.length; i++) {

            key = array[i];
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key,value+1);
            }
            else {
                map.put(key,1);
            }
        }
    }
}
