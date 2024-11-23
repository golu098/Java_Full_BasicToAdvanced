package Others;

import java.util.*;

class Old {
    public static void main(String[] args) {
        get(new HashSet());
        get(new LinkedHashSet<String>());

    }
    public static Object get(Set<?> set) {
        return set.toArray();
    }
}