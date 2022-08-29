package codegym;

public class Main {
    public static void main(String[] args) {
    NumberGenerator ng1 = new NumberGenerator();
    NumberGenerator ng2 = new NumberGenerator();

    Thread thread1 = new Thread(ng1);
    Thread thread2 = new Thread(ng2);
    // Mức độ ưu tiên của luồng.
    thread1.setPriority(Thread.MAX_PRIORITY);
    thread2.setPriority(Thread.MIN_PRIORITY);
    thread1.start();
    thread2.start();
    }
}
