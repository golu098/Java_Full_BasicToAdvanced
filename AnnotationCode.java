
package src;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

import static java.awt.SystemColor.info;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Make the annotation available at runtime
@Target(ElementType.METHOD) // This annotation can be applied to methods
@interface shivkant {
    String name();
    int age();
}

// Class with a method that uses the custom annotation
class Info {

    @shivkant(name = "shivkant_kumar", age = 18)
    public void displayInfo() {
        // Method content (if any)
    }
}

public class AnnotationCode {
    public static void main(String[] args) {
//        // Accessing the annotation values using reflection
//        Info info = new Info();
//
//        // Get the method to check if it's annotated
//        try {
//            // Get the method that is annotated with @shivkant
//            java.lang.reflect.Method method = info.getClass().getMethod("displayInfo");
//
//            if (method.isAnnotationPresent(shivkant.class)) {
//                shivkant annotation = method.getAnnotation(shivkant.class);
//                System.out.println("Name: " + annotation.name());
//                System.out.println("Age: " + annotation.age());
//            }
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//    }


//        Info obj=new Info();
//        try{
//            java.lang.reflect.Method method= obj.getClass().getMethod("displayInfo");
//            if(method.isAnnotationPresent(shivkant.class)){
//                shivkant obj1=method.getAnnotation(shivkant.class);
//                System.out.println(obj1.age());
//
//            }
//
//        }
//        catch(NoSuchMethodException e){
//            e.printStackTrace();
//        }

//    Info obj=new Info();
//    try {
//        java.lang.reflect.Method method = obj.getClass().getMethod("displayInfo");
//        if(method.isAnnotationPresent(shivkant.class)){
//            shivkant obj1=method.getAnnotation(shivkant.class);
//            System.out.println(obj1.age());
//        }
//    }catch (NoSuchMethodException e){
//        e.printStackTrace();
//    }

        Info obj=new Info();
        try {
            java.lang.reflect.Method method=obj.getClass().getMethod("displayInfo");
            if(method.isAnnotationPresent(shivkant.class)){
                shivkant obj1=method.getAnnotation(shivkant.class);
                System.out.println(obj1.age());
            }
        }
        catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}

