package Map;

import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigablMapCode {
    public static void main(String[] args) {
        NavigableMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", null);
        map.put("G", null);
        System.out.println("The value and key of Navigable Map are:-"+map);
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());
        System.out.println("Highest entry: " + map.higherEntry("D"));
        System.out.println("Lowest entry: " + map.lowerEntry("D"));
        System.out.println("The Floor Entry: " + map.floorEntry("D"));
        System.out.println("The Ceiling Entry: " + map.ceilingEntry("D"));
        System.out.println("The Lower Key: " + map.lowerKey("D"));
        System.out.println("The Higher Key: " + map.higherKey("D"));
        System.out.println("Return key and value in Descending order but take only key in descending order:- "+map.descendingMap());
        System.out.println("Values in Descending Order:- "+map.descendingKeySet());
        System.out.println("Values in Ascending order :- "+map.navigableKeySet());

    }
}
