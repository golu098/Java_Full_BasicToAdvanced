package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapCode {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(8, "One");
        map.put(2, "Two");
        map.put(5, "Five");
        map.put(4, "Four");
        map.put(3, "Three");
//        map.put(null, "One");
        map.remove(3);
        System.out.println(map);
        System.out.println("Returns the key of the first map element (the one with the smallest value) :- "
                +map.firstKey());
        System.out.println("Returns a Set view of the mappings contained in this map.:- "+map.entrySet());
        System.out.println("Returns the key of the last map element (the one with the highest value):- "+map.lastKey());
        System.out.println("Returns a view of the portion of this map whose keys are strictly less than toKey:- "+map.headMap(8));
        System.out.println("Returns a view of the portion of this map whose keys are greater than or equal to fromKey"+map.tailMap(8));
        System.out.println("Returns a Set view of the keys contained in this map."+map.keySet());
        System.out.println("Returns the last (highest) key currently in this map:-"+map.lastKey());
//        System.out.println("Lower Entry :-"+map.lowerEntr);



    }
}
