package Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueCode {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);

        pq.add(4);
        pq.add(3);
        // no null is allowed in PQ
//        pq.add(null);
        System.out.println(pq);
        System.out.println(pq.size());//4
        System.out.println(pq.peek());//1
        System.out.println(pq.poll());//1
        System.out.println(pq.remove());//remove specify element
        System.out.println(pq.toArray());// type and memory address of objects
        // convert into array
        Object[] newPq=pq.toArray();
        System.out.println(Arrays.toString(newPq));
    }
}
