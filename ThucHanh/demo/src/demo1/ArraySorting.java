package demo1;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] moesPints = new int[] {9,8,7,6,1};
        Arrays.sort(moesPints);

        Arrays.stream(moesPints).forEach(System.out::println);

        Simpson[] simpsons = new Simpson[]{new Simpson("Lisa"),new Simpson("Homer")};

        Arrays.sort(simpsons);
        Arrays.stream(simpsons).forEach(System.out::println);
    }
}
