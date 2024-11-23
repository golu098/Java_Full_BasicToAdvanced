package Creational;

public class SingletonPatternCode {
    // private static instance of class
    private static volatile SingletonPatternCode name;
    // private constructor to prevent/ avoid instantation/object
    private SingletonPatternCode(){}
    // public static getInstance method to provide access to the instance/object
    public static SingletonPatternCode getInstance(){

            if(name==null){
                // to make it synchronized
                synchronized (SingletonPatternCode.class){
                    if(name==null){
                        name=new SingletonPatternCode();
                    }
                }

            }
        return name;
    }
    public void displayName(){
        System.out.println("Shiv kant");
    }

    public static void main(String[] args) {
        // individual public method of class
        SingletonPatternCode obj=SingletonPatternCode.getInstance();
        obj.displayName();
    }
}
