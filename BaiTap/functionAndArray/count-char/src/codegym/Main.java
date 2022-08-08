package codegym;


import java.lang.String;
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        char charr = 'l';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == charr) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + charr +
                " trong chuỗi " + str + " = " + count);
    }
}
