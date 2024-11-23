package Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"bb", "a", "ff", "cc", "b", "d");
        System.out.println("Print the list:- "+list);
        Collections.sort(list);
        System.out.println("List after Sorting:- "+list);
        Collections.swap(list, 2, 5);
        System.out.println("List after Swap Opetation:-"+list);
        Collections.reverse( list);
        System.out.println("Reverse List:-"+list);
        Collections.shuffle(list);
        System.out.println("shuffle List:- "+list);
    }
}
