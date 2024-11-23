package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCode {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("A");
        set.add("Z");
        set.add("F");
        set.add("H");
        set.add("H");
        set.add(null);
        set.add(null);

        set.add("D");
        System.out.println(set);

    }
//
//    public static class HashSetCode {
//        public static void main(String[] args) {
//    //        HashSet <String>hashSet=new HashSet<>();
//            // for checking heterogenous property
//            HashSet<Object> hashSet=new HashSet<>();
//            hashSet.add("A");
//            hashSet.add("B");
//            hashSet.add("D");
//            hashSet.add(null);
//            hashSet.add("C");
//            hashSet.add(7);
//    //        System.out.println(null.hashCode());
    //         why this happens

    //        hashSet.add(89);
    //        hashSet.add(28);
    //        hashSet.add(73);
    //        hashSet.add(null);
    //        hashSet.add(49);
    //        hashSet.add(null);
//            for(Object i:hashSet){

    //for(String i:hashSet){
//        System.out.println(i);
//    }
//
//            System.out.println("Size Method:-"+hashSet.size());
//            System.out.println("Contains Methods:-"+hashSet.contains("A"));
//            System.out.println("All the Values of the HashSet are:-"+hashSet);
//            System.out.println("Remove element from hashSet:-"+hashSet.remove("A"));
//            System.out.println("After removing the element the hashSet will be :-"+hashSet);


        //}
    // }
}
