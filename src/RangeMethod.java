import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeMethod {
    public static void main(String[] args) {

        // class method supplying a data stream
//        IntStream rangeStream= IntStream.range(1,5);
//        // we can not use here sout bcz it is integer  object and we can npt overide toString() in it
//        int [ ]rangeArray=rangeStream.toArray();
//        System.out.println(Arrays.toString(rangeArray));


        IntStream rangeStream = IntStream.range(1, 5);
// Generates: 1, 2, 3, 4

        List<Integer> rangeList = IntStream.range(1, 5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(rangeList);

    }
}
