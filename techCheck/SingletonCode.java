package techCheck;

public class SingletonCode {
    private static  SingletonCode address;
    int age;
    private SingletonCode(int age){
        this.age=age;
    }

    public  static SingletonCode getInstance(){
        if(address==null){
            address=new SingletonCode(12);
        }
        return address;
    }


    public static void main(String[] args) {
SingletonCode obj=SingletonCode.getInstance();
        System.out.println(obj.age);



    }
}
