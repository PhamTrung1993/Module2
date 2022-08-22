package codegym;

public class InsertionSort {
    public static int[] list = {4,7,3,9,10,2,11,8,5,6,0};

    public static void main(String[] args) {
        System.out.println("Original array: ");
        printArray(list);
        insertionSort(list);
        System.out.println("Array after sorting:");

    }
    public static int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i -1 ;
            /* Di chuyển các phần tử có giá trị lớn hơn giá trị
               key về sau một vị trí so với vị trí ban đầu
               của nó */
            while (j >=0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
    static void printArray(int[] array) {

        for (int element : array) System.out.print(element + " ");

        System.out.println();
    }
}
