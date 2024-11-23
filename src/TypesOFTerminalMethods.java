import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class TypesOFTerminalMethods {
    public static void main(String[] args) {
        List<String> strings = Stream.of( 10,20,30,40,609,90,19,20)
                .map(x -> x % 2)
                .map(Object::toString)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(strings);
    }
}
