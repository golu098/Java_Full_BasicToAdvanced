package Creational;

interface OS{
     void spec();
}
class Android implements OS{
    public void spec(){
        System.out.println("Hi i am Creational.Android");
    }
}
class iOS implements OS{
    public void spec(){
        System.out.println("I am Ios");
    }
}
class Window implements OS{
    public void spec(){
        System.out.println("I am Creational.Window");
    }
}
class factoryClass{
    public  OS getInstance(String str){
        if(str.equals("Open")){
            return new Android();
        }
        else if (str.equals("Closed")){
            return new iOS();
        }
        else {
            return new Window();
        }

    }
}
public class FactoryPatternCode {
    public static void main(String[] args) {
        factoryClass obj1=new factoryClass();
        OS obj=obj1.getInstance("Closed");
//    Creational.OS obj=new Creational.Window();
    obj.spec();
    }
}
