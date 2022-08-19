import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User("Hieu", 25));
        map.put(1, new User("Vinh", 22));
        map.put(1, new User("Han", 23));

    }
}
