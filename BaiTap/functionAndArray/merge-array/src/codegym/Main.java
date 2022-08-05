package codegym;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {2,3,4,5,6};
        int[] arrayTwo = {5,4,3,2,1};
        int lengthone = arrayOne.length;
        int lengthtwo = arrayTwo.length;
        int lengthThree = lengthtwo + lengthone;
        int[] arrayThree = new int[lengthThree];

        for (int i = 0; i < lengthone; i++) {
            arrayThree[i] = arrayOne[i];

        }
        for (int i = 0; i < lengthtwo; i++) {
            arrayThree[lengthone+i] = arrayTwo[i];
        }
        System.out.println("Array three is:");
        for (int i = 0; i < lengthThree; i++) {
            System.out.print("\t" + arrayThree[i]);
        }
    }
}
