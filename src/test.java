import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.util.stream.Nodes.collect;

public class test{
    public static void main(String [] args){
        // Collecting the stream result into a List<Integer>
        List<Integer> arr = Arrays.asList(1, 3, 4, 1, 5, 5, 6, 23, 12);

        List<Integer> result = arr.stream()
                .filter(n -> n % 2 == 1)  // Filter odd numbers
                .map(i -> i * 2)          // Multiply each by 2
                .distinct()               // Remove duplicates
                .sorted()                 // Sort the list
                .limit(2)                 // Limit to first 2 results
                .collect(Collectors.toList());  // Collect the results into a list

        // Printing the result list
        System.out.println(result);
//        parallel();


            result.forEach(System.out::println);
List<List<Integer>>multipleList=Arrays.asList(
        Arrays.asList(2,4,5,6,3),
        Arrays.asList(7,9,67,89),
        Arrays.asList(89,59,665,44)

);
List<Integer>flatList=multipleList.stream()
        .flatMap(Collection::stream)
        .filter(n->n>0)
        .collect(Collectors.toList());

        System.out.println(flatList);
//        System.out.println(streamArr);

    }
}