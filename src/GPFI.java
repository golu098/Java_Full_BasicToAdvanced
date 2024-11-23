import java.util.function.*;
import java.lang.Runnable;
public class GPFI {
    public static void main(String[] args) {
        Supplier<String> obj = () -> "Shivkant";
        System.out.println("By the help of Supplier Functional Interface: " + obj.get());

        Consumer<String> obj1 = (surname) ->
                System.out.println("By the help of Consumer Functional Interface: " + surname);
        obj1.accept("Sharma");

        BiConsumer<String, String> obj4 = (firstName, lastName) ->
                System.out.println("By the help of BiConsumer Functional Interface: " + firstName + " " + lastName);
        obj4.accept("Ram", "Sita");

        BiConsumer<Integer, String> objBiConsumer = (num, str) -> {
            System.out.println("Integer: " + num + ", String: " + str);
        };

        // Integer and String inputs
        Integer inputNum = 12;
        String inputStr = "Hello";

        // Use the BiConsumer to accept two arguments
        objBiConsumer.accept(inputNum, inputStr);


        Predicate<Integer> obj2 = (age) -> age > 18;
        System.out.println("My age is (20 > 18): " + obj2.test(20));

        BiPredicate<Integer,Integer>objOfBiPredicate=(age1,age2)->age1>age2;
                System.out.println("Age1 is Greater than Age2: "+objOfBiPredicate.test(12,19));


                // Calling the convertToUpperCase method
        GPFI gpfI = new GPFI();
        System.out.println(gpfI.convertToUpperCase("nickname"));


        Function<String,Integer>objOfFunction=(myName)->myName.length();
        System.out.println("Length of string by Function Interface :-"+objOfFunction.apply("Shivkant"));

        // Implementing BiFunction to accept two arguments
        BiFunction<String, String, String> concatNames = (firstName, lastName) -> firstName + " " + lastName;
        System.out.println("Full name by BiFunction: " + concatNames.apply("Shivkant", "Sharma"));
    }

    public String convertToUpperCase(String nickName) {
        Function<String, String> obj3 = (name) -> name.toUpperCase();
        return obj3.apply(nickName);
    }
}
