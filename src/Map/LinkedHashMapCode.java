package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(9, "nine");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, null);
        map.put(null, null);
        System.out.println(map);
        System.out.println("Entry set usage:- "+map.entrySet());
        System.out.println("Key set usage:- "+map.keySet());

        map.forEach((key,value)->System.out.println(key+" "+value));
    }
}
