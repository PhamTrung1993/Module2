package codegym;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<NameArray> {
    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    private NameArray[] elements;

    public MyList() {
        elements = (NameArray[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        elements = (NameArray[]) new Object[size];
    }

    public void ensureCapa() {
        int biggestSize = elements.length * 2;
        elements = Arrays.copyOf(elements,biggestSize);
    }

    public void addElement(NameArray newIndex) {
        if (size == elements.length) {
            ensureCapa();;
        }
        elements[size++] = newIndex;
    }
    public boolean add(NameArray newIndex, int index){
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();;
            for (int i = size - 2; i >= index ; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = newIndex;
            return true;
        }
        return false;
    }
    public NameArray getElement (int location) {
        
        if (location >= size || location < 0){
            throw new IndexOutOfBoundsException("Index: " + location + ", size" + location);
        }
        return (NameArray)elements[location];
    }

    @Override
    public MyList clone() {

        MyList<NameArray> clone = new MyList<>(elements.length);
        for (NameArray element : elements){
              clone.addElement(element);
        }
        return clone;
    }
    public NameArray[] getElements() {
        return this.elements;
    }
    public int setSize() {
        return size;
    }
    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i+1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    public void clear() {
        elements = (NameArray[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(NameArray newIndex) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(newIndex)){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(NameArray newIndex) {
        for (NameArray element : elements ) {
            if (newIndex.equals(element)) {
                return true;
            }
        }
        return false;
    }
    public void showArray() {
        for (NameArray element: elements) {
            if (element != null) {
                System.out.print(element +"\t");
            }
        }
        System.out.print("\n");
    }
}
