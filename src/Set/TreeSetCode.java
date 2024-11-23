package Set;

import java.util.TreeSet;
public class TreeSetCode {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
//        TreeSet<Object> set = new TreeSet<String>();
//        set.add("A");
//        set.add("B");
//        set.add("C");
//        set.add("D");
//        set.add("E");
        set.add("java");
        set.add("scala");
        set.add("kotlin");
        set.add("sca" + "la");

        // no null value allowed
//        set.add(null);
        set.add("Java");
        System.out.println(set);
        String a="b";
        System.out.println("Check if the above string exists in the treeset or not:- "+set.contains(a));
        System.out.println("First element: " + set.first());
    
    }
}
