package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListCode implements Iterable<Integer> { // Implement Iterable
    private ArrayList<Integer> obj = new ArrayList<>();

    public static void main(String[] args) {
        ArrayListCode list = new ArrayListCode();
        list.run();
    }

    public void run() {
        // Adding elements to the ArrayList
        obj.add(10);
        obj.add(20);
        obj.add(89);
        obj.add(30);
        obj.add(null);
        System.out.println(obj);

        // Adding an element at a specific index
        obj.add(1, 19);

        // Adding multiple elements using addAll with Arrays.asList
        obj.addAll(Arrays.asList(121, 34, 45));

        // Print element at index 0
        System.out.println("Elements in ArrayList at index 0: " + obj.get(0));

        // Print index of element 9 (which is not in the list)
        System.out.println("Index of 9: " + obj.indexOf(9));

        // Remove the element at index 2 and print the removed element
        obj.remove(2);

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + obj.size());

        // Check if the ArrayList contains the value 2
        System.out.println("Contains value 2 in ArrayList: " + obj.contains(2));

        // Remove null values and then sort the ArrayList
        obj.removeIf(Objects::isNull);  // Remove null values before sorting
        Collections.sort(obj);
        System.out.println("Sorted ArrayList: " + obj);

        // Iterate through the ArrayList and print each element
        System.out.println("Elements in ArrayList:");
        Iterator<Integer> it = iterator(); // Obtain the iterator from the class itself
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Implementing the iterator() method from Iterable interface
    @Override
    public Iterator<Integer> iterator() {
        return obj.iterator(); // Return the iterator of the ArrayList
    }
}
