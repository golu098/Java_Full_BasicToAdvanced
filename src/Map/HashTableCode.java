package Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableCode {
    public static void main(String[] args) {
        Hashtable <String,Integer>hash=new Hashtable<>(1,45);
        hash.put("A",1);
        hash.put("B",2);

        System.out.println("AA".hashCode());
        System.out.println("BL".hashCode());
        System.out.println("L".hashCode());
        hash.put("C",3);
        hash.put("D",4);
        hash.put(" ",8);
        hash.put(" ",9);

        hash.remove("A");
        System.out.println(hash);
//        Enumeration<String> keys = hash.keys();
//        while (keys.hasMoreElements()) {
//            System.out.println(keys.nextElement());
//        }
        Enumeration<Integer> elements = hash.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }

    }
}
