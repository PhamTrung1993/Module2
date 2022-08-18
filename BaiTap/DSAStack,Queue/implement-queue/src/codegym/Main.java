package codegym;
import codegym.Solution;
public class Main {
    public static void main(String[] args) {
        Solution.Queue que = new Solution.Queue();
        que.front = que.rear = null;

        Solution.enQueue(que,14);
        Solution.enQueue(que,22);
        Solution.enQueue(que,6);

        Solution.displayQueue(que);

        System.out.printf("Deleted value = %d", Solution.deQueue(que));
        System.out.print("\n");

        Solution.displayQueue(que);

        Solution.enQueue(que,9);

        Solution.displayQueue(que);
    }
}
