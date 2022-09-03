package codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    private static final long EXPIRED_TIME_IN_MILISECOND = 1200;
    private static final int NUMBER_OF_TAXI = 4;
    // Phương thức synchroizedList() được sử dụng để trả về danh sách được đồng bộ hóa
    // để đảm bảo truy cập nối tiếp, điều quan trọng là tất cả quyền truy cập vào danh sách
    // sao lưu phải được thực hiện thông qua danh sách trả về.
    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());
    //Atomic là một phần trong bộ thư viện java.concurrent kể từ java 6,
    // mình cũng dùng nó cho mục đích thông báo và đảm bảo giá trị sẽ được đồng bộ,
    // vì bên trong nó sử dụng kiểu private volatile int value;.
    // Nên bạn có thể yên tâm sử dụng để thay thế cho volatile nếu muốn. Chúng ta hãy cùng sử dụng Atomic cho các vụ dụ ở trên nhé.
    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);
    public synchronized void release(Taxi taxi) {
        inUse.remove(taxi);
        available.add(taxi);
        System.out.println(taxi.getName() + " is free");
    }
    public synchronized Taxi gettaxi() {
        if (!available.isEmpty()) {
            Taxi taxi = available.get(0);
            inUse.add(taxi);
            return taxi;
        }
        Taxi taxi = this.createTaxi();
        inUse.add(taxi);
        return taxi;
    }
    private Taxi createTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
        System.out.println(taxi.getName() + " isCreated");
        return taxi;
    }
    private void waitingUntilTaxiAvailable() {
        if (waiting.get()) {
            waiting.set(false);
            throw new TaxiNotFoundException("No taxi available");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME_IN_MILISECOND);
    }
    private void waiting(long time) {
        try {
            TimeUnit.MICROSECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
