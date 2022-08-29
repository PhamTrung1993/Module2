package codegym;

public class Main {
    public static void main(String[] args)  throws InterruptedException{
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread thread1 = new Thread(evenThread);
        Thread thread2 = new Thread(oddThread);

        evenThread.setName("EVENThread");
        oddThread.setName("ODDThread");
        thread1.start();
//        Phương thức join() chờ một thread chết.
//        Nói cách khác, nó làm cho các thread đang chạy ngừng hoạt động cho đến khi luồng mà nó tham gia hoàn thành nhiệm vụ của nó.
        thread1.join();
        thread2.start();
    }
}
