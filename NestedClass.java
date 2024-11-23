package src;

// public and default will be here ;private and protected not allow
public class NestedClass {
    int uid = 123;
    void nestedMethods() {
        System.out.println("Hi i am nested methods");
    }
    // inner class
    // if we use here static keyword then for calling the class we have to take help of outerClassObjectName
    class InnerClass {
        int uid1 = 234;

        // int uid1=234;
        void innerMethods() {
            System.out.println("Hi i am inner methods");
        }

    }
    // local class
    void localMethods() {
        // only default(Package private is allow only)
         class LocalClass {
            int uid6 = 234;
            void localMethods1() {
                System.out.println("Hi i am local methods");
            }
        }
        LocalClass localClassObj = new LocalClass();
        localClassObj.localMethods1();
        System.out.println(localClassObj.uid6);
    }


// static class:-  when the class does not need to reference an instance of the outer class.keep private if it is intended to use only within outer class
    static class staticClass  {
        static int uid5 = 178;

         void staticMethod() {
//            System.out.println(uid5);
            System.out.println("Hi i am static method");
        }
    }



    public static void main(String[] args) {
        // calling outerCLass
        NestedClass nc = new NestedClass();
        nc.nestedMethods();
        System.out.println(nc.uid);

        // calling inner class
        NestedClass.InnerClass nc1=nc.new InnerClass();
        nc1.innerMethods();
        System.out.println(nc1.uid1);
staticClass obj34=new staticClass();
obj34.staticMethod();
//        // calling static class
//        staticClass.staticMethod();
//        System.out.println(staticClass.uid5);

// for short and do not reuse code we will use anonymous class
        // if we use inner class then nested class obj is used
        InnerClass anonymousClass = nc.new InnerClass(){
@Override
            void innerMethods() {
                System.out.println("Hi i am inner methods");
            }
        };
        anonymousClass.innerMethods();
        System.out.println(anonymousClass.uid1);

        // Calling local methods
        nc.localMethods();  // Added this line to demonstrate local class usage
    }
}

//Summary :-
// inner class
// if we use here static keyword then for calling the class we have to to take help of outerClassObjectName

//
//        ### 1. **Outer Class**
//        - **What:** A top-level class not nested within another class.
//        - **Where to Use:** The main class in your program or a class that doesn't need to be tied to another class's lifecycle. It can be `public` or package-private (default).
//
//        ### 2. **Inner Class (Non-Static Nested Class)**
//        - **What:** A class defined within another class (without the `static` keyword).
//        - **Where to Use:** When the inner class needs access to the instance members of the outer class. It is tied to an instance of the outer class.
//
//        ### 3. **Local Class**
//        - **What:** A class defined within a method or a block.
//        - **Where to Use:** When you need a one-off class implementation that should only be accessible within a specific method or block of code. It can access local variables of the enclosing scope, but only if they are final or effectively final.
//
//        ### 4. **Anonymous Class**
//        - **What:** An unnamed class used for instant use, usually to override or implement methods of a class or interface.
//        - **Where to Use:** When you need a short-lived class for a specific task, such as implementing an interface or extending a class for a single use, like handling events or callbacks.
//
//      ### 5. **Static Nested Class (Static Class)**
//        - **What:** A class defined within another class with the `static` keyword.
//   - **Where to Use:** When you want a nested class that does not need access to the instance members of the outer class. It is often used to group related classes together that can be logically separated but are still tightly coupled in functionality.
//

