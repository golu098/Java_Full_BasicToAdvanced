package Set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCode  {
    public static void main(String[] args) {
        SortedSet<Integer> st = new TreeSet<>(); // Use TreeSet to instantiate SortedSet

        // Example usage
        st.add(10);
        st.add(5);
        st.add(20);
        st.add(90);

//        st.add(null);
        System.out.println(st);
        System.out.println(st.first());
        System.out.println("tailset output:-" +st.tailSet(10));
        System.out.println("headset output:-" +st.headSet(10));

        System.out.println("Sorted Set: " + st);


        //usisng comparator to sort in descending
    }
}