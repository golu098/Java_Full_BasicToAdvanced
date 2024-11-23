@FunctionalInterface
interface  A{
     int a=10;

     void abstractMethod();
//     void abstractMethod1();

    static void staticMethod(){
        System.out.println("Hi i am static method");
//        System.out.println(a);
    }
    default void defaultMethod(){
        System.out.println("hi i am default Method");
        System.out.println(a);
    }
    private void privateMethod(){
        System.out.println("I am private Method");
        System.out.println(a);
    }


}
class B implements A{

    @Override
    public void abstractMethod() {
        System.out.println("i am abstract Method");
    }
    public void abstractMethod1() {
        System.out.println("i am abstract Method 1");
    }


}
public class FunctionalInterfaceCode {

    public static void main(String[] args) {
       B obj=new B();
       obj.abstractMethod();
       A.staticMethod();
       obj.defaultMethod();

//       B anonymousObject=new B(){
//           public  void abstractMethod(){
//               System.out.println("Hi i am abtract method have the features of anonymous class");
//           }
//        };
        A anonymousObject=()->System.out.println("hi");

       anonymousObject.abstractMethod();
//       anonymousObject.abstractMethod();
//       A anonymousObject=()->
//               System.out.println("Hi i am introducing Lambda ");
//
//       anonymousObject.abstractMethod();
    }
}
