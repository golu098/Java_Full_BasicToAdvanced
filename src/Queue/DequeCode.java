package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCode {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<String>();
        dq.addFirst("a");
        dq.offerFirst("b");
        dq.addLast("c");
        dq.add("f");

        System.out.println(dq);


    }
}
