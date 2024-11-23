package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetCode {
    public static void main(String[] args) {
        Set<Object> st=new HashSet<>();
        st.add(1);
        st.add(4);
        st.add(3);
        st.add(10);
        st.add(0);
        st.add("Shivkant");
        st.add(null);

        // only one null allow
//        st.add(null);

        System.out.println(st);

    }
}
