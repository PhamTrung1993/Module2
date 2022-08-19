package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparableAndComparator {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Homer"));
        simpsons.add(new Simpson("Marge"));
        simpsons.add(new Simpson("Bart"));
        simpsons.add(new Simpson("Lisa"));

        Collections.sort(simpsons);
        simpsons.stream().map(simpson -> simpson.name).forEach(System.out::println);

        Collections.reverse(simpsons);
        simpsons.stream().forEach(System.out::println);
    }
}
