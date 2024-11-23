package techCheck;
interface bank{
    void  customer();
}
class SBI implements bank{
    public void customer(){
        System.out.println("Hi,Welcome to SBI");
    }
}
class IDBI implements bank{
    public void customer(){
        System.out.println("Hi,Welcome to IDBI");
    }
}
class Axis implements bank{
    public void customer(){
        System.out.println("Hi,Welcome to Axis bank");
    }
}
class HSBC implements bank{
    public void customer(){
        System.out.println("Hi,Welcome to HSBC");
    }
}
class  factoryClass{
    public bank getInstance(String BankName){
        if(BankName.equals("SBI")){
            return new SBI();
        }
        else if(BankName.equals("IDBI")){
            return new IDBI();

        }
        else if(BankName.equals("Axis")){
            return  new Axis();

        }
        else {
            return new HSBC();
        }
    }
}
public class FactoryCode {

    public static void main(String[] args) {
        factoryClass obj=new factoryClass();
        bank obj1=obj.getInstance("Axis");
        obj1.customer();

    }
}
