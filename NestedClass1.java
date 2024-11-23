package src;

//import com.sun.tools.javac.NestedClass1;

//import java.util.*;
import java.util.Scanner;
import java.util.*;
class NestedClass1 {
    static class StaticClass{
        void staticMethods(){
            System.out.println("Static Class");
        }
    }

    void an(){
        System.out.println("a1 class methods");
    }
    class inner{
        void innerMethods(){
            class local{
//                System.out.println("HEllo hi");
                 void localMethods(){
                    System.out.println("Local Class");
                }
                void localMethods1(){
                    System.out.println("Local Class 1");
                }

            }
            local obj2=new local();
            obj2.localMethods();
            // local obj3=new local();
            obj2.localMethods1();
            System.out.println("Inner Class");
        }
    }

    public static void main(String[] args){
        NestedClass1 obj=new NestedClass1();
        // inner.outer obj1=new outer.inner();
        NestedClass1 obj4=new NestedClass1(){
            void an(){
                System.out.println("Anpnymous class methods");
            }
        };
        obj4.an();
        NestedClass1.inner obj1=obj.new inner();
        obj1.innerMethods();
        StaticClass obj2=new StaticClass();
        obj2.staticMethods();

    }
}