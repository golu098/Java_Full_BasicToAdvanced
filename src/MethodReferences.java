interface classA{
    void ClassA_Methods();
}
interface classB{
    void ClassB_Methods();
}

public class MethodReferences {
    // static methods
    public static void staticMethod(){
        System.out.println("i am Static Method");
    }
    public void instanceMethod(){
        System.out.println("I am instance method");
    }
    MethodReferences(){
        System.out.println("i am constructor");
    }

    public static void main(String[] args) {
        // using static Method reference
//        classA obj = () -> MethodReferences.staticMethod(); // lambda version
//        obj.ClassA_Methods();
       classA obj=MethodReferences::staticMethod;// lambada express short version ()->{ };
       obj.ClassA_Methods();

       classB obj9=MethodReferences::staticMethod;
       obj9.ClassB_Methods();
//        MethodReferences obj1 = new MethodReferences();
//        classA obj2 = () -> obj1.instanceMethod(); // lambda version
//        obj2.ClassA_Methods();

       // using instance method reference
       MethodReferences obj1=new MethodReferences();
       classA obj2=obj1::instanceMethod;
       obj2.ClassA_Methods();

       // reference by constructor

//        classA obj3 = () -> new MethodReferences(); // lambda version
//        obj3.getClass(); // This line does nothing meaningful, usually should call a method like `ClassA_Methods()` on `obj3`

        classA obj3=MethodReferences::new;
        obj3.getClass();
    }
}
