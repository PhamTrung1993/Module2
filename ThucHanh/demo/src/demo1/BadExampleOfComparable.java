package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BadExampleOfComparable {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();

        Simpson homer = new Simpson("Homer") {

            @Override
            public int compareTo(Simpson simpson) {
                return this.name.length() - (simpson.name.length());
            }
        };
        Simpson moe =new Simpson("Moe"){
            @Override
            public int compareTo(Simpson simpson) {
                return this.name.length() - (simpson.name.length());
            }
        };
        simpsons.add(homer);
        simpsons.add(moe);

        Collections.sort(simpsons);
//        simpsons.stream().forEach(System.out::println);
        System.out.println(simpsons);
    }
}
/*Như bạn có thể thấy, mã này rất phức tạp và bao gồm rất nhiều sự lặp lại.
 Chúng tôi đã phải ghi đè phương thức compareTo () hai lần cho cùng một logic.
 Nếu có nhiều yếu tố hơn, chúng ta sẽ phải sao chép logic cho từng đối tượng.*/