interface parent{
//    void parentMethods();
    // for single para
    void parentMethods(int a);
}
interface  parent1{
    void multiParentMethods(int a,int b);
}
interface  parent2{
    String noReturnValue();
}
//class child implements parent{
//   public void  parentMethods(){
//       System.out.println("i am declared in parent bt body is provided in child class");
//    }
//}
public class LambdaIntro {
    public static void main(String[] args) {
        // anonymous class was earlier
//        parent obj=new parent() {
//            @Override
//            public void parentMethods() {
//                System.out.println("hello how are you ?");
//            }
//        };
        // zero parameter(No arg methods)
//        parent obj = ()->
//            System.out.println("hello how are you ?");
//        obj.parentMethods();
        // single parameter
//

        // single argument

        parent obj1 = (age)-> {
            System.out.println( age);
        };
            obj1.parentMethods(20);

//            int a;
//            int b;

        // multiple argument
            parent1 obj2=(a,b)->{
                // multi line body
                if(a<=0){
                    System.out.println("Enter correct no plz");
                }
                else{
                    System.out.println("Process of addition will start soon !");
                }
                System.out.print("Addition of the entered no is :-");
                System.out.println(a+b);
            };
            obj2.multiParentMethods(10,20);

            // no argument
        parent2 obj3=()->"hi";
        // void arg
        Runnable a1 =()->{
            System.out.println("I am printing this line using runnable ");
        };
        a1.run();



    }
}
