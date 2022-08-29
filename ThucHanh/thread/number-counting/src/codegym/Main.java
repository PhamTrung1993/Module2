package codegym;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try
        {
        //kiểm tra một thread đã kết thúc hay chưa bởi kiểm tra phương thức isAlive() trong Java.
            while (count.getMyThread().isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
