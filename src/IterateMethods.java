import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateMethods {
    public static void main(String[] args) {
        Stream<Integer> obj=Stream.iterate(0,n->n+2);
        List<Integer>obj1=Stream.iterate(0,n->n+2)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(obj1);
    }
}
