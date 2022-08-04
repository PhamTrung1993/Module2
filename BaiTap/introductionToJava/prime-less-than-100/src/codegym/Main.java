package codegym;


public class Main {
    public static void main(String[] args) {
       int n = 2;

        System.out.println("Prime is: ");
       while (n < 100) {
           boolean check = true;
           for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   check = false;
                   break;
               }
           }
           if (check) {
               System.out.print(n + "\t");

           }
           n++;
       }

    }
}
