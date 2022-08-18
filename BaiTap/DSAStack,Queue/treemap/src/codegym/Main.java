package codegym;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "hello body hello bady";
        string = string.replaceAll(",","");
        String[] array = string.split(" ");
        String key = "";
        Integer value;
        TreeMap<String,Integer>map = new TreeMap<String,Integer>();
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
        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            key = (String)i.next();
            System.out.println("Word ' " + key +" ' appears " + map.get(key) + " times");
        }
    }
}
