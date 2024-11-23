package List;

import java.util.Arrays;
import java.util.Vector;
public class VectorCode {
    public static void main(String[] args) {
        Vector<String>v=new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.addAll(Arrays.asList("Shiv","Kant","Kumar"));
        v.hashCode();
        System.out.println("Hashcode of list:-"+v.hashCode());
        // add element at last of list to increase the size of vector auto
        v.addElement("Golu");
        System.out.println("Print first element of list:- "+v.firstElement());
        System.out.println(v);
        //removeElement(Object obj): Removes the first occurrence of the specified element in this vector.
        v.removeElement(1);
//        System.out.println(v);
//        Iterator i=v.iterator();
//        while(i.hasNext()) {
//            System.out.println(i.next());
//            v.add("Sk");
//        }


    }
}
