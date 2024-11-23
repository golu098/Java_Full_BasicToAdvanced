package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCode {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
    dq.push("A");
    dq.push("B");
    dq.add("H");
    dq.push("C");
    dq.push("k");
    dq.push("D");
//    dq.push(null);
    System.out.println("Print DQ:-"+dq);

        dq.addFirst("a");
        dq.offerFirst("b");
        dq.addLast("c");
        dq.add("f");
        System.out.println(dq);
    }
}
