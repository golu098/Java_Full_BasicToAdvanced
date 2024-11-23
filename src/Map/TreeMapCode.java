package Map;

import java.util.TreeMap;
import java.util.Map;
public class TreeMapCode {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(1, "OneD");
//        treeMap.put(null, "Five");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }
        for(Map.Entry i:treeMap.entrySet()){
            System.out.println(i.getKey()+ ":"+i.getValue());
        }
        System.out.println(treeMap.headMap(3));

        System.out.println(treeMap.tailMap(3));

//
//        class Others.Main <T  Number> {
//
//        }
//
//        int float double
    }
}
