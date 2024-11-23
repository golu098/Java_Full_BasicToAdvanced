import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Intro {
    public static void main(String[] args) {
        List <Integer>list= Arrays.asList(1,2,3,4,5);
        // convert collection into stream by stream methods
//       Stream<Integer>obj= list.stream();
//

        // by the help fo Arrays methods we are convert it into stream\
        String[] namesArray = {"Alice", "Bob", "Charlie"};
        Stream<String> nameStream = Arrays.stream(namesArray);


//Value Set (Single Value or Multiple Values)
        Stream<String> singleValueStream = Stream.of("Alice");
        Stream<Integer> multipleValuesStream = Stream.of(1, 2, 3, 4, 5);

        // String
        String name = "Alice";
        IntStream charStream = name.chars(); // Stream of character codes (int)
        Stream<String> splitStream = Arrays.stream(name.split("")); // Stream of characters (String)


//       long size=obj.count();
//        System.out.println(size);


//        Stream<Integer>sortedData=obj.sorted();
//        sortedData.forEach(n-> System.out.println(n));

//        Stream<Integer>doubleValue=obj.map(n->n*2);
        // behind the scene map working
        // working of predicate instead of n->n%2==1 we can use any var name and define predicate as below
//        Predicate<Integer>predicate=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n%2==1;
//            }
//        };
        // how to create anonymous class to lambda expression
        Predicate<Integer>predicate= (Integer n) ->{
                return n%2==1;
            };

//        list.stream()
//                .filter(n->n%2==1)
//                .sorted()
//                .map(n->n*2)
//                .forEach(n-> System.out.println(n));
        // if u want to add all the values then
       int out= list.stream()
                .filter(n->n%2==1)
                .sorted()
                .map(n->n*2)
//                .forEach(n-> System.out.println(n));
               .reduce(0,(c,e)->c+e);
        System.out.println(out);


        //
//        doubleValue.forEach(n-> System.out.println(n));
//        obj.forEach(n-> System.out.println(n));
    }
}
