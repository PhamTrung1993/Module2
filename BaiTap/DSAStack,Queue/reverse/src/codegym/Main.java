package codegym;

public class Main {
    public static void main(String[] args) {
        StringBuffer array = new StringBuffer("trung");
        reverse(array);

        System.out.println("Reversed string is: " + array);
    }
    public static void  reverse(StringBuffer string) {
        int length = string.length();
        Stack Obj = new Stack(length);


        for (int i = 0; i < length ; i++) {
            Obj.push(string.charAt(i));
        }
        for (int i = 0; i < length; i++) {
            char characters = Obj.pop();
            string.setCharAt(i,characters);
        }
    }


}
