package List;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListCode {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println(list);
        System.out.println("LinkedList size is: " + list.size()) ;
        list.addAll(Arrays.asList("D","E","F","G"));
        list.addFirst(" Shiv kant ");// getFirst(), addLast(),removeFirst()
        list.offerFirst("Golu Sharma");
        String peekElementStorage= list.peekFirst();
        System.out.println("Peek element :-"+peekElementStorage);
        for(String i:list){
            System.out.print(i);
        }
    }
}
