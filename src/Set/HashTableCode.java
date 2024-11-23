package Set;

import java.util.Set;
import java.util.Hashtable;

public class HashTableCode {
    public static void main(String[] args) {
        Hashtable<Integer,String> st=new Hashtable <>(1,2);
        st.put(1,"Shivkant");

        st.put(2,"Golu");
        st.put(4,"Mahadev");
        st.put(5,"Har");

        st.put(3,"Har");
//        st.put(10,null);
        // no  null allow in hastable
        System.out.println(st);

        // Print hash code for each key
        System.out.println("Hash codes of keys:");
        for (Integer key : st.keySet()) {
            System.out.println("Key: " + key + ", Hash Code: " + key.hashCode());
        }

    }
}

// it is mention that the hashcode will determine the insertion order in hashtable how ?


