package codegym;

public class Stack {
    private int size;
    private int top;
    private char[] words;

    private boolean isEmpty() {
        return (top < 0);
    }

    public Stack(int length) {
        top = -1;
        size = length;
        words = new char[size];
    }


   public boolean push (char vocabulary) {
        if (top >= size) {
            System.out.println("codegym.Stack Overflow");
            return false;
        }
        else {
            words[++top] = vocabulary;
            return true;
        }
    }
   public char pop() {
        if (top < 0) {
            System.out.println("codegym.Stack Underflow");
            return 0;
        }
        else {
            char vocabulary = words[top--];
            return vocabulary;
        }
    }
}
