package src;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null); // name is an empty Optional
        Optional<String> name1 = Optional.ofNullable("a");
        Optional<String> name2 = Optional.empty();
        // Methods of Verifying and Returning a Result get(), isPresent(), ifPresent()
        Optional my_name=Optional.of("Shivkant");
        if(my_name.isPresent()){
            System.out.println("by the help of isPresent and get():-"+my_name.get());
        }
        my_name.ifPresent( System.out::println);
        // with lambda expression (decalre and var and define it in it)
        my_name.ifPresent(out -> System.out.println("ifPresent method's output: " + out));


        // This line will cause a NullPointerException because you are passing a null value to orElseGet()
        // Uncomment the line below to see the exception
        String result1 = name.orElseGet(() -> null);
        System.out.println(result1); // This line will not be executed if exception occurs

        // You could also trigger a NullPointerException by explicitly throwing it:
        try {
            String result2 = name.orElseThrow(() -> new NullPointerException("No value present"));
            System.out.println(result2); // This line will not be executed if exception occurs
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Another scenario: passing null to Optional.of(), which is not allowed and will throw a NullPointerException
        try {
            Optional<String> name3 = Optional.of(null); // This line will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
