package codegym;

public class RunableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    RunableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    //Phương thức run thực hiện việc hiển thị luồng nào đang được thực hiện.
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting");
    }
//  Phương thức start() được sử dụng để tạo ra các luồng với tên tương ứng
    public void star() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
