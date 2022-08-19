package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GoodExampleOfComparator {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();
        Simpson homer = new Simpson("Homer");
        Simpson moe = new Simpson("Moe");

        simpsons.add(homer);
        simpsons.add(moe);
        Collections.sort(simpsons,(Comparator.<Simpson>
                            comparingInt(simpsons1 -> simpsons1.name.length())
                                    .thenComparingInt(simpsons2 -> simpsons2.name.length())));
        System.out.println(simpsons);
    }
}
