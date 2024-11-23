package revision1;

import java.util.*;

import static java.util.Spliterators.iterator;

public class ListCode {
    public static void main(String[] args) {
//        List<Integer>obj=new ArrayList<>();
        Stack<Integer>obj=new Stack<>();
        obj.add(1);
        obj.add(3);
        obj.add(2);
        obj.add(2);
        obj.push(2);
//        System.out.println(obj);
//        for(int i:obj){
//            System.out.println(i);
//        }
//        Iterator<Integer>it=obj.iterator();
//        while(it.hasNext()){
//            int i= it.next();
//            System.out.println(i);
//        }
        obj.stream().forEach(i-> System.out.println(i));
    }



}
