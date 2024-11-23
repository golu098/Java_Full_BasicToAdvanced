import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStream {
    public static void main(String[] args) {
        Stream<String> inputValue = Stream.of("a", "AnM", "AB");
        List<String> outputValues = inputValue
                .map(String::toUpperCase)                     // Convert all strings to uppercase
                .filter(e -> e.length() > 1)                  // Filter strings to keep ones with a length > 1
                .flatMap(e -> Arrays.stream(e.split("")))     // Using flatMap to split the strings into Streams of characters
                .limit(2)                                     // Limit the result to the first 2 elements post-flatMap
                .skip(1)                                      // Skip 1 element from the limited result
                .collect(Collectors.toList());

        System.out.println(outputValues);
    }
}
//with the input ["a", "AnM", "AB"], after  mapping and filtering, the list would have ["ANM", "AB"]. FlatMap would break these down to ['A', 'N', 'M', 'A', 'B']. Applying limit then skip would give you a list containing just ["N"], because after limiting to the first 2 elements (which would have been ['A', 'N']), skipping the first one would leave you with ["N"].