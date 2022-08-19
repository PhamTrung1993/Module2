package demo1;

import java.util.Map;
import java.util.TreeMap;
//API Java bao gồm nhiều lớp để hỗ trợ sắp xếp, bao gồm cả TreeMap.
// Trong ví dụ dưới đây, chúng tôi sử dụng TreeMap để sắp xếp các keys ở trong Map.
public class TreeMapExample {
    public static void main(String[] args) {
        Map<Simpson, String> simpsons = new TreeMap<>();
        simpsons.put(new Simpson("Moe"), "shotgun");
        simpsons.put(new Simpson("Lenny"), "Carl");
        simpsons.put(new Simpson("Homer"), "television");
        simpsons.put(new Simpson("Barney"), "beer");

        System.out.println(simpsons);

    }
}
