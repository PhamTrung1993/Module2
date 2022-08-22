package codegym;

public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

    public static void main(String[] args) {
        int length = list.length;
        int key = 50;
        int result = binarySearch(list,0,length,key);
        showResult(result);
    }

    private static void showResult(int result) {
        if (result == -1) {
            System.out.println("Not found!");
        }
        else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int binarySearch(int[] list,int low, int hight, int key) {

        int mid= (low + hight) / 2;

        if (list[mid] == key) {
            return mid;
        } else if ( list[mid] > key) {
            return binarySearch(list,low,mid - 1, key);
        }
        else if (list[mid] < key) {
            return binarySearch(list,mid + 1, hight,key);
        }
        return -1;
    }
}
