package Map;

import java.util.Map;
import java.util.HashMap;
public class MapCode {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
       map.put("a", 1);
       map.put("b", 2);
       map.put("c", 3);
       map.put("d", 4);
       map.put("e", 5);
        System.out.println(map);
        map.put(new String("f"),2);
        System.out.println(map);

    }
}
