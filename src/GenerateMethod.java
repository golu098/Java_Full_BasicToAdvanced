import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateMethod {
    public static void main(String[] args) {
        Stream<String> infiniteStream = Stream.generate(() -> "Shivkant");
        // Generates an infinite stream

//        System.out.println(infiniteStream);
        List<String> limitedList = Stream.generate(() -> "shivkant")
                .limit(3)
                .collect(Collectors.toList());


        System.out.println(limitedList);
    }
}
