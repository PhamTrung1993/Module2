package demo1;

import java.util.Set;
import java.util.TreeSet;
//Set interface chịu trách nhiệm lưu trữ các giá trị duy nhất,
// Nhưng khi chúng tôi sử dụng triển khai TreeSet, các phần tử được chèn sẽ được tự động sắp xếp khi chúng tôi thêm chúng
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Simpson> simpsons = new TreeSet<>();
        simpsons.add(new Simpson("Moe"));
        simpsons.add(new Simpson("Lenny"));
        simpsons.add(new Simpson("Homer"));
        simpsons.add(new Simpson("Barney"));

        System.out.println(simpsons);
    }
}
