package Queue;

import java.util.*;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(1);
        q.add(10);
        q.add(1000);
        q.add(100);
        q.add(10000);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println("---------Custom priority--------------");

        PriorityQueue<Integer> customPQueue =new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);    //descending order
            }
        });

        customPQueue.add(5);
        customPQueue.add(11);
        customPQueue.add(0);
        customPQueue.add(-1);
        System.out.println(customPQueue);
        System.out.println(customPQueue.peek());


//
//        PriorityQueue<String> q=new PriorityQueue<>();
//        q.add("a");
//        q.add("b");
//        q.add("ab");
//        q.add("ba");
//        q.add("aba");
//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q);
    }
}
