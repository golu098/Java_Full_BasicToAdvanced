import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class ForEachMethodCode {
    public static void main(String[] args) {
        Collection<String>arr= Arrays.asList("Shivkant","Golu","Kumar","Sharma");
//         imperative style
//        for(String i:arr){
//            System.out.println(i);
//        }

//         Functional Style:- consumer works here
//        arr.forEach(i-> System.out.println(i));

//            arr.remove(i->i.length()>2);

//         Method Refernce
        arr.forEach(System.out::append);
        System.out.append("Golu");



        // Map Interface

//        Map<String, String> names = Map.of(
//                "Shivkant","Kumar","Golu","Sharma");
//
//            // Imperative style
//        for (Map.Entry <String, String> entry : names.entrySet()) {
//            String firstname = entry.getKey();
//            String lastname = entry.getValue();
//            System.out.println(firstname + " " + lastname);
//        }
//
//        // Functional style
//        names.forEach((firstname, lastname) ->
//                System.out.println(firstname + " " + lastname));
    }
}
