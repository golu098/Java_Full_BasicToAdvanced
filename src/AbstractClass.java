abstract class AbstractClass {
    abstract void a();

    abstract void b();

    final void c() {
        System.out.println("Final methods in abstract class");
    }
}
 class GeneralClass extends AbstractClass{
    public void a(){
        System.out.println("a method");
    }
//    void a();
    public  void b(){
        System.out.println("b method");
    }

    public static void main(String[] args) {
        GeneralClass obj= new GeneralClass() {
            @Override
            public void a() {
                System.out.println("hi");
            }
        };
        obj.a();
        obj.b();
        obj.c();

    }

}
