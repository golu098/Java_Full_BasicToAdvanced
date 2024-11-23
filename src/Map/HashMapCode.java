package Map;

import java.util.*;
public class HashMapCode {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println(map);
        map.put(null, "E");
        map.put(null, "g");
        map.remove(2);
        map.replace(3,"F");
        System.out.println("The key and value of HashMap are:- "+map);
        // 1st way
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // 2nd way :- for only keys and values
//        for(Object i:map.keySet()){
//            System.out.println(i + ": " + map.get(i));
//        }
        // 3rd way :- for only values
//        for(Object i:map.values()){
//            System.out.println(i);
//        }
        // 4th way:0 for only keys
//        for(Object i:map.keySet()){
//            System.out.println(i);
//        }
    }
}
